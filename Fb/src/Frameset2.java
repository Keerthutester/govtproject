import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frameset2 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/meganathan/Desktop/keerthu/JAVA/Files/Chromedriver");
		WebDriver driver = new ChromeDriver();
		
	driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
	
	driver.manage().window().maximize(); 
	List<WebElement>  frameSet = driver.findElements(By.tagName("iframe"));
    int leng = frameSet.size();
	System.out.println(leng);
	
	//WebElement frame = driver.findElement(By.name("login_page"));
	//driver.switchTo().frame(frame);
	
	WebElement emailElemet = driver.findElement(By.id("DUMMY1"));
    emailElemet.sendKeys("ram@gamil.com");
   WebElement emailElemet3= driver.findElement(By.xpath("(//img[@id='user-id-goahead'])[1]"));
   emailElemet3.click();
   Thread.sleep(10000);
    
    WebElement emailElemet2 = driver.findElement(By.xpath("(//input[@type='password'])[4]"));
    emailElemet2.sendKeys("abcd123");
    
    WebElement emailElemet1 = driver.findElement(By.id("VALIDATE_CREDENTIALS1"));
    emailElemet1.click();
    Thread.sleep(5000);
    
	
	
	
	}
}

