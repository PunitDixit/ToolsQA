package demo;

import org.testng.annotations.Test;

public class BrokenMethodGroup {

	
	@Test(groups = {"Broken", "Regression"})
	void show () {
		
		
		System.out.println("Broken method");
	}
	
	
	@Test(groups = { "Regression"})
	void show2 () {
		
		
		System.out.println("Working method");
	}
	
	
}
