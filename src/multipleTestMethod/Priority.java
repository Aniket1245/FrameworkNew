package multipleTestMethod;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
	
	
	/*int v=5;
	@Test(priority=v)*/
	
	@Test(priority=5)
	public void registerUser()
	{
		Reporter.log("registered user....", true);
	}
	
	@Test(priority=-5)
	public void deleteUser()
	{
		Reporter.log("deleted user....", true);
	}


}
