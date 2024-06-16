package Stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utils.TestContext;

public class Homepagesteps {

    TestContext context;
    //constructor should be same as class, this comes after testcontext

    public Homepagesteps(TestContext context){
this.context=context;
    }

    @Given("user clicks babywishlist from accounts and lists")
    public void clickbabywishlist()
    {
       // System.out.println("wish");
        //lastly after if condition come here.
        context.pom.getHomePage().clickBabyWish();

    }

    @Then("user verify the navigation")
    public void userVerifyNavigation() {
String actualvalue=context.pom.getBabyWishList().getTitle();
        Assert.assertEquals(expected:"abc",actualvalue);

    }
}
