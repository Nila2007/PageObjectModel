package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;
               // fill all the Information to register
public class RegisterPage extends Uti1 {
    //String expecpectedTitalOfThePage = "Welcome to our store";
    //private By _welcomeTitle = By.xpath("//h2[contains(text(),'Welcome to our store')]");
    private By _selectGender = By.xpath("//input[@id='gender-female']");
    private By _firstName = By.cssSelector("#FirstName");
    private By _lastName = By.name("LastName");
    private By _dateOfBirthDay = By.name("DateOfBirthDay");
    private By _monthOfBirthday = By.name("DateOfBirthMonth");
    private By _yearOfBirthDay = By.name("DateOfBirthYear");
    private By _emailId = By.cssSelector("#Email");
    private By _companyName = By.xpath("//input[@id='Company']");
    private By _newsLetter = By.cssSelector("#Newsletter");
    private By _password = By.cssSelector("#Password");
    private By _conformPassword = By.cssSelector("#ConfirmPassword");
    private By _registerSubmitButton = By.id("register-button");
    private By _userRegisterMessage = By.name("Your registration completed");
    private By _continueOnHomepage = By.name("register-continue");


    public void userEnterRegisterationDetails() {
        clickOnElement(_selectGender, 30);
        TypeText(_firstName, "Nila", 30);
        TypeText(_lastName, "patel", 30);
        selectFromDropDownByVisiableText(_dateOfBirthDay, "20");
        selectFromDropDownByVisiableText(_monthOfBirthday, "May");
        selectFromDropDownByVisiableText(_yearOfBirthDay, "1995");
        TypeText(_emailId, "nila+" + timestamp() + "@gmail.com", 40);
        TypeText(_companyName, "Test.com", 30);
        clickOnElement(_newsLetter, 40);
        TypeText(_password, "123neev", 30);
        TypeText(_conformPassword, "123neev", 40);
        clickOnElement(_registerSubmitButton, 40);
        //getTextFromElement(_userRegisterMessage);
        clickOnElement(_continueOnHomepage, 30);
        //getTextFromElement(_userRegisterMessage);
    }
//        public void userRegisterSuccessfully(){
////    userRegisterSuccessfully(By.name("Your registration completed"),"30");
//    getTextFromElement(By.name("Your registration completed"));
//    String expectedText = "Your registration completed";
//         String actualText = expectedText;

    }


//div[@class='result
//Your registration completed
//register-continue