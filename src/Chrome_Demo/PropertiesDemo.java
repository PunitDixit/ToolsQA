package Chrome_Demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {
		
		
		FileReader reader = new FileReader(new File("D:\\ToolsQA1\\ToolsQA\\src\\config.properties"));
		
		Properties properties = new Properties();
		properties.load(reader);
		
		String execPath = properties.getProperty("execPath");
		
		System.out.println(execPath);
		
		//OR
		
		FileInputStream fis = new FileInputStream(new File("D:\\ToolsQA\\ToolsQA\\src\\config.properties"));
		Properties prop2 = new Properties();
		prop2.load(fis);;
		
		System.out.println(prop2.getProperty("execPath"));
		
		//OR
		
		BufferedReader bufferreader = new BufferedReader(new FileReader("D:\\\\ToolsQA\\\\ToolsQA\\\\src\\\\config.properties"));
		
		
		
	}

}
