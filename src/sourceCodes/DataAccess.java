package sourceCodes;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;


public class DataAccess extends ArrayList<User> {
	public static final String DATE_FORMAT_NOW = "yyyy-MM-dd HH:mm:ss";
	private Connection connect = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;
	private Statement stm = null;
	DBConnector connectDB = new DBConnector();
	
	ArrayList<String> secretQuestions = new ArrayList<String>(Arrays.asList("Enter your mother's birth city:",
																		"Enter your father's birth city:",
																		"Enter your mother's maiden name"));
	
	public void saveUser(User user) throws Exception{
		try{
			connect = connectDB.connectToDB();
	      
	      preparedStatement = connect
	          .prepareStatement("insert into  JAVADB.USERS values " + 
	      "(default, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
	      
	      preparedStatement.setString(1, user.firstName);
	      preparedStatement.setString(2, user.address);
	      preparedStatement.setString(3, user.username);
	      preparedStatement.setString(4, user.password);
	      preparedStatement.setString(5, user.email);
	      preparedStatement.setString(6, user.city);
	      preparedStatement.setString(7, user.state);
	      preparedStatement.setInt(8, Integer.parseInt(user.zipCode));
	      preparedStatement.setString(9, user.lastName);
	      preparedStatement.setString(10, user.middleName);
	      preparedStatement.setDate(11, null);
	      preparedStatement.setInt(12, 0);
	      preparedStatement.setInt(13, 0);
	      preparedStatement.setString(14, user.secretAnswer1);
	      preparedStatement.setString(15, user.secretAnswer2);
	      preparedStatement.setString(16, user.secretAnswer3);
	            preparedStatement.executeUpdate();
	      
		} catch (Exception e) {
		      throw e;
		    } finally {
		      close();
		    }
	}
	
	public boolean loginUser(String username, String password) throws Exception{

		try{
			connect = connectDB.connectToDB();
			stm = connect.createStatement();
			String query = "select * from users where users.username='"+ username +"' and users.password='"+ password +"'";
			resultSet = stm.executeQuery(query);
			resultSet.next();
			if(resultSet.next()){
				return true;
			}else
				return false;
		
		}catch (Exception e) {
		      throw e;
		    } finally {
		      close();
		    }
	}

	/*public void loginUpdate(String username, String password) throws Exception {
		try{
			connect = connectDB.connectToDB();
			
			String query = "update table users set users.datetimelastlogin=? where users.username=? and users.password=?";
			preparedStatement = connect.prepareStatement(query);
			preparedStatement.setString(1, now());
			preparedStatement.setString(2, username);
			preparedStatement.setString(3, password);
			preparedStatement.executeUpdate();

		}catch (Exception e) {
		      throw e;
		    } finally {
		      close();
		    }
	}
	
	public static String now() {
		java.util.Date dt = new java.util.Date();

		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		String currentTime = sdf.format(dt);
		return currentTime;
	}*/
	
	private void close() {
	    try {
	      if (resultSet != null) {
	        resultSet.close();
	      }
	      if (preparedStatement != null) {
	        preparedStatement.close();
	      }
	      if (stm != null) {
		    stm.close();
		  }
	      if (connect != null) {
	        connect.close();
	      }
	    } catch (Exception e) {

	    }
	}

}
