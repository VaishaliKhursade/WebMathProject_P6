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

public class WM_TS_14 {

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

		driver.findElement(By.xpath("//a[text()='Converting']")).click();
		Thread.sleep(1000);
		String actTitle = driver.getTitle();

		String expextedTitle = "Conversion Between an Improper Fraction and a Mixed Number - WebMath";

		Assert.assertEquals(actTitle, expextedTitle,
				"Test Failed User not nevigated toConversion Between an Improper Fraction and a Mixed Number page successfully");

	}

	@Test(priority = 2, description = "Validating Input Elements")

	public void TC2() throws Exception {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[text()='Converting']")).click();
		Thread.sleep(1000);

		WebElement TopTxb1 = driver.findElement(By.xpath("//input[@name='top']"));
		WebElement BottTxb1 = driver.findElement(By.xpath("//input[@name='bottom']"));
		WebElement TopTxb2 = driver.findElement(By.xpath("//input[@name='mntop']"));
		WebElement BottTxb2 = driver.findElement(By.xpath("//input[@name='mnbottom']"));
		WebElement WholeTxb2 = driver.findElement(By.xpath("//input[@name='mnwhole']"));
		WebElement Convbtn = driver.findElement(By.xpath("//input[@value='Convert it']"));

		Assert.assertTrue(TopTxb1.isDisplayed(), " Top input textbox1 is not visible");
		Assert.assertTrue(BottTxb1.isDisplayed(), "Bottom input textbox1 is is not visible");
		Assert.assertTrue(TopTxb2.isDisplayed(), " Top input textbox2 is not visible");
		Assert.assertTrue(BottTxb2.isDisplayed(), "Bottom input textbox2 is not visible");
		Assert.assertTrue(WholeTxb2.isDisplayed(), "Bottom input WholeTxb2 is not visible");
		Assert.assertTrue(Convbtn.isDisplayed(), " Convert it Button is not visible");

		Assert.assertTrue(TopTxb1.isEnabled(), "Top input textbox1 is disabled");
		Assert.assertTrue(BottTxb1.isEnabled(), " Bottom input textbox1 is disabled");
		Assert.assertTrue(TopTxb2.isEnabled(), "Top input textbox2 is disabled");
		Assert.assertTrue(BottTxb2.isEnabled(), " Bottom input textbox2 is disabled");
		Assert.assertTrue(WholeTxb2.isEnabled(), "Bottom input WholeTxb2 is disabled");
		Assert.assertTrue(Convbtn.isEnabled(), " Convert it Button is disabled");
	}

	@Test(priority = 3, description = "Validating input")

	public void TC3() throws Exception {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[text()='Converting']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@name='top']")).sendKeys("4");
		driver.findElement(By.xpath("//input[@name='bottom']")).sendKeys("5");
		driver.findElement(By.xpath("//input[@name='mntop']")).sendKeys("8");
		driver.findElement(By.xpath("//input[@name='mnbottom']")).sendKeys("3");
		driver.findElement(By.xpath("//input[@name='mnwhole']")).sendKeys("2");
		// driver.findElement(By.xpath("//input[@value='Convert it']"));

		String data1 = driver.findElement(By.xpath("//input[@name='top']")).getAttribute("value");
		String data2 = driver.findElement(By.xpath("//input[@name='bottom']")).getAttribute("value");
		String data3 = driver.findElement(By.xpath("//input[@name='mntop']")).getAttribute("value");
		String data4 = driver.findElement(By.xpath("//input[@name='mnbottom']")).getAttribute("value");
		String data5 = driver.findElement(By.xpath("//input[@name='mnwhole']")).getAttribute("value");

		String DataEntered1 = "4";
		String DataEntered2 = "5";
		String DataEntered3 = "8";
		String DataEntered4 = "3";
		String DataEntered5 = "2";
		
		Assert.assertEquals(data1, DataEntered1, "Test fail input box is not taking the data");
		Assert.assertEquals(data2, DataEntered2, "Test fail input box is not taking the data");
		Assert.assertEquals(data3, DataEntered3, "Test fail input box is not taking the data");
		Assert.assertEquals(data4, DataEntered4, "Test fail input box is not taking the data");
		Assert.assertEquals(data5, DataEntered5, "Test fail input box is not taking the data");	
		}
	
	@Test(priority = 4, description = "Validating Result Accuricy 1")

	public void TC4() throws Exception {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Converting']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@name='top']")).sendKeys("10");
		driver.findElement(By.xpath("//input[@name='bottom']")).sendKeys("3");
		driver.findElement(By.xpath("//input[@value='Convert it']")).click();
	
	Thread.sleep(1000);

	WebElement ResultFrame = driver.findElement(By.xpath("//iframe[@name='centerContentFrame']"));
	Assert.assertTrue(ResultFrame.isDisplayed(), "Test failed Calculation not done");

	driver.switchTo().frame(ResultFrame);
	String Result = driver.findElement(By.xpath("/html/body/font/font/font/p[2]")).getText();

	String ExpResult = "To convert to a mixed number:\r\n"
			+ "\r\n"
			+ "First, divide the numerator (the 10) by the denominator (the 3). This will give\r\n"
			+ "you 3, with a remainder of 1.\r\n"
			+ "The mixed number can be created by using the 3 as the whole number, the 1 as the numerator\r\n"
			+ "and the 3 as the denominator.\r\n"
			+ "So, as an improper fraction is ";
	Assert.assertNotEquals(Result, ExpResult, "Test fail calculetion is not correct");

}
	
	
	
	@Test(priority = 5, description = "Validating Result Accuricy 2")

	public void TC5() throws Exception {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Converting']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='mntop']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@name='mnbottom']")).sendKeys("5");
		driver.findElement(By.xpath("//input[@name='mnwhole']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@value='Convert it']")).click();
	
	Thread.sleep(1000);

	WebElement ResultFrame = driver.findElement(By.xpath("//iframe[@name='centerContentFrame']"));
	Assert.assertTrue(ResultFrame.isDisplayed(), "Test failed Calculation not done");

	driver.switchTo().frame(ResultFrame);
	String Result = driver.findElement(By.xpath("/html/body/font/font/font/p[2]")).getText();

	String ExpResult = " To convert to an improper fraction:\r\n"
			+ "\r\n"
			+ "multiply the 5 (the denominator), and the 1 (the whole number). To this product, add the 1 (the numerator)\r\n"
			+ "giving 6, to form the new numerator, and use the 5 as the new denominator.\r\n"
			+ "So, as an improper fraction is ";
	Assert.assertNotEquals(Result, ExpResult, "Test fail calculetion is not correct");

}
	
	@Test(priority = 6, description = "Validating Back to Math Problem Link")

	public void TC6() throws Exception {
	  
	  driver.findElement(By.xpath("//a[text()='Converting']")).click();
	  Thread.sleep(1000);
	  
	  driver.findElement(By.xpath("//input[@name='top']")).sendKeys("10");
		driver.findElement(By.xpath("//input[@name='bottom']")).sendKeys("3");
		driver.findElement(By.xpath("//input[@value='Convert it']")).click();
	  
	  driver.findElement(By.xpath("//img[@src='/static/images/backToProblem.gif']")
	  ).click();
	  Thread.sleep(1000); 
	  String actTitle = driver.getTitle(); String
	  expextedTitle = "Conversion Between an Improper Fraction and a Mixed Number - WebMath";
	  Assert.assertEquals(actTitle, expextedTitle,
	  "Test Failed User not nevigated Conversion Between an Improper Fraction and a Mixed Number page successfully"
	  );
	
	}
	
	@Test(priority = 7, description = "Validating Clear entire Form Button")

	public void TC7() throws Exception {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[text()='Converting']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='top']")).sendKeys("4");
		driver.findElement(By.xpath("//input[@name='bottom']")).sendKeys("5");
		driver.findElement(By.xpath("//input[@name='mntop']")).sendKeys("8");
		driver.findElement(By.xpath("//input[@name='mnbottom']")).sendKeys("3");
		driver.findElement(By.xpath("//input[@name='mnwhole']")).sendKeys("2");
		driver.findElement(By.xpath("//input[@value='Clear the Entire Form']")).click();
		
		String data1 = driver.findElement(By.xpath("//input[@name='top']")).getAttribute("value");
		String data2 = driver.findElement(By.xpath("//input[@name='bottom']")).getAttribute("value");
		String data3 = driver.findElement(By.xpath("//input[@name='mntop']")).getAttribute("value");
		String data4 = driver.findElement(By.xpath("//input[@name='mnbottom']")).getAttribute("value");
		String data5 = driver.findElement(By.xpath("//input[@name='mnwhole']")).getAttribute("value");
		
		String DataEntered1 = "";
		String DataEntered2 = "";
		String DataEntered3 = "";
		String DataEntered4 = "";
		String DataEntered5 = "";
	
		Assert.assertEquals(data1, DataEntered1, "Test fail input box is not Empty");
		Assert.assertEquals(data2, DataEntered2, "Test fail input box is not Empty");
		Assert.assertEquals(data3, DataEntered3, "Test fail input box is not Empty");
		Assert.assertEquals(data4, DataEntered4, "Test fail input box is not Empty");
		Assert.assertEquals(data5, DataEntered5, "Test fail input box is not Empty");
	}
	
	@AfterMethod

	public void close() {

		driver.quit();

	}
}