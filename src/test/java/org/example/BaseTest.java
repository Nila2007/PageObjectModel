package org.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Uti1{
    BrowserManager browserManager=new BrowserManager();

    @BeforeMethod
    public void openBrowser(){
        browserManager.setBrowser();

    }
    @AfterMethod
    public void closeBrowser(){
      //browserManager.browserCloseMethod();
    }

}
