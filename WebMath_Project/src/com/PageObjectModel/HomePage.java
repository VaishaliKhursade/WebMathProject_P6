package com.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
	      this.driver = driver;
	   }
	
	
		
	
	
	//@By(xpath = "//img[@src='/static/images/WebMathv16Logo.gif']")
	public WebElement Logo;

}
