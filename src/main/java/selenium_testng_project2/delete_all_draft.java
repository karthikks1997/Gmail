package selenium_testng_project2;



import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test

public class delete_all_draft {
	 WebDriver driver;
	  
	  @BeforeTest
	    public void setup() throws InterruptedException {
	        // Set the path to the ChromeDriver executable
	        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");

	        // Initialize the ChromeDriver instance
	        driver = new WebDriver();

	        // Navigate to the Gmail login page
	         ( driver).get("https://mail.google.com");
	        Thread.sleep(5000);
	    }
	  
	  public void loginToGmail() throws InterruptedException {
	        // Locate the email input field and enter your email address
	        WebElement emailInput = driver.findElement(By.linkText("Use another account"));
	        emailInput.click();
	        Thread.sleep(5000);
	  
	        WebElement emailInput1 = driver.findElement(By.xpath("//input[type='Email']"));
	        

	        emailInput1.sendKeys("kskarthik68008@gmail.com");
	        Thread.sleep(5000);
	        
	        WebElement emailInput2 = driver.findElement(By.xpath("//div[class='qhFLie']"));
	        emailInput2.click();
	        
	        Thread.sleep(5000);
	        
	        
	        WebElement emailInput3 = driver.findElement(By.xpath("//input[type='password']"));
	        emailInput3.sendKeys("kar@6361688286");
	        Thread.sleep(5000);
	        
	        WebElement emailInput4 = driver.findElement(By.xpath("//div[class='VfPpkd-RLmnJb']"));
	        emailInput4.click();
	        WebElement emailInput10 = driver.findElement(By.xpath("//div[class='TN bzz aHS-bnq']"));
	        
	        emailInput10.click();
	        Thread.sleep(5000);
	        
	        WebElement emailInput11 = driver.findElement(By.xpath("//span[class='T-Jo J-J5-Ji T-Jo-auq T-Jo-Jp']"));

	        emailInput11.click();
	        Thread.sleep(5000);
	        
	        
	        WebElement emailInput12 = driver.findElement(By.xpath("//div[class='T-I J-J5-Ji aFh T-I-ax7 T-I-Js-Gs mA']"));

	        emailInput12.click();
	        
	        @AfterTest
	        public void teardown() {
	            // Close the browser after the test
	             driver.quit();
	        
	  }        

}

}
