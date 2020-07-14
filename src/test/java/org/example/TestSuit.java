package org.example;

import org.testng.annotations.Test;

public class TestSuit extends BaseTest {
          //objects for all classes
    HomePage homePage = new HomePage();
    RegisterPage registerPage=new RegisterPage();
    RegisterSucssesPage registerSucssesPage = new RegisterSucssesPage();
    EmailAFriend emailAFriend =new EmailAFriend();
    BooksCategory books = new BooksCategory();

 //Register page
     @Test
    public void veryfiyUserShouldAbleToRefisterSuccessfully() {
         homePage.veryfyUserOnHomePage();
         homePage.clickOnRegisterButton();
         registerPage.userEnterRegisterationDetails();
         //registerPage.userRegisterSuccessfully();
        // registerSucssesPage.veryfyUserRegisterSuccessFully();
     }

     //computer and email a friends
     @Test(priority = 1)
     public void userNavigateToTheComputerCategory() {
        homePage.clickOnRegisterButton();
         registerPage.userEnterRegisterationDetails();
         emailAFriend.userAbleToSelectComputerCategory();
         emailAFriend.userSelectTheDesktop();
         emailAFriend.userClickOnDigitalStrom();
         emailAFriend.userSendEmailToTheFriend();
         //emailAFriend.userGetConformationMessage();

     }
     //Books catagory and add to basket
     @Test(priority = 2)
     public void userNavigateToTheBooksCategory(){
         books.userNavigateToTheBooksCategory();
         books.userClickOnBookCatagory();
         books.getTextFromAddToBasket();
         books.getTextFromAddToBasket();


     }
}










