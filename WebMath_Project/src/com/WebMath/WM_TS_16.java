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

public class WM_TS_16 {
	

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

		driver.findElement(By.xpath("//a[text()='Divide with']")).click();
		Thread.sleep(1000);
		String actTitle = driver.getTitle();

		String expextedTitle = "Divide Two Numbers in Scientific Notation - WebMath";

		Assert.assertEquals(actTitle, expextedTitle,
				"Test Failed User not nevigated to Divide Two Numbers in Scientific Notation page successfully");

	}

	@Test(priority = 2, description = "Validating Input Elements")

	public void TC2() throws Exception {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[text()='Divide with']")).click();
		Thread.sleep(1000);

		WebElement Txb1 = driver.findElement(By.xpath("//input[@name='p1exp1']"));
		WebElement Txb2 = driver.findElement(By.xpath("//input[@name='p1exp2']"));
		WebElement Txb3 = driver.findElement(By.xpath("//input[@name='p1base1']"));
		WebElement Txb4 = driver.findElement(By.xpath("//input[@name='p1base2']"));
		WebElement Txb5 = driver.findElement(By.xpath("//input[@name='p2exp1']"));
		WebElement Txb6 = driver.findElement(By.xpath("//input[@name='p2base1']"));
		WebElement Txb7 = driver.findElement(By.xpath("//input[@name='p2base2']"));
		WebElement Txb8 = driver.findElement(By.xpath("//input[@name='p3exp2']"));
		WebElement Txb9 = driver.findElement(By.xpath("//input[@name='p3base1']"));
		WebElement Txb10 = driver.findElement(By.xpath("//input[@name='p3base2']"));
		
		Assert.assertTrue(Txb1.isDisplayed(), "Input textbox1 is not visible");
		Assert.assertTrue(Txb2.isDisplayed(), "Input textbox2 is not visible");
		Assert.assertTrue(Txb3.isDisplayed(), "Input textbox3 is not visible");
		Assert.assertTrue(Txb4.isDisplayed(), "Input textbox4 is not visible");
		Assert.assertTrue(Txb5.isDisplayed(), "Input textbox5 is not visible");
		Assert.assertTrue(Txb6.isDisplayed(), "Input textbox6 is not visible");
		Assert.assertTrue(Txb7.isDisplayed(), "Input textbox7 is not visible");
		Assert.assertTrue(Txb8.isDisplayed(), "Input textbox8 is not visible");
		Assert.assertTrue(Txb9.isDisplayed(), "Input textbox9 is not visible");
		Assert.assertTrue(Txb10.isDisplayed(), "Input textbox10 is not visible");


		Assert.assertTrue(Txb1.isEnabled(), "Input textbox1 is disabled");
		Assert.assertTrue(Txb2.isEnabled(), "Input textbox2 is disabled");
		Assert.assertTrue(Txb3.isEnabled(), "Input textbox3 is disabled");
		Assert.assertTrue(Txb4.isEnabled(), "Input textbox4 is disabled");
		Assert.assertTrue(Txb5.isEnabled(), "Input textbox5 is disabled");
		Assert.assertTrue(Txb6.isEnabled(), "Input textbox6 is disabled");
		Assert.assertTrue(Txb7.isEnabled(), "Input textbox7 is disabled");
		Assert.assertTrue(Txb8.isEnabled(), "Input textbox8 is disabled");
		Assert.assertTrue(Txb9.isEnabled(), "Input textbox9 is disabled");
		Assert.assertTrue(Txb10.isEnabled(), "Input textbox10 is disabled");
		
		
		
}
	
	@Test(priority = 3, description = "Validating input")

	public void TC3() throws Exception {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[text()='Divide with']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@name='p1exp1']")).sendKeys("2");
		driver.findElement(By.xpath("//input[@name='p1exp2']")).sendKeys("3");
		driver.findElement(By.xpath("//input[@name='p1base1']")).sendKeys("4");
		driver.findElement(By.xpath("//input[@name='p1base2']")).sendKeys("5");
		driver.findElement(By.xpath("//input[@name='p2exp1']")).sendKeys("6");
		driver.findElement(By.xpath("//input[@name='p2base1']")).sendKeys("7");
		driver.findElement(By.xpath("//input[@name='p2base2']")).sendKeys("8");
		driver.findElement(By.xpath("//input[@name='p3exp2']")).sendKeys("2");
		driver.findElement(By.xpath("//input[@name='p3base1']")).sendKeys("3");
		driver.findElement(By.xpath("//input[@name='p3base2']")).sendKeys("4");
		
		// driver.findElement(By.xpath("//input[@value='Convert it']"));

		String data1 = driver.findElement(By.xpath("//input[@name='p1exp1']")).getAttribute("value");
		String data2 = driver.findElement(By.xpath("//input[@name='p1exp2']")).getAttribute("value");
		String data3 = driver.findElement(By.xpath("//input[@name='p1base1']")).getAttribute("value");
		String data4 = driver.findElement(By.xpath("//input[@name='p1base2']")).getAttribute("value");
		String data5 = driver.findElement(By.xpath("//input[@name='p2exp1']")).getAttribute("value");
		String data6 = driver.findElement(By.xpath("//input[@name='p2base1']")).getAttribute("value");
		String data7 = driver.findElement(By.xpath("//input[@name='p2base2']")).getAttribute("value");
		String data8 = driver.findElement(By.xpath("//input[@name='p3exp2']")).getAttribute("value");
		String data9 = driver.findElement(By.xpath("//input[@name='p3base1']")).getAttribute("value");
		String data10 = driver.findElement(By.xpath("//input[@name='p3base2']")).getAttribute("value");
		
		String DataEntered1 = "2";
		String DataEntered2 = "3";
		String DataEntered3 = "4";
		String DataEntered4 = "5";
		String DataEntered5 = "6";
		String DataEntered6 = "7";
		String DataEntered7 = "8";
		String DataEntered8 = "2";
		String DataEntered9 = "3";
		String DataEntered10 = "4";
		
		Assert.assertEquals(data1, DataEntered1, "Test fail input box is not taking the data");
		Assert.assertEquals(data2, DataEntered2, "Test fail input box is not taking the data");
		Assert.assertEquals(data3, DataEntered3, "Test fail input box is not taking the data");
		Assert.assertEquals(data4, DataEntered4, "Test fail input box is not taking the data");
		Assert.assertEquals(data5, DataEntered5, "Test fail input box is not taking the data");	
		Assert.assertEquals(data6, DataEntered6, "Test fail input box is not taking the data");
		Assert.assertEquals(data7, DataEntered7, "Test fail input box is not taking the data");	
		Assert.assertEquals(data8, DataEntered8, "Test fail input box is not taking the data");	
		Assert.assertEquals(data9, DataEntered9, "Test fail input box is not taking the data");
		Assert.assertEquals(data10, DataEntered10, "Test fail input box is not taking the data");
		}
	
	
	@Test(priority = 4, description = "Validating Result Accuricy 1")

	public void TC4() throws Exception {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Divide with']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@name='p1exp1']")).sendKeys("2");
		driver.findElement(By.xpath("//input[@name='p1exp2']")).sendKeys("3");
		driver.findElement(By.xpath("//input[@name='p1base1']")).sendKeys("4");
		driver.findElement(By.xpath("//input[@name='p1base2']")).sendKeys("5");
		driver.findElement(By.xpath("//input[@value='Divide']")).click();
	
	Thread.sleep(1000);

	WebElement ResultFrame = driver.findElement(By.xpath("//iframe[@name='centerContentFrame']"));
	Assert.assertTrue(ResultFrame.isDisplayed(), "Test failed Calculation not done");

	driver.switchTo().frame(ResultFrame);
	String Result = driver.findElement(By.xpath("/html/body/font/font/blockquote/blockquote/center")).getText();

	String ExpResult = "To divide 4 × 102 by 5 × 103:\r\n"
			+ "First, divide the two bases, that is, divide 4 and 5 to get 0.8.\r\n"
			+ "Next, subtract the two exponents, that is, 2 minus 3 to get -1.\r\n"
			+ "So, your answer is 0.8 × 10-1\r\n"
			+ "Although this answer is perfectly O.K., most commonly the base, or the 0.8, is written as a number with just one digit to the left of the decimal.\r\n"
			+ "To format our answer in this way, we'll multiply the 0.8 by 10, 1 time(s), making it a 8.\r\n"
			+ "But in order to do so, we must subtract 1 to the exponent of the 10, making the -1 a(n) -2.\r\n"
			+ "\r\n"
			+ "So, the final answer is 8 × 10-2";
	Assert.assertNotEquals(Result, ExpResult, "Test fail calculetion is not correct");

}
	
	@Test(priority = 5, description = "Validating Result Accuricy 2")

	public void TC5() throws Exception {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Divide with']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@name='p2exp1']")).sendKeys("6");
		driver.findElement(By.xpath("//input[@name='p2base1']")).sendKeys("7");
		driver.findElement(By.xpath("//input[@name='p2base2']")).sendKeys("8");
		driver.findElement(By.xpath("//input[@value='Divide']")).click();
	
	Thread.sleep(1000);

	WebElement ResultFrame = driver.findElement(By.xpath("//iframe[@name='centerContentFrame']"));
	Assert.assertTrue(ResultFrame.isDisplayed(), "Test failed Calculation not done");

	driver.switchTo().frame(ResultFrame);
	String Result = driver.findElement(By.xpath("/html/body/font/font/blockquote/blockquote/center")).getText();

	String ExpResult = "To divide 7 × 106 by 8:\r\n"
			+ "First, divide the base of the number in scientfic notation, the 7, by the regular number, the 8 to get 0.875.\r\n"
			+ "The exponent of the 10 in the final answer will just be the 6.\r\n"
			+ "So, your answer is 0.875 × 106\r\n"
			+ "Although this answer is perfectly O.K., most commonly the base, or the 0.875, is written as a number with just one digit to the left of the decimal.\r\n"
			+ "To format our answer in this way, we'll multiply the 0.875 by 10, 1 time(s), making it a 8.75.\r\n"
			+ "But in order to do so, we must subtract 1 to the exponent of the 10, making the 6 a(n) 5.\r\n"
			+ "\r\n"
			+ "So, the final answer is 8.75 × 105";
	Assert.assertNotEquals(Result, ExpResult, "Test fail calculetion is not correct");

}
	
	
	
	@Test(priority = 6, description = "Validating Result Accuricy 3")

	public void TC6() throws Exception {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Divide with']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@name='p3exp2']")).sendKeys("2");
		driver.findElement(By.xpath("//input[@name='p3base1']")).sendKeys("3");
		driver.findElement(By.xpath("//input[@name='p3base2']")).sendKeys("4");
		driver.findElement(By.xpath("//input[@value='Divide']")).click();
	
	Thread.sleep(1000);

	WebElement ResultFrame = driver.findElement(By.xpath("//iframe[@name='centerContentFrame']"));
	Assert.assertTrue(ResultFrame.isDisplayed(), "Test failed Calculation not done");

	driver.switchTo().frame(ResultFrame);
	String Result = driver.findElement(By.xpath("/html/body/font/font/blockquote/blockquote/center")).getText();

	String ExpResult = "To divide 3 by 4 × 102:\r\n"
			+ "First, divide the regular number, the 3, by the base of the number in scientfic notation, the 4, to get 0.75.\r\n"
			+ "Since this is a division, the exponent of the 10 in the final answer will be -2.\r\n"
			+ "So, your answer is 0.75 × 10-2\r\n"
			+ "Although this answer is perfectly O.K., most commonly the base, or the 0.75, is written as a number with just one digit to the left of the decimal.\r\n"
			+ "To format our answer in this way, we'll multiply the 0.75 by 10, 1 time(s), making it a 7.5.\r\n"
			+ "But in order to do so, we must subtract 1 to the exponent of the 10, making the -2 a(n) -3.\r\n"
			+ "\r\n"
			+ "So, the final answer is 7.5 × 10-3";
	Assert.assertNotEquals(Result, ExpResult, "Test fail calculetion is not correct");

}
	
	
	@Test(priority = 7, description = "Validating Back to Math Problem Link")

	public void TC7() throws Exception {
	  
		driver.findElement(By.xpath("//a[text()='Divide with']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@name='p2exp1']")).sendKeys("6");
		driver.findElement(By.xpath("//input[@name='p2base1']")).sendKeys("7");
		driver.findElement(By.xpath("//input[@name='p2base2']")).sendKeys("8");
		driver.findElement(By.xpath("//input[@value='Divide']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//img[@src='/static/images/backToProblem.gif']")
				  ).click();
		Thread.sleep(1000);
	  String actTitle = driver.getTitle(); String
	  expextedTitle = "Divide Two Numbers in Scientific Notation - WebMath";
	  Assert.assertEquals(actTitle, expextedTitle,
	  "Test Failed User not nevigated Multiply Two Numbers in Scientific Notation page successfully"
	  );
	
	}
	
	
	@Test(priority = 8, description = "Validating Clear entire Form Button")

	public void TC8() throws Exception {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[text()='Divide with']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='p1exp1']")).sendKeys("2");
		driver.findElement(By.xpath("//input[@name='p1exp2']")).sendKeys("3");
		driver.findElement(By.xpath("//input[@name='p1base1']")).sendKeys("4");
		driver.findElement(By.xpath("//input[@name='p1base2']")).sendKeys("5");
		driver.findElement(By.xpath("//input[@name='p2exp1']")).sendKeys("6");
		driver.findElement(By.xpath("//input[@name='p2base1']")).sendKeys("7");
		driver.findElement(By.xpath("//input[@name='p2base2']")).sendKeys("8");
		driver.findElement(By.xpath("//input[@name='p3exp2']")).sendKeys("2");
		driver.findElement(By.xpath("//input[@name='p3base1']")).sendKeys("3");
		driver.findElement(By.xpath("//input[@name='p3base2']")).sendKeys("4");
		driver.findElement(By.xpath("//input[@value='Clear the Form']")).click();
		
		String data1 = driver.findElement(By.xpath("//input[@name='p1exp1']")).getAttribute("value");
		String data2 = driver.findElement(By.xpath("//input[@name='p1exp2']")).getAttribute("value");
		String data3 = driver.findElement(By.xpath("//input[@name='p1base1']")).getAttribute("value");
		String data4 = driver.findElement(By.xpath("//input[@name='p1base2']")).getAttribute("value");
		String data5 = driver.findElement(By.xpath("//input[@name='p2exp1']")).getAttribute("value");
		String data6 = driver.findElement(By.xpath("//input[@name='p2base1']")).getAttribute("value");
		String data7 = driver.findElement(By.xpath("//input[@name='p2base2']")).getAttribute("value");
		String data8 = driver.findElement(By.xpath("//input[@name='p3exp2']")).getAttribute("value");
		String data9 = driver.findElement(By.xpath("//input[@name='p3base1']")).getAttribute("value");
		String data10 = driver.findElement(By.xpath("//input[@name='p3base2']")).getAttribute("value");
		
		
		String DataEntered1 = "";
		String DataEntered2 = "";
		String DataEntered3 = "";
		String DataEntered4 = "";
		String DataEntered5 = "";
		String DataEntered6 = "";
		String DataEntered7 = "";
		String DataEntered8 = "";
		String DataEntered9 = "";
		String DataEntered10 = "";
	
		Assert.assertEquals(data1, DataEntered1, "Test fail input box is not Empty");
		Assert.assertEquals(data2, DataEntered2, "Test fail input box is not Empty");
		Assert.assertEquals(data3, DataEntered3, "Test fail input box is not Empty");
		Assert.assertEquals(data4, DataEntered4, "Test fail input box is not Empty");
		Assert.assertEquals(data5, DataEntered5, "Test fail input box is not Empty");
		Assert.assertEquals(data6, DataEntered6, "Test fail input box is not Empty");
		Assert.assertEquals(data7, DataEntered7, "Test fail input box is not Empty");
		Assert.assertEquals(data8, DataEntered8, "Test fail input box is not Empty");
		Assert.assertEquals(data9, DataEntered9, "Test fail input box is not Empty");
		Assert.assertEquals(data10, DataEntered10, "Test fail input box is not Empty");
	}
	
	@AfterMethod

	public void close() {

		driver.quit();

	}
}
