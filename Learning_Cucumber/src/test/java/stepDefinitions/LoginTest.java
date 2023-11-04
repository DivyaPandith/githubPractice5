package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	WebDriver driver;

	@Given("{string} browser launched,entered {string}")
	public void browser_launched_entered(String browserName, String url) {
		if (browserName.equalsIgnoreCase("chrome")) {
			driver = WebDriverManager.chromedriver().create();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			driver = WebDriverManager.firefoxdriver().create();
		}
		driver.get(url);
	}

	@And("Login page displayed")
	public void login_page_displayed() {
		driver.findElement(By.linkText("Log in")).click();
	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String username, String password) {
		driver.findElement(By.id("Email")).sendKeys(username);
		driver.findElement(By.id("Password")).sendKeys(password);
	}

	@And("clicks login button")
	public void clicks_login_button() {
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}

	@Then("{string} logged into App")
	public void logged_into_app(String username) {
		if(driver.findElement(By.xpath("(//a[@class='account'])[1]")).getText().contains(username)) {
			System.out.println("User successfully logged in");
		}else {
			System.out.println("User failed to login");
		}
	}

	@And("browser closed")
	public void browser_closed() {
		driver.quit();
	}
}
