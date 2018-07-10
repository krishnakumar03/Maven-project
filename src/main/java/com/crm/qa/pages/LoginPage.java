package com.crm.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.Base;

public class LoginPage extends Base {
	
	//Page Factory
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@type=\"submit\"]")
	WebElement loginbtn;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String title()
	{
		return driver.getTitle();
		
	}
	
	public HomePage login(String un, String pass)
	{
		username.sendKeys(un);
		password.sendKeys(pass);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", loginbtn);
          //  loginbtn.click();
            return new  HomePage();
	}
}
