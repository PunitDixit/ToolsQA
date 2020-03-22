package retryDemo;

import java.lang.reflect.Constructor; //LANG.REFLECT HI SELECT KARNA
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class retryAnnotationTransformer implements IAnnotationTransformer {

	@Override
	 public void transform(ITestAnnotation testAnnotation, Class testClass, Constructor testConstructor, Method testMethod) {
		
		IRetryAnalyzer retry = testAnnotation.getRetryAnalyzer();
		
		if (retry==null)
		{
			testAnnotation.setRetryAnalyzer(RetryAnalyzerFailed.class);
		}
	}
}
