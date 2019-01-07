package StepDefenition;

import org.openqa.selenium.chrome.ChromeDriver;

import Base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

//extends BaseUtil class inside of Hook class
public class Hook extends BaseUtil{
	
	//create private variable
	private BaseUtil base;
    
	
	//this is dependency injection 
	public Hook(BaseUtil base) {

		this.base = base;
		//then go to LoginStep class and extends BAseUtil class 
	}
	

	@Before
	public void InitializeTest(){
		System.out.println("Opening the browser: Chrome");
		
		System.setProperty("webdriver.chrome.driver","/Users/aizada/Selenium/chromedriver");
		//create public class inside of BaseUtil class
		//create global WebDriver driver; inside of LoginSTep class 
		base.Driver=new ChromeDriver();
		
		
		//Pasing a dummy WebDriver instance 
		      //base.StepInfo="ChromeDriver";
		//need to accsess in this driver inside of LoginSTep 
	}
	
	@After
	public void TearDownTest(Scenario scenario) {
		//example
		if(scenario.isFailed()) {
			//example code: Take screensshot
//			WebDriver driver = new FirefoxDriver();
//			driver.get("http://www.google.com/");
//			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//			// Now you can do whatever you need to do with it, for example copy somewhere
//			FileUtils.copyFile(scrFile, new File("c:\\tmp\\screenshot.png"));
			System.out.println(scenario.getName());
		}
		base.Driver.quit();
		System.out.println("Closing the browser: MOCK");
	}
}
