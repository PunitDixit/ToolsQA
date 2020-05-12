package demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NewTest {
  
	
	@DataProvider(name="MyData" )
     public Object[][] f() {
	  
	 Object dp[][] = new Object[3][2];
	  
	  dp[0][0]="dp[0][0]";
	  dp[0][1]="dp[0][1]";
	  dp[1][0]="dp[1][0]";
	  dp[1][1]="dp[1][1]";
	  dp[2][0]="dp[2][0]";
	  dp[2][1]="dp[2][1]";
	  
	   return dp ; 
	  
	  
  }

@Test(dataProvider = "MyData")
void method(String col1, String col2)
{
	
System.out.println(col1+" "+col2);
}


@DataProvider(name="SampleData")
String[][] getter() {
	
	String str[][] = {{"a","b"},{"c","d"}};
	
	return str;
	
}

@Test(dataProvider = "SampleData")
void show(String str1, String str2) {
	
	System.out.println(str1+"   "+ str2);
	
}




}



