package FirstCryPackage;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features ="src/test/java/FirstCry.feature" ,glue={"com.hcl.definition"})


public class RunnerForFirstCry {

}
