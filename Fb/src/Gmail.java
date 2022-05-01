import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/meganathan/Desktop/keerthu/JAVA/Files/Chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		//WebElement userName=driver.findElement(By.id("identifierId"));
		//userName.sendKeys("keerthi");
		//System.out.println(userName.getAttribute("value"));
		//System.out.println(userName.getAttribute("data-initial-value"));
		//WebElement user=driver.findElement(By.xpath("//span[contains(text(),'continue')]"));
		//System.out.println(user.getText());
		
		
		//WebElement btnSignIn = driver.findElement(By.xpath("//button[@id='alertButton']"));
		//btnSignIn.click();
		
		//WebElement btnSignIn = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		//btnSignIn.click();
		
		//WebElement btnSignIn = driver.findElement(By.xpath("//div[@id='OKTab']"));
		//btnSignIn.click();
		
		
		//WebElement btnSignIn = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		//btnSignIn.click();
	   // WebElement butSi1 = driver.findElement(By.xpath("(//button[contains(text(),'click')])[3]"));
	    //butSi1.click();
	    
	   // WebElement btnSignIn2 = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		//btnSignIn2.click();
	    WebElement cntSign = driver.findElement(By.xpath("//a[text()='CONTINUE']"));
	    cntSign.click();
	     Alert alertObj = driver.switchTo().alert();
		String name = alertObj.getText();
		System.out.println(name);
		Thread.sleep(5000);
		alertObj.dismiss();
		Thread.sleep(5000);
		driver.quit();
}
}
