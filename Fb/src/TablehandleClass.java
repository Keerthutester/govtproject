import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablehandleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","/Users/meganathan/Desktop/keerthu/JAVA/Files/Chromedriver");
		//WebDriver driver = new ChromeDriver();
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		WebElement  table = driver.findElement(By.id("customers"));
		
		
	List<WebElement> lstRows = table.findElements(By.tagName("tr")); 
	
	WebElement firstRow = lstRows.get(0);
	System.out.println("name-->"+firstRow.getText());

	
	
	//[a,b,c,d] - size 4
	///0,1,2,3

	int length = lstRows.size()-1;
	System.out.println("length-->"+length);


	WebElement lastRow = lstRows.get(length);
	//--> tr

	List<WebElement> lstDatas = lastRow.findElements(By.tagName("td"));
	
	for (WebElement data:lstDatas) {
		String name = data.getText();
		System.out.println("name-->"+name);
	}
	System.out.println("-------------------------");

	List<WebElement> lstRows1 = table.findElements(By.tagName("tr"));
	
	for(int i=0; i<lstRows1.size(); i++) {
		WebElement firstRow1 = lstRows1.get(i);

	List<WebElement> lstDatas1 = firstRow1.findElements(By.tagName("td"));
		for (WebElement data:lstDatas1) {
		
		String name = data.getText();
		System.out.println("name is-->"+name);
		}
	}
	System.out.println("-------------------------");

	List<WebElement> lstRows2 = table.findElements(By.tagName("tr"));
	WebElement firstRow2 = lstRows2.get(6);
	
	List<WebElement> lstDatas2 = firstRow2.findElements(By.tagName("td"));
	
	WebElement name = lstDatas2.get(1);
	System.out.println("name-->"+name.getText());
	
	for (WebElement data:lstDatas2) {
		
		String name1 = data.getText();
		System.out.println("2 row values-->"+name1);
	}
	}
}
