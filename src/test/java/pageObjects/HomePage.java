package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
@FindBy(id ="framelive")
protected WebElement frm;   		

@FindBy(xpath = "//li[@id='category-3']//a[@class='dropdown-item']")
WebElement ClButton;
    
@FindBy(xpath="//li[@id='category-4']//a[@class='dropdown-item dropdown-submenu']")
WebElement MensButton;

public void ClickButton() {
	driver.switchTo().frame(frm);
    Actions act = new Actions(driver);
    act.moveToElement(ClButton).moveToElement(MensButton).click().build().perform();
    driver.switchTo().defaultContent();
    	}
    	

    }
    

