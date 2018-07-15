package com.crm.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.crm.qa.base.Base;

public class HomePage extends Base{
	
	//WebDriverWait drivers;
	
	@FindBy(xpath = "//td[contains(text(),'User: Naveen K')]")
	@CacheLookup
	WebElement userNameLabel;
	
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	WebElement contactslink;
	
	@FindBy(xpath="//a[contains(text(),'Deals')]")
	WebElement deallink;
	
	@FindBy(xpath="//a[contains(text(),'New Contact')]")
	WebElement newcontactlink;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean headervalidation()
	{
		return userNameLabel.isDisplayed();
		
	}
	public NewContactsPage hovering()
	{

    WebDriverWait wait = new WebDriverWait(driver,30);
    wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("mainpanel"));
   	WebElement element = wait.until(ExpectedConditions.visibilityOf(contactslink));
   	element.click();
   	return new NewContactsPage(); 

    
	} 
		
	}
	
	
	

