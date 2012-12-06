package sourceCodes;

import static org.junit.Assert.*;
import java.sql.Connection;
import java.sql.ResultSet;
import org.junit.Test;
import java.sql.Statement;

public class DataAccessTest{

	@Test
	public void testSaveUser() throws Exception {
	
		DBConnector connectDB = new DBConnector();
		Connection connect = connectDB.connectToDB();
		Statement stm = null;
		ResultSet rs = null;
		
		User user = new User("Paolo", "de", "Lucini", "apt 10 church st", "new haven", "CT", "09845", "paoloLucini", "luciniP123", "plucini@yahoo.com", "roma", "palermo", "pausini");
		DataAccess save = new DataAccess();
		save.saveUser(user);
		
		try{
			stm = connect.createStatement();
			rs = stm.executeQuery( "select * from users where users.username = \"paoloLucini\"" );
			rs.next();
			if (rs.next())
				assertTrue(true);
			else
				assertFalse(true);
		} finally {
			connect.close();
		      rs.close();
		      stm.close();
		}
	}
	
	@Test
	public void testlogUser() throws Exception{
		
		boolean rs = false;
		String username = "paoloLucini";
		String password = "luciniP123";
		
		DataAccess log = new DataAccess();
		rs=log.loginUser(username, password);
		
		if(rs)
			assertTrue(true);
		else
			assertFalse(true);
		
	}
}
