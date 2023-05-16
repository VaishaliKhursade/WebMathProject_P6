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

public class WM_TS_5 {

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

		driver.findElement(By.xpath("//a[text()='LCM']")).click();
		Thread.sleep(1000);
		String actTitle = driver.getTitle();

		String expextedTitle = "Find the Least Common Multiple - WebMath";

		Assert.assertEquals(actTitle, expextedTitle,
				"Test Failed User not nevigated to Find the Least Common Multiple page successfully");

	}

	@Test(priority = 2, description = "Validating Input Elements")

	public void TC2() throws Exception {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[text()='LCM']")).click();
		Thread.sleep(1000);

		WebElement Txb = driver.findElement(By.xpath("//input[@type='text']"));
		WebElement btn = driver.findElement(By.xpath("//input[@value='LCM']"));

		Assert.assertTrue(Txb.isDisplayed(), " Type the integers here txb is not visible");
		Assert.assertTrue(btn.isDisplayed(), " LCM btn is not visible");

		Assert.assertTrue(Txb.isEnabled(), " Type the integers here txb is disabled");
		Assert.assertTrue(btn.isEnabled(), " GCF btn is disabled");

	}

	@Test(priority = 3, description = "Validating input")

	public void TC3() throws Exception {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[text()='LCM']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='param0']")).sendKeys("12,15");
		Thread.sleep(2000);
		// driver.findElement(By.xpath("//input[@type='submit']")).click();

		String data = driver.findElement(By.xpath("//input[@name='param0']")).getAttribute("value");
		Thread.sleep(2000);
		String DataEntered = "12,15";
		Assert.assertEquals(data, DataEntered, "Test fail input box is not taking the data");

	}

	@Test(priority = 4, description = "Validating Result Accuricy")

	public void TC4() throws Exception {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[text()='LCM']")).click();
		driver.findElement(By.xpath("//input[@name='param0']")).sendKeys("12,15");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		WebElement ResultFrame = driver.findElement(By.id("centerContentFrame"));
		Assert.assertTrue(ResultFrame.isDisplayed(), "Test failed Calculation not done");

		driver.switchTo().frame(ResultFrame);
		String Result = driver.findElement(By.xpath("/html/body/font/font/center")).getText();
		String ExpResult = "The Least Common Multiple (LCM) of the numbers\r\n" + "12,15\r\n" + "is\r\n" + "60\r\n"
				+ "because 60 is the smallest number that all of the numbers divide into evenly.";
		Assert.assertNotEquals(Result, ExpResult, "Test fail calculetion is not correct");

	}

	@Test(priority = 5, description = "Validating Back to Math Problem Link")
	public void TC5() throws Exception {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[text()='LCM']")).click();

		driver.findElement(By.xpath("//input[@name='param0']")).sendKeys("12,15");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		driver.findElement(By.xpath("//img[@src='/static/images/backToProblem.gif']")).click();
		Thread.sleep(1000);
		String actTitle = driver.getTitle();
		String expextedTitle = "Find the Least Common Multiple - WebMath";
		Assert.assertEquals(actTitle, expextedTitle,
				"Test Failed User not nevigated to Find theLeast Common Multiple page successfully");

	}

	@AfterMethod

	public void close() {

		driver.quit();

	}

}
