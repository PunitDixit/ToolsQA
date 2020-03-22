package Chrome_Demo;

import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableDemo {

	static WebDriver driver;
	static String URL = "http://toolsqa.com/automation-practice-table/";
	static String ExecPath = "C:\\Users\\Sumit\\Downloads\\Punit\\BrowserDrivers\\chromedriver.exe";
	
	public static void main(String[] args) throws InterruptedException {
		
		try {
			System.setProperty("webdriver.chrome.driver",ExecPath);
			driver = new ChromeDriver();
   
			driver.get(URL);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
			
			
			String val = driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[1]/td[2]")).getText();
		
			System.out.println(val);
			driver.findElement(By.xpath("//*[text()='Clock Tower Hotel']/following-sibling::td[last()]")).click();
			
			System.out.println("Clicked on details");
			
			Thread.sleep(5000);
			
			//To find number of rows in a table or rowSize
			//*[@id="content"]/table/tbody/tr[2]/th			
			//*[@id="content"]/table/tbody/tr[2]/td[1]
			//*[@id="content"]/table/tbody/tr[2]/td[2]
			//*[@id="content"]/table/tbody/tr[2]/td[3]
			
			List<WebElement> list = driver.findElements(By.xpath("//*[@id='content']/table/tbody//th[contains(text(),'Clock')]/following-sibling::td"));
			
			   int colCount = list.size();
			   System.out.println(colCount);
			   for(int i=0; i<colCount; i++)
			   {
				   System.out.println(list.get(i).getText());
				  				   
			   }
			   
			
			
			driver.quit();
			
			System.out.println("Test completed successfully");
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
		
	}

}
