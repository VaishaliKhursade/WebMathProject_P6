package reusableMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ReusableMethods {
	
	public void Close(WebDriver driver) {
		driver.quit();
	}
	
	public void Navigation(String title, String ExpTitle) {
		Assert.assertEquals(title, ExpTitle);
		
	}
	
	public void Validating(WebElement w) {
		Assert.assertTrue(w.isDisplayed(), "Test Fail "+w+" is not displayed");
		Assert.assertTrue(w.isEnabled(),"Test Fail "+w+" is not Not enabled");
		
	}
	
	public void Calculation(WebElement Result) {
		Assert.assertTrue(Result.isDisplayed(),"Test Fail Calculation not done");
		
	}
	
	public void CalculationAccurecy(String Result,String ExpResult) {
		Assert.assertEquals(Result, ExpResult,"Test fail Calculetion is not correct");
	}
	
	public void Switchingtoframe(WebDriver driver,WebElement Frame) {
		driver.switchTo().frame(Frame);
		
	}
	
	public void ValidatingInput(String data, String DataEntered) {
		
		Assert.assertEquals(data, DataEntered);
		
	}

}
