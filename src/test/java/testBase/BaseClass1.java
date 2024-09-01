package testBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass1 {

public WebDriver driver;

	
	@BeforeClass
	public void setup()
	{
	driver= new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	driver.get("https://demo.prestashop.com/");
	driver.manage().window().maximize();
	}
	
	@AfterClass
	public void teardown()
	{
		driver.close();
	}

}
