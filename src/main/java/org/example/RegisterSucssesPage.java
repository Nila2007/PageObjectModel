package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterSucssesPage extends Uti1 {
    private By _registerSuccessMessage = By.xpath("//div[@class='result']");
    String expectedRegisterSuccessMessage = "Your registration completed";

public void veryfyUserRegisterSuccessFully(){
    getTextFromElement(_registerSuccessMessage);
    Assert.assertEquals(expectedRegisterSuccessMessage,_registerSuccessMessage);
   Assert.assertEquals(getTextFromElement(_registerSuccessMessage),expectedRegisterSuccessMessage);


}
}