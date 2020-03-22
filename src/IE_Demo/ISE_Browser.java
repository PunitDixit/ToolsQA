package IE_Demo;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverLogLevel;
import org.openqa.selenium.ie.InternetExplorerDriverService;

public class ISE_Browser {

	static String execpathIE = "C:\\Users\\Sumit\\Downloads\\Punit\\BrowserDrivers\\IEDriverServer.exe";
	static WebDriver driver;
	static String URL = "https://www.toolsqa.com/selenium-webdriver/selenium-test/";
	
	public static void main(String[] args) {
		
//		System.setProperty("webdriver.ie.driver", execpathIE);
//		
//		driver = new InternetExplorerDriver();
//		driver.get(URL);
//
//		driver.close();
//		System.out.println("Test is completed");
		
		
		//Second method through IE driver service builder
		
		InternetExplorerDriverService.Builder serviceBuilder = new InternetExplorerDriverService.Builder();
		serviceBuilder.usingPort(1080);
		serviceBuilder.usingDriverExecutable(new File(execpathIE));
		serviceBuilder.withLogLevel(InternetExplorerDriverLogLevel.TRACE);
		serviceBuilder.withLogFile(new File("C:\\Users\\Sumit\\Documents\\logFile.txt"));
		
		InternetExplorerDriverService service = serviceBuilder.build();
		
        driver = new InternetExplorerDriver(service);
		driver.get(URL);
		driver.close();
		System.out.println("Test Completed");
		
		
		
	}

}
