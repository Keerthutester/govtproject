import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/meganathan/Desktop/keerthu/JAVA/Files/Chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		//driver.close();
		//System.out.println("ürl--->"+driver.getCurrentUrl());
		//System.out.println("title--->"+driver.getTitle());
		//String result="ChromeDriver-WebDriver for chrome";
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getTitle());
		//if(result.equals(driver.getTitle()))
		//{
		//	System.out.println("ïts correct url");	
		//}else
		//{
		//	System.out.println("ïts correct url");	
		//}
		//System.out.println("pagesource--->"+driver.getPageSource());
		WebElement emailElement=driver.findElement(By.id("email"));
		emailElement.sendKeys("keerthi44@gmail.com");
		//System.out.println(emailElement.getAttribute("value"));
		//String text1=emailElement.getAttribute("value");
		//System.out.println(text1);
		//WebElement passElement=driver.findElement(By.id("pass"));
		//passElement.sendKeys("abcd123@");
		//System.out.println(passElement.getAttribute("value"));
		//WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		//email.sendKeys("keertHI");
		//WebElement passWord=driver.findElement(By.xpath("//input[@id='pass']"));
		//passWord.sendKeys("abcd123@");
		//WebElement loginButton=driver.findElement(By.xpath("//button[@name='login']"));
		//loginButton.click();
		//WebElement continueText=driver.findElement(By.xpath("//h2[contains(text(),'Facebook')]"));
		//System.out.println(continueText.getText());
		//String text=continueText.getText();
		//System.out.println(text);

		
		

	}
}


