package Firefox_Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox_browser_commands {
	
	static String exepath = "C:\\Users\\Sumit\\Downloads\\Punit\\BrowserDrivers\\geckodriver.exe";
    static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
	  // Setting the executable path
		
		System.setProperty("webdriver.gecko.driver",exepath);
		
		// Creating instance of Firefox Driver class through WebDriver interface reference 
		
		driver = new FirefoxDriver();
		driver.get("https://www.toolsqa.com/selenium-webdriver/selenium-test/");
		
		Thread.sleep(5000);
		
		driver.close();
		
		System.out.println("Test completed successfully");
	}

}
