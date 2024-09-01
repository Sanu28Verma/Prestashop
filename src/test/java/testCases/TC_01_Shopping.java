package testCases;

import org.testng.annotations.Test;

import pageObjects.AddToCart;
import pageObjects.DetailsPage;
import pageObjects.FilterPage;
import pageObjects.HomePage;
import testBase.BaseClass1;

public class TC_01_Shopping extends BaseClass1 {

	@Test(priority=1)
	public void verify_Shopping()
	{
	HomePage hp = new HomePage(driver);
	hp.ClickButton();
	}
	
	@Test(priority=2,dependsOnMethods= {"verify_Shopping"})
	public void verify_Filter() throws InterruptedException
	{
	FilterPage fp = new FilterPage(driver);
	fp.Filter();  
	//fp.Slider();
	fp.TshirtClick();
	}
	
	@Test(priority=3)
	public void verify_Add() 
	{
	AddToCart cp = new AddToCart(driver);
	cp.Cart();
	}
	
	@Test(priority=4)
	public void verify_Personal_Information()
	{
	DetailsPage dp = new DetailsPage(driver);
	dp.ClickRadio();	
	dp.enterRegistrationDetails("Raj", "Kumar", "Rajkumar623@gmail.com", "kumarRju678123", "05/31/1970");
	dp.Click_checkboxes();
	dp.Continue_Button();
	dp.enter_Address("123 Elm Street", "Springfield", "90210", "8890123567");
	dp.Click_Address_Btn();
	dp.AddComment("Best Shopping Site");
	dp.Agree_Check();
	}

	
	
}

