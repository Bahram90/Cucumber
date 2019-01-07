package stepDefenation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class exam {
	WebDriver driver;
	@Given("^Open chrome and start application$")
	public void Open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver","/Users/aizada/Selenium/chromedriver");
		driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/");
	}

	@When("^I enter a valid username and valid password$")
	public void I_enter_a_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.id("email")).sendKeys("useaname");
		driver.findElement(By.id("pass")).sendKeys("Password");
	}

	@When("^user should be able to login succesfully$")
	public void user_should_be_able_to_login_succesfully() throws Throwable {
		driver.findElement(By.id("loginbutton")).click();
	}

	@Then("^browser should quit$")
	public void browser_should_quit() throws Throwable {
		driver.quit();
	}
}
