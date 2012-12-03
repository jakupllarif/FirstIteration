package sourceCodes;
import java.util.ArrayList;
import java.util.Arrays;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class DataAccess extends ArrayList<User> {

	private Connection connect = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;
	
	ArrayList<String> secretQuestions = new ArrayList<String>(Arrays.asList("Enter your mother's birth city:",
																		"Enter your father's birth city:",
																		"Enter your mother's maiden name"));
	
	public void saveUser(User user) throws Exception{
		try{
			DBConnector connectDB = new DBConnector();
			Connection connect = connectDB.connectToDB();
	      
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
	
	private void close() {
	    try {
	      if (resultSet != null) {
	        resultSet.close();
	      }
	      if (preparedStatement != null) {
	        preparedStatement.close();
	      }
	      if (connect != null) {
	        connect.close();
	      }
	    } catch (Exception e) {

	    }
	}
}
