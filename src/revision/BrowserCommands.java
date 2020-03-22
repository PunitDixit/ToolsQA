package revision;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Chrome_Demo.GlobalClass;

public class BrowserCommands extends GlobalClass{

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",ExecPath);
		
		WebDriver driver = new ChromeDriver();
		
			
		driver.navigate().to("http://toolsqa.com/automation-practice-form/");
		
		List <WebElement> list =  driver.findElements(By.name("sex"));
		
		for (WebElement el : list)
		{
			System.out.println(el.getAttribute("value"));
			
			if (el.getAttribute("value").equals("Female") && el.isSelected()==false){
				
				el.click();
				System.out.println("Female is selected");
				
			}
		}
		
		
	}

}
