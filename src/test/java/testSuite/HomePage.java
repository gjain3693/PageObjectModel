package testSuite;

import pageobjects.HomePageObject;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePage {
	
	@Given("^user valid url \"([^\"]*)\" at browser$")
	public void user_valid_url_at_browser(String url) {
		
		HomePageObject.setDriver();
		
		HomePageObject.driver.navigate().to(url);
		
		System.out.println("URL:::"+url);
	  
	}

	@When("^user perform action to open web page$")
	public void user_perform_action_to_open_web_page() {
	   
	}

	@Then("^Money Control \"([^\"]*)\" Page loaded successfully$")
	public void money_Control_Page_loaded_successfully(String page) {
	 
	}
}
