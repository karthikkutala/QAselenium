package TestNGfiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Datadrivenframe {
	
	@Test
	public void Login() throws IOException{
		Properties prop= new Properties();
		FileInputStream fil=new FileInputStream("E:\\QA\\workspace\\Frameworks\\src\\TestNGfiles\\datadriven.properties");
		prop.load(fil);
		WebDriver driver=new FirefoxDriver();
		driver.get(prop.getProperty("url"));
		
		
		System.out.println(prop.getProperty("username"));
	}
	
	
}
