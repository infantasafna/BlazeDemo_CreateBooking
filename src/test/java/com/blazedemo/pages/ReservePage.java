package com.blazedemo.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ReservePage {

	WebDriver driver;
	
	  
    public ReservePage(WebDriver driver){

        this.driver = driver;

    }
	
	
  //Click on Choose This Flight button
	
	public void clickChooseThisFlight(String strFlightNumber){

		 driver.findElement(By.xpath("//td[text()='"+strFlightNumber+"']/preceding-sibling::td[1]")).click();
		  

    }
	
	
	public void reserveFlight(String strFlightNumber){

        
        this.clickChooseThisFlight(strFlightNumber);  
        
    }
}
