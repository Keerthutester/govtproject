import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/meganathan/Desktop/keerthu/JAVA/Files/Chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//WebElement e=driver.findElement(By.id("month"));
		//Select s=new Select(e);
		//s.selectByVisibleText("15");
		//s.selectByIndex(0);
		//s.selectByValue("Sep");
		//System.out.println(s.isMultiple());
		//WebElement e1=driver.findElement(By.id("month"));
		//Select s1=new Select(e1);
		//s1.selectByVisibleText();
		
		
		WebElement  signupButton = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		signupButton.click();
		
		Thread.sleep(2000);
		WebElement ddMonth  = driver.findElement(By.id("month"));
		ddMonth.click();

		Select selectObj  = new Select(ddMonth);
		selectObj.selectByIndex(3); //--> Apr
		Thread.sleep(1000);
		
		selectObj.selectByValue("10"); //--> Oct
		Thread.sleep(1000);


		selectObj.selectByVisibleText("Jan");

		selectObj.getOptions();
		
		System.out.println("------------------------");

		List<WebElement> list = selectObj.getOptions();
		
		WebElement firstIndex	= list.get(0);
		System.out.println("firstIndex"+firstIndex);
		
		String firstValue = firstIndex.getText();
		System.out.println(firstValue);
		
		
		int length =  selectObj.getOptions().size();
		System.out.println("length-->"+length);

		
		System.out.println("Total size-->"+length);
		WebElement lastIndex	= list.get(length-1);
		
		String lastValue = lastIndex.getText();
		System.out.println(lastValue);
		

		System.out.println("------------------------");
		
           
		
		for(int i=0; i<selectObj.getOptions().size();i++) 
		{
			WebElement index	= list.get(i);
//			String indexV = index.getAttribute("value");
//			System.out.println(indexV);
			String indexValue = index.getText();
			System.out.println("-->"+indexValue);

	}

}
}
