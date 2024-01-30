package Exercise1;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class DailyCVupdate {

	public static void main(String[] args) {
			
		     System.setProperty("webdriver.chrome.driver", "C:/Users/subha/OneDrive/Desktop/others/drivers/drvrs/chromedriver.exe");

		     WebDriver driver = new ChromeDriver();
		     	 
		     String Linkedin = "https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin";
		     String Naukri   = "https://www.naukri.com/nlogin/login";
		     String Foundit  = "https://www.foundit.in/rio/login";
		     String glassdr  = "https://www.glassdoor.co.in/profile/login_input.htm";
		    
		     
		     //for all accounts
		     
		     String username = "subhanshaik771@gmail.com";
		        String pwd = "Subhan@77";

		        driver.get(Linkedin);
		        driver.manage().window().maximize();
		        
		       
		        WebElement emailInput = driver.findElement(By.id("username"));

		        WebElement passwordInput = driver.findElement(By.id("password"));

		        // Fill in the email and password
		        emailInput.sendKeys(username);
		        passwordInput.sendKeys(pwd);

		        // Click the sign-in button
		        WebElement signInButton = driver.findElement(By.xpath("//button[@type='submit']"));
		        signInButton.click();
		     
		     WebElement Lprofile = driver.findElement(By.xpath("//*[@id=\"ember164\"]/div[2]"));
		     Lprofile.click();
		     
		     WebElement Ledit = driver.findElement(By.xpath("//*[@id=\"ember371\"]/li-icon/svg"));
		     Ledit.click();
		     
		     WebElement Ltext = driver.findElement(By.xpath("//*[@id=\"gai-text-form-component-profileEditFormElement-TOP-CARD-profile-ACoAAERj2iYBZyuN-OHbJZ3hiDFcA7UNAvJidoY-headline\"]"));
		     
		     String text1= "ISTQB - CTFL Certified | Manual Test Analyst at Cognizant | Immediate Joiner |";
		     String text2= "ISTQB - CTFL Certified || Manual Test Analyst at Cognizant || Immediate Joiner ||";
		     
		     String otext= Ltext.getAttribute("value");
		    		 
		     if(otext.equals(text1))
		     {
		    	 Ltext.sendKeys(text1);
		     }
		     else
		     {
		    	 Ltext.sendKeys(text2);
		     }
		     
		     WebElement Lsave = driver.findElement(By.xpath("//*[@id=\"ember676\"]/span"));
		     Lsave.click();
		   
		     
		     
		     // driver.close();
				

		}
		}