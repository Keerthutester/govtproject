import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Dropmonth {
public static void main(String[] args)throws InterruptedException {
	//WebDriver list;
	System.setProperty("webdriver.chrome.driver","/Users/meganathan/Desktop/keerthu/JAVA/Files/Chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/signup");
	driver.manage().window().maximize();
	
	Select s=new Select(driver.findElement(By.id("month"))); 
	List<WebElement> list = s.getOptions();
	
	//
	for(int i=0;i<list.size()-1;i++) 
	{
		WebElement index	= list.get(i);
		//String indexV = index.getAttribute("value");
		//System.out.println(indexV);
		String indexValue = index.getText();
		System.out.println("-->"+indexValue);

	

	}


}
}
