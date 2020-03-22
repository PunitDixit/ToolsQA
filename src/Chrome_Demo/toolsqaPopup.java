package Chrome_Demo;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class toolsqaPopup extends GlobalClass {

	public static void main(String[] args) {

      System.setProperty("webdriver.chrome.driver", ExecPath);
      driver = new ChromeDriver();
      driver.get("https://www.toolsqa.com/selenium-cucumber-framework/read-configurations-from-property-file/");
      
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      
      Set<String> set = driver.getWindowHandles();
      
  for(String s : set) {
	  
	  System.out.println(s);
  }   
      
      driver.findElement(By.xpath("//img[contains(@class,'lazyloading') and contains(@alt,'close-link')]"));
      
      
		
		
		
	}

}
