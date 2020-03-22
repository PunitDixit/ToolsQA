package demo;

import org.testng.annotations.Test;

public class GroupofGroups {

	@Test (groups= {"Elephant"})
	void m1() {
		System.out.println("Elephant");
	}
	
	
	@Test (groups= {"Dog"})
	void m2() {
		System.out.println("Dog");
	}
	
	
	@Test (groups= {"Cat"})
	void m3() {
		System.out.println("Cat");
	}
	
	
	@Test (groups= {"Lion"})
	void m4() {
		System.out.println("Lion");
	}
	
	
	@Test (groups= {"Cheetah"})
	void m5() {
		System.out.println("Cheetah");
	}
	
	
}
