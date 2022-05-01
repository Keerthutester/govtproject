
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.apache.common.io.FileUtils;

public class Screen{

	public static void main(String[] args)throws IOException{
			System.setProperty("webdriver.chrome.driver","/Users/meganathan/Desktop/keerthu/JAVA/Files/Chromedriver");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize(); //MWM

			WebElement userName = driver.findElement(By.id("email"));
			userName.sendKeys("hello there");
			WebElement password = driver.findElement(By.id("pass"));
			password.sendKeys("hello");
		
			TakesScreenshot tc=(TakesScreenshot)driver;//typecasting
			File src=tc.getScreenshotAs(OutputType.FILE);//for taking screenshot
			File des=new File("/Users/meganathan/eclipse-workspace/Fb/Saveimages/fb.png") ;

			FileUtils.copyFile(src,des);

}
	}