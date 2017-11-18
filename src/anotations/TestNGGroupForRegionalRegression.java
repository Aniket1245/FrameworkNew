package anotations;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGGroupForRegionalRegression {
	
	@BeforeMethod(alwaysRun=true)
	public void login()
	{
		Reporter.log("Login.....",true);
	}
	
	@AfterMethod(alwaysRun=true)
	public void logout()
	{
		Reporter.log("Logout.....",true);
	}
	
	@Test(priority=1,groups={"user","smoke"})
	public void createUser()
	{
		Reporter.log("Create User....",true);
	}
	
	@Test(priority=2,groups="user")
    public void editUser()
    {
		Reporter.log("Edit User....",true);
    }
	
	@Test(priority=3,groups="user")
	public void deleteUser()
	{
		Reporter.log("Delete user...",true);
	}
	
	
	@Test(priority=4,groups={"task","smoke"})
	public void createTask()
	{
		Reporter.log("Create Task....",true);
	}
	
	@Test(priority=5,groups="task")
    public void editTask()
    {
		Reporter.log("Edit Task....",true);
    }
	
	@Test(priority=6,groups="task")
	public void deleteTask()
	{
		Reporter.log("Delete Task....",true);
	}

	
	
}
