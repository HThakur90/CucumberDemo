package Step;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class GmailLoginSteps {
WebDriver driver;
@When("^User log in with username as \\\"(.*?)\\\" and Password as \\\"(.*)\\\"$")
public void user_log_in_as_username_as_and_password_as(String username, String password) {
    // Write code here that turns the phrase above into concrete actions

	driver.findElement(By.id("identifierId")).sendKeys(username);
	driver.findElement(By.xpath("//*[@id='passwordNext']/div/button/span")).click();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	driver.findElement(By.name("password")).sendKeys(password);
	driver.findElement(By.xpath("//*[@id='passwordNext']/div/button/div[3]")).click();
}

@Then("^Home Page should be displayed$")
public void home_page_should_be_displayed() {
    // Write code here that turns the phrase above into concrete actions
    	String expected_title= "Gmail";
    	String actual_title=driver.findElement(By.xpath("//*[@id='gb']/div[2]/div[1]/div[4]/div/a")).getText();
    	Assert.assertEquals(expected_title,actual_title);

    	
}


}
