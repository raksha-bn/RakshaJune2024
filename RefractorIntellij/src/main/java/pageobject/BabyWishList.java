package pageobject;

import org.openqa.selenium.WebDriver;

public class BabyWishList {

    WebDriver driver;

    public BabyWishList(WebDriver driver)
    {
      this.driver=driver; //now to got to testcotext and give driverknowledge
    }
    public String getTitle()
    {
return driver.getTitle();
    }
}
