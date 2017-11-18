 package testngSimple;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoA {

	@Test
	public void testA() 
	{
		/*//print on "Hello" on console only
		System.out.println("Hello");*/
		
		
		/*//print "Hello" on emailable-report.html only
	     Reporter.log("Hello");*/
	     
		/*//print "Hello" on emailable-report.html only
	     Reporter.log("Hello", false);	*/     
		
		
		/*//print on both console as well on report 
		System.out.println("Hello");
		Reporter.log("Hello");*/
		
		
		//print on both console as well on report
		Reporter.log("Hello", true);
		
		
		
	}

}
