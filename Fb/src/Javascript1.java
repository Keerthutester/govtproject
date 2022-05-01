
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript1 {

	public static void main(String[] args) throws InterruptedException {
	

		System.setProperty("webdriver.chrome.driver","/Users/meganathan/Desktop/keerthu/JAVA/Files/Chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://toolsqa.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
	
		WebElement email = driver.findElement(By.xpath("//div[text()='Recent Tutorials']"));
		js.executeScript("arguments[0].scrollIntoView(true)",email);
	
	
	}
}

		

