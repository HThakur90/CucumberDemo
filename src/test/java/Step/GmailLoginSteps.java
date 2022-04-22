package Step;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class GmailLoginSteps {


WebDriver driver=null;
@Before
public void setup() {
	System.setProperty("webdriver.chrome.driver", "D:\\SDET\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	
}

@Given("^I Open Orange Homepage$")
public void go()
{
		driver.get("https://opensource-demo.orangehrmlive.com/");
}

@When("^User log in with username as \\\"(.*?)\\\" and Password as \\\"(.*)\\\"$")

public void user_log_in_as_username_as_and_password_as(String username, String password) {
	
    // Write code here that turns the phrase above into concrete actions
	
	driver.findElement(By.name("txtUsername")).sendKeys(username);
	
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	driver.findElement(By.name("txtPassword")).sendKeys(password);
	driver.findElement(By.id("btnLogin")).click();
}

@Then("^Home Page should be displayed$")
public void home_page_should_be_displayed() {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("Test pass!");

    	
    	
}

@After
public void tear_down()
{
	driver.close();
}


}
