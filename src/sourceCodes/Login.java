package sourceCodes;

import java.util.Scanner;


	public class Login

	{
		public void logUser (){
			String username;
			String password;
			Scanner input = new Scanner(System.in);
			boolean userInDB = false;
			do{
				System.out.println("Enter your username: ");
				username = input.nextLine();
				  
				//read the password of the user
				System.out.println("Enter your password: ");
				password = input.nextLine();
				
				DataAccess checkUser = new DataAccess();
				
				try {
					userInDB = checkUser.loginUser(username, password);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				if(userInDB){
					System.out.println("******You are loged in! Welcome " + username + " to the home page!******");
					try {
						//checkUser.loginUpdate(username, password);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}else{
					System.out.println("!!Your username or password is incorrect!! Try again");
				}
			}while(!userInDB);
		}
}
