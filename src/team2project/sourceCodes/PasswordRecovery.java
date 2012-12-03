package team2project.sourceCodes;

import java.util.Random;
import java.util.Scanner;

public class PasswordRecovery {

  
    String rec1 = null;
    String rec2 = null;
    String newPass = null;
    boolean nonalphanumeric;
    int count1=0;
    int count2=0;
    Scanner input = new Scanner(System.in);
	 
  public void Recov(DataAccess saveUser){

		Random generator = new Random();
		
        System.out.println("=========== Rest Password Page ==========");
        System.out.println("what is your Username name??");
        rec1 = input.nextLine();
        
        int randQuestion = generator.nextInt(3);
        int secretAnswerIndex = 3;
        String secretAnswer = null;
        
        switch (randQuestion) {
		case 0:
			System.out.println(saveUser.secretQuestions.get(0));
			secretAnswerIndex = 0;
			break;
		case 1:
			System.out.println(saveUser.secretQuestions.get(1));
			secretAnswerIndex = 1;
			break;
		case 2:
			System.out.println(saveUser.secretQuestions.get(2));
			secretAnswerIndex = 2;
			break;
		default:
			System.out.println("Error when generating random secret question!");
			break;
		}

        rec2 = input.nextLine();
                
        for (int i=0; i<saveUser.userDatabase.size(); i++){
            
           if (rec1.equals(saveUser.userDatabase.get(i).username)){
                 count1++;
                 
                 switch(secretAnswerIndex){
                 case 0:
                	 secretAnswer = saveUser.userDatabase.get(i).secretAnswer1;
                	 break;
                 case 1:
                	 secretAnswer = saveUser.userDatabase.get(i).secretAnswer2;
                	 break;
                 case 2:
                	 secretAnswer = saveUser.userDatabase.get(i).secretAnswer3;
                	 break;
                 default:
                	 break;
                 }
                 
                 if (rec2.equals(secretAnswer)){ 
                     count2++;
                     
                     do{
                     System.out.println("what is your NEW pass??");
                     newPass= input.nextLine();
                     ReadInput in = new ReadInput();
                     nonalphanumeric = in.checkPassword(newPass);
                     }while(nonalphanumeric);
                     
                     saveUser.userDatabase.get(i).setPassword(newPass);//reset the password
                     System.out.println("updated");
                     System.out.print("Your New Password: " + newPass + " has been sent via email to your email address: "+saveUser.userDatabase.get(i).email);
                     
                 }
             }
        } System.out.println(" ");
          if (count1==0){ System.err.println("wrong User Name");}
          if (count2==0 & count1>0){ System.err.println("wrong Answer");}
        
	        }

	 
	 }
