package pageObjects;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class DetailsPage extends BasePage {
	
	public DetailsPage(WebDriver driver)
	{
		super(driver);
	}
	
@FindBy(id="field-id_gender-1")
WebElement MrRadiobutton;

@FindBy(id="field-firstname")
WebElement txtFirstName;

@FindBy(id="field-lastname")
WebElement txtLastName;

@FindBy(id="field-email")
WebElement txtEmail;

@FindBy(id="field-password")
WebElement txtPassword;

@FindBy(id="field-birthday")
WebElement txtBirthDate;

@FindBy(xpath="//span[@class='custom-checkbox']")
List<WebElement> Checkboxes;

@FindBy(xpath="//footer[@class='form-footer clearfix']//button[@name='continue']")
WebElement ContinueBtn;

@FindBy(id="field-address1")
WebElement txtAddress;

@FindBy(id="field-city")
WebElement txtCity;

@FindBy(id="field-id_state")
WebElement State;

@FindBy(id="field-postcode")
WebElement txtPostalCode;

@FindBy(id="field-phone")
WebElement txtPhone;

@FindBy(xpath="//footer[@class='form-footer clearfix']//button[@name='confirm-addresses']")
WebElement AddressContinueBtn;

@FindBy(id="delivery_message")
WebElement txtComment;

@FindBy(name="confirmDeliveryOption")
WebElement ShippingContinueBtn;

@FindBy(id="conditions_to_approve[terms-and-conditions]")
WebElement agreeCheckbox;

public void ClickRadio()
{
	MrRadiobutton.click();	
}

public void enterRegistrationDetails(String FirstName,String LastName, String Email,String Password, String BirthDate)
{
	txtFirstName.sendKeys(FirstName);
	txtLastName.sendKeys(LastName);
	txtEmail.sendKeys(Email);
	txtPassword.sendKeys(Password);
	txtBirthDate.sendKeys(BirthDate);
}

public void Click_checkboxes()
{
	for (int i = 0; i < Checkboxes.size(); i++) 
	{
		    WebElement checkbox = Checkboxes.get(i);
		    checkbox.click();
		}
}

public void Continue_Button()
{
	ContinueBtn.click();	
}

public void enter_Address(String Address,String City,String PostalCode,String Phone)
{
txtAddress.sendKeys(Address);
txtCity.sendKeys(City);
txtPostalCode.sendKeys(PostalCode);
txtPhone.sendKeys(Phone);
Select dropdownElement1=new Select(State);
dropdownElement1.selectByVisibleText("California");
}

public void Click_Address_Btn()
{
	AddressContinueBtn.click();	
}

public void AddComment(String Comment)
{
	txtComment.sendKeys(Comment);
	ShippingContinueBtn.click();
}

public void Agree_Check()
{
	agreeCheckbox.click();
	
}

}
