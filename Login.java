package de.vogella.junit.first; // Name of my project

public class Login {

	public boolean isValidUsername(String username) 
	{
		// TODO Auto-generated method stub
		if (username.equalsIgnoreCase(aUser.getUsername()))
	      {
		return true;
	      }
		return false;
	}
	
		public boolean isValidUsernameAndPassword (String username, String password)
		  {
		// TODO Auto-generated method stub
			if (username.equalsIgnoreCase(aUser.getUsername()) 
					&& password.equals(aUser.getPassword()))
		      {
		        return true;
		      }
			return false;
			}

}
