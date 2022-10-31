drop sequence Center_SEQ
/

drop sequence Country_SEQ
/

drop sequence Privilege_SEQ
/

drop sequence Role_SEQ
/

drop sequence SimedUser_SEQ
/

drop sequence WorkPosition_SEQ
/

drop table Center cascade constraints
/

drop table Country cascade constraints
/

drop table Privilege cascade constraints
/

drop table PrivilegeRole cascade constraints
/

drop table Role cascade constraints
/

drop table SimedUser cascade constraints
/

drop table UserWorkPosition cascade constraints
/

drop table WorkPosition cascade constraints
/

CREATE TABLE Center (address VARCHAR2(100) NOT NULL, city VARCHAR2(50) NOT NULL, code VARCHAR2(10) NOT NULL, countryID NUMBER NOT NULL, id NUMBER NOT NULL, name VARCHAR2(50) NOT NULL, postalCode VARCHAR2(10) NOT NULL, publicID VARCHAR2(100) NOT NULL)
/

CREATE TABLE Country (englishName VARCHAR2(100) NOT NULL, id NUMBER NOT NULL, longCode VARCHAR2(3) NOT NULL, shortCode VARCHAR2(2) NOT NULL)
/

CREATE TABLE Privilege (code VARCHAR2(10) NOT NULL, id NUMBER NOT NULL, name VARCHAR2(50) NOT NULL, publicID VARCHAR2(100) NOT NULL)
/

CREATE TABLE PrivilegeRole (privilegeId NUMBER NOT NULL, roleId NUMBER NOT NULL)
/

CREATE TABLE Role (code VARCHAR2(10) NOT NULL, id NUMBER NOT NULL, name VARCHAR2(50) NOT NULL, publicID VARCHAR2(100) NOT NULL)
/
CREATE TABLE SimedUser (canUseAuditTrail NUMBER, canUseSampleManager NUMBER, currentWorkPositionID NUMBER, email VARCHAR2(50) NOT NULL, firstName VARCHAR2(50) NOT NULL, id NUMBER NOT NULL, lastName VARCHAR2(50) NOT NULL, login VARCHAR2(50) NOT NULL, passwordHash VARCHAR2(100) NOT NULL, publicID VARCHAR2(100) NOT NULL, urlParam VARCHAR2(100))
/

CREATE TABLE UserWorkPosition (userId NUMBER NOT NULL, workPositionId NUMBER NOT NULL)
/

CREATE TABLE WorkPosition (centerID NUMBER NOT NULL, id NUMBER NOT NULL, publicID VARCHAR2(100) NOT NULL, roleId NUMBER NOT NULL)
/

create table eo_temp_table as select max(id) counter from Center
/

create sequence Center_SEQ
/

create procedure eo_set_sequence is
    xxx number;
    yyy number;
begin
    select max(counter) into xxx from eo_temp_table;
    if xxx is not NULL then
        yyy := 0;
        while (yyy < xxx) loop
            select Center_SEQ.nextval into yyy from dual;
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

create table eo_temp_table as select max(id) counter from Country
/

create sequence Country_SEQ
/

create procedure eo_set_sequence is
    xxx number;
    yyy number;
begin
    select max(counter) into xxx from eo_temp_table;
    if xxx is not NULL then
        yyy := 0;
        while (yyy < xxx) loop
            select Country_SEQ.nextval into yyy from dual;
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

create table eo_temp_table as select max(id) counter from Privilege
/

create sequence Privilege_SEQ
/

create procedure eo_set_sequence is
    xxx number;
    yyy number;
begin
    select max(counter) into xxx from eo_temp_table;
    if xxx is not NULL then
        yyy := 0;
        while (yyy < xxx) loop
            select Privilege_SEQ.nextval into yyy from dual;
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

create table eo_temp_table as select max(id) counter from Role
/

create sequence Role_SEQ
/

create procedure eo_set_sequence is
    xxx number;
    yyy number;
begin
    select max(counter) into xxx from eo_temp_table;
    if xxx is not NULL then
        yyy := 0;
        while (yyy < xxx) loop
            select Role_SEQ.nextval into yyy from dual;
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

create table eo_temp_table as select max(id) counter from SimedUser
/

create sequence SimedUser_SEQ
/

create procedure eo_set_sequence is
    xxx number;
    yyy number;
begin
    select max(counter) into xxx from eo_temp_table;
    if xxx is not NULL then
        yyy := 0;
        while (yyy < xxx) loop
            select SimedUser_SEQ.nextval into yyy from dual;
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

create table eo_temp_table as select max(roleId) counter from WorkPosition
/

create sequence WorkPosition_SEQ
/

create procedure eo_set_sequence is
    xxx number;
    yyy number;
begin
    select max(counter) into xxx from eo_temp_table;
    if xxx is not NULL then
        yyy := 0;
        while (yyy < xxx) loop
            select WorkPosition_SEQ.nextval into yyy from dual;
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

ALTER TABLE Center ADD PRIMARY KEY (id)
/

ALTER TABLE Country ADD PRIMARY KEY (id)
/

ALTER TABLE Privilege ADD PRIMARY KEY (id)
/

ALTER TABLE PrivilegeRole ADD PRIMARY KEY (privilegeId, roleId)
/

ALTER TABLE Role ADD PRIMARY KEY (id)
/

ALTER TABLE SimedUser ADD PRIMARY KEY (id)
/

ALTER TABLE UserWorkPosition ADD PRIMARY KEY (userId, workPositionId)
/

ALTER TABLE WorkPosition ADD PRIMARY KEY (id)
/

ALTER TABLE Center ADD CONSTRAINT Center_country_FK FOREIGN KEY (countryID) REFERENCES Country (id) DEFERRABLE INITIALLY DEFERRED
/

ALTER TABLE PrivilegeRole ADD CONSTRAINT PrivilegeRole_role_FK FOREIGN KEY (roleId) REFERENCES Role (id) DEFERRABLE INITIALLY DEFERRED
/

ALTER TABLE PrivilegeRole ADD CONSTRAINT PrivilegeRole_privilege_FK FOREIGN KEY (privilegeId) REFERENCES Privilege (id) DEFERRABLE INITIALLY DEFERRED
/

ALTER TABLE UserWorkPosition ADD CONSTRAINT UserWorkPosition_FK FOREIGN KEY (workPositionId) REFERENCES WorkPosition (roleId) DEFERRABLE INITIALLY DEFERRED
/
ALTER TABLE UserWorkPosition ADD CONSTRAINT UserWorkPosition_pos_FK FOREIGN KEY (workPositionId) REFERENCES WorkPosition (id) DEFERRABLE INITIALLY DEFERRED
/

ALTER TABLE WorkPosition ADD CONSTRAINT WorkPosition_workLocation_FK FOREIGN KEY (centerID) REFERENCES Center (id) DEFERRABLE INITIALLY DEFERRED
/

ALTER TABLE WorkPosition ADD CONSTRAINT WorkPosition_role_FK FOREIGN KEY (roleId) REFERENCES Role (id) DEFERRABLE INITIALLY DEFERRED
/



