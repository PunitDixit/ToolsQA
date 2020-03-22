package Chrome_Demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxRadiobutton {

	static String ExecPath ="C:\\Users\\Sumit\\Downloads\\Punit\\BrowserDrivers\\chromedriver.exe";
	static String URL ="http://toolsqa.com/automation-practice-form/";
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",ExecPath);
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		System.out.println("Launching new browser");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
		if(driver.findElement(By.className("lazyloading")).isDisplayed())
		{
			driver.findElement(By.className("lazyloading")).click();
		}
		
		List<WebElement> elements = driver.findElements(By.name("sex"));
		System.out.println(elements.get(0).isDisplayed());
		System.out.println(elements.size());
		Boolean val = elements.get(0).isSelected();
		
		if (val==true)
		{
			elements.get(1).click();
			System.out.println(elements.get(1).getAttribute("value")+" radio button is selected");
		}
		
		driver.findElement(By.id("exp-2")).click();
		System.out.println("Years of Experience 3 selected");
		
		List<WebElement> checkbox = driver.findElements(By.name("profession"));
		int cSize = checkbox.size();
		for (int j = 0; j<cSize-1;j++) {
			
			if (checkbox.get(j).getAttribute("value").equalsIgnoreCase("Automation Tester")) {
				checkbox.get(j).click();
				System.out.println("Automation tester is checked");
				break;
			}
			}
		driver.quit();
		}
		
		
		
	}
        
		
	


