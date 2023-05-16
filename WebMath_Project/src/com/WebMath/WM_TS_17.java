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

public class WM_TS_17 {
	
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

	public void TC1() throws Exception {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[@href='sn_convert.html']")).click();
		Thread.sleep(1000);
		String actTitle = driver.getTitle();

		String expextedTitle = "Convert between Regular Decimals and Scientific Notation - WebMath";

		Assert.assertEquals(actTitle, expextedTitle,
				"Test Failed User not nevigated toConvert between Regular Decimals and Scientific Notation page successfully");

	}

	@Test(priority = 2, description = "Validating Input Elements")

	public void TC2() throws Exception {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[@href='sn_convert.html']")).click();
		Thread.sleep(1000);

		WebElement Txb1 = driver.findElement(By.xpath("//input[@name='p1exp1']"));
		WebElement Txb2 = driver.findElement(By.xpath("//input[@name='p1base1']"));
		WebElement Txb3 = driver.findElement(By.xpath("//input[@name='p2base1']"));
		
		Assert.assertTrue(Txb1.isDisplayed(), "Input textbox1 is not visible");
		Assert.assertTrue(Txb2.isDisplayed(), "Input textbox2 is not visible");
		Assert.assertTrue(Txb3.isDisplayed(), "Input textbox3 is not visible");
		
		Assert.assertTrue(Txb1.isEnabled(), "Input textbox1 is disabled");
		Assert.assertTrue(Txb2.isEnabled(), "Input textbox2 is disabled");
		Assert.assertTrue(Txb3.isEnabled(), "Input textbox3 is disabled");

}
	
	@Test(priority = 3, description = "Validating input")

	public void TC3() throws Exception {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[@href='sn_convert.html']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@name='p1exp1']")).sendKeys("2");
		driver.findElement(By.xpath("//input[@name='p1base1']")).sendKeys("3");
		driver.findElement(By.xpath("//input[@name='p2base1']")).sendKeys("5000");
		
		String data1 = driver.findElement(By.xpath("//input[@name='p1exp1']")).getAttribute("value");
		String data2 = driver.findElement(By.xpath("//input[@name='p1base1']")).getAttribute("value");
		String data3 = driver.findElement(By.xpath("//input[@name='p2base1']")).getAttribute("value");
		String DataEntered1 = "2";
		String DataEntered2 = "3";
		String DataEntered3 = "5000";
		
		Assert.assertEquals(data1, DataEntered1, "Test fail input box is not taking the data");
		Assert.assertEquals(data2, DataEntered2, "Test fail input box is not taking the data");
		Assert.assertEquals(data3, DataEntered3, "Test fail input box is not taking the data");
	
	
	}
	

	@Test(priority = 4, description = "Validating Result Accuricy 1")

	public void TC4() throws Exception {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@href='sn_convert.html']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@name='p1exp1']")).sendKeys("2");
		driver.findElement(By.xpath("//input[@name='p1base1']")).sendKeys("3");
		driver.findElement(By.xpath("//input[@value='Convert']")).click();
		Thread.sleep(1000);

		WebElement ResultFrame = driver.findElement(By.xpath("//iframe[@name='centerContentFrame']"));
		Assert.assertTrue(ResultFrame.isDisplayed(), "Test failed Calculation not done");

		driver.switchTo().frame(ResultFrame);
		String Result = driver.findElement(By.xpath("/html/body/font/blockquote/center")).getText();

		String ExpResult = "To convert 3 × 102 into regular notation:\r\n"
				+ "To convert 3.0 into regular format, move the decimal point to the right 2 places. Why? Because that's what × 102 means: multiply by a 1 with 2 zero(s) after it. And, with each zero in a multiplication, the decimal moves to the right 1 place.\r\n"
				+ "\r\n"
				+ "So 3.0 × 102 written in regular notation is\r\n"
				+ "300";
		Assert.assertNotEquals(Result, ExpResult, "Test fail calculetion is not correct");

}
	
	
	

	@Test(priority = 5, description = "Validating Result Accuricy 2")

	public void TC5() throws Exception {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@href='sn_convert.html']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@name='p2base1']")).sendKeys("5000");
		driver.findElement(By.xpath("//input[@value='Convert']")).click();
		Thread.sleep(1000);

		WebElement ResultFrame = driver.findElement(By.xpath("//iframe[@name='centerContentFrame']"));
		Assert.assertTrue(ResultFrame.isDisplayed(), "Test failed Calculation not done");

		driver.switchTo().frame(ResultFrame);
		String Result = driver.findElement(By.xpath("/html/body/font/blockquote/center")).getText();

		String ExpResult = "The goal of writing a number in scientific notation is to have a decimal number, with one digit to theleft of the decmial point, followed by a × 10to some power.\r\n"
				+ "To format your number in this way, we'll divide the 5000 by 10, 3 time(s), making it a 5.\r\n"
				+ "We do this, because each division by 10 moves the decimal point to the left one digit.\r\n"
				+ "But in order to keep our number the same number, we must have a × 103 next to the 5.\r\n"
				+ "\r\n"
				+ "So, the final answer is 5 × 103";
		Assert.assertNotEquals(Result, ExpResult, "Test fail calculetion is not correct");

}
	
	@Test(priority = 6, description = "Validating Back to Math Problem Link")

	public void TC6() throws Exception {
	  
		driver.findElement(By.xpath("//a[@href='sn_convert.html']")).click();
		Thread.sleep(1000);


		driver.findElement(By.xpath("//input[@name='p1exp1']")).sendKeys("2");
		driver.findElement(By.xpath("//input[@name='p1base1']")).sendKeys("3");
		driver.findElement(By.xpath("//input[@value='Convert']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//img[@src='/static/images/backToProblem.gif']")
				  ).click();
		Thread.sleep(1000);
	  String actTitle = driver.getTitle(); String
	  expextedTitle = "Convert between Regular Decimals and Scientific Notation - WebMath";
	  Assert.assertEquals(actTitle, expextedTitle,
	  "Test Failed User not nevigated Convert between Regular Decimals and Scientific Notation page successfully"
	  );
	
	}
	
	
	@Test(priority = 7, description = "Validating Clear entire Form Button")

	public void TC7() throws Exception {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[@href='sn_convert.html']")).click();
		Thread.sleep(1000);
		

		driver.findElement(By.xpath("//input[@name='p1exp1']")).sendKeys("2");
		driver.findElement(By.xpath("//input[@name='p1base1']")).sendKeys("3");
		driver.findElement(By.xpath("//input[@name='p2base1']")).sendKeys("5000");
		driver.findElement(By.xpath("//input[@value='Clear the Form']")).click();
		
		String data1 = driver.findElement(By.xpath("//input[@name='p1exp1']")).getAttribute("value");
		String data2 = driver.findElement(By.xpath("//input[@name='p1base1']")).getAttribute("value");
		String data3 = driver.findElement(By.xpath("//input[@name='p2base1']")).getAttribute("value");

		String DataEntered1 = "";
		String DataEntered2 = "";
		String DataEntered3 = "";
		
		Assert.assertEquals(data1, DataEntered1, "Test fail input box is not Empty");
		Assert.assertEquals(data2, DataEntered2, "Test fail input box is not Empty");
		Assert.assertEquals(data3, DataEntered3, "Test fail input box is not Empty");
	}

	@AfterMethod

	public void close() {

		driver.quit();

	}
}