

package sourceCodes;

import java.util.concurrent.atomic.AtomicReferenceArray;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




public class Register {

	void registerUser(DataAccess dataAccess){
		
		String firstName = null;
		String address = null;
		String username = null;
		String password = null;
		String email = null;
		String city = null;
		String state = null;
		String zipcode = null;
		String lastName = null;
		String middleName = null;
		String secretAns1 = null;
		String secretAns2 = null;
		String secretAns3 = null;
		
		String [] array = {firstName, middleName, lastName, address, city, state, zipcode, username, password, email, secretAns1, secretAns2, secretAns3};
		
		AtomicReferenceArray<String> userInfo = new AtomicReferenceArray<>(array);
		
		//read the input data to register the user
		ReadInput readUserData = new ReadInput();
		readUserData.readUserInfo(userInfo);
		
		//create the user and save that to the list
		User newUser = new User(userInfo.get(0), userInfo.get(1), userInfo.get(2), userInfo.get(3), userInfo.get(4), userInfo.get(5), userInfo.get(6), userInfo.get(7), userInfo.get(8),userInfo.get(9), userInfo.get(10), userInfo.get(11), userInfo.get(12));
		System.out.println("The user is created.");
		
		System.out.println(newUser.toString());
		
		try {
			dataAccess.saveUser(newUser);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("The user is saved to the virtual database.");
	}
}












