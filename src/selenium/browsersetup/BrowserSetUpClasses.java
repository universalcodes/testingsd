package selenium.browsersetup;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserSetUpClasses {
	
	 static WebDriver launchbrowsers;
	
	static String propertyfilepath ="G:\\CucumberFramework\\Automation_BDD\\configfile\\testdata.properties";
	
	static Properties readpropfile = new Properties();
	

	public BrowserSetUpClasses(WebDriver launchbrowsers ) throws IOException, InterruptedException
	{
		BrowserSetUpClasses.launchbrowsers=launchbrowsers;
		
		 FileInputStream filepath = new FileInputStream(propertyfilepath);
		 readpropfile.load(filepath);
		 System.out.println("BrowserSetUpClasses.browserCallSetup()");
		 
		 Scanner enterbrowsername = new Scanner(System.in);
		 System.out.println("Enter a Browser Name");
		 String loadbrowser1 = enterbrowsername.nextLine();
		// String loadbrowser2 = enterbrowsername.nextLine();
		// String loadbrowser3 = enterbrowsername.nextLine();

		 
		String region1= readpropfile.getProperty("Region1");
		System.out.println(region1);

		  loadbrowser1= readpropfile.getProperty("Browser1");
			

			//  loadbrowser2= readpropfile.getProperty("Browser2");
				
				 
				 // loadbrowser3= readpropfile.getProperty("Browser3");
			
					
					if(loadbrowser1.equalsIgnoreCase("Google"))
					{
						System.out.println(loadbrowser1+" is selected");
						WebDriverManager.chromedriver().setup();
						launchbrowsers = new ChromeDriver();
						Thread.sleep(10000);
					launchbrowsers.get(region1);
					
					}
					
					else if(loadbrowser1.equalsIgnoreCase("Firefox"))
					{
						System.out.println(loadbrowser1+" is selected");
						WebDriverManager.firefoxdriver().setup();
						launchbrowsers = new FirefoxDriver();

					}
						
					
					else if (loadbrowser1.equalsIgnoreCase("Edge")) {
						System.out.println(loadbrowser1+" is selected");
						
						WebDriverManager.edgedriver().setup();
						launchbrowsers = new EdgeDriver();
						
					
						if(region1.contains("https://secure-nonprod.uhcprovider.com/stage/#/"))
						{
							launchbrowsers.get(region1);
						}
						
					}
					else if (loadbrowser1.equalsIgnoreCase(null)) {
						
						System.out.println("No Browser Found");
						
					}
					
					
					
					
	}
	
	

	
	
	public static void main(String[] args) throws IOException, InterruptedException {
		BrowserSetUpClasses test = new BrowserSetUpClasses(launchbrowsers);
		
	}

}
