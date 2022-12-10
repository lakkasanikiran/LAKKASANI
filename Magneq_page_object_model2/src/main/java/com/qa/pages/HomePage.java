package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseClass;

public class HomePage {
	
	
	public HomePage() {
		
		
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
@FindBy(linkText="SING-ON")
WebElement login;

@FindBy(linkText="REGISTER")
WebElement register;

@FindBy(linkText="CONTACT")
WebElement contacts;

@FindBy(linkText="Flights")
WebElement flights;

@FindBy(linkText="Hotels")
WebElement hotels;

@FindBy(linkText="Car Rentals")
WebElement carRentals;

@FindBy(linkText="Vacations")
WebElement vacations;

@FindBy(linkText="Destination")
WebElement destination;

public String verifyHomePageTitle () {
	
return BaseClass.getDriver().getTitle();
}
	public String verifyHomePageUrl() {
		return BaseClass.getDriver().getCurrentUrl();
	}
	public void loginoperation() {
		login.click();
		
	}
	public void registeroperation() {
		register.click();
		
	}
	public void contactoperation() {
		contacts.click();
	}
	public void flightoperation() {
		flights.click();
	}
	public void hoteloperation() {
		hotels.click();
		
	}
	public void carRentalsoperation() {
		carRentals.click();
	
	}
	public void vacationsoperation() {
		vacations.click();
	
	}
	public void destinationoperation() {
		destination.click();
	}
	

}
