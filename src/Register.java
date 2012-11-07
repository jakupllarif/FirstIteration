import java.util.concurrent.atomic.AtomicReferenceArray;


public class Register {

	void registerUser(DataAccess saveUser){
		
		String firstName = null;
		String address = null;
		String username = null;
		String password = null;
		String email = null;
		String city = null;
		String state = null;
		String zipcode = null;
		String lastName = null;
		String middleName = null;
		String [] array = {firstName, middleName, lastName, address, city, state, zipcode, username, password, email};
		
		AtomicReferenceArray<String> userInfo = new AtomicReferenceArray<>(array);
		
		//read the input data to register the user
		ReadInput readUserData = new ReadInput();
		readUserData.readUserInfo(userInfo);
		
		//create the user and save that to the list
		User newUser = new User(userInfo.get(0), userInfo.get(1), userInfo.get(2), userInfo.get(3), userInfo.get(4), userInfo.get(5), userInfo.get(6), userInfo.get(7), userInfo.get(8),userInfo.get(9));
		System.out.println("The user is created.");
		
		System.out.println(newUser.toString());
		
		saveUser.list.add(newUser);
		System.out.println("The number of users: " + saveUser.count());
		
		System.out.println("The user is saved to the virtual database.");
		
		
	}
	

}












