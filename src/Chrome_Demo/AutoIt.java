package Chrome_Demo;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class AutoIt extends GlobalClass{

	private static boolean actualResult;
	private static String au3EXEFilePath ="C:\\Users\\Sumit\\Desktop\\Upload.exe";
	
	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", ExecPath);
		
		driver = new ChromeDriver();
		
		driver.get("https://easyupload.io");
		
		//driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[text()='click here or drop file to upload (10 GB max)']")).click();	
	     
		Thread.sleep(5000);
			
		//Runtime.getRuntime().exec(au3EXEFilePath);
		
		//Second way using ProcessBuilder () class 
		
		ProcessBuilder processBuilder = new ProcessBuilder(au3EXEFilePath, "File2.txt"); //For this use $CmdLine instead of file name in the autoIt file. No need to compile again and again if saving through editor
		processBuilder.start();
		
		
		
		// Runtime.getRuntime().exec(au3EXEFilePath); // THIS DOESNT ALLOW DYNAMIC ARGUMENT PASSING
		
		System.out.println("Test completed");
		
		
			
	}

}
