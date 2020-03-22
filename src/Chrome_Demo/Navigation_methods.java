package Chrome_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_methods {

	public static void main(String[] args) throws InterruptedException {
		
		String URL = "https://www.toolsqa.com/selenium-webdriver/selenium-test/";
		
		String ExecutablePath = "C:\\Users\\Sumit\\Downloads\\Punit\\BrowserDrivers\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver",ExecutablePath);
		
		System.out.println("SystemProperty is set");
		
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Driver is instantiated");
		
		driver.navigate().to(URL);
		
//		driver.findElement(By.className("twitter")).click();
//		
//		System.out.println("twitter is clicked");
//		
//		Thread.sleep(5000);
//			
//		
//		driver.navigate().back();
//		
//		
//		
//		System.out.println("back");
//		driver.navigate().forward();
//		System.out.println("forward");
//		driver.navigate().refresh();
		System.out.println("refresh");
		driver.close();
		
		System.out.println("Trying to open the browser again to see NoSuchSessionException");
		
		driver.get(URL);
		
		System.out.println("Test completed successfully");
		
//		JavascriptExecutor js = (JavascriptExecutor) driver; // Interface casting in Java. JavascriptExecutor helps to execute java script through Selenium. In other words Selenium injects javascript into Browservc   
		

	}

}
