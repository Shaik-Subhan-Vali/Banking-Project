package Exercise1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EcommercePRJ5 {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\subha\\OneDrive\\Desktop\\others\\drivers\\drvrs\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	      
	    driver.get("http://live.techpanda.org/index.php/");
	    
	    driver.manage().window().maximize() ;
	   
        
	    WebElement account = driver.findElement(By.xpath("/html/body/div/div/header/div/div[2]/div/a/span[2]"));
        account.click();
        
        WebElement Myaccount = driver.findElement(By.xpath("/html/body/div/div/header/div/div[5]/div/ul/li[1]/a"));
        Myaccount.click();
        
        WebElement Create = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/form/div/div[1]/div[2]/a"));
        Create.click();
		
        WebElement Fname = driver.findElement(By.xpath("//*[@id=\"firstname\"]"));
        Fname.sendKeys("Mahendra");
        
        WebElement Mname = driver.findElement(By.xpath("//*[@id=\"middlename\"]"));
        Mname.sendKeys("singh");
        
        WebElement Lname = driver.findElement(By.xpath("//*[@id=\"lastname\"]"));
        Lname.sendKeys("Dhoni");
        
        WebElement email = driver.findElement(By.xpath("//*[@id=\"email_address\"]"));
        email.sendKeys("TErXterteryGAMER@gmail.com");
        
        WebElement pwd = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        pwd.sendKeys("Dhon@1981");
        
        WebElement rpwd = driver.findElement(By.xpath("//*[@id=\"confirmation\"]"));
        rpwd.sendKeys("Dhon@1981");
        
      
        WebElement Register = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/form/div[2]/button/span/span"));
        Register.click();
        
        
        String Verify = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/ul/li/ul/li/span")).getText();
        String msg = "Thank you for registering with Main Website Store.";
        
        
		if(Verify.equalsIgnoreCase(msg))
		{
       	 System.out.println("Verified");	
       }
       else
       {
       	System.out.println("Not Verified");	
       }
	   
		Thread.sleep(5000);
		
		WebElement 	Tv = driver.findElement(By.xpath("/html/body/div/div/header/div/div[3]/nav/ol/li[2]/a"));
		Tv.click();
		
		WebElement Wish1 = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div[1]/div[2]/ul/li[1]/div/div[3]/ul/li[1]/a"));
		Wish1.click();
		
		driver.navigate().back();
		
		WebElement Wish2 = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div[1]/div[2]/ul/li[2]/div/div[3]/ul/li[1]/a"));
		Wish2.click();
		
		WebElement Sharelist = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div[1]/form[1]/div/div/button[1]/span/span"));
		Sharelist.click();
		
		WebElement eBox = driver.findElement(By.xpath("//*[@id=\"email_address\"]"));
		eBox.sendKeys("Subhanlucky111@gmail.com");
		
		WebElement mBox = driver.findElement(By.xpath("//*[@id=\"message\"]"));
		mBox.sendKeys("Here is your wishlist");
		
		WebElement send = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/form/div[2]/button/span/span"));
		send.click();
		
		WebElement Fverify = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div[1]/ul/li/ul/li/span"));
		String Fmsg = Fverify.getText();
		String Smsg = "Your Wishlist has been shared.";
		
		if(Fmsg.equals(Smsg))
		{
			System.out.println("Verified");
		}
		else
		{
			System.out.println("Not Verified");
		}
		
		
		driver.quit();
	}

}































