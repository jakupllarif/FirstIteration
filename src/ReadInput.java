import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ReadInput {

	public void readUserInfo(String firstName, String middleName, String lastName, String address, String city, String state, String zipcode, String username, String password, String email) {
		
		Scanner input = new Scanner(System.in);
		
		boolean nonalphanumeric;
		
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
			nonalphanumeric = checkAlphaNumeric(zipcode, "^[0-9 ]+$");
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
			nonalphanumeric = checkPassword(password);
		}while(nonalphanumeric);
		
		//read the email from the user
		do{
			System.out.println("Enter your email address:");
			email = input.nextLine();
			nonalphanumeric = checkEmail(email);
		}while(nonalphanumeric);
		
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
	
	//check if password is correct
	private boolean checkPassword(String password){
		boolean hasDigit = false;
		boolean hasUpperCase = false;
		
		if(password.length() >= 8){
	        for (int i = 0; i < password.length(); i++){
	        	if (Character.isDigit(password.charAt(i))){
	        		hasDigit = true;
	            }
	        	if (Character.isUpperCase(password.charAt(i))){
	        		hasUpperCase = true;
	        	}
	        }
	        
	        if(hasDigit && hasUpperCase)
	        	return false;
	        else{
	        	System.out.println("The password must contain at least one digit and one Upper Case letter!");
	        	return true;
	        }
		}else{
			System.out.println("The password must contain at least 8 digits!");
			return true;
		}
    }
	
}
