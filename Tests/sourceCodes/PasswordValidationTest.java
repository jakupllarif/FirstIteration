package sourceCodes;

import static org.junit.Assert.*;

import org.junit.Test;

public class PasswordValidationTest {

	@Test
	public void testCheckPassword() {
		String password = "Fairfield20";
		PasswordValidation valid = new PasswordValidation();
		
		boolean check = valid.checkPassword(password);
		
		assertEquals(check, false);
	}

}
