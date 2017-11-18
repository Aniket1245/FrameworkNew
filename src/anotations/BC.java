package anotations;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BC {
	
	
	@BeforeClass
	public void  beforeClass()
	{
		Reporter.log("Before Class",true);
	}
	
	
	@BeforeMethod()
	public void  beforeMethod()
	{
		Reporter.log("Before Method",true);
	}
	
	
	@AfterMethod()
	public void afterMethod()
	{
		Reporter.log("After Method", true);
	}
	@Test
	public void testA()
	{
		Reporter.log("testA method of BM",true);
	}


}
