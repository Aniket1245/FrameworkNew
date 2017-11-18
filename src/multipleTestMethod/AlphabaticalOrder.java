package multipleTestMethod;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class AlphabaticalOrder {
	
	@Test
	public void registerUser()
	{
		Reporter.log("registered user....", true);
	}
	
	@Test
	public void deleteUser()
	{
		Reporter.log("deleted user....", true);
	}

}
