package retryDemo;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzerFailed implements IRetryAnalyzer {

	int count =0;
	int maxRetry =3;
	
	@Override
	public boolean retry(ITestResult arg0) {
		
		if(count<maxRetry) {
			
			System.out.println("Retrying "+arg0.getName());
			count++;
		
			return true;
			
		}
		
		else	
			
			return false;
		
	}

	
	
	
}
