import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropday {
	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/meganathan/Desktop/keerthu/JAVA/Files/Chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
		//WebElement e=driver.findElement(By.id("month"));
		Select s=new Select(driver.findElement(By.id("day"))); 
		//s.selectByVisibleText("15");
		//WebElement  signupButton = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		//signupButton.click();
		
		//Thread.sleep(2000);
		//WebElement ddYear  = driver.findElement(By.id("year"));
		//ddYear.click();
		
		List<WebElement> dd_options=s.getOptions();
		for (WebElement e1 : dd_options)
		{
			System.out.println(e1.getText());	

		}

}
}
