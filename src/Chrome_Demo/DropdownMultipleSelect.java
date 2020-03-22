package Chrome_Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownMultipleSelect {
	
	 static String URL = "http://toolsqa.com/automation-practice-form/";
	 static String ExecPath = "C:\\Users\\Sumit\\Downloads\\Punit\\BrowserDrivers\\chromedriver.exe";
	 static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", ExecPath);
		driver = new ChromeDriver();
		driver.navigate().to(URL);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		WebElement element = driver.findElement(By.id("continents"));
		
		Select select = new Select(element);
		
		select.selectByIndex(0);
		Thread.sleep(5000);
		select.selectByVisibleText("Africa");
		Thread.sleep(5000);
		
		List<WebElement> elements = select.getOptions();
		for(int i=0; i<elements.size();i++)
		{
			
			System.out.println(elements.get(i).getText()+"\n");
		}
		
		elements.get(3).click();
		
		driver.close();
		
		
	}

}
