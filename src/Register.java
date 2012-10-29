
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
		
		//read the input data to register the user
		ReadInput readUserData = new ReadInput();
		readUserData.readUserInfo(firstName, middleName, lastName, address, city, state, zipcode, username, password, email);
		
		//create the user and save that to the list
		User newUser = new User(firstName, lastName, middleName, email, address, city, state, zipcode, username, password);
		System.out.println("The user is created.");
		
		saveUser.list.add(newUser);
		System.out.println("The user is saved to the virtual database.");

		
	}
	

}












