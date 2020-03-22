package automationFramework;


public class FirstTest extends BrowserDrivers {

	public static void main(String[] args) throws InterruptedException {
		
		 ChromeDriver();
	     driver.get("http://toolsqa.com/automation-practice-form/");
	     Thread.sleep(100);
         driver.quit();
         
	}

}
