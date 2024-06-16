package Stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utils.TestContext;

public class Learnmoresteps {

    TestContext Context;
    public Learnmoresteps(TestContext Context)
    {
        this.Context=Context;
    }

    @Given("user click on confirmation box button")
            public void clickConfirm()
    {
       Context.pom.getLearnmoreAlertsPage().clickConfirmBoxButton();
    }

    @Then("user validate the alert message")
    public void userValidateTheAlertMessage() {
        String actualMessage= Context.pom.getLearnmoreAlertsPage().getAlertBoxText();
        Assert.assertEquals("Press a Button !",actualMessage);
    }

    @And("user validate the UI message")
    public void userValidateTheUIMessage() {
        Context.pom.getLearnmoreAlertsPage().clickCancelAlert();
        Assert.assertEquals("You Pressed",Context.pom.getLearnmoreAlertsPage().getCancelTextMessageFromUI());
    }

    @Given("user clicks on change Text button")
    public void userClicksOnChangeTextButton() {
        Context.pom.getLearnMoreExplicitPage().clickChangeTextButton();
    }

    @Then("validate the change text value")
    public void validateTheChangeTextValue() {
        Assert.assertEquals("Hello, Learn More Aspirants", Context.pom.getLearnMoreExplicitPage().getChangeText());

    }
}
