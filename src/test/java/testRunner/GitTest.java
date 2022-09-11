package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//created new branch
//created new branch2

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/Git.feature",
        glue = {"stepDefinition"},
        plugin= {"pretty","html:target/htmlReport.html"} ,
        monochrome= true)

public class GitTest {
}
// Git Repository created successfully.
// Git Repository created successfully.
