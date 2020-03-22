package Chrome_Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ImplicitWait extends GlobalClass{

	public static void main(String[] args) throws InterruptedException {
		
		
		  System.setProperty("webdriver.chrome.driver", ExecPath);
	      
	      ChromeOptions options = new ChromeOptions();
	    
	      
	      // REMEMBER ONLY ADD ARGUMENTS METHOD FOR CHROMEOPTIONS 
	      
	      //SETCAPABILITY FOR DESIRED CAPABILITY
	      
	      
	        options.addArguments("--disable-info-bars");
	      //options.setProxy(new Proxy());                                IMPORTANT METHODS
	      //options.addExtensions(new File("extension path to .crx file ")); //crx stands for Chrome extension
	      //  options.merge(new DesiredCapabilities());  TO MERGE DESIRED CAPABILITIES
	      
	   
	      driver = new ChromeDriver(options);
	      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	      driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS); //for asynchronous script to execute
	      driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);  // waits for page to load completely
	      
	      Thread.sleep(10000); //forces driver to wait for 10 sec 
	      
	      driver.manage().deleteAllCookies();
	      driver.manage().window().maximize();
	      
	      
	      // DesiredCapabilities cap = new DesiredCapabilities();
	      // cap.setCapability(ChromeOptions.CAPABILITY, true);  
	      
	      driver.navigate().to("http://toolsqa.com/automation-practice-switch-windows/");
	     
		  System.out.println("TestCompleted");
	}

}
