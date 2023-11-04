package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Register {
	WebDriver driver;

	@Given("Browser is launched url is entered")
	public void browser_is_launched_and_url_is_entered() {
		// Write code here that turns the phrase above into concrete actions
		driver = WebDriverManager.chromedriver().create();
		driver.get("https://demowebshop.tricentis.com/");
	}

	@And("Register page is displayed")
	public void register_page_is_displayed() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.linkText("Register")).click();
	}

	@When("User Clicks on male gender and enters first name,last name,email,password and Confirm password")
	public void user_clicks_on_male_gender_and_enters_first_name_last_name_email_password_and_confirm_password() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Abhi");
		driver.findElement(By.id("LastName")).sendKeys("S");
		driver.findElement(By.id("Email")).sendKeys("abhis10@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("abhis@1998");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("abhis@1998");
	}

	@And("User Clicks on Register button")
	public void user_clicks_on_register_button() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("register-button")).click();
	}

	@Then("User is successfully Registered")
	public void user_is_successfully_registered() {
		// Write code here that turns the phrase above into concrete actions
		if (driver.findElement(By.xpath("//div[@class=\"result\"]")).getText().contains("registration completed")) {
			Reporter.log("User successfully registered", true);
		} else {
			Reporter.log("User failed to register", true);
		}
	}

	@And("Browser closed")
	public void browser_is_closed() {
		// Write code here that turns the phrase above into concrete actions
		driver.quit();
	}
}
