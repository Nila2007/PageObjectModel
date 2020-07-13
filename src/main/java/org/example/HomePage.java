package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;
                         // To check user on Homepage
public class HomePage<welcomeTitalBox> extends Uti1{

    String expectedTitalOfThePage ="Welcome to our store";
    private By _welcomeTitelText = By.xpath("//h2[contains(text(),'Welcome to our store')]");
    private By _registerButton = By.className("ico-register");


   public void veryfyUserOnHomePage(){
       getTextFromElement(_welcomeTitelText);
       Assert.assertEquals(getTextFromElement(_welcomeTitelText),expectedTitalOfThePage,"user is not on homepage");
   }
    public void clickOnRegisterButton(){
        clickOnElement(_registerButton,20);
    }







}




















