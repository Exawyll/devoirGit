#------------------------------------------------------------
#        Script MySQL.
#------------------------------------------------------------

DROP database IF EXISTS GitControle;
CREATE database GitControle;
USE GitControle;

#------------------------------------------------------------
# Table: Droits
#------------------------------------------------------------

CREATE TABLE Droits(
        id       int (11) Auto_increment  NOT NULL ,
        niveau   Varchar (25) ,
        severite Varchar (25) ,
        nom      Varchar (25) ,
        societe  Varchar (25) ,
        PRIMARY KEY (id )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: User
#------------------------------------------------------------

CREATE TABLE User(
        id        int (11) Auto_increment  NOT NULL ,
        name      Varchar (25) ,
        lastname  Varchar (25) ,
        login     Varchar (25) ,
        password  Varchar (25) ,
        id_Droits Int ,
        PRIMARY KEY (id )
)ENGINE=InnoDB;

ALTER TABLE User ADD CONSTRAINT FK_User_id_Droits FOREIGN KEY (id_Droits) REFERENCES Droits(id);

INSERT INTO Droits VALUES (1, '1', 'Homme', 'Fort', 'DDCorp');
INSERT INTO Droits VALUES (2, '2', 'Citoyen', 'Faible', 'WDCorp');

INSERT INTO User VALUES (1, 'Dereck','Daniel','ddaniel','BonJoir', 1);
INSERT INTO User VALUES (2, 'Wylliam','Delaunay','wdelaun','BonDour', 2);
