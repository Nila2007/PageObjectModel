package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;
  //To open Book categoris to check user can select and put in basket successfuly
import java.util.concurrent.TimeUnit;
   // Book category extends with uti1, where i store all reusable methods
public class BooksCategory extends Uti1 {
    // Store all Locatore in variables
    private By _userNavigateToTheBookPage = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Books')]");
    private By _userSelectClickAddToBasket = By.xpath("//div[@class='item-grid']//div[1]//div[1]//div[2]//div[3]//div[2]//input[1]");
    private By _goToTheTheBooksPage = By.xpath("//h2[@class='product-title']//a[contains(text(),'First Prize Pies')]");
    private  By _clickOnAddToBasket = By.id("add-to-cart-button-38");
    private By _clickOnShopingCart = By.xpath("//a[contains(text(),'shopping cart')]");
     // Method for all steps
    public void userNavigateToTheBooksCategory(){

       clickOnElement(_userNavigateToTheBookPage,30);
    }

       public void userClickOnBookCatagory() {
           clickOnElement(_userSelectClickAddToBasket,30);
           clickOnElement(_goToTheTheBooksPage,30);
          clickOnElement(_clickOnAddToBasket,50);
           clickOnElement(_clickOnShopingCart,40);



          // clickOnElement(By.xpath("//input[@id='add-to-cart-button-38']"
       }
       public void getTextFromAddToBasket(){
        String expectedText="Fahrenheit 451 by Ray Bradbury";
        // check Excepted and actual Result
        String actualText = getTextFromElement(By.xpath("//a[@class='product-name']" +
                "[contains(text(),'Fahrenheit 451 by Ray Bradbury')]"));
        driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
        Assert.assertEquals(actualText,expectedText);
        String expectedText1="First Prize Pies";
        String acutualText1= getTextFromElement(By.xpath("//a[@class='product-name']" +
                "[contains(text(),'First Prize Pies')]"));
        Assert.assertEquals(acutualText1,expectedText1);
    }



    }

