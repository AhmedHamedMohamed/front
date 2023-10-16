package runner;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "not @wip and not @quarentine",
        features = "src/main/resources/Features"
        ,glue="steps"
        ,plugin = {"pretty", "html:build/reports/feature.html"}

)

public class TestRunner {




}
