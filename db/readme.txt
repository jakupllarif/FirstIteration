Adding Sql/db files in this directory.

This document should contain instructions on setting up jdbc connection for the team
-----------------------------------------------------------------------------------------------------------

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
	  















4. Download mysql JDBC connector here- http://www.mysql.com/downloads/connector/j/