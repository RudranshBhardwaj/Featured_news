package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features= {".//Feature/News.feature"},
        glue="StepDefination",
        plugin= {
        		"pretty", "html:reportsCucumber/myreport.html", 
        		"json:reportsCucumber/myreport.json"
        		},    //Mandatory to capture failures  
        dryRun=false,
        monochrome=true,
        tags = "@Sanity"	//Scenarios tagged with @sanity,
      )
public class TestRunner 
{

}