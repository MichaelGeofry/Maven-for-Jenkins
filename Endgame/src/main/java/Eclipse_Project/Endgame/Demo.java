package Eclipse_Project.Endgame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
    
    public static WebDriver driver;
    
    public static void Initiate() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    
    public static void Initiateapp() throws InterruptedException {
    	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    	driver.get("https://www.makemytrip.com/");
        
        driver.manage().window().maximize();
//        String s = "sendKeys("Hyderabad")";
        driver.findElement(By.id("fromCity")).sendKeys("Hyderabad");
        driver.findElement(By.xpath("//div[text()='HYD']")).click();
//        driver.findElement(By.xpath("//li[@id = ‘react-autowhatever-1-section-0-item-1’]/option[1]")).click();
        driver.findElement(By.id("toCity")).sendKeys("Chennai");
        driver.findElement(By.xpath("//div[text()='MAA']")).click();
//       driver.findElement(By.id("departure")).sendKeys("Monday, 12 Sep 2022");
//        ((JavascriptExecutor)driver).executeScript ("document.getElementById('departure').removeAttribute('readonly',0);"); // Enables the from date box
//
//        WebElement fromDateBox= driver.findElement(By.id("departure"));
//        fromDateBox.clear();
//        fromDateBox.sendKeys("12 Sep'22");
        driver.findElement(By.xpath("//span[contains(text(),'DEPARTURE')]")).click();
        Boolean flag = false;
        while(!flag) {
               if(driver.findElements(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'Sep 15 2022')]")).size()>0) {
                   driver.findElement(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'Sep 15 2022')]")).click();
                   flag = true;
                   Thread.sleep(3000);
               }
               else {
                   driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
               }
        }
        driver.findElement(By.xpath("//div[@data-cy='flightTraveller']")).click();
        driver.findElement(By.xpath("//ul/li[@data-cy='adults-2']")).click();
        driver.findElement(By.xpath("//ul/li[starts-with(.,'Economy')]")).click();
        driver.findElement(By.xpath("//button[text()='APPLY']")).click();
        driver.findElement(By.xpath("//a[text()='Search']")).click();
        driver.findElement(By.xpath("//span[@class='bgProperties icon20 overlayCrossIcon']")).click();
        driver.findElement(By.xpath("//button[@id='bookbutton-RKEY:31e62007-2f84-496a-a2b5-88d9444993b1:8_0']")).click();
//        driver.findElement(By.id("return")).click();
//       driver.findElement(By.xpath("//div[text()='HYD']")).click();
//        driver.findElement(By.id("return")).sendKeys("Thursday, 15 Sep 2022");
    }
    
    public static void main(String[] args) throws InterruptedException {
        
        Initiate();
        Initiateapp();
    }

}