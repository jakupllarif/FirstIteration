package sourceCodes;
import java.util.Scanner;




public class Controller {

	public void menu() {
		
		String repeat;
		Scanner input = new Scanner(System.in);
		
		do{
			System.out.println("Please choose which option do you want to do: ");
			System.out.println("To log in pres L: ");
			System.out.println("To register pres R: ");
			System.out.println("To change your password press C: ");
			String choice = input.next();
			
			switch (choice){
				case "L": case "l":
					Login login = new Login();
					login.logUser();
					break;
				case "R": case "r":
					Register register = new Register(); //used to register the user
					register.registerUser();
					break;
				case "C": case "c":
					//PasswordRecovery recover = new PasswordRecovery();
					//recover.Recov(saveUser);
					break;
				default:
					System.out.println("Wrong choice! Try again!");
					break;
			}
			System.out.println("To continue press Y , to exit pres any key: ");
			repeat = input.next();
			
		}while (repeat.equals("Y") || repeat.equals("y"));
	}
		
}
