package selenium_testng_project2;


import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class mailcompose {

	 WebDriver driver;
	 
	  @BeforeTest
	    public void setup() throws InterruptedException {
	        // Set the path to the ChromeDriver executable
	        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");

	        // Initialize the ChromeDriver instance
	        driver = new ChromeDriver();

	        // Navigate to the Gmail login page
	        driver.get("https://mail.google.com");
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
	        
	        
	        WebElement emailInput5 = driver.findElement(By.xpath("//div[class='T-I T-I-KE L3']"));
	        
	        emailInput5.click();
	        
	        WebElement emailInput6 = driver.findElement(By.id(":te"));
	        emailInput6.click();
	        emailInput6.sendKeys("kiranksbng@gmail.com");
	        Thread.sleep(5000);
	        
	        WebElement emailInput7 = driver.findElement(By.xpath("//input[name='subjectbox']"));
	        emailInput7.click();
	        emailInput7.sendKeys("sending email");
	        Thread.sleep(5000);
	        
	        
	        WebElement emailInput8 = driver.findElement(By.id(":r2"));
	        emailInput8.click();
	        emailInput8.sendKeys("hi how are you have a nice day");
	        
	        Thread.sleep(5000);
	        

	        WebElement emailInput9 = driver.findElement(By.id(":pj"));
	        
	        emailInput9.click();
	        
	        @AfterTest
	        public void teardown() {
	            // Close the browser after the test
	            driver.quit();
	        
	    }

	
			
		

			
		}
}
