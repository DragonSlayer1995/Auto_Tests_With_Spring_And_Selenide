package dragon.slayer.autotest.com;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber/html", "json:target/cucumber/json/cucumber.json", "pretty"},
        monochrome = true,
        features = "src/test/resources/features",
        glue = {"dragon.slayer.autotest.com"}
)
public class CucumberRunTest {


}
