package mainProject.featuredNews;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.xmlbeans.impl.xb.xsdschema.All;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import excelSheet.ListOfNewsHeadings;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Report;

import Report.ExtentReportManager;
import TestBase.Browsers;

@Listeners(ExtentReportManager.class)

public class FeaturedNewsTestCases extends Browsers {

	public FeaturedNewsTestCases() throws Exception {
		super();
	}

	ListOfNewsHeadings HeadingList = new ListOfNewsHeadings();
	FeaturedNewsPage newsPage = new FeaturedNewsPage();

	// Invoke the browser
	@BeforeClass
	public void Driversetup() throws Exception {
		invokeBrowser();
		newsPage.login();
		System.out.println(driver.getTitle());
		
		
	}

	// Get user details
	@Test(priority = 1)
	public void Userdetails() throws Exception {
//		newsPage.login();
		String userName= newsPage.getUserDetails();
		
		//verify where logo is visible or not
		System.out.println(driver.getTitle());
		Assert.assertEquals(userName, "Bhardwaj, Rudransh (Contractor)");
		
	

	}

	// Get text of news headings
	@Test(priority = 2,dependsOnMethods = {"Userdetails"})
	public void Headings() throws Exception {
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

	// Get the text of news articles
	@Test(priority = 3,dependsOnMethods = {"Userdetails","Headings"})
	
	public void TextOfNews() throws Exception {
		Thread.sleep(5000);
		newsPage.getNewsArticles();
		String paragraph=newsPage.paragraphValidation.get(0);
		Assert.assertTrue(paragraph.contains("As Cognizant’s CFO and Executive Sponsor of the Embrace LGBTQ+ affinity group, Jan Siegmund leads the company toward growth while inspiring associates to show up as their authentic selves."));
	}

	@AfterClass
	public void CloseBrowser() {
		newsPage.browser();

	}
}
