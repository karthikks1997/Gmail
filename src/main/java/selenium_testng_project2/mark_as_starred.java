package selenium_testng_project2;


import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test

public class mark_as_starred {
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
	        WebElement emailInput13 = driver.findElement(By.xpath("//span[class='J-J5-Ji J-JN-M-I-Jm']"));
	        
	        emailInput13.click();
	        
	        Thread.sleep(5000);
	        
	        WebElement emailInput14= driver.findElement(By.xpath("//div[class='asa']"));
	        
	        emailInput14.click();
	        Thread.sleep(5000);
	        
	        WebElement emailInput15= driver.findElement(By.xpath("//div[class='J-N']"));
	        emailInput15.click();
	  }
	        @AfterTest
	        public void teardown() {
	            // Close the browser after the test
	             driver.quit();
	        }
	        

}
