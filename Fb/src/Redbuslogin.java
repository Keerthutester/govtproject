
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbuslogin{

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/meganathan/Desktop/keerthu/JAVA/Files/Chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://crackwithjack.com/#");
	//driver.close();
		System.out.println("ürl--->"+driver.getCurrentUrl());
		System.out.println("title--->"+driver.getTitle());
		String result="ChromeDriver-WebDriver for chrome";
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		if(result.equals(driver.getTitle()))
		{
			System.out.println("ïts correct url");	
		}else
		{
			System.out.println("ïts correct url");	
		}
		//System.out.println("pagesource--->"+driver.getPageSource());
		//WebElement srcElement=driver.findElement(By.xpath("//input[@id='emailid']"));
		//srcElement.sendKeys("keerthi");
		WebElement continueText=driver.findElement(By.xpath("//a[contains(text(),'Latest')]"));
		System.out.println(continueText.getText());
		
		

		
		

	}

}
