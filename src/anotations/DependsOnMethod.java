package anotations;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethod {
	
	@Test()
	public void registerUser()
	{
		Reporter.log("register user",true);
	}

	@Test(dependsOnMethods="registerUser")
	public void deleteUser()
	{
		Reporter.log("delete user",true);
	}
	
	@Test
	public void editUser()
	{
		Reporter.log("edit user",true);
	}
}
