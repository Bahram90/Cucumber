package StepDefenition;

//import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;

import Base.BaseUtil;
import Pages.LoginPage;
import Transformation.EmailTransform;
import Transformation.SalaryCountTransformer;
import cucumber.api.Transform;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

//public LoginPage page = new LoginPage(base.Driver);
public class LoginStep extends BaseUtil {
	//WebDriver driver;
	// create private variable for BaseUtil
	
	private BaseUtil base;
	

	public LoginStep(BaseUtil base) {
//go to inside of Hook class 
		
		this.base = base;
	}

	// for Login2 file
	@Then("should should see the userform page")
	public void should_should_see_the_userform_page() {
		
		Assert.assertEquals("Its not displayed", base.Driver.findElement(By.id("Initial")).isDisplayed(), true);
		//System.out.println("The driver is: " + base.StepInfo);
		System.out.println("///////////////////////");

		System.out.println("I should see the userform page");
		System.out.println("///////////////////////");
	}

	// for Login1 file
	@Given("I navigate to the login page")
	public void i_navigate_to_the_login_page() {
		System.out.println("I navigate to the login page ");
		System.out.println("///////////////////////");
		base.Driver.navigate().to("http://www.executeautomation.com/demosite/Login.html");
	}
	
	@Given("I click login button")
	public void i_click_login_button() {
		System.out.println("I click login button ");
		System.out.println("///////////////////////");
		LoginPage page = new LoginPage(base.Driver);
        page.ClickLogin();
	}

	@Given("I enter the following for Login")
	public void i_enter_the_following_for_Login(io.cucumber.datatable.DataTable table) {
		// how to get data fro multiple datas this method....
		LoginPage page = new LoginPage(base.Driver);
		List<List<String>> data = table.asLists();
		
		//System.out.println("The value is: " + data.get(1).get(0).toString());
		page.txtUserName.sendKeys(data.get(1).get(0));
		page.txtPassword.sendKeys(data.get(1).get(1));
		System.out.println("///////////////////////");
		System.out.println("The value is: " + data.get(1).get(1).toString());
		System.out.println("///////////////////////");

	}

	

	@Given("I enter {string} and {string}")
	public void i_enter_and(String userName, String password) {
		System.out.println("UserName is: " + userName);
		System.out.println("///////////////////////");

		System.out.println("Password is: " + password);
		System.out.println("///////////////////////");
		
	}

	// for Login3 file
	@Given("I enter the users email address as Email:([^\"]*)")
	public void i_enter_the_users_email_address_as_Email_admin(@Transform(EmailTransform.class) String email) {
		System.out.println("The email addres is " + email);
		
		System.out.println("///////////////////////");
	}

	@Given("I verify the count of my salary digits for Rs {int}")
	public void i_verify_the_count_of_my_salary_digits_for_Rs(@Transform(SalaryCountTransformer.class) Integer salary) {

		System.out.println("My salary digits count is: " + salary);
	}

}
