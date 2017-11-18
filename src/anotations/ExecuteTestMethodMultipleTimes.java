package anotations;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ExecuteTestMethodMultipleTimes {
	
	
	@Test(invocationCount=5)
	public void createUser()
	{
		Reporter.log("create User", true);
	}

}
