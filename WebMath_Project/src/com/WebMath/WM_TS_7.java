package com.WebMath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WM_TS_7 {
	
	WebDriver driver;

	String url = "https://www.webmath.com";

	@BeforeMethod

	public void launch() throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sel_3.141_Jars_ExcelrOnline\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@title='General Math']")).click();

		Thread.sleep(1000);

	}
	
	@Test(priority = 1, description = "Validating Nevagitation")

	public void TC1() {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[text()='Fraction to Decimal']")).click();

		String actTitle = driver.getTitle();

		String expextedTitle = "Convert from a Fraction to a Decimal - WebMath";

		Assert.assertEquals(actTitle, expextedTitle,
				"Test Failed User not nevigated to Convert from a Fraction to a Decimal page successfully");

	}
	

	@Test(priority = 2, description = "Validating Input Elements")

	public void TC2() {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[text()='Fraction to Decimal']")).click();

		
		WebElement TopTxb = driver.findElement(By.xpath("//input[@name='top']"));
		WebElement BottTxb = driver.findElement(By.xpath("//input[@name='bottom']"));
		WebElement DecTxb = driver.findElement(By.xpath("//input[@name='dplaces']"));
		WebElement Btn = driver.findElement(By.xpath("//input[@value='Convert it']"));

		Assert.assertTrue(TopTxb.isDisplayed(), " Top input textbox is not visible");
		Assert.assertTrue(BottTxb.isDisplayed(), "Bottom input textbox is is not visible");
		Assert.assertTrue(DecTxb.isDisplayed(), "Decimal Number TextBox is not visible");
		Assert.assertTrue(Btn.isDisplayed(), " Convert it Button is not visible");

		Assert.assertTrue(TopTxb.isEnabled(), "Top input textbox is disabled");
		Assert.assertTrue(BottTxb.isEnabled(), " Bottom input textbox is disabled");
		Assert.assertTrue(DecTxb.isEnabled(), " Decimal Number TextBox is disabled");
		Assert.assertTrue(Btn.isEnabled(), " Convert it Button is disabled");

	}

	@Test(priority = 3, description = "Validating input")

	public void TC3() throws Exception {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[text()='Fraction to Decimal']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='top']")).clear();
		driver.findElement(By.xpath("//input[@name='top']")).sendKeys("4");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='bottom']")).clear();
		driver.findElement(By.xpath("//input[@name='bottom']")).sendKeys("5");
		driver.findElement(By.xpath("//input[@name='dplaces']")).clear();
		driver.findElement(By.xpath("//input[@name='dplaces']")).sendKeys("2");
		Thread.sleep(1000);
		// driver.findElement(By.xpath("//input[@type='submit']")).click();

		String data1 = driver.findElement(By.xpath("//input[@name='top']")).getAttribute("value");
		String data2 = driver.findElement(By.xpath("//input[@name='bottom']")).getAttribute("value");
		String data3 = driver.findElement(By.xpath("//input[@name='dplaces']")).getAttribute("value");
		String DataEntered1 = "4";
		String DataEntered2 = "5";
		String DataEntered3 = "2";
		Assert.assertEquals(data1, DataEntered1, "Test fail input box is not taking the data");
		Assert.assertEquals(data2, DataEntered2, "Test fail input box is not taking the data");
		Assert.assertEquals(data3, DataEntered3, "Test fail input box is not taking the data");
		

	}
	
	@Test(priority = 4, description = "Validating Result Accuricy")

	public void TC4() throws Exception {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[text()='Fraction to Decimal']")).click();
		driver.findElement(By.xpath("//input[@name='top']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='top']")).sendKeys("4");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='bottom']")).clear();
		driver.findElement(By.xpath("//input[@name='bottom']")).sendKeys("5");
		driver.findElement(By.xpath("//input[@name='dplaces']")).clear();
		driver.findElement(By.xpath("//input[@name='dplaces']")).sendKeys("2");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Convert it']")).click();
		
		Thread.sleep(1000);
		

		WebElement ResultFrame = driver.findElement(By.id("centerContentFrame"));
		Assert.assertTrue(ResultFrame.isDisplayed(), "Test failed Calculation not done");

		driver.switchTo().frame(ResultFrame);
		String Result = driver.findElement(By.xpath("/html/body/font/font/p[2]")).getText();
		
		String ExpResult = "OK, so there's a few steps to set up here in order to convert 4/5 into a decimal.\r\n"
				+ "First off, we'll interpret the fraction bar to mean \"divided by.\" This means that 4/5 is the same as 4 divided by 5.\r\n"
				+ "Second, you have requested to see 2 decimal places in your answer, so we'll write the 4 as 4.00 instead (a 4 with 2 zeros after the decimal point).\r\n"
				+ "Now, we'll just do what the fraction bar says: divide 4.00 by 5:\r\n"
				+ "\r\n"
				+ "And that's about it! 4/5 written as a decimal to 2 decimal places is 0.80.\r\n"
				+ "\r\n"
				+ "If you need help pronouncing 0.80, click here...";
		Assert.assertNotEquals(Result, ExpResult, "Test fail calculetion is not correct");

	}
	
	
	
	
	@Test(priority = 5, description = "Validating Back to Math Problem Link")
	public void TC5() throws Exception {

		driver.findElement(By.xpath("//a[text()='Fraction to Decimal']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='top']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='top']")).sendKeys("4");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='bottom']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='bottom']")).sendKeys("5");
		driver.findElement(By.xpath("//input[@name='dplaces']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='dplaces']")).sendKeys("2");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Convert it']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//img[@src='/static/images/backToProblem.gif']")).click();
		Thread.sleep(1000);
		String actTitle = driver.getTitle();
		String expextedTitle = "Convert from a Fraction to a Decimal - WebMath";
		Assert.assertEquals(actTitle, expextedTitle,
				"Test Failed User not nevigated to Convert from a Fraction to a Decimal page successfully");

	}
	
	
	
	
	
	@AfterMethod

	public void close() {

		driver.quit();
	
	
	
	}	

}
