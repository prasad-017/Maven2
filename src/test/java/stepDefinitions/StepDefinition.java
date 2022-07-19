package stepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class StepDefinition {
	
	@Given("^User is on landing page$")
    public void user_is_on_landing_page() throws Throwable {
		System.out.println("User is on Login page");
    }

    @When("^User log into application with \"([^\"]*)\" name and password \"([^\"]*)\"$")
    public void user_log_into_application_with_something_name_and_password_something(String strArg1, String strArg2) throws Throwable {
    	System.out.println(strArg1);
    	System.out.println(strArg2);
    }

    @Then("^Home page is displayed$")
    public void home_page_is_populated() throws Throwable {
    	System.out.println("Home Page is displayed");
    }

    @And("^cards are populated$")
    public void cards_are_displayed() throws Throwable {
    	System.out.println("and cards are displayed");
    }


}
