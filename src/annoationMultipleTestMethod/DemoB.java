package annoationMultipleTestMethod;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoB extends BaseTest{
	
	@Test
	public void testB()
	{
		Reporter.log("testB() of DemoB class", true);
	}
	
	
	@Test
	public void testC()
	{
		Reporter.log("testC() of DemoB class", true);
	}



}
