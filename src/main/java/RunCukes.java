import com.membership.projectresouces.webDriverSingleton;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
 features = {"src/test"},
        // format = {"pretty", "html:target/reports/cucumber/html", "json:target/cucumber.json", "usage:target/usage.jsonx", "junit:target/junit.xml"},
         // Run every thing but ignore @wip and @fail
         // tags = {"@ikea,@skrill","~@wip","~@fail"}, strict = true)
         tags = {"@current"}, strict = true)

public class RunCukes {
    @AfterClass
    public static void tearDown() {
        webDriverSingleton.getInstance().quit();
    }
}
