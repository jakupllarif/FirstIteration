package sourceCodes;

public class PasswordValidation {

	public PasswordValidation() {}
	
	//check if password is correct
	public boolean checkPassword(String password){
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
