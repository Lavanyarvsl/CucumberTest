package cucumberTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumTest2 {
	
	
public static  final String CHROME_KEY="webdriver.chrome.driver";
	
	public static  final String CHROME_VALUE="./chromedriver.exe";
	private static WebDriver driver = null;
	
public static void main(String[] args) {
	System.setProperty(CHROME_KEY,CHROME_VALUE);
	 driver = new ChromeDriver();
	
     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
     //WebDriverWait wait = new WebDriverWait(driver, 20);
   
     driver.get("https://www.google.com/");
     driver.navigate().refresh();
     driver.navigate().to(driver.getCurrentUrl());
     //driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("testuser_1"); 
     
     //Css by class name
     driver.findElement(By.cssSelector("input.gLFyf")).sendKeys("testuser_1"); 

     System.out.println("Successfull");


     driver.quit();
}
}
