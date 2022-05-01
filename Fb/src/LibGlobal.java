import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LibGlobal {
	
WebDriver driver;

public WebDriver getDriver() {
	
	System.setProperty("webdriver.chrome.driver","/Users/meganathan/Desktop/keerthu/JAVA/Files/Chromedriver");
	driver = new ChromeDriver();
	return driver;
}
public void getUrl(String urlstr) {
	driver.get(urlstr);
}
public void loadUrl(String url) {
	driver.get(url);
}
public void sendInput(WebElement element,String input) {
	element.sendKeys(input);
}
public void sendpass(WebElement element,String pass) {
	element.sendKeys(pass);
}
public void maxiWindow() {
	driver.manage().window().maximize();
}
public void quitBrowse() {
  
	
}
public String GetTitles() {

	return null;
}
public void buttonclick(WebElement loginbtn) {
	
}
public String getCurrentUrl() {
	
	return null;
}









}

