import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import java.io.File;

@RunWith(Cucumber.class)
@CucumberOptions(features=".", tags={}, dryRun = true,
                 plugin = "com.cucumber.listener.ExtentCucumberFormatter:target/report/tsr.html")

public class Run {

    public static String xmlPath = new File("src/main/resources/extent-Config.xml").getAbsolutePath();

    @AfterClass
    public static void generateReport()
    {
        Reporter.loadXMLConfig(xmlPath);
    }
}
