package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCart extends BasePage {
	
	public AddToCart(WebDriver driver)
	{
		super(driver);
	}
	
@FindBy(xpath = "//i[@class='material-icons touchspin-up']")
protected WebElement Quantity ;
	
@FindBy(xpath="//button[@class='btn btn-primary add-to-cart']")
protected WebElement Add_To_Cart ;

@FindBy(xpath="//div[@class='cart-content-btn']//a[@class='btn btn-primary']")
protected WebElement Checkout1 ;

@FindBy(xpath="//div[@class='text-sm-center']//a[@class='btn btn-primary']")
protected WebElement Checkout2 ;


public void Cart() 
{
	Quantity.click();
	Add_To_Cart.click();
	JavascriptExecutor js=(JavascriptExecutor) driver;
    js.executeScript("arguments[0].click();",Checkout1);
    js.executeScript("arguments[0].click();",Checkout2);

}

}
