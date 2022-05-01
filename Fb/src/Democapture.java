import java.io.File;
import java.util.Date;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Democapture {

	public static void main(String[] args)throws Exception{
		Date currentdate=new Date();
		System.out.println(currentdate);
		String scrsht=currentdate.toString().replace(" ", "-").replace(":","-");
		System.out.println(scrsht);
		
			System.setProperty("webdriver.chrome.driver","/Users/meganathan/Desktop/keerthu/JAVA/Files/Chromedriver");
			WebDriver driver = new ChromeDriver();
			driver.get("http://www.greenstechnologys.com/flutter-and-dart-training-in-chennai.html");
			driver.manage().window().maximize(); //MWM
			
			WebElement loginButton=driver.findElement(By.xpath("//h2[text()='About Trainer']"));
		
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			
			js.executeScript("arguments[0].scrollIntoView(true)",loginButton);
			loginButton.click();
			
			
		
			TakesScreenshot tc=(TakesScreenshot)driver;//typecasting
			File src=tc.getScreenshotAs(OutputType.FILE);//for taking screenshot
			FileUtils.copyFile(src,new File(".//saveimages//"+ scrsht + ".png"));
		

}
	}

