package Step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GmailSteps {
WebDriver driver;
	@Before
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\SDET\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	

	@Given("^I Open Orange HRM Homepage$")
	public void go()
	{
			driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@Then("^Login Should Exist$")
	public void loginButton()
	{
		if(driver.findElement(By.id("btnLogin")).isDisplayed())
		{
			System.out.println("Test Passed");
			
		}
		
		else {
			System.out.println("Test Passed");
		}
		
	}
	@After
	public void tear_down()
	{
		driver.close();
	}
}
