

insert into country values ('Switzerland',1,'CHE','CH')

INSERT INTO Center (id, address, city, code, countryID, name, postalCode, publicID) VALUES (Center_SEQ.nextVal, 'Rue Gabrielle-Perret-Gentil 4','Genève','01', 1,'Hôpitaux Universitaires de Genève','1205 ','7cb1d95c-4b18-44bf-b984-596aafe3a1cc');
INSERT INTO Center (id, address, city, code, countryID, name, postalCode, publicID) VALUES (Center_SEQ.nextVal, 'Spitalstrasse 21','Basel','02', 1,'Basel Universitätsspital','4056 ','a0395239-32e2-4298-ba0d-ffc35be9c38b');
INSERT INTO Center (id, address, city, code, countryID, name, postalCode, publicID) VALUES (Center_SEQ.nextVal, 'Freiburgstrasse 8,','Bern','03', 1,'Bern Inselspital','3010','2f0c5e27-babb-4231-a752-6962658733a9');
INSERT INTO Center (id, address, city, code, countryID, name, postalCode, publicID) VALUES (Center_SEQ.nextVal, 'Rämistrasse 100','Zürich','04', 1,'Zürich Universitätsspital','8091','b68efffc-ff48-401a-b0e2-b8065c56849d');
INSERT INTO Center (id, address, city, code, countryID, name, postalCode, publicID) VALUES (Center_SEQ.nextVal, 'Rue du Bugnon 21','Lausanne','05', 1,'Lausanne CHUV','1011','f17379e9-6e80-414b-bb7a-e6d5f4f9a1b0');
INSERT INTO Center (id, address, city, code, countryID, name, postalCode, publicID) VALUES (Center_SEQ.nextVal, 'Geissbergstrasse 81','Schaffhausen','06', 1,'Schaffhausen Kantonsspital','8208','3070853b-1d7d-4e08-893b-cccc389e53c4');
INSERT INTO Center (id, address, city, code, countryID, name, postalCode, publicID) VALUES (Center_SEQ.nextVal, 'Walchestrasse 11','Zürich','07', 1,'Zürich Immunologie Zentrum','8006','4a49ed88-80e8-45bf-92fd-81f8308bcf82');
INSERT INTO Center (id, address, city, code, countryID, name, postalCode, publicID) VALUES (Center_SEQ.nextVal, 'Bruderholz','Bruderholz','08', 1,'Basel Kantonsspital Bruderholz','4101','3060ffa7-073d-407c-9dc1-f9f50928a62b');
INSERT INTO Center (id, address, city, code, countryID, name, postalCode, publicID) VALUES (Center_SEQ.nextVal, 'Spitalstrasse','Luzern','09', 1,'Luzern Kantonsspital','6000','e17cd989-0546-44b5-baf8-94f528975ad0');
INSERT INTO Center (id, address, city, code, countryID, name, postalCode, publicID) VALUES (Center_SEQ.nextVal, 'Av. du Grand-Champsec 80','Sion','10', 1,'Valais Sion CHCV','1951','b9fc2b60-cdfc-459a-ad92-e8df31e40a1b');
INSERT INTO Center (id, address, city, code, countryID, name, postalCode, publicID) VALUES (Center_SEQ.nextVal, 'Viale Officina 3','Viale Officina 3','11', 1,'Ticino Lugano Ospedale Civico','6500','5380ac60-bf80-41a2-9b72-d31d0783ff5b');
INSERT INTO Center (id, address, city, code, countryID, name, postalCode, publicID) VALUES (Center_SEQ.nextVal, 'Rorschacher Str. 95','St-Gallen','12', 1,'St-Gallen Kantonsspital','9007','3a5dd20a-b317-4597-a502-1df03ada560c');


insert into role values ('ldm',role_seq.nextval,'Local Data Manager','ldm')
insert into role values ('validator',role_seq.nextval,'Local validator','validator')
insert into role values ('readonly',role_seq.nextval,'readonly','readonly')



insert into Privilege values ('edit', Privilege_seq.nextval,'Can edit','edit')
insert into Privilege values ('validate', Privilege_seq.nextval,'Can validate','validate')

insert into PrivilegeRole values (1,1)
insert into PrivilegeRole values (2,2)

--insert into SimedUser values(1,1,1,'pgen@hcuge.ch','Pierre',1,'Gilquin','pegn','$2a$1','pegn', null)
--insert into WorkPosition values(1,WorkPosition_seq.nextval,'ldm on first center',1)

--insert into userworkposition values (1,1)
