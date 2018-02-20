import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Harshala on 31/01/2018.
 */


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/features/",
                    //glue = "src/test/java/steps"
                    tags = "@gmailTest",
                  plugin = "html:target/test-reports" )
public class FirstRunner {
}
