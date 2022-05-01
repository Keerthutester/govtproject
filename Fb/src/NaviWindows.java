import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaviWindows{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","/Users/meganathan/Desktop/keerthu/JAVA/Files/Chromedriver");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		
		System.out.println("title"+driver.getTitle());

		WebElement searchBox = driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
		searchBox.sendKeys("mirrors",Keys.ENTER);

		WebElement selectDress =
		driver.findElement(By.xpath("//img[@title='Aapno Rajasthan Gold-Toned Metallic Frame with Mirror']"));
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
		WebElement addToCart = driver.findElement(By.xpath("//div[text()='ADD TO BAG']"));
		addToCart.click();
		Thread.sleep(5000);

		driver.close();
		
		driver.switchTo().window(pwid);
		//Apple iPhone 11 (64GB) - Black
		WebElement selectPhoned = driver.findElement(By.xpath("//img[@title='AAKRITI ART CREATIONS Multicoloured Handcrafted Wall Mirror']"));
		selectPhoned.click();

	}
}
