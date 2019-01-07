package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test {
	
	WebDriver driver;
	@Given("Open chrome and start application")
	public void open_chrome_and_start_application() {
		System.setProperty("webdriver.chrome.driver","/Users/aizada/Selenium/chromedriver");
		driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://www.executeautomation.com/site/");
	}

	@When("I enter a valid username and valid password")
	public void i_enter_a_valid_username_and_valid_password() {
		driver.findElement(By.linkText("LOGIN")).click();
	}

	@When("User should be able to login succesfully")
	public void user_should_be_able_to_login_succesfully() {
		driver.findElement(By.id("side-user-login")).sendKeys("MikeSmith");
		driver.findElement(By.id("sidebar-user-pass")).sendKeys("abc123");
		driver.findElement(By.id("sidebar-wp-submit")).click();
	}

	@Then("Browser should quit")
	public void browser_should_quit() {
		driver.quit();
	}
}
