package demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class beforeAfter {

	@Test
	void test1() {
		System.out.println("\nTest1()\n");
	}
@Test
 void test2() {
	 System.out.println("\nTest2()\n");
 }
	
@Test (groups="group", dependsOnMethods="test1")
void Group1() {
	System.out.println("Group1");
}

@Test (groups="group")
void Group2() {
	System.out.println("Group2");
}


@BeforeSuite
void Group3() {
	System.out.println("BeforeSuite");
}

@AfterSuite 
void Group4() {
	System.out.println("AfterSuite");
}


	
	@BeforeTest
	void beforeTest() {
		System.out.println("BeforeTest");
	}
	
	@AfterTest
	void Aftertest() {
		System.out.println("AfterTest");
	}
	
	
	@BeforeMethod
	void BeforeTest() {
		System.out.println("BeforeMethod");
	}
	
	
	
	@AfterMethod
	void AfterMethod() {
		System.out.println("AfterMethod");
	}
	
	
	@BeforeClass
	void BeforeClass() {
		System.out.println("BeforeClass");
	}
	
	@AfterClass
	void AfterClass() {
		System.out.println("AfterClass");
	}
	
	
	@BeforeGroups
	void BeforeGroups() {
		System.out.println("BeforeGroups");
	}
	
	@AfterGroups
	void AfterGroups() {
		System.out.println("AfterGroups");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
