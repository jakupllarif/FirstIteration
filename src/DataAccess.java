import java.util.ArrayList;


public class DataAccess extends ArrayList<User> {

	ArrayList<User> list = new ArrayList<User>();
	
	//returns the number of the users found in the list (database)
	public int count(){
		return list.size();
	}
	
	
}
