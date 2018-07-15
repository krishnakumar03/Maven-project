package com.crm.qa.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.Base;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class HomPageTest extends Base{
	public LoginPage loginpage;
	public HomePage homepage;
	
	public HomPageTest() {
	     super();
	}
	
	@BeforeMethod 
	public void before()
	{
		try {
			invokebrowser();
			loginpage = new LoginPage();
			// homepage = new HomePage();
			homepage= loginpage.login(prop.getProperty("username"), prop.getProperty("password"));	
			
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
	}
	@Test
	public void contactmethod()
	{
			try {
				homepage.hovering();
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	}
 @AfterMethod
 public void after()
 {
	 driver.close();
	 
 }
}
