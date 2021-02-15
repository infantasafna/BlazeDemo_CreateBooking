package com.blazedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class PurchasePage {
WebDriver driver;
	
	By passengerName = By.id("inputName");

    By address = By.id("address");
    
    By city = By.id("city");
    
    By state = By.id("state");
    
    By zipCode = By.id("zipCode");
    
    By cardType = By.id("cardType");
    
    By creditCardNumber = By.id("creditCardNumber");
    
    By creditCardMonth = By.id("creditCardMonth");
    
    By creditCardYear = By.id("creditCardYear");
    
    By nameOnCard = By.id("nameOnCard");
    
    By rememberMe = By.id("rememberMe");
    
    By purchaseFlight = By.xpath("//input[@value='Purchase Flight']");

   

    public PurchasePage(WebDriver driver){

        this.driver = driver;

    }
	
  //Set passenger name in textbox
    
    public void setPassengerName(String strPassengerName){

		  driver.findElement(passengerName).sendKeys(strPassengerName);
		  
  }
    
  //Set address in textbox
    
    public void setAddress(String strAddress){

		  driver.findElement(address).sendKeys(strAddress);
		  
}
    
  //Set city in textbox
    
    public void setCity(String strCity){

		  driver.findElement(city).sendKeys(strCity);
		  
}
    
  //Set state in textbox
    
    public void setState(String strState){

		  driver.findElement(state).sendKeys(strState);
		  
}
    
  //Set Zip code in textbox
    
    public void setZipCode(String strZipCode){

		  driver.findElement(zipCode).sendKeys(strZipCode);
		  
}
   
    
  //Select card type from the options list
    
    public void chooseCardType(String strCardType){

		  Select selectCardType = new Select(driver.findElement(cardType));
		  selectCardType.selectByVisibleText(strCardType);

    }
	
  //Set credit card number in textbox
    
	public void setCreditCardNumber(String strCreditCardNumber){

		  driver.findElement(creditCardNumber).sendKeys(strCreditCardNumber);
		  
}
	
	//Set credit card month in textbox
	
	public void setCreditCardMonth(String strCreditCardMonth){

		  driver.findElement(creditCardMonth).sendKeys(strCreditCardMonth);
		  
}
	
	//Set credit card year in textbox
	
	public void setCreditCardYear(String strCreditCardYear){

		  driver.findElement(creditCardYear).sendKeys(strCreditCardYear);
		  
}
	
	//Set name on card in textbox
	
	public void setNameOnCard(String strNameOnCard){

		  driver.findElement(nameOnCard).sendKeys(strNameOnCard);
		  
}
	
	//Check remember me
	
	public void clickRememberMe(){

        driver.findElement(rememberMe).click();

}
	
	//Click on Purchase Flight button
	
	public void clickPurchaseFlight(){

        driver.findElement(purchaseFlight).click();

}
	
	
	
	public void makePayment(String strPassengerName,String strAddress,String strCity, String strState, String strZipCode, String strCardType, String strCreditCardNumber, String strCreditCardMonth,String strCreditCardYear, String strNameOnCard  ){

        

        this.setPassengerName(strPassengerName);
        
        this.setAddress(strAddress);
        
        this.setCity(strCity);
        
        this.setState(strState);
        
        this.setZipCode(strZipCode);
        
        this.chooseCardType(strCardType);
        
        this.setCreditCardNumber(strCreditCardNumber);
        
        this.setCreditCardMonth(strCreditCardMonth);
        
        this.setCreditCardYear(strCreditCardYear);
        
        this.setNameOnCard(strNameOnCard);
        
        this.clickRememberMe();
        
        this.clickPurchaseFlight();

        
    }
}
