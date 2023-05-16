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

public class WM_TS_2 {

	WebDriver driver;

	String url = "https://www.webmath.com";

	@BeforeMethod

	public void launch() throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sel_3.141_Jars_ExcelrOnline\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get(url);

		driver.manage().window().maximize();

		Thread.sleep(1000);

	}

	@Test(priority = 1)

	public void TC1() {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[@title='General Math']")).click();
		String actTitle = driver.getTitle();
		String expextedTitle = "General Math - WebMath";

		Assert.assertEquals(actTitle, expextedTitle,
				"Test Failed User not nevigated to General math page successfully");

	}

	@Test(priority = 2)

	public void TC2() {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[@title='General Math']")).click();

		WebElement l1 = driver.findElement(By.xpath("//a[@title='WebMath Home Page']"));
		WebElement l2 = driver.findElement(By.xpath("//a[@title='Math for Everyone']"));
		WebElement l3 = driver.findElement(By.xpath("//a[@title='General Math']"));
		WebElement l4 = driver.findElement(By.xpath("//a[@title='Kindergarten - 8th Grade Math']"));
		WebElement l5 = driver.findElement(By.xpath("//a[@title='Algebra']"));
		WebElement l6 = driver.findElement(By.xpath("//a[@title='Plots and Geometry']"));
		WebElement l7 = driver.findElement(By.xpath("//a[@title='Triginometry and Calculus']"));
		WebElement l8 = driver.findElement(By.xpath("//a[@title='Plots and Geometry']"));
		WebElement l9 = driver.findElement(By.xpath("//a[@title='WebMath Home Page']"));

		Assert.assertTrue(l1.isDisplayed(), " Home link is not visible");
		Assert.assertTrue(l2.isDisplayed(), " Math for Everyone link is not visible");
		Assert.assertTrue(l3.isDisplayed(), " General Math link is not visible");
		Assert.assertTrue(l4.isDisplayed(), " K-8 Math link is not visible");
		Assert.assertTrue(l5.isDisplayed(), " Algebra link is not visible");
		Assert.assertTrue(l6.isDisplayed(), " Plots and Geometry link is not visible");
		Assert.assertTrue(l7.isDisplayed(), " Triginometry and Calculus link is not visible");
		Assert.assertTrue(l8.isDisplayed(), " Plots and Geometry' link is not visible");
		Assert.assertTrue(l9.isDisplayed(), " Welcome to Webmath! link is not visible");

		Assert.assertTrue(l1.isEnabled(), "Home link is disabled");
		Assert.assertTrue(l2.isEnabled(), "Math for Everyone link is disabled");
		Assert.assertTrue(l3.isEnabled(), "General Math link is disabled");
		Assert.assertTrue(l4.isEnabled(), "K-8 Math link is disabled");
		Assert.assertTrue(l5.isEnabled(), "Algebra link is disabled");
		Assert.assertTrue(l6.isEnabled(), "Plots and Geometry link is disabled");
		Assert.assertTrue(l7.isEnabled(), "Triginometry and Calculus link is disabled");
		Assert.assertTrue(l8.isEnabled(), "Plots and Geometry' link is disabled");
		Assert.assertTrue(l9.isEnabled(), "Welcome to Webmath! link is disabled");

	}

	@Test(priority = 3)

	public void TC3() {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[@title='General Math']")).click();
		WebElement LinkNumbers = driver.findElement(By.xpath("//b[text()='Numbers']"));

		Assert.assertTrue(LinkNumbers.isDisplayed(), "Test Failed Link Numbers is not visible ");

	}

	@Test(priority = 4)

	public void TC4() {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[@title='General Math']")).click();
		WebElement LinkDecimals = driver.findElement(By.xpath("//b[text()='Decimals']"));

		Assert.assertTrue(LinkDecimals.isDisplayed(), "Test Failed Link Decimals is not visible ");

	}

	@Test(priority = 5)

	public void TC5() {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[@title='General Math']")).click();
		WebElement LinkNumberCrn = driver.findElement(By.xpath("//b[text()='Number Crunching']"));

		Assert.assertTrue(LinkNumberCrn.isDisplayed(), "Test Failed Link Number Crunching is not visible ");
	}

	@Test(priority = 6)

	public void TC6() {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[@title='General Math']")).click();
		WebElement LinkFractions = driver.findElement(By.xpath("//b[text()='Fractions']"));

		Assert.assertTrue(LinkFractions.isDisplayed(), "Test Failed Link Fractions is not visible ");

	}

	@Test(priority = 7)

	public void TC7() {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[@title='General Math']")).click();
		WebElement LinkSciNotation = driver.findElement(By.xpath("//b[text()='Scientific Notation']"));

		Assert.assertTrue(LinkSciNotation.isDisplayed(), "Test Failed Link Scientific Notation is not visible ");

	}

	@Test(priority = 8)

	public void TC8() {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[@title='General Math']")).click();

		WebElement DW = driver.findElement(By.xpath("//select[@id='topicItem']"));

		Assert.assertTrue(DW.isDisplayed(), "Test Failed Dropdown is not visible at General Math page");

	}

	@Test(priority = 9)

	public void TC9() {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[@title='General Math']")).click();

		WebElement DW = driver.findElement(By.xpath("//select[@id='topicItem']"));

		Assert.assertTrue(DW.isEnabled(), "Test Failed Dropdown is not Enable at General Math page");

	}

	@AfterMethod

	public void close() {

		driver.quit();

	}

}
