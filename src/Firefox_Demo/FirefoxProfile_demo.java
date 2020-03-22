package Firefox_Demo;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

public class FirefoxProfile_demo extends Firefox_browser_commands {

	public static void main(String[] args) throws InterruptedException {
		
		//Set executable path 
		
		System.setProperty("webdriver.gecko.driver", exepath);
		
		System.out.println("executable path is set");
		
		// Instance of profile class
		
		ProfilesIni profile = new ProfilesIni();
		FirefoxProfile fp = profile.getProfile("testprofile");
		
		
		FirefoxOptions fo = new FirefoxOptions();
		fo.setHeadless(true);
		fo.setProfile(fp);
		
		System.out.println("testprofile is set");
		
		System.out.println("Headless browser is set through firefox option class instanse");
		
		
		driver = new FirefoxDriver(fo);
		System.out.println("firefox opened in the backgroud");
		
		driver.get("https://www.toolsqa.com/selenium-webdriver/selenium-test/");
		System.out.println("URL accessed");
		
		Thread.sleep(5000);
		
		driver.close();
		System.out.println("driver closed");
		
		
		System.out.println(fo.getBinary());
		
		
		
		

	}

}
