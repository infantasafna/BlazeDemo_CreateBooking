package com.blazedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class IndexPage {
	
	WebDriver driver;
	
	By departureCity = By.name("fromPort");

    By destinationCity = By.name("toPort");

    By findFlights = By.xpath("//input[@value='Find Flights']");

    public IndexPage(WebDriver driver){

        this.driver = driver;

    }
	
	// Select Departure city from the options list 
	
	public void chooseDepartureCity(String strDepartureCity){

		  Select selectDepartureCity = new Select(driver.findElement(departureCity));
		  selectDepartureCity.selectByVisibleText(strDepartureCity);

    }
	
	// Select Destination City from the options list 
	
	public void chooseDestinationCity(String strDestinationCity){

		  Select selectDestinationCity = new Select(driver.findElement(destinationCity));
		  selectDestinationCity.selectByVisibleText(strDestinationCity);

   }
	
	// Click on Find Flights button
	
	public void clickFindFlights(){

        driver.findElement(findFlights).click();

}
	public void flightsFromTo(String strDepartureCity,String strDestinationCity){

        

        this.chooseDepartureCity(strDepartureCity);

        this.chooseDestinationCity(strDestinationCity);

        this.clickFindFlights();        
    }
}
