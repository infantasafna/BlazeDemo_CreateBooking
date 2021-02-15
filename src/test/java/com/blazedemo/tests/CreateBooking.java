package com.blazedemo.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.blazedemo.pages.ConfirmationPage;
import com.blazedemo.pages.IndexPage;
import com.blazedemo.pages.PurchasePage;
import com.blazedemo.pages.ReservePage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateBooking {
	WebDriver driver;
	IndexPage objIndex;
	ReservePage objReserve;
	PurchasePage objPurchase;
	ConfirmationPage objConfirmation;
	

	@BeforeTest

    public void SetupTest(){

	WebDriverManager.chromedriver().setup();
        
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://blazedemo.com/index.php");
        
    }
	
	@AfterTest

    public void TearDown(){

		if (driver != null)
		      driver.quit();

    }
	
	
// create a booking and print the confirmation ID
	
  @Test
  public void CreateBooking_GetConfirmationID() {
	  
	  objIndex = new IndexPage(driver);
	  objIndex.flightsFromTo("Portland", "New York");
	  objReserve = new ReservePage(driver);
	  objReserve.reserveFlight("234");
	  objPurchase = new PurchasePage(driver);
	  objPurchase.makePayment("Safna", "HSR Layout", "Bangalore", "Karnataka", "560102", "American Express", "123456789", "02", "2021", "Infanta Safna");
	  objConfirmation = new ConfirmationPage(driver);
	  System.out.println("Booking ID : " + objConfirmation.getBookingID());
		
  }
}
