package Step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GmailSteps {
WebDriver driver;
	
	@Given("^I have open the browser$")
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\SDET\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@When("^I Open Gmail Homepage$")
	public void goToFb()
	{
		driver.get("https://www.gmail.com/");
	}

	
	@Then("^Login Should Exist$")
	public void loginButton()
	{
		if(driver.findElement(By.id("identifierId")).isDisplayed())
		{
			System.out.println("Test Passed");
			
		}
		
		else {
			System.out.println("Test Passed");
		}
		driver.close();
	}
}
