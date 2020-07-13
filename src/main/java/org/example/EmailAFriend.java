package org.example;
// User able to send a email successfuly and get conformation Message */
import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;
// Store all path in variables

public class EmailAFriend extends Uti1 {
    //give a variables name and store the locators....
    private By _clickOnComputer = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Computers')]");
    private By _clickOnDesktops = By.xpath("//div[@class='item-grid']//div[1]//div[1]//div[1]//a[1]//img[1]");
    private By _clickOnDigitalStorm = By.xpath("//h2[@class='product-title']" +
            "//a[contains(text(),'Digital Storm VANQUISH 3 Custom Performance PC')]");
    private By _clickOnEmailAFriendButton = By.xpath("//input[@value=\"Email a friend\"]");
    private By _enterAFriendsEmail = By.xpath("//input[@id='FriendEmail']");
    private By _enterYourEmail = By.cssSelector("#YourEmailAddress");
    private By _enterAMessage = By.cssSelector("#PersonalMessage");
    private By _clickOnSendButton = By.xpath("//input[@name='send-email']");
    private By _sendMessageConformation =By.xpath("//div[@class='result']");
    //private By _clickOnEmailAFriend = By.className("button-2 email-a-friend-button valid");


    /*  Test case steps */
    // write method according to the test steps
    public void userAbleToSelectComputerCategory() {
        clickOnElement(_clickOnComputer, 60);
   }
       public void userSelectTheDesktop() {
           clickOnElement(_clickOnDesktops, 50);
        }
        public void userClickOnDigitalStrom() {
            clickOnElement(_clickOnDigitalStorm, 40);
        }
        public void userSendEmailToTheFriend() {
            clickOnElement(_clickOnEmailAFriendButton, 30);
            TypeText(_enterAFriendsEmail, "nila123@gmail.com", 30);
           // TypeText(_enterYourEmail, "neev123@gail.com", 30);
            TypeText(_enterAMessage, "Jai swaminarayan", 30);
            clickOnElement(_clickOnSendButton,30 );
            getTextFromElement(_sendMessageConformation);

            //input[@name='send-email']
            //clickOnElement(_sendMessageConformation, 30);
        }
        //  print Conformation Message
        public void usergetConformationMessage(){


            String expectedText="Your message has been sent";
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            String actualText = getTextFromElement(By.xpath("//div[@class='result']"));
            //clickOnElement(By.xpath("//input[@name='send-email']"),30);
            Assert.assertEquals(actualText,expectedText);

        }


    }








