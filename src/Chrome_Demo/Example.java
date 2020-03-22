package Chrome_Demo;

import java.util.Date;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Example extends GlobalClass{

	public static void main(String[] args) {
		
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.titleIs("ToolsQA"));
		
		
		
		
	}

}
