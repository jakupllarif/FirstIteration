import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

import javax.crypto.SecretKey;


public class DataAccess extends ArrayList<User> {

	ArrayList<User> userDatabase = new ArrayList<User>();
	ArrayList<String> secretQuestions = new ArrayList<String>(Arrays.asList("Enter your mother's birth city:",
																		"Enter your father's birth city:",
																		"Enter your mother's maiden name"));
	
	//returns the number of the users found in the list (database)
	public int count(){
		return userDatabase.size();
	}
	
}
