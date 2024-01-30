package Exercise1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TelecomPrj {

	public static void main(String[] args) {
		
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\subha\\OneDrive\\Desktop\\others\\drivers\\drvrs\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		
        WebDriver driver = new FirefoxDriver();
	      
	    driver.get("https://demo.guru99.com/telecom/");
	    
	    driver.manage().window().maximize() ;
	    
	    String title = driver.getTitle();
	  
	    if(title.equalsIgnoreCase("Guru99 Telecom"))
	    	
	    {
	    	System.out.println("Title is correct");
	    }
	    else
	    {
	    	System.out.println("Title is incorrect");
	    }
	    
	    String Opt1 = driver.findElement(By.xpath("//a[@href='addcustomer.php']")).getText();
	    String Opt2 = driver.findElement(By.xpath("//a[@href='addtariffplans.php']")).getText();
	    String Opt3 = driver.findElement(By.xpath("//a[@href='assigntariffplantocustomer.php']")).getText();
	    String Opt4 = driver.findElement(By.xpath("//a[@href='billing.php']")).getText();
	       
	    if(	Opt1.matches("Add Customer"))
	    {
	    	System.out.println("Title is correct");
	    }
	    else
	    {
	    	System.out.println("Title is incorrect");
	    }
	    
	    if(Opt2.equalsIgnoreCase("Add Tariff Plan"))
	    {
	    	System.out.println("Title is correct");
	    }
	    else
	    {
	    	System.out.println("Title is incorrect");
	    }
	    if(Opt3.equalsIgnoreCase("Add Tariff Plan to Customer"))
	    {
	    	System.out.println("Title is correct");
	    }
	    else
	    {
	    	System.out.println("Title is incorrect");
	    }
	    if(Opt4.equalsIgnoreCase("Pay Billing"))
	    {
	    	System.out.println("Title is correct");
	    }
	    else
	    {
	    	System.out.println("Title is incorrect");
	    }
	    
	    driver.quit();	}
	
}
