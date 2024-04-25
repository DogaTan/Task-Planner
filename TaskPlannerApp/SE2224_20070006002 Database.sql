CREATE TABLE USERS(
User_Id INT AUTO_INCREMENT NOT NULL,
Username VARCHAR(30) NOT NULL,
User_Password VARCHAR(30) NOT NULL,
PRIMARY KEY(User_Id));


CREATE TABLE TASKS(
Id INT AUTO_INCREMENT NOT NULL,
Task_Name VARCHAR(100),
Short_Desc VARCHAR(200),
Deadline  DATE NOT NULL,
Priority INT,
Reminder_Image BOOLEAN NOT NULL,
Entry_date  DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
User_Id INT NOT NULL,
PRIMARY KEY(Id),
FOREIGN KEY(User_Id) REFERENCES USERS(User_Id));


INSERT INTO USERS(Username,User_Password) VALUES('Doga','123456');
INSERT INTO USERS(Username,User_Password) VALUES('Yagmur','ab12345');
INSERT INTO USERS(Username,User_Password) VALUES('Mert','abc1234');

INSERT INTO TASKS(Task_Name,Short_Desc,Deadline,Priority,Reminder_Image,User_Id) VALUES('A','FSC','2023-06-01','3',true,'1');
INSERT INTO TASKS(Task_Name,Short_Desc,Deadline,Priority,Reminder_Image,User_Id) VALUES('B','SVER','2023-06-05','2',true,'1');
INSERT INTO TASKS(Task_Name,Short_Desc,Deadline,Priority,Reminder_Image,User_Id) VALUES('C','EFLWL','2023-06-08','1',false,'1');
INSERT INTO TASKS(Task_Name,Short_Desc,Deadline,Priority,Reminder_Image,User_Id) VALUES('D','RŞGNWŞKN','2023-06-02','4',true,'1');
INSERT INTO TASKS(Task_Name,Short_Desc,Deadline,Priority,Reminder_Image,User_Id) VALUES('E','RŞGNWŞKN','2023-06-02','2',true,'1');
INSERT INTO TASKS(Task_Name,Short_Desc,Deadline,Priority,Reminder_Image,User_Id) VALUES('F','RŞGNWN','2023-06-02','5',true,'1');
