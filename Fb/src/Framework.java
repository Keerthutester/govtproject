import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framework {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/meganathan/Desktop/keerthu/JAVA/Files/Chromedriver");
		WebDriver driver = new ChromeDriver();
		
	driver.get("http://demo.guru99.com/test/guru99home/");
	
	driver.manage().window().maximize(); 
	// void has no return type
	
	
	//img[@src='Jmeter720.png']
//	org.openqa.selenium.NoSuchElementException: no such element: 
	//Unable to locate element: {"method":"xpath","selector":"//img[@src='Jmeter720.png']"}
	
	   
//	driver.switchTo().frame("a077aa5e");
	
	
	WebElement frame = driver.findElement(By.id("a077aa5e"));
	driver.switchTo().frame(frame);

	
    WebElement imageElement = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
    imageElement.click();
        
    driver.switchTo().defaultContent();
    
    WebElement emailElemet = driver.findElement(By.id("philadelphia-field-email"));
    emailElemet.sendKeys("ram@gamil.com");

    List<WebElement>  frameSet = driver.findElements(By.tagName("iframe"));
    int leng = frameSet.size();
	System.out.println(leng);
	
	/*
	 driver.switchTo().frame("a077aa5e");
//    WebElement frame = driver.findElement(By.id("a077aa5e"));
//    driver.switchTo().frame(frame);
    
    WebElement imageElement = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
    imageElement.click();
    
    
    driver.switchTo().defaultContent();
    
    WebElement emailElemet = driver.findElement(By.id("philadelphia-field-email"));
    emailElemet.sendKeys("ram");
    
*/
	
	}

}

