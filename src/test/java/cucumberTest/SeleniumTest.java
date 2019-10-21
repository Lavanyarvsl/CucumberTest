package cucumberTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
	
	
public static  final String CHROME_KEY="webdriver.chrome.driver";
	
	public static  final String CHROME_VALUE="./chromedriver.exe";
	private static WebDriver driver = null;
	
public static void main(String[] args) {
	System.setProperty(CHROME_KEY,CHROME_VALUE);
	 driver = new ChromeDriver();
	
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

     driver.get("https://www.toolsqa.com/Automation-practice-form/");
   
     driver.findElement(By.xpath(".//input[@name='firstname' and @type='text']")).sendKeys("testuser_1"); 
     

     System.out.println("Successfull");


     driver.quit();
}
}
