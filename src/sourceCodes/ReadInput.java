package sourceCodes;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ReadInput {

	public void readToRegister(AtomicReferenceArray<String> userInfo) {
		
		Scanner input = new Scanner(System.in);
		boolean nonalphanumeric;
		String firstName; 
		String middleName; 
		String lastName; 
		String address; 
		String city; 
		String state; 
		String zipcode; 
		String username; 
		String password; 
		String email;
		String secretAnswer1; 
		String secretAnswer2; 
		String secretAnswer3;
		
		System.out.println("****************This is the Registration Part****************");
		//read the first name of the user
		do{
			System.out.println("Enter your First name: ");
			firstName = input.nextLine();
			nonalphanumeric = checkNameAddress(firstName);
		}while(nonalphanumeric);
		
		//read the middle names of the user
		do{
			System.out.println("Enter your Middle name: ");
			middleName = input.nextLine();
			nonalphanumeric = checkNameAddress(middleName);
		}while(nonalphanumeric);
		
		//read the last name of the user
		do{
			System.out.println("Enter your Last name: ");
			lastName = input.nextLine();
			nonalphanumeric = checkNameAddress(lastName);
		}while(nonalphanumeric);
		
		//read the address of the user
		do{
			System.out.println("Enter your Address: ");
			address = input.nextLine();
			nonalphanumeric = checkNameAddress(address);
		}while(nonalphanumeric);
		
		//read the city of the user
		do{
			System.out.println("Enter your City: ");
			city = input.nextLine();
			nonalphanumeric = checkAlphaNumeric(city, "^[a-zA-Z ]+$");
		}while(nonalphanumeric);
		
		//read the state of the user
		do{
			System.out.println("Enter your State: ");
			state = input.nextLine();
			if(state.length() ==2)
				nonalphanumeric = checkAlphaNumeric(state, "^[a-zA-Z ]+$");
			else{
				System.out.println("The input is too long! Try again!");
				nonalphanumeric = true;
			}
		}while(nonalphanumeric);
		
		//read the zipcode of the user
		do{
			System.out.println("Enter your ZipCode: ");
			zipcode = input.nextLine();
			if(zipcode.length()==5)
				nonalphanumeric = checkAlphaNumeric(zipcode, "^[0-9 ]+$");
			else{
				System.out.println("The zipcode is not in the correct format! Try again!");
				nonalphanumeric = true;
			}
		}while(nonalphanumeric);
		
		//read the username of the user
		do{
			System.out.println("Enter your username: ");
			username = input.nextLine();
			nonalphanumeric = checkAlphaNumeric(username, "^[a-zA-Z0-9]+$");
		}while(nonalphanumeric);
		  
		//read the password of the user
		PasswordValidation validate = new PasswordValidation();
		do{
			System.out.println("Enter your password: ");
			password = input.nextLine();
			nonalphanumeric = validate.checkPassword(password);
		}while(nonalphanumeric);
		
		//read the email from the user
		do{
			System.out.println("Enter your email address:");
			email = input.nextLine();
			nonalphanumeric = checkEmail(email);
		}while(nonalphanumeric);
		 System.out.println("Secret Answer1: Enter your mother's birth city:");
		 secretAnswer1 = input.nextLine();
		 System.out.println("Secret Answer2: Enter your father's birth city:");
		 secretAnswer2 = input.nextLine();
		 System.out.println("Secret Answer3: Enter your mother's maiden name:");
		 secretAnswer3 = input.nextLine();
		
		//update the array userInfo which contains created user's information
		userInfo.set(0, firstName);
		userInfo.set(1, middleName);
		userInfo.set(2, lastName);
		userInfo.set(3, address);
		userInfo.set(4, city);
		userInfo.set(5, state);
		userInfo.set(6, zipcode);
		userInfo.set(7, username);
		userInfo.set(8, password);
		userInfo.set(9, email);
		userInfo.set(10, secretAnswer1);
		userInfo.set(11, secretAnswer2);
		userInfo.set(12, secretAnswer3);
		
	}
	
	//------------------------------Check if input is correct---------------------------------------------------------------------------------//
	
	
	//check if names (first, middle, last) are correct 
	private boolean checkNameAddress(String name) {
		if(name.length()<=150)
			 return checkAlphaNumeric(name, "^[a-zA-Z ]+$");
		else{
			System.out.println("The input is too large. Try again!");
			return true;
		}
	}

	//checks if the entered input is alphanumeric or not
	private boolean checkAlphaNumeric(String string, String delimiter){
		Pattern p = Pattern.compile(delimiter);
		Matcher m = p.matcher(string);
		if(m.find())
			return false;
		else{
			System.out.println("The entered input is not correct. Try again!");
			return true;
		}
	}
	
	//check if email address is correct
	private boolean checkEmail(String email){
		
		String [] temp = email.split("[@.]+");
		if(temp.length == 3)
			return false;
		else {
			System.out.println("The email address is not correct. Try again!");
			return true;
		}
	}
}
