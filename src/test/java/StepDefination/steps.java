package StepDefination;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v112.browser.Browser;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import TestBase.Browsers;
import excelSheet.ListOfNewsHeadings;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import mainProject.featuredNews.FeaturedNewsPage;

public class steps extends Browsers {
	public steps() throws Exception{
		super();
	}
    ResourceBundle rb; // for reading properties file
    String br; //to store browser name

	ListOfNewsHeadings HeadingList = new ListOfNewsHeadings();
	FeaturedNewsPage newsPage = new FeaturedNewsPage();

    @Before
    public void setup() throws Exception    //Junit hook - executes once before starting
    {
        
        //Reading config.properties (for browser)
        rb=ResourceBundle.getBundle("function");
        br=rb.getString("browser");

        
    }

    @After
    public void tearDown(Scenario scenario) {
        System.out.println("Scenario status ======>"+scenario.getStatus());
        if(scenario.isFailed()) {
        	
        	TakesScreenshot ts=(TakesScreenshot) driver;
        	byte[] screenshot=ts.getScreenshotAs(OutputType.BYTES);
        	scenario.attach(screenshot, "image/png",scenario.getName());
        	            
        }
        newsPage.browser();
    }

	@When("user login")
	public void user_login() throws Exception {
		invokeBrowser();
	   newsPage.login();
	}

	

	@Then("User navigates to be.cognizant")
	public void user_navigates_to_be_cognizant() throws Exception {
	
		String userName= newsPage.getUserDetails();
		
		//verify where logo is visible or not
		System.out.println(driver.getTitle());
		Assert.assertEquals(userName, "Bhardwaj, Rudransh (Contractor)");
	}
	@Then("capture Heading")
	public void capture_heading() throws Exception {
		newsPage.getTextOfHeadings();
		//adding the Heading in excel sheet
		HeadingList.Headinglist();
		
		//Verifying the Heading
		ArrayList<String> allHeading = newsPage.NewsHeadings;
		ArrayList<String> expectedHeading=new ArrayList<>(Arrays.asList(
				"CFO Jan Siegmund lives — and leads — with pride",
				"Inside Cognizant and Tidal’s mission to transform the Blue Economy",
				"Women in Engineering: Recognizing Women’s Contribution to Engineering",
				"Wins and deals: Across every industry, companies are choosing Cognizant",
				"CEO blog: Watch my interview with CNBC India"));
		Assert.assertEquals(allHeading,expectedHeading ); 
	}

	@Then("capture Paragraph")
	public void capture_paragraph() throws Exception {
		Thread.sleep(5000);
		newsPage.getNewsArticles();
		//Verify the paragraph
		String paragraph=newsPage.paragraphValidation.get(0);
		Assert.assertTrue(paragraph.contains("As Cognizant’s CFO and Executive Sponsor of the Embrace LGBTQ+ affinity group, Jan Siegmund leads the company toward growth while inspiring associates to show up as their authentic selves."));
	}
	


}
