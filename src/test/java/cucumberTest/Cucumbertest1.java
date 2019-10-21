package cucumberTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cucumbertest1 {

	public static final String CHROME_KEY = "webdriver.chrome.driver";

	public static final String CHROME_VALUE = "./chromedriver.exe";
	private static WebDriver driver = null;

	public static void main(String[] args) {
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://demoqa.com/html-contact-form/");
		driver.manage().window().maximize();
		/*
		 * driver.navigate().refresh();
		 * driver.navigate().to(driver.getCurrentUrl());
		 */

		// Css by class name
		driver.findElement(By.cssSelector("input.firstname")).sendKeys("Lavanya");
		driver.findElement(By.cssSelector("input#lname")).sendKeys("R");
		driver.findElement(By.cssSelector("input[name=country]")).sendKeys("India");

		js.executeScript("window.scrollBy(0,1000)");

		driver.findElement(By.cssSelector("textarea#subject")).sendKeys("Cucumber Test");

		driver.findElement(By.cssSelector("input[type=submit]")).click();
		System.out.println("Successfull");

		driver.quit();
	}
}
