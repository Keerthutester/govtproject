import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {
	
	public static void main(String args[]) {
//		
		System.setProperty("webdriver.chrome.driver","/Users/meganathan/Desktop/keerthu/JAVA/Files/Chromedriver");
		WebDriver driver = new ChromeDriver();
		

		driver.get("https://demoqa.com/droppable/");
		driver.manage().window().maximize();
		
		WebElement btnCourse = driver.findElement(By.id("draggable"));
		WebElement btnPega = driver.findElement(By.id("droppable"));
	
		Actions actionObj = new Actions(driver);
		
		actionObj.dragAndDrop(btnCourse, btnPega).perform();
		

	}
}
