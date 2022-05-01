import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instalogin{

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/meganathan/Desktop/keerthu/JAVA/Files/Chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
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
		WebElement srcElement=driver.findElement(By.name("username"));
		srcElement.sendKeys("keerthi");
		WebElement destElement=driver.findElement(By.id("password"));
		destElement.sendKeys("9791770639");
		
		

		
		

	}

}
