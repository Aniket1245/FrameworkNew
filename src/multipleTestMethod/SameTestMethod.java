package multipleTestMethod;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SameTestMethod {

	
	@Test
	public void A()
	{
		Reporter.log("registered user....", true);
	}
	
	@Test
	public void a()
	{
		Reporter.log("deleted user....", true);
	}
}
