package annoationMultipleTestMethod;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	 
	@BeforeSuite
	public void beforeSuite()
	{
		Reporter.log("Before Suit",true);
	}
	
	@AfterSuite
	public void afterSuite()
	{
		Reporter.log("After Suite",true);
	}
	
	@BeforeTest
	public void beforeTest()
	{
		Reporter.log("Before Test", true);
	}
	
	@AfterTest
	public void afterTest()
	{
		Reporter.log("After Test",true);
	}
	
	@BeforeClass
	public void  beforeClass()
	{
		Reporter.log("Before Class",true);
	}
	
	@AfterClass
	public void afterClass()
	{
		Reporter.log("Afterr Class", true);
	}
	
	
	@BeforeMethod
	public void  beforeMethod()
	{
		Reporter.log("Before Method",true);
	}
	
	@AfterMethod
	public void aterMethod()
	{
		Reporter.log("After Method", true);
	}

}
