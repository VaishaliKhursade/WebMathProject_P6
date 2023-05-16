package reusableMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WM_TS_3HYB {

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

	@Test(priority = 1, description = "Validating Nevagitation")

	public void TC1() {
		driver.findElement(By.xpath("//a[text()='Factor']")).click();
		String title = driver.getTitle();
		String Exptitle = "Factor an Integer - WebMath";

		r.Navigation(title, Exptitle);

	}

	@Test(priority = 2, description = "Validating Input Elements")

	public void TC2() {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Factor']")).click();
		WebElement dw1 = driver.findElement(By.xpath("//select[@name='param0']"));
		WebElement Txb = driver.findElement(By.xpath("//input[@name='param1']"));
		WebElement Btn = driver.findElement(By.xpath("//input[@value='Factor it']"));
		r.Validating(dw1);
		r.Validating(Txb);
		r.Validating(Btn);
	}

	@Test(priority = 3, description = "Validating input")

	public void TC3() {
		driver.findElement(By.xpath("//a[text()='Factor']")).click();
		WebElement dw1 = driver.findElement(By.xpath("//select[@name='param0']"));
		Select obj1 = new Select(dw1);
		obj1.selectByVisibleText("All");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("30");
		String data = driver.findElement(By.xpath("//input[@type='text']")).getAttribute("value");
		String DataEntered = "30";
		r.ValidatingInput(data, DataEntered);
	}
	
	
	
	@Test(priority = 4, description = "Validating Result Accuricy")

	public void TC4() {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[text()='Factor']")).click();
}
}