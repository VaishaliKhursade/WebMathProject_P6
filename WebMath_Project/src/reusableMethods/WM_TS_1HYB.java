package reusableMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WM_TS_1HYB {

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

	@AfterClass
	public void close() {
		r.Close(driver);
	}

	@Test
	public void TC1() {

		String title = driver.getTitle();
		String Exptitle = "WebMath - Solve Your Math Problem";

		r.Navigation(title, Exptitle);
	}

	@Test
	public void TC2() {
		driver.findElement(By.xpath("//img[@src='/static/images/WebMathv16Logo.gif']")).click();
		String title = driver.getTitle();
		String Exptitle = "WebMath - Solve Your Math Problem";

		r.Navigation(title, Exptitle);
	}

	@Test
	public void TC3() {

		WebElement l1 = driver.findElement(By.xpath("//a[@title='WebMath Home Page']"));
		WebElement l2 = driver.findElement(By.xpath("//a[@title='Math for Everyone']"));
		WebElement l3 = driver.findElement(By.xpath("//a[@title='General Math']"));
		WebElement l4 = driver.findElement(By.xpath("//a[@title='Kindergarten - 8th Grade Math']"));
		WebElement l5 = driver.findElement(By.xpath("//a[@title='Algebra']"));
		WebElement l6 = driver.findElement(By.xpath("//a[@title='Plots and Geometry']"));
		WebElement l7 = driver.findElement(By.xpath("//a[@title='Triginometry and Calculus']"));
		WebElement l8 = driver.findElement(By.xpath("//a[@title='Plots and Geometry']"));
		WebElement l9 = driver.findElement(By.xpath("//h1[text()='Welcome to Webmath!']"));
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

	@Test
	public void TC4() {
		driver.findElement(By.xpath("//a[@title='WebMath Home Page']")).click();

		String title = driver.getTitle();
		String Exptitle = "WebMath - Solve Your Math Problem";
		r.Navigation(title, Exptitle);
	}

	@Test(priority = 5)

	public void TC5() {
		WebElement DW = driver.findElement(By.xpath("//select[@id='topicItem']"));
		r.Validating(DW);

	}

}
