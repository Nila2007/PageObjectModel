package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Uti1 extends BasePage {
    public static void waitUntilElementToBeClickable(By by){
    WebDriverWait wait=new WebDriverWait(driver,30);
    wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public static void TypeText(By by, String text,int time){
        driver.findElement(by).sendKeys(text);
    }// click method with  Two parameter, one for time
    public static void clickOnElement(By by,int time){
        driver.findElement(by).click();
    } //time stamp method
    public static long timestamp(){
        return (System.currentTimeMillis());
    } // below method is for text
   public static String getTextFromElement(By by){
       return driver.findElement(by).getText();
    }
    //select method for select for drop down list
    public static void selectFromDropDownByVisiableText(By by, String text){
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }
    public static String getTxtFromElement(By by){
        return driver.findElement(by).getText();
    }
    public static void userRegisterSuccessfully( By by ,String text){
        getTextFromElement(by);
    }




    }






