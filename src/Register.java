import java.util.Scanner;


public class Register {

	public Register(DataAccess saveUser) {
		super();
		readUserInfo(saveUser);
	}

	private void readUserInfo(DataAccess saveUser) {
		String tempName;
		String tempAddress;
		String username;
		String password;
		String email;
		Boolean correctInput = true;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your name (First, Middle, Last): ");
		tempName = input.nextLine();
		
		System.out.println("Enter your Address (Address, City, State, Zip code): ");
		tempAddress = input.nextLine();
		
		System.out.println("Enter your username: ");
		username = input.nextLine();
		
		System.out.println("Enter your password: ");
		password = input.nextLine();
		
		System.out.println("Enter your email address:");
		email = input.nextLine();
		
		
		if(correctInput == true){
			
			saveUser.list.add(createUser(tempName, tempAddress, username, password, email));
			
		}
	}

	private User createUser(String tempName, String tempAddress, String username, String password, String email) {
		
		String[] temp = tempName.split(" ");
		String first = temp[0];
		String middle = temp[1];
		String last =  temp[2];
		
		temp = tempAddress.split(" ");
		String address = temp[0];
		String city = temp[1];
		String state = temp[2];
		String zipCode = temp[3];
		
		User newUser = new User(first, last, middle, email, address, city, state, zipCode, username, password);
		System.out.println(newUser.toString());//see the details of user
		
		return newUser;
	}

}












