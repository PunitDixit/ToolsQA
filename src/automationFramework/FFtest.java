package automationFramework;




	public class FFtest extends BrowserDrivers
	{

	public static void main(String[] args) throws InterruptedException {
		
		FirefoxDriver();
		 
        //Launch the Online Store Website
       // driver.get("http://www.shop.demoqa.com");
        driver.navigate().to("http://www.shop.demoqa.com");
 
        // Print a Log In message to the screen
        System.out.println("Successfully opened the website www.Store.Demoqa.com");
  
        // Close the driver
        driver.quit();
        System.out.println("Test completed successfully");

	}

}
