package com.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomePageTest {
	WebDriver driver;
	
	String url = "https://www.webmath.com";
	public HomePage homePage;
	
	
	
	@BeforeClass 
	public void launch() {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sel_3.141_Jars_ExcelrOnline\\chromedriver.exe");

		driver = new ChromeDriver();
		HomePage h = new HomePage(driver);

		driver.get(url);
		driver.manage().window().maximize();
	}
	

@AfterClass
public void close() {
	driver.quit();
	
}
@Test
public void TS1() {
	
	
}

}
