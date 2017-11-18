package anotations;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderAnnoataion

{
	@DataProvider
	
	//public String[][] getData() {
		//String[][] data = new String[2][2];
		
	public Object[][] getData() {
		Object[][] data = new Object[2][2];
		data[0][0]="userA";
		data[0][1]="pass1";
		data[1][0]="userB";
		//data[1][1]="pass2";
		data[1][1]=1234;
		
		return data;
		
	}

    @Test(dataProvider="getData")
   // public void createUser(String un, String pw)
    public void createUser(String un, Object pw)
    {
    	Reporter.log(un+" "+pw,true);
    }

}

