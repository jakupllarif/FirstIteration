import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.*;

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
		
		boolean nonalphanumeric;
		
		//read the names of the user
		do{
			System.out.println("Enter your name (First, Middle, Last): ");
			tempName = input.nextLine();
			if(tempName.length()<=150)
				nonalphanumeric = checkAlphaNumeric(tempName, "^[a-zA-Z ]+$");
			else{
				System.out.println("The input is too large. Try again!");
				nonalphanumeric = true;
			}
		}while(nonalphanumeric);
		
		//read the address of the user
		do{
			System.out.println("Enter your Address (Address, City, State, Zip code): ");
			tempAddress = input.nextLine();
			if(tempAddress.length()<=150)
				nonalphanumeric = checkAlphaNumeric(tempAddress, "^[a-zA-Z0-9 ]+$");
			else{
				System.out.println("The input is too large. Try again!");
				nonalphanumeric =true;
			}
		}while(nonalphanumeric);
		
		//read the username of the user
		do{
			System.out.println("Enter your username: ");
			username = input.nextLine();
			nonalphanumeric = checkAlphaNumeric(username, "^[a-zA-Z0-9]+$");
		}while(nonalphanumeric);
		  
		//read the password of the user
		do{
			System.out.println("Enter your password: ");
			password = input.nextLine();
			if(password.length()>8)
				nonalphanumeric = checkAlphaNumeric(password, "^[a-zA-Z0-9]+$");
			else{
				System.out.println("The password is too short. Try again!");
				nonalphanumeric = true;
			}
		}while(nonalphanumeric);
		
		//read the email from the user
		do{
			System.out.println("Enter your email address:");
			email = input.nextLine();
			String [] temp = email.split("[@.]+");
			System.out.println("The email part no: " + temp.length);
			if(temp.length == 3)
				nonalphanumeric = false;
			else 
				nonalphanumeric = true;
		}while(nonalphanumeric);
		
		
		
		if(correctInput == true){
			//create the user and save that to the list
			saveUser.list.add(createUser(tempName, tempAddress, username, password, email));
			
		}
	}

	//checks if the entered input is alphanumeric or not
	private boolean checkAlphaNumeric(String string, String delimiter){
		Pattern p = Pattern.compile(delimiter);
		Matcher m = p.matcher(string);
		if(m.find())
			return false;
		else{
			System.out.println("The entered input is not alphanumeric. Try again!");
			return true;
		}
	}
	
	//creates the user object with its attributes
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












