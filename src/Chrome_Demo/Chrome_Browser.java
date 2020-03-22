package Chrome_Demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome_Browser {

	public static void main(String[] args) {
		
		//1st method
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sumit\\Downloads\\Punit\\BrowserDrivers\\chromedriver.exe");
//		ChromeDriver driver = new ChromeDriver();
//		
//		driver.get("URL");
//		driver.close();
		
		//2nd method with options eg headless
		
		ChromeOptions options = new ChromeOptions();
		options.setCapability("Headless", true);
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("");
		driver.close();
		
		
	}

}
