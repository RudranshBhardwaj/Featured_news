package mainProject.featuredNews;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.io.*;
import Report.Screenshot;

import org.apache.commons.lang3.Validate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import TestBase.Browsers;

public class FeaturedNewsPage extends Browsers {

	public FeaturedNewsPage() throws Exception {
		super();
	}

	
	
	Screenshot capture = new Screenshot(); // Screenshot object for capturing screenshots
	WebElement screenShot;
	By userIcon = By.id("O365_MainLink_MePhoto"); // Locator for user icon
	By name = By.id("mectrl_currentAccount_primary"); // Locator for name element
	By mail = By.id("mectrl_currentAccount_secondary"); // Locator for mail element
	
	public void login() throws Exception {

		driver.findElement(By.id("i0116")).sendKeys("2266635@cognizant.com");
		driver.findElement(By.id("idSIButton9")).click();
		Thread.sleep(5000);

		driver.findElement(By.id("i0118")).sendKeys("password");
		driver.findElement(By.xpath("//input[@value='Sign in']")).click();
		Thread.sleep(5000);
		
	
	}
	
	public String getUserDetails() throws Exception {
//		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(userIcon)); // Wait for user icon to
		Thread.sleep(5000);
		capture.takescreenshot("HomePage",element); // Capture a screenshot																					// be present
		driver.findElement(userIcon).click(); // Click on the user icon
		
		System.out.println("!...........UserDetails.............!");
		String nameText = driver.findElement(name).getText(); // Get the text of the name element
		System.out.println(nameText); // Print the name text
		String mailText = driver.findElement(mail).getText(); // Get the text of the mail element
		System.out.println(mailText); // Print the mail text
		screenShot = driver.findElement(By.tagName("html"));
		capture.takescreenshot("getUserDetails",screenShot); // Capture a screenshot
		
		System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
		System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _  _");
		return nameText;
	}

	public static ArrayList<String> NewsHeadings = new ArrayList<String>();
	By NewsTitle = By.xpath("//div[contains(@class,'ar_b_91bed31b')]"); // Locator for news titles

	public void getTextOfHeadings() throws Exception {
		System.out.println("!...........NewsHeadings.............!");
		List<WebElement> NewsHeading = driver.findElements(NewsTitle); // Get the list of news headings
		for (WebElement news : NewsHeading) {
			System.out.println(news.getText()); // Print the text of each news heading
			NewsHeadings.add(news.getText());

		}
		System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
		System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _  _");
		
	}
	public static ArrayList<String> paragraphValidation= new ArrayList();
	public void getNewsArticles() throws InterruptedException, IOException {
		List<WebElement> NewsNumber = driver.findElements(By.xpath("//div[@class='e_a_37591358 q_a_37591358']")); 
		// Get the list of news elements																										 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		for (int i=1;i<=NewsNumber.size();i++) {
			System.out.println(i+" News Article");
			WebElement header = driver.findElement(By.xpath("(//*[@class='ar_b_91bed31b ac_b_91bed31b'])[" + i + "]"));
			wait.until(ExpectedConditions.elementToBeClickable(header)); // Wait for the header element to be clickable
			String head = header.getText(); // Get the text of the header
			System.out.println("This is the Heading of the Article");
			System.out.println(head); // Print the header text
			String title = head.trim().replaceAll("[^a-zA-Z]", " "); // Trim and remove special characters from the
			System.out.println();
			System.out.println("This the NextText File Name");															// header text to create a title
			System.out.println(title); // Print the title
			header.click(); // Click on the news header
			Thread.sleep(5000);
			List<WebElement> text = driver.findElements(By.xpath("//div/p")); // Get the list of paragraphs in the news
																				// article
			wait.until(ExpectedConditions.visibilityOfAllElements(text)); // Wait for all paragraphs to be visible
			String filename = "NewsText\\" + title + ".txt"; // Create a file name for the news article
			File oldfile = new File(filename);
			if (oldfile.exists()) { // If the file already exists
				if (oldfile.delete()) {
					System.out.println("File Deleted..."); // Delete the file if it exists
				} else {
					System.err.println("Failed to delete or No file " + filename);
				}
			}
			for (int j = 1; j < text.size() - 1; j++) {
				WebElement Newstext = driver.findElement(By.xpath("(//div/p)[" + j + "]")); // Get each paragraph
																							// element
				String displayText = Newstext.getText(); // Get the text of the paragraph
				System.out.println(displayText); // Print the paragraph text
				paragraphValidation.add(displayText);
				try (FileWriter file = new FileWriter(filename, true)) { // Write the paragraph text to the file
					file.write(displayText + "\n");
					file.close();
				} catch (Exception e) {
					System.err.println("Error occurred during saving the file data" + e.getMessage());
				}
			}

			Thread.sleep(6000);
			screenShot = driver.findElement(By.tagName("html"));
			capture.takescreenshot(title,screenShot); // Capture a screenshot

			driver.navigate().back(); // Navigate back to the previous page
			Thread.sleep(4000);
			
		}
	
	}

	public void browser() {
		driver.close(); // Close the browser
	}
}
