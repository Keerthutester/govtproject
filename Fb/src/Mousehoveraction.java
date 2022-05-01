import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehoveraction {
	
	public static void main(String args[]) {
//		
		System.setProperty("webdriver.chrome.driver","/Users/meganathan/Desktop/keerthu/JAVA/Files/Chromedriver");
		WebDriver driver = new ChromeDriver();
		

		driver.get("http://greenstechnologys.com/");
		driver.manage().window().maximize();
		
		WebElement btnCourse = driver.findElement(By.xpath("//a[text()='COURSES']"));
	
		Actions actionObj = new Actions(driver);
		actionObj.moveToElement(btnCourse).perform();	
		//actionObj.dragAndDrop(btnCourse, btnCourse)

//		WebElement btnPega = driver.findElement(By.xpath("//span[text()='Pega Training']"));
//		btnPega.click();
		
		
		// Scenario 2
	

		WebElement btnOrac = driver.
				findElement(By.xpath("//span[text()='Oracle Training']"));
		actionObj.moveToElement(btnOrac).perform();
		WebElement plSqlAction = driver.
				findElement(By.xpath("//span[text()='PLSQL Certification']"));
		plSqlAction.click();


	}
}
