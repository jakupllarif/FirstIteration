Adding Sql/db files in this directory.

This document should contain instructions on setting up jdbc connection for the team

DATABASE NAME = javadb
USER =root (if we have time we should make other user for webapp access)
PW= toor

PORT=3306
-----------------------------------------------------------------------------------------------------------
http://www.tutorialspoint.com/jdbc/jdbc_tutorial.pdf
http://www.tutorialspoint.com/jdbc/jdbc-quick-guide.htm
http://docs.oracle.com/javase/tutorial/jdbc/basics/index.html
Steps should be followed in order for it to work

Language- MYSQL

1. set up mysql database on your machine-

	- Install MySQL database server- MYSQL Community Server 5.5.28 download HERE:http://dev.mysql.com/downloads/mysql/
        - Set up MySQL instance through server - 
		-choose detailed configuration-next-
                -developer machine-next-
                -multifunctional database-next-
                -(installation path) I put in C:/MySQL but doesn't matter  
                -DSS/OLAP -next-
                -make sure both TCP/IP and Enable Strict Mode is checked - default port is 3306 which is fine as long as 
                 you've got nothing else running on it.You probably want to check the box to add firewall exception -next-
                 standard character set is fine -next-
                -Install as Windows Service - service name MySQL (i unchecked for it to run automatically)
                  - include bin directory in windows path - MAKE SURE THIS IS CHECKED-next-
                 - set security settings- I made root password toor. I also checked enable root access from remote machines 
                   and create an anonymous account - next- EXECUTE-
	  


         
2.  - Set up MySQL GUI client/db management tool- (this step isn't necessary if you want to run the create db script from the 
                                                command since)
	MySQL workbench? http://dev.mysql.com/downloads/workbench/5.2.html

3.   -Create Database-  
                     The first time you do this you want to use the createjavadb script in our project folder.
                     You can either run this through the command MySQL command line that was installed with MySQL database server,
                     or use a UI client to import it.






4. Download mysql JDBC connector here- http://www.mysql.com/downloads/connector/j/