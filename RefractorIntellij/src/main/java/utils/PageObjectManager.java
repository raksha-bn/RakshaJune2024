package utils;

import org.openqa.selenium.WebDriver;
import pageobject.BabyWishList;
import pageobject.HomePage;
import pageobject.LearnMoreExplicitPage;
import pageobject.LearnmoreAlertsPage;

//here we create method for pageobjects package
public class PageObjectManager {

    public BabyWishList bw;
    public HomePage hp;
    public WebDriver driver;
    public LearnmoreAlertsPage learnmoreAlertsPage;
    public LearnMoreExplicitPage lme;

    public PageObjectManager(WebDriver driver)//after putting driver
    {
        this.driver = driver;  //now pass driver to below constructoer but will get error
    }

    public BabyWishList getBabyWishList() {
        bw = new BabyWishList(driver);
        return bw;//entire class will be returned.
    }

    public HomePage getHomePage() {
        HomePage hp = new HomePage(driver);//when u get error go to babywishlist classa] and create constructor
        return hp;
        //call pageobejctmanger in testcontext
    }

    public LearnmoreAlertsPage getLearnmoreAlertsPage() {
        learnmoreAlertsPage = new LearnmoreAlertsPage(driver);
        return learnmoreAlertsPage;
    }

    public LearnMoreExplicitPage getLearnMoreExplicitPage() {
        lme = new LearnMoreExplicitPage(driver);
        return lme;
    }
}
