package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public WebDriver driver;
	public void browseInitialization() throws IOException {
		//to read the browser files--
		FileInputStream fis=new FileInputStream("C:\\Users\\Lucky\\eclipse-workspace\\19sepseleniumTestng\\src\\main\\java\\Resources\\data.properties");
	     //to acees the properties file
		Properties prop=new Properties();//(C:\\Users\\Lucky\\eclipse-workspace\\19sepseleniumTestng)ki jagag par
		prop.load(fis);                  //System.getproperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties"rakh denge
		
	    String browserName=prop.getProperty("browser");
	       if(browserName.equalsIgnoreCase("chrome")) {
	    	  // System.setProperty(browserName, browserName)
	    	   
	           driver=new ChromeDriver();
	     }
	       else if(browserName.equalsIgnoreCase("firefox")) {
	    	
	     }
	       else {
	    	System.out.println("pls enter valid browser name");
	    }
	
	}
	@BeforeMethod
	public void launch() throws IOException {
		browseInitialization();
		driver.get("https://login.salesforce.com/");
	}
	

}
