import java.util.ArrayList;
import java.util.Scanner;
import java.*;

public class Recov {

                //''  
                String rec1 = null;
                String rec2 = null;
                String newPass = null;
                boolean nonalphanumeric;
                int count1=0;
                int count2=0;
                Scanner input = new Scanner(System.in);
 
 public void Recov(DataAccess saveUser){



                Object[] elements = saveUser.list.toArray();
                System.out.println("=========== Rest Password Page ==========");
                System.out.println("what is your Username name??");
			rec1 = input.nextLine();
                System.out.println("what is your midlle name??");
			rec2 = input.nextLine();
                        
                for (int i=0; i<saveUser.list.size();i++){
                    
                   if (rec1.equals(elements[i])){
                         count1++;
                         if (rec2.equals(elements[i-6])){ 
                             count2++;
                             
                             do{
                             System.out.println("what is your NEW pass??");
                             newPass= input.nextLine();
                             nonalphanumeric = checkPassword(newPass);
                             }while(nonalphanumeric);
                             
                             saveUser.list.set(i+1, newPass);
                             System.out.println("updated");
                             System.out.print("Your Information was:[ ");
                                    for (int x=0; x<9;x++){ 
                                    
                                    System.out.print(elements[i-7]+", ");
                                    i++;
                                    }
                             System.out.println(elements[i-7]+" ]");
                             System.out.print("Your New Password is: ");
                             System.out.println(newPass);
                                }
                     }
                }  System.out.println(" ");
                  if (count1==0){ System.err.println("wrong User Name");}
                  if (count2==0 & count1>0){ System.err.println("wrong Answer");}
                
        }
 
 
 
 
 
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
