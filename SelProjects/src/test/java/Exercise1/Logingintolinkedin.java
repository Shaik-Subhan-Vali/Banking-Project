package Exercise1;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Logingintolinkedin {
	    public static void main(String[] args) {
	        
	        System.setProperty("webdriver.chrome.driver", "C:/Users/subha/OneDrive/Desktop/others/drivers/drvrs/chromedriver.exe");

	       
	        WebDriver driver = new ChromeDriver();

	        
	        driver.get("https://www.linkedin.com/login");
	        driver.manage().window().maximize();
	        
	        
	  //      WebElement emailInput = driver.findElement(By.id("username"));
	  //     emailInput.sendKeys("subhanshaik@gmail.com");

	        
	   //     WebElement passwordInput = driver.findElement(By.id("password"));
	   //   passwordInput.sendKeys("Subhan@777");

	       
	        WebElement signInButton = driver.findElement(By.tagName("button"));
	        signInButton.click();
	        
	        try {
	            Thread.sleep(10000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        
	        
	        if(driver.getTitle().equals("LinkedIn"))
	        {
	        	System.out.println("Test passed");
	        }
	        else
	        {
	        	System.out.println("Test failed");
	        }
	        	
	      
	        driver.quit();
	    }
	}


