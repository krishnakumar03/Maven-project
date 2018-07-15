package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.crm.qa.base.Base;

public class NewContactsPage extends Base {
	
	
	
 @FindBy(xpath="//a[contains(text(),'Mail Accounts')]")
 WebElement mailacounts;
 
 @FindBy(xpath="//a[contains(text(),'Call') and @title='Call']")
 WebElement call;
 
 public NewContactsPage() {
	PageFactory.initElements(driver, this);
}
 
 public CallPage callpage()
 {
	 WebDriverWait wait = new WebDriverWait(driver, 30);
	 wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("mainpanel"));
	 WebElement element = wait.until(ExpectedConditions.visibilityOf(call));
	 element.click();
	 return new CallPage();
	 
 }
 
}
