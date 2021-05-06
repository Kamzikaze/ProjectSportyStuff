package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
																
<<<<<<< HEAD
@CucumberOptions(features="src/test/resources/features", glue="stepDefinitions", tags= "@windowtest") //, tags= "@idtest"
=======
@CucumberOptions(features="src/test/resources/features", glue="stepDefinitions", tags= "@scoreTable") 
>>>>>>> branch 'master' of https://github.com/Kamzikaze/ProjectSportyStuff.git
public class TestRunner {
	
}