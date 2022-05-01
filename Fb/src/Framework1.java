import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framework1 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/meganathan/Desktop/keerthu/JAVA/Files/Chromedriver");
		WebDriver driver = new ChromeDriver();
		
	driver.get(" https://netbanking.hdfcbank.com/netbanking/");
	
	driver.manage().window().maximize(); 
	List<WebElement>  frameSet = driver.findElements(By.tagName("frameset"));
    int leng = frameSet.size();
	System.out.println(leng);
	
	WebElement frame = driver.findElement(By.name("login_page"));
	driver.switchTo().frame(frame);
	
	WebElement emailElemet = driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
    emailElemet.sendKeys("ram@gamil.com");
    WebElement emailElemet1 = driver.findElement(By.xpath("//a[text()='CONTINUE']"));
    emailElemet1.click();
    Thread.sleep(5000);
    WebElement emailElemet2 = driver.findElement(By.xpath("//input[@id='fldPasswordDispId']"));
    
    emailElemet2.sendKeys("abcd123");
    
    
	
	
	
	}
}
