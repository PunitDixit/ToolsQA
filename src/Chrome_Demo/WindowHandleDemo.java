package Chrome_Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleDemo extends GlobalClass{

	public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", ExecPath);
        driver = new ChromeDriver();
        
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        
        driver.get("http://toolsqa.com/automation-practice-switch-windows/");
        


        
        Alert alert = driver.switchTo().alert();
        
        System.out.println(alert.getText());
        
        alert.accept();
        
        
        
        
        
		
		
		
		
	}

}
