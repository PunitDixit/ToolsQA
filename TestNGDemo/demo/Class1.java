package demo;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Class1 {

	@BeforeTest
	void Test1() {
		
		System.out.println("Class1 : Test1 : Before Test");
		
	}
	
	@Parameters({"Player1", "Player2", "Player3", "Player4"})
	@Test (groups= {"Functional"})
    void Test2(String P1, String P2, String P3, String P4) {
		
		System.out.println("Class1 : Test2 : @Test : Functional "+P1+"  "+P2+" "+P3+" "+P4);
		Assert.assertTrue(true);
		System.out.println("Wont Execute&@@@@@@@@@@@@@@@@@@@@@@@@");
	}

	@Test (alwaysRun = true, priority =0, groups= {"Regression"})
	 void Test3() {
			
			System.out.println("Class1 : Test3 : @Test : Regression");
			
		}
	 
	 
	 @Test (alwaysRun = true, priority =1, groups= {"Functional"})
	 void Test4() {
			
			System.out.println("Class1 : Test4 : @Test : Functional");
			
		}
	 @Test (alwaysRun = true, priority =2, groups= {"Regression"})
	 void Test5() {
			
			System.out.println("Class1 : Test5 : @Test : Regression");
			
		}
	
		
    @AfterTest 
    void Test6() {
	
	System.out.println("Class1 : Test6 : After Test");
	
    }
	
	
	
}
