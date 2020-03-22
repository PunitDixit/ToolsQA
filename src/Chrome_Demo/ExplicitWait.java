package Chrome_Demo;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait extends GlobalClass {

	public static void main(String[] args) throws InterruptedException {

     System.setProperty("webdriver.chrome.driver",ExecPath);
     
     driver = new ChromeDriver();
     driver.get("http://toolsqa.com/automation-practice-switch-windows/");
     driver.manage().window().maximize();
     driver.manage().deleteAllCookies();
     
    // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     
    // FluentWait which is also super class of WebDriverWait class and bot implememts Wait interface
    // Old FluentWait witTimeout ann EveryPolling is depreciated from Seleniun 3.11 
     
     
     Thread.sleep(20000);
     
    driver.findElement(By.xpath("//img[@alt='close-link']"));
     
     
     FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)  
    	                              .ignoring(NoSuchElementException.class)
                                      .withTimeout(Duration.ofSeconds(10))
                                      .pollingEvery(Duration.ofSeconds(2))
                                      .withMessage("Customized message");
     
     Alert alert =  (Alert) wait.until(new Function<WebDriver, WebElement>(){     
		 
                            public WebElement apply(WebDriver driver) {

                                     return driver.findElement(By.name("Timing Alert"));
                         }});

                       
      System.out.println(alert.getText());
               	                   
    	 
    alert.accept();
    
    System.out.println("Test Completed");
		
		
		
		
		
	}

}
