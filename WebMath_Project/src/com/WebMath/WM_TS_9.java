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

public class WM_TS_9 {
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

		driver.findElement(By.xpath("//a[text()='Reduce']")).click();
		Thread.sleep(1000);
		String actTitle = driver.getTitle();

		String expextedTitle = "Reduce a Fraction to Lowest Terms - WebMath";

		Assert.assertEquals(actTitle, expextedTitle,
				"Test Failed User not nevigated to Reduce a Fraction to Lowest Terms page successfully");

	}
	
	
	@Test(priority = 2, description = "Validating Input Elements")

	public void TC2() throws Exception {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[text()='Reduce']")).click();
		Thread.sleep(1000);

		WebElement TopTxb = driver.findElement(By.xpath("//input[@name='top']"));
		WebElement BottTxb = driver.findElement(By.xpath("//input[@name='bottom']"));
		WebElement Rdbtn = driver.findElement(By.xpath("//input[@value='Reduce it']"));

		Assert.assertTrue(TopTxb.isDisplayed(), " Top input textbox is not visible");
		Assert.assertTrue(BottTxb.isDisplayed(), "Bottom input textbox is is not visible");
		Assert.assertTrue(Rdbtn.isDisplayed(), " Reduce it Button is not visible");
		
		Assert.assertTrue(TopTxb.isEnabled(), "Top input textbox is disabled");
		Assert.assertTrue(BottTxb.isEnabled(), " Bottom input textbox is disabled");
		Assert.assertTrue(Rdbtn.isEnabled(), " Reduce it Button is disabled");
	
	}
	
	@Test(priority = 3, description = "Validating input")

	public void TC3() throws Exception {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[text()='Reduce']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='top']")).clear();
		driver.findElement(By.xpath("//input[@name='top']")).sendKeys("50");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='bottom']")).clear();
		driver.findElement(By.xpath("//input[@name='bottom']")).sendKeys("75");
		
		Thread.sleep(1000);
		

		String data1 = driver.findElement(By.xpath("//input[@name='top']")).getAttribute("value");
		String data2 = driver.findElement(By.xpath("//input[@name='bottom']")).getAttribute("value");
		
		String DataEntered1 = "50";
		String DataEntered2 = "75";
		
		Assert.assertEquals(data1, DataEntered1, "Test fail input box is not taking the data");
		Assert.assertEquals(data2, DataEntered2, "Test fail input box is not taking the data");
		
		

	}
	
	@Test(priority = 4, description = "Validating Result Accuricy")

	public void TC4() throws Exception {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[text()='Reduce']")).click();
		driver.findElement(By.xpath("//input[@name='top']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='top']")).sendKeys("50");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='bottom']")).clear();
		driver.findElement(By.xpath("//input[@name='bottom']")).sendKeys("75");
	
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Reduce it']")).click();
		
		Thread.sleep(1000);
		

		WebElement ResultFrame = driver.findElement(By.id("centerContentFrame"));
		Assert.assertTrue(ResultFrame.isDisplayed(), "Test failed Calculation not done");

		driver.switchTo().frame(ResultFrame);
		String Result = driver.findElement(By.xpath("/html/body/font/font/p[3]/table/tbody/tr/td/font/font/center")).getText();
		
		String ExpResult = "The fraction is not reduced to lowest terms. We can reduce this fraction to lowest\r\n"
				+ "terms by dividing both the numerator and denominator by 25.\r\n"
				+ "Why divide by 25? 25 is the Greatest Common Divisor (GCD)\r\n"
				+ "or Greatest Common Factor (GCF) of the numbers 50 and 75.\r\n"
				+ "So, this fraction reduced to lowest terms is\r\n"
				+ "\r\n"
				+ "The final answer is: ";
		Assert.assertNotEquals(Result, ExpResult, "Test fail calculetion is not correct");

	}
	
	
	
	@Test(priority = 5, description = "Validating Back to Math Problem Link")
	public void TC5() throws Exception {

		driver.findElement(By.xpath("//a[text()='Reduce']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='top']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='top']")).sendKeys("50");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='bottom']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='bottom']")).sendKeys("75");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Reduce it']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//img[@src='/static/images/backToProblem.gif']")).click();
		Thread.sleep(1000);
		String actTitle = driver.getTitle();
		String expextedTitle = "Reduce a Fraction to Lowest Terms - WebMath";
		Assert.assertEquals(actTitle, expextedTitle,
				"Test Failed User not nevigated to Convert from a Fraction to a Decimal page successfully");

	}
	
	
	
	
	
	@AfterMethod

	public void close() {

		driver.quit();
	
	
	
	}	
	
	
}
