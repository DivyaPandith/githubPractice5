package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
	
	public static WebDriver driver;
	
	@Given("Browser launched and url is entered")
	public void browser_launched_and_url_is_entered() {
	   driver=WebDriverManager.chromedriver().create();
	   driver.get("");
	}

	@And("Home page is displayed")
	public void home_page_is_displayed() {
	    
	}

	@When("User enters username and password")
	public void user_enters_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Login displayed")
	public void login_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
