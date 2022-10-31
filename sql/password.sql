alter TABLE SimedUser modify  passwordHash VARCHAR2(100) null;
alter TABLE SimedUser add isActive NUMBER NULL;
update SimedUser set isActive = 1;
commit;
alter TABLE SimedUser modify isActive NUMBER NOT NULL;


CREATE TABLE OldPassHash (creationDate TIMESTAMP NOT NULL, hash VARCHAR2(100) NOT NULL, id NUMBER NOT NULL, publicID VARCHAR2(100) NOT NULL, simedUserID NUMBER NOT NULL)
/

create table eo_temp_table as select max(id) counter from OldPassHash
/

create sequence OldPassHash_SEQ
/

create procedure eo_set_sequence is
    xxx number;
    yyy number;
begin
    select max(counter) into xxx from eo_temp_table;
    if xxx is not NULL then
        yyy := 0;
        while (yyy < xxx) loop
            select OldPassHash_SEQ.nextval into yyy from dual;
        end loop;
    end if;
end;

/

begin eo_set_sequence; end;
/

drop procedure eo_set_sequence
/

drop table eo_temp_table
/

ALTER TABLE OldPassHash ADD PRIMARY KEY (id)
/

ALTER TABLE OldPassHash ADD CONSTRAINT OldPassHash_simedUser_FK FOREIGN KEY (simedUserID) REFERENCES SimedUser (id) DEFERRABLE INITIALLY DEFERRED
/
