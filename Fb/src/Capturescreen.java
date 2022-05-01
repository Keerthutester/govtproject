import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Capturescreen {

	public static WebDriver driver;

	private static void captureScreenshot() throws IOException {

		Date d = new Date();

		String FileName = d.toString().replace(":", "_").replace(" ", "_") + ".png";

		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileHandler.copy(screenshot, new File("/home/users/bhanu.pratap/Documents/testScreenshot/" + FileName));

	}
}

