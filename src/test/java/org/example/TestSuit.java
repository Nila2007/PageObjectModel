package org.example;

import org.testng.annotations.Test;

public class TestSuit extends BaseTest {

    HomePage homePage = new HomePage();
    RegisterPage registerPage=new RegisterPage();
    RegisterSucssesPage registerSucssesPage = new RegisterSucssesPage();
    EmailAFriend emailAFriend =new EmailAFriend();
    BooksCategory books = new BooksCategory();


     @Test
    public void veryfiyUserShouldAbleToRefisterSuccessfully() {
         homePage.veryfyUserOnHomePage();
         homePage.clickOnRegisterButton();
         //registerPage.toVeryfyUsetONRegisterPage();
         registerPage.userEnterRegisterationDetails();
         registerSucssesPage.veryfyUserRegisterSuccessFully();
     }
     @Test(priority = 2)
     public void userNavigateToTheComputerCategory() {
         homePage.veryfyUserOnHomePage();
         homePage.clickOnRegisterButton();
        //registerPage.toVeryfyUsetONRegisterPage();
         registerPage.userEnterRegisterationDetails();
         registerSucssesPage.veryfyUserRegisterSuccessFully();

         emailAFriend.userAbleToSelectComputerCategory();
         emailAFriend.userSelectTheDesktop();
         emailAFriend.userClickOnDigitalStrom();
         emailAFriend.userSendEmailToTheFriend();
         emailAFriend.usergetConformationMessage();

     }

     @Test(priority = 3)
     public void userNavigateToTheBooksCategory(){
         books.userNavigateToTheBooksCategory();
         books.userClickOnBookCatagory();
         books.getTextFromAddToBasket();
         books.getTextFromAddToBasket();


     }
}










