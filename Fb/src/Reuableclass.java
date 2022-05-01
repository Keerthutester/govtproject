import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Reuableclass {
	public static void main(String args[]) {
		
              LibGlobal global=new LibGlobal();
              WebDriver driver=global.getDriver();
              
              global.maxiWindow();
              global.quitBrowse();
              
              String title=global.GetTitles();
              System.out.println(title);
              
              
              String currenturl=global.getCurrentUrl();
              System.out.println(currenturl);
              
              
              
              global.getUrl("http://www.facebook.com");
              
              WebElement emailElement=driver.findElement(By.id("email"));
      		  global.sendInput(emailElement,"keerthi44@gmail.com");
      		  
      		  String name=emailElement.getAttribute("value");
      		  System.out.println(name);
      		
      		WebElement password=driver.findElement(By.id("pass"));
    		  global.sendInput(password,"abcd123");
    		  
    		  String pass1=emailElement.getAttribute("value");
      		  System.out.println(pass1);
              
    		  
    		  WebElement loginbtn=driver.findElement(By.name("login"));
    		  global.buttonclick(loginbtn);
    		  
    		  global.quitBrowse();

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}

}