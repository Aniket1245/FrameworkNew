package anotations;

import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BM {
	
	@BeforeMethod()
	public void  beforeMethod()
	{
		Reporter.log("Before Method",true);
	}
	
	@Test
	public void testA()
	{
		Reporter.log("testA method of BM",true);
	}

}
