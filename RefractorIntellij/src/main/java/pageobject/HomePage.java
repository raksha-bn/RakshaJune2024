package pageobject;

//in automation we need to first look at page object and enter methods for each feilds.

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class HomePage
{
    WebDriver driver;

    public HomePage(WebDriver driver)
    {
        this.driver=driver;
    }
public void entertheProductName(String prodName)
{
driver.findElement(By.id("twotabsearchtextbox")).sendKeys(prodName);
}

public void clickSearchbutton()
{
driver.findElement(By.id("nav-search-submit-button")).click();
}

public void clickBabyWish()
{

   WebElement ele= driver.findElement(By.id("nav-link-account"));
    Actions actions=new Actions(driver);
    actions.clickAndHold(ele).build().perform();
    driver.findElement(By.linkText("Baby Wishlist")).click();
//driver knowledge is not shared and willl be shared in text context class now driver has null knowledge
}

}
