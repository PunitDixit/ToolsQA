package Chrome_Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AlertDemo extends GlobalClass {

	public static void main(String[] args) {

      System.setProperty("webdriver.chrome.driver", ExecPath);
    
      
      
      DesiredCapabilities cap = DesiredCapabilities.chrome();
      cap.setAcceptInsecureCerts(true);
      
      ChromeOptions option =new ChromeOptions();
      option.merge(cap);
      driver = new ChromeDriver(option);
      driver.manage().window().maximize();
      
      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
      
      driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
      //This step will result in an alert on screen
      driver.findElement(By.xpath("//button[text()='Simple Alert']")).click();
      
      //Once alert is present try to click on any button on the page
      driver.findElement(By.xpath("//*[text()='Confirm Pop up']")).click();
      
		
		
		
	}

}
