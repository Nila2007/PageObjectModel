package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
                   // In browser manager , give path for google crome and demo.nopcommerce
import java.util.concurrent.TimeUnit;

public class BrowserManager extends Uti1{

        // Browser manager extends with util1,

    public void setBrowser(){
        // set the cromeDriver path
        System.setProperty("webdriver.chrome.driver", "src\\test\\BrowserDrivers\\chromedriver.exe");
        // obj ect for chrome driver
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("useAutomationExtension", false);
        System.setProperty("webdriver.chrome.driver","src\\test\\BrowserDrivers\\chromedriver.exe");
        //open the browser
        driver = new ChromeDriver();
        // to maximize window
        driver.manage().window().maximize();
        //synchronizetion micanizum
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        // type the url
        driver.get("https://demo.nopcommerce.com/ ");
    }


    public void closeBrowser(){
        driver.close();
    }
}
