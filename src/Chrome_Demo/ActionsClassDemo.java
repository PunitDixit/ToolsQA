package Chrome_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassDemo extends GlobalClass {

	public static void main(String[] args) {
		
		
		
		//Actions Class is provides user API for complex user gestures 
		// It implements build design pattern which build multiple interactions in a single unit
		
		
		WebElement we = driver.findElement(By.id(""));
		Actions acn = new Actions(driver)
		.keyDown(we,Keys.SHIFT)
		.sendKeys(we, "text")
		.keyUp(we, Keys.SHIFT);
		
		Action acnInt = acn.build();
		acnInt.perform();
		
		we.getLocation().getX(); // To get the offset X and Y
		
		WebElement source = null, target = null; // In real scenario find using findElement()
		
		//DragandDrop
		
		acn.dragAndDrop(source, target).perform();
	// 	acn.dragAndDropBy(source, x , y); x and y value obtained by source X - target X
		
		
		//double Click'
		
		acn.doubleClick(source).perform(); //It is same as doubleClick(source).build().perform()  Buid()bis preset internally in perform()
		
		// Right click - mouse points middle of element and performs action
		
		acn.contextClick(source).perform();
		
		//Hover-Over
		
		acn.moveToElement(source).perform(); // source is Main Menu
		acn.moveToElement(target).perform(); // targer is sub menu
		
		//for slider --> acn.moveToElement(element,xtarget,yTarget)
		
		acn.keyUp(target,"a"); // releases key
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
