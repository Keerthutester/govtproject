
import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot2 {

	public static void main(String[] args)throws Exception{
		Date currentdate=new Date();
		System.out.println(currentdate);
		String scrsht=currentdate.toString().replace(" ", "-").replace(":","-");
		System.out.println(scrsht);
		
			System.setProperty("webdriver.chrome.driver","/Users/meganathan/Desktop/keerthu/JAVA/Files/Chromedriver");
			WebDriver driver = new ChromeDriver();
			driver.get(" https://www.flipkart.com/");
			driver.manage().window().maximize(); //MWM

			WebElement userName = driver.findElement(By.name("q"));
			userName.sendKeys("women");
			WebElement loginButton=driver.findElement(By.xpath("//button[@type='submit']"));
			loginButton.click();
			//WebElement password = driver.findElement(By.id("pass"));
			//password.sendKeys("hello");//span[text()='Mail Us:']
		
			TakesScreenshot tc=(TakesScreenshot)driver;//typecasting
			File src=tc.getScreenshotAs(OutputType.FILE);//for taking screenshot
			FileUtils.copyFile(src,new File(".//saveimages//"+ scrsht + ".png"));
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			WebElement email = driver.findElement(By.xpath("//span[text()='Mail Us:']"));
			js.executeScript("arguments[0].scrollIntoView(true)",email);
		

}
	}
