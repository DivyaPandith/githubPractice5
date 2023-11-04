package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class cart1 {
	@Given("open browser and navigate to url")
	public void open_browser_and_navigate_to_url() {
	 WebDriver driver= WebDriverManager.chromedriver().create();
	}
}
