CREATE SCHEMA ToyStopInventoryManagementSystem;

CREATE TABLE Toy( TID int primary key,
      ToyName varchar (30),
      price int,
      minAge int,
      maxAge int,
      addedOn datetime
);

CREATE TABLE STORE( SID int primary key,
      address varchar (100),
     contactNo varchar (30),
     email varchar (30)
);

CREATE TABLE Employee( EmpName varchar (30),
    UID int primary key,
    email varchar (30),
    storeID int,
    foreign key (storeID) references STORE(SID)
    );
    
INSERT INTO STORE VALUES(12, "address", "+92", "urooj@bla.com" );
INSERT INTO Employee VALUES("Urooj", 1, "urooj@bla.com", 12);