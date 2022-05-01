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

public class Screenshot1 {

	public static void main(String[] args)throws Exception{
		Date currentdate=new Date();
		System.out.println(currentdate);
		String scrsht=currentdate.toString().replace(" ", "-").replace(":","-");
		System.out.println(scrsht);
		
			System.setProperty("webdriver.chrome.driver","/Users/meganathan/Desktop/keerthu/JAVA/Files/Chromedriver");
			WebDriver driver = new ChromeDriver();
			driver.get(" https://www.amazon.in/");
			driver.manage().window().maximize(); //MWM

			WebElement searchName = driver.findElement(By.id("twotabsearchtextbox"));
			searchName.sendKeys("motorola");
			WebElement loginButton=driver.findElement(By.xpath("//input[@type='submit']"));
			loginButton.click();
			//WebElement password = driver.findElement(By.id("pass"));
			//password.sendKeys("hello");//span[text()='Mail Us:']
		
			TakesScreenshot tc=(TakesScreenshot)driver;//typecasting
			File src=tc.getScreenshotAs(OutputType.FILE);//for taking screenshot
			FileUtils.copyFile(src,new File(".//saveimages//"+ scrsht + ".png"));
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			WebElement email = driver.findElement(By.xpath("//div[text()='Connect with Us']"));
			js.executeScript("arguments[0].scrollIntoView(true)",email);
		

}
	}
