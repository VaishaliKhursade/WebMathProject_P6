package com.WebMath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WM_TS_3 {

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

		driver.findElement(By.xpath("//a[text()='Factor']")).click();

		String actTitle = driver.getTitle();

		String expextedTitle = "Factor an Integer - WebMath";

		Assert.assertEquals(actTitle, expextedTitle,
				"Test Failed User not nevigated to Factor an Integer page successfully");

	}

	@Test(priority = 2, description = "Validating Input Elements")

	public void TC2() {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[text()='Factor']")).click();

		WebElement dw1 = driver.findElement(By.xpath("//select[@name='param0']"));
		WebElement Txb = driver.findElement(By.xpath("//input[@name='param1']"));
		WebElement Btn = driver.findElement(By.xpath("//input[@value='Factor it']"));

		Assert.assertTrue(dw1.isDisplayed(), " Show me dropdown is not visible");
		Assert.assertTrue(Txb.isDisplayed(), " Number TextBox is not visible");
		Assert.assertTrue(Btn.isDisplayed(), " Factor it Button is not visible");

		Assert.assertTrue(dw1.isEnabled(), "Show me dropdown is disabled");
		Assert.assertTrue(Txb.isEnabled(), " Number TextBox is disabled");
		Assert.assertTrue(Btn.isEnabled(), " Factor it Button is disabled");

	}

	@Test(priority = 3, description = "Validating input")

	public void TC3() {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[text()='Factor']")).click();
		WebElement dw1 = driver.findElement(By.xpath("//select[@name='param0']"));
		Select obj1 = new Select(dw1);
		obj1.selectByVisibleText("All");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("30");
		String data = driver.findElement(By.xpath("//input[@type='text']")).getAttribute("value");
		String DataEntered = "30";
		Assert.assertEquals(data, DataEntered, "Test fail input box is not taking the data");

	}

	@Test(priority = 4, description = "Validating Result Accuricy")

	public void TC4() {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[text()='Factor']")).click();
		WebElement dw1 = driver.findElement(By.xpath("//select[@name='param0']"));
		Select obj1 = new Select(dw1);
		obj1.selectByVisibleText("All");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("30");
		driver.findElement(By.xpath("//input[@value='Factor it']")).click();
		WebElement ResultFrame = driver.findElement(By.id("centerContentFrame"));
		Assert.assertTrue(ResultFrame.isDisplayed(), "Test failed Calculation not done");
		driver.switchTo().frame(ResultFrame);
		String Result = driver.findElement(By.xpath("/html/body/font/font/blockquote[1]")).getText();
		String ExpResult = "-30, -15, -10, -6, -5, -3, -2, -1, 1, 2, 3, 5, 6, 10, 15, and 30.";
		Assert.assertEquals(Result, ExpResult, "Test fail calculetion is not correct");

	}

	@Test(priority = 5, description = "Validating input")

	public void TC5() {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[text()='Factor']")).click();
		WebElement dw1 = driver.findElement(By.xpath("//select[@name='param0']"));
		Select obj1 = new Select(dw1);
		obj1.selectByVisibleText("Prime");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("30");
		String data = driver.findElement(By.xpath("//input[@type='text']")).getAttribute("value");
		String DataEntered = "30";
		Assert.assertEquals(data, DataEntered, "Test fail input box is not taking the data");

	}

	@Test(priority = 6, description = "Validating Result Accuricy")

	public void TC6() {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[text()='Factor']")).click();
		WebElement dw1 = driver.findElement(By.xpath("//select[@name='param0']"));
		Select obj1 = new Select(dw1);
		obj1.selectByVisibleText("Prime");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("30");
		driver.findElement(By.xpath("//input[@value='Factor it']")).click();
		WebElement ResultFrame = driver.findElement(By.id("centerContentFrame"));
		Assert.assertTrue(ResultFrame.isDisplayed(), "Test failed Calculation not done");
		driver.switchTo().frame(ResultFrame);
		String Result = driver.findElement(By.xpath("/html/body/font/font/blockquote[1]")).getText();
		String ExpResult = "There are 3 prime factors of 30:\r\n"
				+ "\r\n"
				+ "2, 3, and 5.";
		Assert.assertNotEquals(Result, ExpResult, "Test fail calculetion is not correct");

	}

	@Test(priority = 7, description = "Validating Back to Math Problem Link")
	public void TC7() throws Exception {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[text()='Factor']")).click();
		WebElement dw1 = driver.findElement(By.xpath("//select[@name='param0']"));
		Select obj1 = new Select(dw1);
		obj1.selectByVisibleText("Prime");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("30");
		driver.findElement(By.xpath("//input[@value='Factor it']")).click();

		driver.findElement(By.xpath("//img[@src='/static/images/backToProblem.gif']")).click();
		Thread.sleep(1000);
		String actTitle = driver.getTitle();
		String expextedTitle = "Factor an Integer - WebMath";
		Assert.assertEquals(actTitle, expextedTitle,
				"Test Failed User not nevigated to Factor an Integer page successfully");

	}

	@AfterMethod

	public void close() {

		driver.quit();

	}

}
