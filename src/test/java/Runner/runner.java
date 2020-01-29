package Runner;

import java.io.File;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.ExtentCucumberFormatter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"html:target/cucumber_html_report", "pretty", "com.cucumber.listener.ExtentCucumberFormatter"},
		         features= {"features"},
                 glue= {"stepDefinition"},
                 tags= {"@Login"}
                 
		
		
		)
public class runner {
    @BeforeClass
	public static void setup() {
		
    	ExtentCucumberFormatter.initiateExtentCucumberFormatter();
    	
    	ExtentCucumberFormatter.loadConfig(new File("extent-config.xml"));
    	
    	ExtentCucumberFormatter.addSystemInfo("Browser name", "Chrome");
    	
    	ExtentCucumberFormatter.addSystemInfo("Browser version", "79");
		
		
	}
	
	
}
