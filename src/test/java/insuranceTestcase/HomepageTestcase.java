package insuranceTestcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import insuranceBase.TestBase;

public class HomepageTestcase extends TestBase {

	@Test
	public  void homePageMethod() throws IOException, InterruptedException
	{
		driver=getdriver();
		driver.get(urls());
		driver.manage().window().maximize();
		Thread.sleep(3000);
	//	javascriptxecutor js = ja
		driver.findElement(By.id("email")).sendKeys(getUserNames());
		driver.findElement(By.id("password")).sendKeys(getPasswords());
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//return new RequestQuotationTestcase(driver);
	}
}
