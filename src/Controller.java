import java.util.Scanner;


public class Controller {

	public void menu() {
		
		String repeat;
		DataAccess saveUser = new DataAccess();//list of the users used as database
		Scanner input = new Scanner(System.in);
		
		do{
			System.out.println("Please choose which option do you want to do: ");
			System.out.println("To log in pres L: ");
			System.out.println("To register pres R: ");
			System.out.println("To change your password press C: ");
			String choice = input.next();
			
			switch (choice){
				case "L":
					break;
				case "R":
					new Register(saveUser);
					break;
				case "C":
					break;
				default:
					System.out.println("Wrong choice! Try again!");
					break;
			}
			System.out.println("To continue press Y , to exit pres any key: ");
			repeat = input.next();
			
		}while (repeat.equals("Y"));
	}
		
}
