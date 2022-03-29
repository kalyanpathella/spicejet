package runnerclass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/features/feature1.feature",
		                   "src/test/resources/features/feature2.feature"
                           },
                   glue="gluecode",
                   plugin={"pretty","html:target/myresultsspicejet"},
                   monochrome=true)

public class Runner1 
{
}
