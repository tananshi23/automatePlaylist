package stepDefinition;

import driverManager.InitiateDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObjects.LandingPage;

//validations of the business logics written in pageObjects

public class LandingPageSteps {
    public LandingPage lp = new LandingPage(InitiateDriver.getDriver());

   @Given("user is able to see the Youtube logo")
    public void user_is_able_to_see_the_youtube_logo() {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(lp.validateLogo());
        System.out.println("Success given");
    }
    @When("user is able to see the sign button")
    public void user_is_able_to_see_the_sign_button() {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(lp.validateSignInButton()); //hard assert
        System.out.println("Success when");
    }
    @Then("user clicks on Sign in Button")
    public void user_clicks_on_sign_in_button() {
        // Write code here that turns the phrase above into concrete actions
        lp.clickSignIn();
        System.out.println("ok");
    }
    @Given("user provides email id {string}")
    public void user_provides_email_id(String emailId) {
        // Write code here that turns the phrase above into concrete actions
        lp.clickSignIn();
        lp.enterEmail(emailId);
        System.out.println("ok");
    }
    @Given("user clicks on next button1")
    public void user_clicks_on_next_button() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        lp.cliclNext();
        System.out.println("ok");
    }
    @Given("user enters Password {string}")
    public void user_enters_password(String password) {
        // Write code here that turns the phrase above into concrete actions
        lp.enterPwd(password);
        System.out.println("ok");
    }
    @When("user clicks on next button2")
    public void user_clicks_on_next_button1() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("ok");
    }
    @Then("user is able to logs in to the account and user is able to see {string} text")
    public void user_is_able_to_logs_in_to_the_account_and_user_is_able_to_see_text(String string) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("ok");
    }

}
