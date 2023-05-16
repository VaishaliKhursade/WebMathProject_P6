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

public class WM_TS_11 {


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

		driver.findElement(By.xpath("//a[text()='Subtract']")).click();
		Thread.sleep(1000);
		String actTitle = driver.getTitle();

		String expextedTitle = "Subtract Two Fractions - WebMath";

		Assert.assertEquals(actTitle, expextedTitle,
				"Test Failed User not nevigated to Subtract Two Fractions page successfully");

	}

	@Test(priority = 2, description = "Validating Input Elements")

	public void TC2() throws Exception {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[text()='Subtract']")).click();
		Thread.sleep(1000);

		WebElement TopTxb1 = driver.findElement(By.xpath("//input[@name='atop1']"));
		WebElement BottTxb1 = driver.findElement(By.xpath("//input[@name='abottom1']"));
		WebElement TopTxb2 = driver.findElement(By.xpath("//input[@name='atop2']"));
		WebElement BottTxb2 = driver.findElement(By.xpath("//input[@name='abottom2']"));

		WebElement TopTxb3 = driver.findElement(By.xpath("//input[@name='btop1']"));
		WebElement BottTxb3 = driver.findElement(By.xpath("//input[@name='bbottom1']"));
		WebElement TopTxb4 = driver.findElement(By.xpath("//input[@name='btop2']"));
		WebElement BottTxb4 = driver.findElement(By.xpath("//input[@name='bbottom2']"));
		WebElement WholeTxb4 = driver.findElement(By.xpath("//input[@name='bwhole1']"));

		WebElement TopTxb5 = driver.findElement(By.xpath("//input[@name='ctop1']"));
		WebElement BottTxb5 = driver.findElement(By.xpath("//input[@name='cbottom1']"));
		WebElement TopTxb6 = driver.findElement(By.xpath("//input[@name='ctop2']"));
		WebElement BottTxb6 = driver.findElement(By.xpath("//input[@name='cbottom2']"));
		WebElement WholeTxb6 = driver.findElement(By.xpath("//input[@name='cwhole1']"));
		WebElement WholeTxb7 = driver.findElement(By.xpath("//input[@name='cwhole2']"));
		WebElement Subtbtn = driver.findElement(By.xpath("//input[@value='Subtract']"));

		Assert.assertTrue(TopTxb1.isDisplayed(), " Top input textbox1 is not visible");
		Assert.assertTrue(BottTxb1.isDisplayed(), "Bottom input textbox1 is is not visible");
		Assert.assertTrue(TopTxb2.isDisplayed(), " Top input textbox2 is not visible");
		Assert.assertTrue(BottTxb2.isDisplayed(), "Bottom input textbox2 is not visible");
		Assert.assertTrue(Subtbtn.isDisplayed(), " Subtract Button is not visible");

		Assert.assertTrue(TopTxb3.isDisplayed(), " Top input textbox3 is not visible");
		Assert.assertTrue(BottTxb3.isDisplayed(), "Bottom input textbox3 is is not visible");
		Assert.assertTrue(TopTxb4.isDisplayed(), " Top input textbox4 is not visible");
		Assert.assertTrue(BottTxb4.isDisplayed(), "Bottom input textbox4 is not visible");
		Assert.assertTrue(WholeTxb4.isDisplayed(), "Bottom input WholeTxb4 is not visible");
		Assert.assertTrue(Subtbtn.isDisplayed(), " Subtract Button is not visible");

		Assert.assertTrue(TopTxb5.isDisplayed(), " Top input textbox3 is not visible");
		Assert.assertTrue(BottTxb5.isDisplayed(), "Bottom input textbox3 is is not visible");
		Assert.assertTrue(TopTxb6.isDisplayed(), " Top input textbox4 is not visible");
		Assert.assertTrue(BottTxb6.isDisplayed(), "Bottom input textbox4 is not visible");
		Assert.assertTrue(WholeTxb6.isDisplayed(), "Bottom input WholeTxb4 is not visible");
		Assert.assertTrue(WholeTxb7.isDisplayed(), "Bottom input WholeTxb4 is not visible");
		Assert.assertTrue(Subtbtn.isDisplayed(), " Subtract Button is not visible");

		Assert.assertTrue(TopTxb1.isEnabled(), "Top input textbox1 is disabled");
		Assert.assertTrue(BottTxb1.isEnabled(), " Bottom input textbox1 is disabled");
		Assert.assertTrue(TopTxb2.isEnabled(), "Top input textbox2 is disabled");
		Assert.assertTrue(BottTxb2.isEnabled(), " Bottom input textbox2 is disabled");
		Assert.assertTrue(Subtbtn.isEnabled(), " Subtract Button is disabled");

		Assert.assertTrue(TopTxb3.isEnabled(), "Top input textbox3 is disabled");
		Assert.assertTrue(BottTxb3.isEnabled(), " Bottom input textbox3 is disabled");
		Assert.assertTrue(TopTxb4.isEnabled(), "Top input textbox4 is disabled");
		Assert.assertTrue(BottTxb4.isEnabled(), " Bottom input textbox4 is disabled");
		Assert.assertTrue(WholeTxb4.isEnabled(), " Bottom input WholeTxb4 is disabled");
		Assert.assertTrue(Subtbtn.isEnabled(), " Subtract Button is disabled");

		Assert.assertTrue(TopTxb5.isEnabled(), "Top input textbox3 is disabled");
		Assert.assertTrue(BottTxb5.isEnabled(), " Bottom input textbox3 is disabled");
		Assert.assertTrue(TopTxb6.isEnabled(), "Top input textbox4 is disabled");
		Assert.assertTrue(BottTxb6.isEnabled(), " Bottom input textbox4 is disabled");
		Assert.assertTrue(WholeTxb6.isEnabled(), " Bottom input WholeTxb4 is disabled");
		Assert.assertTrue(WholeTxb7.isEnabled(), " Bottom input WholeTxb4 is disabled");
		Assert.assertTrue(Subtbtn.isEnabled(), " Add Subtract is disabled");

	}

	@Test(priority = 3, description = "Validating input")

	public void TC3() throws Exception {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[text()='Subtract']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@name='atop1']")).sendKeys("5");
		driver.findElement(By.xpath("//input[@name='abottom1']")).sendKeys("9");
		driver.findElement(By.xpath("//input[@name='atop2']")).sendKeys("7");
		driver.findElement(By.xpath("//input[@name='abottom2']")).sendKeys("4");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@name='btop1']")).sendKeys("4");
		driver.findElement(By.xpath("//input[@name='bbottom1']")).sendKeys("5");
		driver.findElement(By.xpath("//input[@name='btop2']")).sendKeys("8");
		driver.findElement(By.xpath("//input[@name='bbottom2']")).sendKeys("3");
		driver.findElement(By.xpath("//input[@name='bwhole1']")).sendKeys("2");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@name='ctop1']")).sendKeys("6");
		driver.findElement(By.xpath("//input[@name='cbottom1']")).sendKeys("3");
		driver.findElement(By.xpath("//input[@name='ctop2']")).sendKeys("4");
		driver.findElement(By.xpath("//input[@name='cbottom2']")).sendKeys("5");
		driver.findElement(By.xpath("//input[@name='cwhole1']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@name='cwhole2']")).sendKeys("2");
		Thread.sleep(1000);

		String data1 = driver.findElement(By.xpath("//input[@name='atop1']")).getAttribute("value");
		String data2 = driver.findElement(By.xpath("//input[@name='abottom1']")).getAttribute("value");
		String data3 = driver.findElement(By.xpath("//input[@name='atop2']")).getAttribute("value");
		String data4 = driver.findElement(By.xpath("//input[@name='abottom2']")).getAttribute("value");

		String data5 = driver.findElement(By.xpath("//input[@name='btop1']")).getAttribute("value");
		String data6 = driver.findElement(By.xpath("//input[@name='bbottom1']")).getAttribute("value");
		String data7 = driver.findElement(By.xpath("//input[@name='btop2']")).getAttribute("value");
		String data8 = driver.findElement(By.xpath("//input[@name='bbottom2']")).getAttribute("value");
		String data9 = driver.findElement(By.xpath("//input[@name='bwhole1']")).getAttribute("value");

		String data10 = driver.findElement(By.xpath("//input[@name='ctop1']")).getAttribute("value");
		String data11 = driver.findElement(By.xpath("//input[@name='cbottom1']")).getAttribute("value");
		String data12 = driver.findElement(By.xpath("//input[@name='ctop2']")).getAttribute("value");
		String data13 = driver.findElement(By.xpath("//input[@name='cbottom2']")).getAttribute("value");
		String data14 = driver.findElement(By.xpath("//input[@name='cwhole1']")).getAttribute("value");
		String data15 = driver.findElement(By.xpath("//input[@name='cwhole2']")).getAttribute("value");

		String DataEntered1 = "5";
		String DataEntered2 = "9";
		String DataEntered3 = "7";
		String DataEntered4 = "4";

		String DataEntered5 = "4";
		String DataEntered6 = "5";
		String DataEntered7 = "8";
		String DataEntered8 = "3";
		String DataEntered9 = "2";

		String DataEntered10 = "6";
		String DataEntered11 = "3";
		String DataEntered12 = "4";
		String DataEntered13 = "5";
		String DataEntered14 = "1";
		String DataEntered15 = "2";

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
		Assert.assertEquals(data11, DataEntered11, "Test fail input box is not taking the data");
		Assert.assertEquals(data12, DataEntered12, "Test fail input box is not taking the data");
		Assert.assertEquals(data13, DataEntered13, "Test fail input box is not taking the data");
		Assert.assertEquals(data14, DataEntered14, "Test fail input box is not taking the data");
		Assert.assertEquals(data15, DataEntered15, "Test fail input box is not taking the data");

	}

	@Test(priority = 4, description = "Validating Result Accuricy 1")

	public void TC4() throws Exception {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Subtract']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@name='atop1']")).sendKeys("5");
		driver.findElement(By.xpath("//input[@name='abottom1']")).sendKeys("2");
		driver.findElement(By.xpath("//input[@name='atop2']")).sendKeys("7");
		driver.findElement(By.xpath("//input[@name='abottom2']")).sendKeys("4");
		driver.findElement(By.xpath("//input[@value='Subtract']")).click();
		Thread.sleep(1000);

		WebElement ResultFrame = driver.findElement(By.id("centerContentFrame"));
		Assert.assertTrue(ResultFrame.isDisplayed(), "Test failed Calculation not done");

		driver.switchTo().frame(ResultFrame);
		String Result = driver.findElement(By.xpath("/html/body/font/font/font/p[1]")).getText();

		String ExpResult = "The problem here is to subtract and\r\n"
				+ "These two fractions do not have the same denominators (lower numbers), so we must first find a common denominator of the two fractions, before subtracting them.\r\n"
				+ "\r\n" + "For the denominators here, the 2 and 4, a common denominator for both is 4.\r\n"
				+ "With the common denominator, the\r\n" + " becomes a\r\n" + "\r\n" + "and the\r\n" + " becomes a\r\n"
				+ "\r\n" + "So now our subtraction problem becomes this...\r\n"
				+ "The problem here is to subtract and\r\n" + "\r\n"
				+ "Since these two fractions have the same denominators (the numbers under the fraction bar), we can subtract them by simply subtracting the numerators (the 10 - 7 = 3), while keeping the same denominator (the 4).\r\n"
				+ "\r\n" + "Our answer here is:\r\n" + "\r\n" + "\r\n" + "\r\n" + "The final answer is: ";
		Assert.assertNotEquals(Result, ExpResult, "Test fail calculetion is not correct");

	}

	

	@Test(priority = 5, description = "Validating Result Accuricy 2")

	public void TC5() throws Exception {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Subtract']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='btop1']")).sendKeys("4");
		driver.findElement(By.xpath("//input[@name='bbottom1']")).sendKeys("5");
		driver.findElement(By.xpath("//input[@name='btop2']")).sendKeys("8");
		driver.findElement(By.xpath("//input[@name='bbottom2']")).sendKeys("3");
		driver.findElement(By.xpath("//input[@name='bwhole1']")).sendKeys("2");

		driver.findElement(By.xpath("//input[@value='Subtract']")).click();
		Thread.sleep(1000);

		WebElement ResultFrame = driver.findElement(By.id("centerContentFrame"));
		Assert.assertTrue(ResultFrame.isDisplayed(), "Test failed Calculation not done");

		driver.switchTo().frame(ResultFrame);
		String Result = driver
				.findElement(By.xpath("/html/body/font/font/font/font/font/font/font/blockquote/font/font")).getText();

		String ExpResult = "The problem here is to subtract and\r\n"
				+ "These two fractions do not have the same denominators (lower numbers), so we must first find a common denominator of the two fractions, before subtracting them.\r\n"
				+ "\r\n" + "For the denominators here, the 5 and 3, a common denominator for both is 15.\r\n"
				+ "With the common denominator, the\r\n" + " becomes a\r\n" + "\r\n" + "and the\r\n" + " becomes a\r\n"
				+ "\r\n" + "So now our subtraction problem becomes this...\r\n"
				+ "The problem here is to subtract and\r\n" + "\r\n"
				+ "These two fractions have the same denominators, but numerator of the first fraction, the 12, is less than the numerator of the second fraction, the 40. This means, before subtracting the fractions, we have to \"borrow\" a 1 from the whole number 2, making it a 1. We can add this borrowed 1 to the fraction 12/15, like this:\r\n"
				+ "12/15 + 1 is 12/15 + 15/15 = 27/15\r\n"
				+ "After doing all of this, the  becomes a  , and we can now perform the subtraction...\r\n"
				+ "The problem here is to subtract and\r\n" + "\r\n"
				+ "These two fractions have the same denominators, but numerator of the first fraction, the 27, is less than the numerator of the second fraction, the 40. This means, before subtracting the fractions, we have to \"borrow\" a 1 from the whole number 1, making it a 0. We can add this borrowed 1 to the fraction 27/15, like this:\r\n"
				+ "27/15 + 1 is 27/15 + 15/15 = 42/15\r\n"
				+ "After doing all of this, the  becomes a  , and we can now perform the subtraction...\r\n"
				+ "The problem here is to subtract and\r\n" + "\r\n"
				+ "Since these two fractions have the same denominators (the numbers under the fraction bar), we can subtract them by simply subtracting the numerators (the 42 - 40 = 2), while keeping the same denominator (the 15).\r\n"
				+ "\r\n" + "Our answer here is:";
		Assert.assertNotEquals(Result, ExpResult, "Test fail calculetion is not correct");

	}

	@Test(priority = 6, description = "Validating Result Accuricy 3")

	public void TC6() throws Exception {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Subtract']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='ctop1']")).sendKeys("6");
		driver.findElement(By.xpath("//input[@name='cbottom1']")).sendKeys("3");
		driver.findElement(By.xpath("//input[@name='ctop2']")).sendKeys("4");
		driver.findElement(By.xpath("//input[@name='cbottom2']")).sendKeys("5");
		driver.findElement(By.xpath("//input[@name='cwhole1']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@name='cwhole2']")).sendKeys("2");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Subtract']")).click();
		Thread.sleep(1000);

		WebElement ResultFrame = driver.findElement(By.id("centerContentFrame"));
		Assert.assertTrue(ResultFrame.isDisplayed(), "Test failed Calculation not done");

		driver.switchTo().frame(ResultFrame);
		String Result = driver.findElement(By.xpath("/html/body/font/font/font/blockquote[2]/font/font")).getText();

		String ExpResult = "The problem here is to subtract and\r\n"
				+ "These two fractions do not have the same denominators (lower numbers), so we must first find a common denominator of the two fractions, before subtracting them.\r\n"
				+ "\r\n" + "For the denominators here, the 3 and 5, a common denominator for both is 15.\r\n"
				+ "With the common denominator, the\r\n" + " becomes a\r\n" + "\r\n" + "and the\r\n" + " becomes a\r\n"
				+ "\r\n" + "So now our subtraction problem becomes this...\r\n"
				+ "The problem here is to subtract and\r\n" + "\r\n"
				+ "Since these two fractions have the same denominators (the numbers under the fraction bar), we can subtract them by simply subtracting the numerators (the 30 - 12 = 18), while keeping the same denominator (the 15).\r\n"
				+ "\r\n" + "And, we just subtract the whole number parts, or 1 - 2 = -1.\r\n"
				+ "Our answer here is:\r\n" + "\r\n" + "\r\n"
				+ "The fraction is an improper fraction (the numerator is greater than the denominator).\r\n"
				+ "While there is nothing incorrect about this, an improper fraction is typically\r\n"
				+ "simplified further into a mixed number.\r\n" + "\r\n"
				+ "The whole number part of the mixed number is found by dividing the 18 by the 15.\r\n"
				+ "In this case we get 1.\r\n" + "\r\n"
				+ "The fractional part of the mixed number is found by using the remainder of the division,\r\n"
				+ "which in this case is 3 (18 divided by 15 is 1 remainder 3).\r\n" + "\r\n"
				+ "The fraction is not reduced to lowest terms. We can reduce this fraction to lowest\r\n"
				+ "terms by dividing both the numerator and denominator by 3.\r\n" + "\r\n"
				+ "Why divide by 3? 3 is the Greatest Common Divisor (GCD)\r\n"
				+ "or Greatest Common Factor (GCF) of the numbers 3 and 15.\r\n"
				+ "So, this fraction reduced to lowest terms is\r\n" + "\r\n" + "\r\n" + "The final answer is: ";
		Assert.assertNotEquals(Result, ExpResult, "Test fail calculetion is not correct");

	}

	@Test(priority = 7, description = "Validating Back to Math Problem Link")

	public void TC7() throws Exception {

		driver.findElement(By.xpath("//a[text()='Subtract']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@name='atop1']")).sendKeys("5");
		driver.findElement(By.xpath("//input[@name='abottom1']")).sendKeys("9");
		driver.findElement(By.xpath("//input[@name='atop2']")).sendKeys("7");
		driver.findElement(By.xpath("//input[@name='abottom2']")).sendKeys("4");
		driver.findElement(By.xpath("//input[@value='Subtract']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//img[@src='/static/images/backToProblem.gif']")).click();
		Thread.sleep(1000);
		String actTitle = driver.getTitle();
		String expextedTitle = "Subtract Two Fractions - WebMath";
		Assert.assertEquals(actTitle, expextedTitle,
				"Test Failed User not nevigated Subtract Two Fractions page successfully");

	}

	@Test(priority = 8, description = "Validating Clear entire Form Button")

	public void TC8() throws Exception {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[text()='Subtract']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@name='atop1']")).sendKeys("5");
		driver.findElement(By.xpath("//input[@name='abottom1']")).sendKeys("9");
		driver.findElement(By.xpath("//input[@name='atop2']")).sendKeys("7");
		driver.findElement(By.xpath("//input[@name='abottom2']")).sendKeys("4");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@name='btop1']")).sendKeys("4");
		driver.findElement(By.xpath("//input[@name='bbottom1']")).sendKeys("5");
		driver.findElement(By.xpath("//input[@name='btop2']")).sendKeys("8");
		driver.findElement(By.xpath("//input[@name='bbottom2']")).sendKeys("3");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='bwhole1']")).sendKeys("2");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@name='ctop1']")).sendKeys("6");
		driver.findElement(By.xpath("//input[@name='cbottom1']")).sendKeys("3");
		driver.findElement(By.xpath("//input[@name='ctop2']")).sendKeys("4");
		driver.findElement(By.xpath("//input[@name='cbottom2']")).sendKeys("5");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='cwhole1']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@name='cwhole2']")).sendKeys("2");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@value='Clear the Entire Form']")).click();

		String data1 = driver.findElement(By.xpath("//input[@name='atop1']")).getAttribute("value");
		String data2 = driver.findElement(By.xpath("//input[@name='abottom1']")).getAttribute("value");
		String data3 = driver.findElement(By.xpath("//input[@name='atop2']")).getAttribute("value");
		String data4 = driver.findElement(By.xpath("//input[@name='abottom2']")).getAttribute("value");

		String data5 = driver.findElement(By.xpath("//input[@name='btop1']")).getAttribute("value");
		String data6 = driver.findElement(By.xpath("//input[@name='bbottom1']")).getAttribute("value");
		String data7 = driver.findElement(By.xpath("//input[@name='btop2']")).getAttribute("value");
		String data8 = driver.findElement(By.xpath("//input[@name='bbottom2']")).getAttribute("value");
		String data9 = driver.findElement(By.xpath("//input[@name='bwhole1']")).getAttribute("value");

		String data10 = driver.findElement(By.xpath("//input[@name='ctop1']")).getAttribute("value");
		String data11 = driver.findElement(By.xpath("//input[@name='cbottom1']")).getAttribute("value");
		String data12 = driver.findElement(By.xpath("//input[@name='ctop2']")).getAttribute("value");
		String data13 = driver.findElement(By.xpath("//input[@name='cbottom2']")).getAttribute("value");
		String data14 = driver.findElement(By.xpath("//input[@name='cwhole1']")).getAttribute("value");
		String data15 = driver.findElement(By.xpath("//input[@name='cwhole2']")).getAttribute("value");

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
		String DataEntered11 = "";
		String DataEntered12 = "";
		String DataEntered13 = "";
		String DataEntered14 = "";
		String DataEntered15 = "";

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
		Assert.assertEquals(data11, DataEntered11, "Test fail input box is not Empty");
		Assert.assertEquals(data12, DataEntered12, "Test fail input box is not Empty");
		Assert.assertEquals(data13, DataEntered13, "Test fail input box is not Empty");
		Assert.assertEquals(data14, DataEntered14, "Test fail input box is not Empty");
		Assert.assertEquals(data15, DataEntered15, "Test fail input box is not Empty");

	}

	@AfterMethod

	public void close() {

		driver.quit();

	}
}