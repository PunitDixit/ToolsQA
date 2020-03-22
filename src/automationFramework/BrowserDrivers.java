package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.firefox.FirefoxOptions;
//import org.openqa.selenium.firefox.FirefoxProfile;
//import org.openqa.selenium.firefox.ProfilesIni;

/**Browserdrivers class sets the setProperty and returns the driver object   */
public class BrowserDrivers {

	//global variables static plus instance
	
	public static  WebDriver driver;
	public static String exePath;
	
	
	public static void FirefoxDriver() throws InterruptedException
	{
//		ProfilesIni p = new ProfilesIni();
//		FirefoxProfile fp = p.getProfile("testprofile");
//		FirefoxOptions fo = new FirefoxOptions();
//		fo.setProfile(fp);
//		
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sumit\\Downloads\\Punit\\BrowserDrivers\\geckodriver.exe");
    driver = new FirefoxDriver();  //driver = new FirefoxDriver(fo);
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	
	}
	
	public static void ChromeDriver()
	{
	exePath = "C:\\Users\\Sumit\\Downloads\\Punit\\BrowserDrivers\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", exePath);
	driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
		}
	
	public static void test() {
		
//		// First step is to extract the profile
//		ProfilesIni profile = new ProfilesIni();
//		FirefoxProfile fp = profile.getProfile("testprofile");
//	
//		//Second step is to set the profile
//		FirefoxOptions fo = new FirefoxOptions(fp);
//		fo.setProfile(fp);
//		
//		
//		DesiredCapabilities cap = DesiredCapabilities.firefox();
//		fo.getProfile();
		
		 FirefoxOptions options = new FirefoxOptions();
			      options.addPreference("browser.startup.page", 1); 
			      options.addPreference("browser.startup.homepage", "https://www.google.co.uk");
			       driver = new FirefoxDriver(options);
		
		FirefoxProfile fp = new FirefoxProfile();
		fp.setAcceptUntrustedCertificates(true);
		fp.setAssumeUntrustedCertificateIssuer(true);
		
		
		
		
	}
//	
	
}
