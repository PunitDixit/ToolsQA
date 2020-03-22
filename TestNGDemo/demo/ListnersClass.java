package demo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;



public class ListnersClass implements ITestListener {

	
	
	public void onTestFailure(ITestResult result) {
		   
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		
		  }
	
	
	 public  void onTestStart(ITestResult result) {

           System.out.println("************");
		 
		  }


	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
