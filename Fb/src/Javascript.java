import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript {

	public static void main(String[] args) throws InterruptedException {
	

		System.setProperty("webdriver.chrome.driver","/Users/meganathan/Desktop/keerthu/JAVA/Files/Chromedriver");
		WebDriver driver = new ChromeDriver();
		
		
		/*
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.id("email"));
		js.executeScript("arguments[0].setAttribute('value','Greens@gmail.com')", email);
		
		WebElement passWord = driver.findElement(By.name("pass"));
		js.executeScript("arguments[0].setAttribute('value','abc@123')", passWord);
		
		String passWordString = (String) js.executeScript("return arguments[0].getAttribute('value')", passWord);
		System.out.println("pass-->"+passWordString);
		
		String usernameStr = (String) js.executeScript("return arguments[0].getAttribute('value')", email);
		System.out.println("username-->"+usernameStr);
		
		String indexValue = (String) js.executeScript("return arguments[1].getAttribute('value')", passWord,email);
		System.out.println("using Index-->"+indexValue);

		WebElement loginButton = driver.findElement(By.name("login"));
		js.executeScript("arguments[0].click()", loginButton);
		*/
		
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		WebElement signupElement = driver.findElement(By.xpath("//a[text()='Sign Up']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)",signupElement);
		Thread.sleep(5000);
		
		WebElement email = driver.findElement(By.id("email"));
		js.executeScript("arguments[0].scrollIntoView(false)",email);
	
	//WebElement simpleAlert = driver.findElement(By.xpath("//button[text()='Confirm Pop up']"));
	//js.executeScript("arguments[0].scrollIntoView(false)",simpleAlert);
	
	}
}

		
		