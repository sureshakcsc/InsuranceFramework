package insuranceBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class TestBase {
	
	
	public  static WebDriver driver;
	private FileInputStream fis;
	private Properties prop;
	private String urls;
	private String userName;
	private String pwd;
	//private String browser;
	
	
	public Properties  readProperty() throws IOException
	{
		prop = new Properties();
		fis= new FileInputStream("E:\\eclipse\\suresh\\InsuranceFramework\\src\\main\\java\\Config.Properties");
	    prop.load(fis);	
	    return prop;
	}
   
	public String urls() throws IOException
	{
		prop = readProperty();
		urls=prop.getProperty("url");
		return urls;
	}
    
	public String getUserNames() throws IOException
	{
    	prop = readProperty();
		userName= prop.getProperty("username");
		return userName;
	}
	
	public String getPasswords() throws IOException
	{
		prop = readProperty();
		pwd = prop.getProperty("password");
		return pwd;
	}
	//@Test
	public WebDriver getdriver() throws IOException, InterruptedException
	{
		prop =readProperty();
		if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
		{
			ChromeOptions options= new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver(options);
		}
		else if(prop.getProperty("browser").equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();
		}
		return driver;
	}
}
