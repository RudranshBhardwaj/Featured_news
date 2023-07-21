package Report;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;

import TestBase.Browsers;

public class Screenshot extends Browsers {

	public Screenshot() throws Exception {
		super();
	}

	public void takescreenshot(String Name,WebElement NodeName) throws IOException {
		// Take a screenshot
		File screenshotFile = NodeName.getScreenshotAs(OutputType.FILE);

		// Generate a unique filename using timestamp and UUID
		String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
		String uniqueId = UUID.randomUUID().toString();
		String fileName = Name + timestamp + "_" + uniqueId + ".png";

		// Save the screenshot file with the generated filename
		try {
			String userDir = System.getProperty("user.dir");
			FileUtils.copyFile(screenshotFile, new File(userDir + "\\Screenshot\\" + fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
