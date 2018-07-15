package com.crm.qa.testcases;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.crm.qa.base.Base;

import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.NewContactsPage;

public class NewContactTest extends Base{
	
public NewContactsPage newct;
public HomePage home;
public LoginPage lpage;
	public NewContactTest() {
	super();
	}
	 @BeforeMethod
	 public void before()
	 {
		 invokebrowser();
		 lpage = new LoginPage();
	     home = lpage.login(prop.getProperty("username"), prop.getProperty("password"));
	     newct = new NewContactsPage();
	   
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	 }
	 
	@Test
	public void testcase()
	{
        newct.callpage();
	}

}
