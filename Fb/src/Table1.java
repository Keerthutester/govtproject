import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","/Users/meganathan/Desktop/keerthu/JAVA/Files/Chromedriver");
		WebDriver driver = new ChromeDriver();
		
        driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		
		WebElement  table = driver.findElement(By.id("customers"));
	
		List<WebElement> lstRows = table.findElements(By.tagName("tr")); 
		List<WebElement> lstCols = table.findElements(By.tagName("td")); 
		
	//Print first row
		
	    WebElement firstRow = lstRows.get(0);
	    System.out.println("name-->"+firstRow.getText());
	    
	    WebElement firstCols = lstCols .get(0);
	    System.out.println("name1-->"+firstCols.getText());
	    
	//print length
	    
	    int length = lstRows.size()-1;
	    System.out.println("length-->"+length);
	
	
	
	/*//1) Print last 2 rows all datas
	
	
	for(int i=lstRows.size()-2;i<=lstRows.size();i++)
	{
		WebElement firstRow1 = lstRows.get(i);
		System.out.println("LAST 2 ROWS----->"+firstRow1.getText());
	}                                                                       //LAST 2 ROWS----->Laughing Bacchus Winecellars Yoshi Tannamuri Canada
		                                                                    //LAST 2 ROWS----->Magazzini Alimentari Riuniti Giovanni Rovelli Italy
		
	//2) Print the alternatives rows data
		
		for(int j=1;j<=lstRows.size();j=j+2)
		{
			WebElement firstRow2 = lstRows.get(j);
			System.out.println("ALTERNATE ROWS----->"+firstRow2.getText()); 
		}                                                                          // ALTERNATE ROWS----->Alfreds Futterkiste Maria Anders Germany
			                                                                      //ALTERNATE ROWS----->Ernst Handel Roland Mendel Austria
			                                                                      //ALTERNATE ROWS----->Laughing Bacchus Winecellars Yoshi Tannamuri Canada
	 //3) Print the last column all rows data
	    
	    for(int j=lstCols.size()-3;j<=lstCols.size();j++)
		{
		WebElement coloumn=lstCols.get(j);
		System.out.println("coloumns----->"+coloumn.getText()); 
	}*/
	    
	    //4) print count the no of tables
	    
	    
	   WebElement  table1 = driver.findElement(By.tagName("table"));
       
        System.out.println("table"+table1.getSize());  
	}
}

	

