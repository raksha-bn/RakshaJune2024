package utils;

import org.checkerframework.checker.index.qual.PolyUpperBound;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

//this is heart of package.
//using this driver knowledge will be shared to other classes
public class TestContext {


    public WebDriver driver;

    public PageObjectManager pom;
    public Webdivermanager webDriverManger;

    public TestContext() throws IOException
    {
        webDriverManger=new Webdivermanager();//this is from class Webdivermanager
        //next need to pass testcontext knowledge to pageobjects

      pom=new PageObjectManager(webDriverManger.getDriverDetails());//when we put driver we get error go to pageobject manage and write constructor there
    }
}
