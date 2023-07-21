package TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browsers {

	protected static Properties prop;

	public static WebDriver driver;


	public Browsers() throws Exception {
		try {
			String userDir = System.getProperty("user.dir");
			prop = new Properties();
			FileInputStream ip = new FileInputStream(userDir + "\\src\\main\\java\\config\\config.properties");

			// loading properties file
			prop.load(ip);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
	}

	
	public static void invokeBrowser() {

		String browsername = prop.getProperty("browser");
		if (browsername.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browsername.equalsIgnoreCase("firefox")) {

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else if (browsername.equalsIgnoreCase("edge")) {

			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		}

		else {
			System.out.println("Please provide a proper browser value..");
		}
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));

		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		

	}



}
