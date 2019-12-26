CREATE TABLE PROGRAMMER (EmpNo NUMBER(5) PRIMARY KEY,
    ProjId CHAR(5) NOT NULL,
    LastName VARCHAR(30),
    FirstName VARCHAR(30),
    HireDate DATE,
    Language VARCHAR(15),
    TaskNo NUMBER(2),
    Privilege VARCHAR(25) NULL);

INSERT INTO PROGRAMMER VALUES(201,'NPR','Gupta','Saurav',TO_DATE('1/1/1995','MM/DD/YYYY'),'VB',52,'Secret');

INSERT INTO PROGRAMMER VALUES(390,'KCW','Ghosh','Pinky',TO_DATE('1/5/1993','MM/DD/YYYY'),'Java',11,'Top Secret');

INSERT INTO PROGRAMMER VALUES(789,'RNC','Agrawal','Praveen',TO_DATE('8/31/1998','MM/DD/YYYY'),'VB',11,'Secret');

INSERT INTO PROGRAMMER VALUES(134,'TIPPS','Chaudhary','Supriyo',TO_DATE('7/15/1995','MM/DD/YYYY'),'C++',52,'Secret');


SELECT * FROM PROGRAMMER;


CREATE TABLE WEATHER (CITY VARCHAR(15),
    STATE VARCHAR(20),
    HIGH NUMBER(3),
    LOW NUMBER (3),
    EX NUMBER(1));
 ALTER TABLE WEATHER DROP  COLUMN EX;

 DESC WEATHER;
 INSERT INTO WEATHER VALUES('Calcutta', 'West Bengal',105,90);

 INSERT INTO WEATHER VALUES('Trivandrum','Kerela',101,92);
 INSERT INTO WEATHER VALUES('Mumbai','Maharashtra',88,69);

INSERT INTO WEATHER VALUES('Banglore','Karnataka',77,60);




desc weather;

select * from weather;



 CREATE TABLE BOOKS (BookId NUMBER(4) PRIMARY KEY,
    Title CHAR(4),
    TopicId CHAR(6),
    PublisherName VARCHAR(30),
   PlaceOfPublication VARCHAR(30),
   Price NUMBER(3),
   PurchaseDate DATE,
   ShelfNo CHAR(3));


INSERT INTO BOOKS VALUES(8293,'DBMS','DB1','Prentice Hall','Mumbai',255, TO_DATE('1/1/1995','MM/DD/YYYY'),'S11');


INSERT INTO BOOKS VALUES(5645,'DBMS','DB1','Pearson Education','Mumbai',655, TO_DATE('1/5/1993','MM/DD/YYYY'),'S12');



INSERT INTO BOOKS VALUES(6565,'C','C1','TMH','Mumbai',840, TO_DATE('8/31/1998','MM/DD/YYYY'),'S66');


INSERT INTO BOOKS VALUES(6567,'C++','Cplus1','ABC Publisher','Delhi',300, TO_DATE('7/15/1995','MM/DD/YYYY'),'S77');


select* from books;


update PROGRAMMER SET ProjId='NTTS' where EmpNo=201;



update PROGRAMMER SET Language='C++' where EmpNo=201;

update BOOKS SET ShelfNo='S10' where Title='DBMS';


ALTER TABLE WEATHER ADD (ClimateType CHAR(6) CHECK(ClimateType in ('Rainy','Cloudy','Sunny','Snow')));

drop table WEATHER ;
