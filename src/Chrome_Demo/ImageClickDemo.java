package Chrome_Demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageClickDemo extends GlobalClass {

	public static void main(String[] args) throws Exception {
		
		FileReader reader = new FileReader(new File(propFilePath));
		
		Properties properties = new Properties();
		properties.load(reader);
		
		String ExecPathLocal = properties.getProperty("execPath");
		
		
		System.setProperty("webdriver.chrome.driver",ExecPathLocal);
		
		driver = new ChromeDriver();
		
		driver.navigate().to("https://en-gb.facebook.com/");
		
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		
		String CurrentUrl = driver.getTitle();
		
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//u[text()=normalize-space('Facebook')]/..")).click();
		
		String NavigatedUrl = driver.getTitle();
		
		if( CurrentUrl.equals(NavigatedUrl)) {
			System.out.println("Successful"+CurrentUrl);
			
		}
		else
		{
			System.out.println("Failed");
		}
		
		
	}

}
