package com.crm.qa.testcases;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.Base;
import com.crm.qa.testcases.LoginTest;

public class test extends Base{
	
	 public test() {
	super();
	}
	 @BeforeMethod
	 public void before()
	 {
		 invokebrowser();
		 
	 }
	 
	@Test
	public void testcase()
	{
	LoginTest logintest = new LoginTest();
	logintest.login();
	}

}
