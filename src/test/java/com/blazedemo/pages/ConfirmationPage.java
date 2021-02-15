package com.blazedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ConfirmationPage {
	
	WebDriver driver;
	
	By bookingID = By.xpath("//td[text()='Id']/following-sibling::td[1]");
	
	public ConfirmationPage(WebDriver driver){

        this.driver = driver;

    }
	
	//Get Booking ID
	
	public String getBookingID(){

        return driver.findElement(bookingID).getText();

}
}
