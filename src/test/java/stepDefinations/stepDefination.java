package stepDefinations;
import org.junit.runner.RunWith;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefination{

	@Given("User is on Netbanking landing page")
	public void user_is_on_netbanking_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("navigated to page");
	
	   
	}
	 @When("^User login to application with \"([^\"]*)\" and \"([^\"]*)\"$")
	    public void user_login_to_application_with_something_and_something(String strArg1, String strArg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(strArg1);
		System.out.println(strArg2);
	  
	}
	@Then("Home page is populated")
	public void Home_page_is_populated() {
	    // Write code here that turns the phrase above into concrete actions
    	System.out.println("home page is validated");
	  
	}
	@And("^Cards displayed are \"([^\"]*)\"$")
    public void cards_displayed_are_something(String strArg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println(strArg1);
	    
	}

}