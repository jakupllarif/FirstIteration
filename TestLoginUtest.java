package de.vogella.junit.first;
 
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import de.vogella.junit.first.Login;
 
public class TestLoginUtest
{
  // the variable name 'sut' stands for
  // system under test.  This is just a
  // coding convention and it refers to 
  // the Object we will be testing.
  Login sut = new Login();
 
  @Test
  public void testValidUsernameAndPasswordCombination()
  {
    boolean result = sut.isValidUsernameAndPassword("user3", "howtoprogramwithjava");
    assertTrue(result);
  }
  
  
@Test
public void testValidUsername()
{
  boolean result = sut.isValidUsername("user231");
  assertFalse(result);
}


private void assertFalse(boolean result) {
	// TODO Auto-generated method stub
	
}
}