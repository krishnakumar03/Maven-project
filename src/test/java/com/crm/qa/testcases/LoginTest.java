package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
 

import com.crm.qa.base.Base;
import com.crm.qa.pages.LoginPage;

public class LoginTest extends Base{
	 public  LoginPage loginpage;
	
	public LoginTest()
	{
		super();
		
	}
	
	@BeforeMethod
	public  void call()
	{
		invokebrowser();
		loginpage = new LoginPage();	
	}
	
	/*@Test
	public void validatetitle()
	{
		String title = loginpage.title();
		Assert.assertEquals(title, "Free CRM software in the cloud powers sales and customer service");
	} */
	
	@Test 
	public void login()
	{
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@AfterMethod
	public void after()
	{
		driver.close();
		
	}

}
