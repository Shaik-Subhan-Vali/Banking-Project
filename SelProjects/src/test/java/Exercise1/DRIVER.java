package Exercise1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DRIVER {

	
	public static WebDriver webdr() {
		
		
	    System.setProperty("webdriver.gecko.driver", Util.webdriverpath);
	    
	    WebDriver driver = new FirefoxDriver();
	    
	    return driver ;
		
		}
}
