import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal{

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/meganathan/Desktop/keerthu/JAVA/Files/Chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.zomato.com/");
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
		WebElement srcElement=driver.findElement(By.id("userName"));
		srcElement.sendKeys("9095579714");
		//WebElement destElement=driver.findElement(By.id("dest"));
		//destElement.sendKeys("madurai");
		
		

		
		

	}

}
