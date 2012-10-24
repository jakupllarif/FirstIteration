import java.util.Scanner;
import java.util.StringTokenizer;


public class Register {

	public void register() {
		readUserInfo();
		
	}

	private void readUserInfo() {
		String tempName;
		String tempAddress;
		String username;
		String password;
		String email;
		Boolean correctInput = true;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name (First, Middle, Last): ");
		tempName = input.next();
		System.out.println("Enter your Address (Address, City, State, Zip code): ");
		tempAddress = input.next();
		System.out.println("Enter your username: ");
		username = input.next();
		System.out.println("Enter your password: ");
		password = input.next();
		System.out.println("Enter your email address:");
		email = input.next();
		
		
		if(correctInput == true)
			createUser(tempName, tempAddress, username, password, email);
	}

	private void createUser(String tempName, String tempAddress, String username, String password, String email) {
		
		String[] temp = tempName.split(" ");
		String first = temp [1];
		String second = temp [2];
		
		
	}

}












