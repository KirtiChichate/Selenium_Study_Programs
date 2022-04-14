package selenium_Wait_Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dynamic_2ExplicitWait_Type {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\OWNER\\Desktop\\VELOCITY DATA\\VELOCITY NOTES\\Automation Notes\\SELENIUM Software\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://automationpractice.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));  //Dynamic implicit wait
		driver.manage().window().maximize();
		Thread.sleep(4000);   //static wait
        driver.findElement(By.className("login")).click();
       
        WebElement Buttonstatus = driver.findElement(By.id("SubmitLogin"));
//step1)-->use sleep by using explicit wait for that 
/*        2. Explicit wait:
        	   Applicable: single element
        	   1 parameter: time value(seconds)
        	   2 parameter: Condition (isselected, isdisplayed, isenabled)
*/
        
//        1st u need to creat object of class Webdriverwait and pass the argument/parameter as two argu/parameter as driver,duration
        WebDriverWait obj= new WebDriverWait(driver, Duration.ofMillis(4000));
        
// step2)--->use the object name of WebDriverWait and call the until method in which pass the condition as a argument
        obj.until(ExpectedConditions.visibilityOf(Buttonstatus));
        
    
    System.out.println(Buttonstatus.isEnabled());
    
		
	}

}
