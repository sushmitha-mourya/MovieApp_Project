package movieapp_utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public WebDriver driver;
	
	
	//method for initializing all the browser drivers.
	
	public WebDriver initializeDriver() throws IOException
	{
		//data driven framework
		//passing the browser information from external file.
		
		Properties prop = new Properties();
		
		//file path
		FileInputStream fis = new FileInputStream("/Users/sushmitha/eclipse-workspace/MovieApp_Project/src/main/java/MovieApp/MovieApp_Project/driver.properties");
		
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome"))
		{
			driver = new ChromeDriver();
			
		}
		else if (browserName.equals("firefox"))
		{
			driver = new FirefoxDriver();
			
		}
		
		//apply implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		return driver;
		
		
		
	}
	
	

}
