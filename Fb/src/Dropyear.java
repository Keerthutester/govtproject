import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropyear{

	public static void main(String[] args)throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","/Users/meganathan/Desktop/keerthu/JAVA/Files/Chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/signup");
	driver.manage().window().maximize();
	
	Select s=new Select(driver.findElement(By.id("year"))); 
	
	
	List<WebElement> dd_options=s.getOptions();
	for (WebElement e1 : dd_options)
	{
		System.out.println(e1.getText());	

	}

}
}
