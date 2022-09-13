package Eclipse_Project.Endgame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hotels {
public static WebDriver driver;
    
    public static void Initiate() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
        driver = new ChromeDriver();
    }
	 public static void Initiateapp() throws InterruptedException {
		 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		 	driver.get("https://www.makemytrip.com");
	        driver.manage().window().maximize();
	      
	        driver.findElement(By.xpath("//li[@class='menu_Hotels']")).click();
	        
	        Thread.sleep(3000);
	   
	        driver.findElement(By.xpath("//input[@class='hsw_inputField lineHeight36 latoBlack font30']")).click();
	        
	        Thread.sleep(3000);
	        
	        driver.findElement(By.xpath("//input[@aria-controls='react-autowhatever-1']")).sendKeys("Delhi");
	        
	        Thread.sleep(3000);
	     
	        driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-0']")).isSelected();
	        
	        Thread.sleep(3000);
	        
	        driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-0']")).click();    
	        
	        driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();        
	        
	        driver.findElement(By.xpath("//div[@aria-label='Fri Oct 08 2022']")).click();
	        
	        driver.findElement(By.xpath("//div[@aria-label='Mon Oct 10 2022']")).click();
	        
	        driver.findElement(By.xpath("//ul/li[@data-cy='adults-4']")).click();
	        
	        driver.findElement(By.xpath("//button[@class='primaryBtn btnApply']")).click();
	        
	        driver.findElement(By.xpath("//button[text()='Search']")).click();
	        
	    }
	 public static void main(String[] args) throws InterruptedException {
	        
	        Initiate();
	        Initiateapp();
	    }
}
