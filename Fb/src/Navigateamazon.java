import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigateamazon{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","/Users/meganathan/Desktop/keerthu/JAVA/Files/Chromedriver");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		System.out.println("title"+driver.getTitle());

		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("iphone",Keys.ENTER);

		WebElement selectDress =
		driver.findElement(By.xpath("//span[text()='Apple iPhone 8, US Version, 64GB, Gold - GSM Carriers (Renewed)']"));
		selectDress.click();
		
		String pwid  = driver.getWindowHandle();
		System.out.println("pwid"+pwid);

		Set<String> allwindows  = driver.getWindowHandles();
		System.out.println("pwid"+allwindows);
		

		// Enhanced for loop
		for (String eachWindowId: allwindows) {
			if(pwid != eachWindowId) {
				driver.switchTo().window(eachWindowId);
			}
		}

		String childWindow  = driver.getWindowHandle();
		System.out.println("childWindow-->"+childWindow);

		System.out.println("title"+driver.getTitle());
		
		WebElement addToCart = driver.findElement(By.xpath("//a[text()=' Add to List ']"));
		addToCart.click();
		Thread.sleep(5000);

		driver.close();
		
		//driver.switchTo().window(pwid);
		
		//Apple iPhone 11 (64GB) - Black
		//WebElement selectPhoned = driver.findElement(By.xpath("//img[@title='AAKRITI ART CREATIONS Multicoloured Handcrafted Wall Mirror']"));
		//selectPhoned.click();*/

	}
}

