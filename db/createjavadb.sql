
CREATE DATABASE javadb;



CREATE TABLE users 

(
userid int not null auto_increment,
primary key(userid),
firstName varchar(20),
 address varchar(50),
 username varchar(20),
 password varchar(20),
 email varchar (20),
 city varchar (20),
 state varchar (20),
 zipcode int (10),
 lastName varchar(20),
 middleName varchar(20),
datetimelastlogin timestamp,  
 wrongtries int(5) default 0,
 lockedout tinyint default 0
)