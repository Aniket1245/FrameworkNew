package annoationMultipleTestMethod;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoA  extends BaseTest{
	
	@Test
	public void testA()
	{
		Reporter.log("testA() of DemoA class", true);
	}

}
