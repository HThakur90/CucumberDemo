package AppFeatures;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/AppFeatures/Login.feature"}, glue = {"Step"})
public class TestRunner
{
	
}
