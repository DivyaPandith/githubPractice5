package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	WebDriver driver;
	
	@Given("Browser is launched and url is entered")
	public void browser_is_launched_and_url_is_entered() {
	    // Write code here that turns the phrase above into concrete actions
	    driver=WebDriverManager.chromedriver().create();
	    driver.get("https://demowebshop.tricentis.com/");
	}

	@And("Login page is displayed")
	public void login_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.linkText("Log in")).click();
	}

	@When("User enters valid username and Password")
	public void user_enters_valid_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.id("Email")).sendKeys("abhishiva1998@gmail.com");
	    driver.findElement(By.id("Password")).sendKeys("Rolex@1998");
	}

	@And("User Clicks on login button")
	public void user_clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
	}

	@Then("User is successfully logged in")
	public void user_is_successfully_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
	   if(driver.findElement(By.xpath("(//a[@class=\"account\"])[1]")).getText().contains("abhishiva")) {
		   Reporter.log("User successfully logged in", true);
	   }
	   else {
		   Reporter.log("User failed log in", true);
	   }
	}

	@And("Browser is closed")
	public void browser_is_closed() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.quit();
	}
}
