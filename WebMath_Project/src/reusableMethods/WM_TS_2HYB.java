package reusableMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WM_TS_2HYB {
	WebDriver driver;
	String url = "https://www.webmath.com";
	ReusableMethods r = new ReusableMethods();

	@BeforeClass
	public void launch() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sel_3.141_Jars_ExcelrOnline\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void ToGeneralMath() {
		driver.findElement(By.xpath("//a[@title='General Math']")).click();

	}

	@AfterMethod
	public void ToMainFrame() {
		driver.switchTo().defaultContent();
	}

	@AfterClass
	public void close() {
		r.Close(driver);
	}
	
	
	@Test(priority = 1)

	public void TC1() {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String title = driver.getTitle();
		String ExpTitle = "General Math - WebMath";
		r.Navigation(title, ExpTitle);
}
	

	@Test(priority = 2)

	public void TC2() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
		WebElement l1 = driver.findElement(By.xpath("//a[@title='WebMath Home Page']"));
		WebElement l2 = driver.findElement(By.xpath("//a[@title='Math for Everyone']"));
		WebElement l3 = driver.findElement(By.xpath("//a[@title='General Math']"));
		WebElement l4 = driver.findElement(By.xpath("//a[@title='Kindergarten - 8th Grade Math']"));
		WebElement l5 = driver.findElement(By.xpath("//a[@title='Algebra']"));
		WebElement l6 = driver.findElement(By.xpath("//a[@title='Plots and Geometry']"));
		WebElement l7 = driver.findElement(By.xpath("//a[@title='Triginometry and Calculus']"));
		WebElement l8 = driver.findElement(By.xpath("//a[@title='Plots and Geometry']"));
		WebElement l9 = driver.findElement(By.xpath("//a[@title='WebMath Home Page']"));
		r.Validating(l1);
		r.Validating(l2);
		r.Validating(l3);
		r.Validating(l4);
		r.Validating(l5);
		r.Validating(l6);
		r.Validating(l7);
		r.Validating(l8);
		r.Validating(l9);
}
	
	@Test(priority = 3)

	public void TC3() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement LinkNumbers = driver.findElement(By.xpath("//b[text()='Numbers']"));
		r.Validating(LinkNumbers);
	}
	
	
	
	@Test(priority = 4)

	public void TC4() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement LinkDecimals = driver.findElement(By.xpath("//b[text()='Decimals']"));
		r.Validating(LinkDecimals);
	}
	
	@Test(priority = 5)

	public void TC5() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement LinkNumberCrn = driver.findElement(By.xpath("//b[text()='Number Crunching']"));
		r.Validating(LinkNumberCrn);
	}
	
	@Test(priority = 6)

	public void TC6() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement Fractions = driver.findElement(By.xpath("//b[text()='Fractions']"));
		r.Validating(Fractions);
	}
	

	@Test(priority = 7)

	public void TC7() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement LinkSciNotation = driver.findElement(By.xpath("//b[text()='Scientific Notation']"));
		r.Validating(LinkSciNotation);
	}
	
	@Test(priority = 8)

	public void TC8() {
		WebElement DW = driver.findElement(By.xpath("//select[@id='topicItem']"));
		r.Validating(DW);

	}
}