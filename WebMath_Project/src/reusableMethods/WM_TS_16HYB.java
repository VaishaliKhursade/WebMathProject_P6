package reusableMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public abstract class WM_TS_16HYB {
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

	@Test
	public void TC1() {
		driver.findElement(By.xpath("//a[text()='Divide with']")).click();
		String title = driver.getTitle();
		String Exptitle = "Divide Two Numbers in Scientific Notation - WebMath";

		r.Navigation(title, Exptitle);
	}

	@Test
	public void TC2() {
		driver.findElement(By.xpath("//a[text()='Divide with']")).click();
		WebElement Txb1 = driver.findElement(By.xpath("//input[@name='p1exp1']"));
		WebElement Txb2 = driver.findElement(By.xpath("//input[@name='p1exp2']"));
		WebElement Txb3 = driver.findElement(By.xpath("//input[@name='p1base1']"));
		WebElement Txb4 = driver.findElement(By.xpath("//input[@name='p1base2']"));
		WebElement Txb5 = driver.findElement(By.xpath("//input[@name='p2exp1']"));
		WebElement Txb6 = driver.findElement(By.xpath("//input[@name='p2base1']"));
		WebElement Txb7 = driver.findElement(By.xpath("//input[@name='p2base2']"));
		r.Validating(Txb1);
		r.Validating(Txb2);
		r.Validating(Txb3);
		r.Validating(Txb4);
		r.Validating(Txb5);
		r.Validating(Txb6);
		r.Validating(Txb7);

	}

}
