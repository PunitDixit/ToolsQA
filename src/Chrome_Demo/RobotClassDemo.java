package Chrome_Demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClassDemo extends GlobalClass {

	public static void main(String[] args) throws AWTException {
	
		System.setProperty("webdriver.chrome.driver", ExecPath);
		driver = new ChromeDriver();
		
		driver.get("http://www.tinyupload.com/");
		
		
	    Robot robot = new Robot();
	    for(int i=0;i<7;i++) {
	    robot.keyPress(KeyEvent.VK_TAB);
	    robot.delay(2000);
	    }
	    robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER);
	    
		
	
		
		
		
	}

}
