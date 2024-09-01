package pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FilterPage extends BasePage {
	
	public FilterPage(WebDriver driver)
	{
		super(driver);
	}
	
@FindBy(xpath = "//iframe[@id='framelive']")
protected WebElement frm2;
	
@FindBy(xpath="//span[@class='custom-checkbox']")
WebElement chbox;
	
@FindBy(xpath="//a[@style='left: 100%;']")
WebElement Slider;

@FindBy(xpath="//a[text()='Hummingbird printed t-shirt']")
WebElement Tshirt;

public void Filter() throws InterruptedException
  {
	driver.switchTo().frame(frm2);
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    
    WebElement checkboxElement = wait.until(ExpectedConditions.visibilityOf(chbox));
    wait.until(ExpectedConditions.elementToBeClickable(checkboxElement));
	chbox.click();	

}


public void TshirtClick()
{
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
    WebElement TshirtElement = wait.until(ExpectedConditions.visibilityOf(Tshirt));
    TshirtElement = wait.until(ExpectedConditions.elementToBeClickable(TshirtElement));
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].click();", TshirtElement);
}
}