package team2project.sourceCodes;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnector {

	 private Connection connect = null;

	  public Connection connectToDB() throws Exception {
	    try {
	      Class.forName("com.mysql.jdbc.Driver");
	      
	      connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb?"
	              + "user=root&password=toor");
	    }catch (Exception e){
	    	throw e;
	    }
		return connect;
	  }
}
