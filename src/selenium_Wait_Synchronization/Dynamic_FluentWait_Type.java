package selenium_Wait_Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dynamic_FluentWait_Type {

	public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\OWNER\\Desktop\\VELOCITY DATA\\VELOCITY NOTES\\Automation Notes\\SELENIUM Software\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://automationpractice.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));  //Dynamic implicit wait
		driver.manage().window().maximize();
		Thread.sleep(4000);   //static wait
		driver.findElement(By.className("login")).click();
		
		
//Steps to execute Fluent wait
		
// step1)--->Create an object of fluentWait class by passing the argument as driver
		FluentWait obj= new FluentWait(driver);
	
//  step 2)--->mentioned the genralized time with the obj		
		obj.withTimeout(Duration.ofMillis(4000));
		
//Step 3)---> now it need to specify polling time or we can say frequency time
		obj.pollingEvery(Duration.ofMillis(5));  //means after every 5 sec it becomes poll
		
// step 4)--->use the object name of WebDriverWait and call the until method in which pass the condition as a argument
	
		WebElement Buttonstatus = driver.findElement(By.id("SubmitLogin"));
		obj.until(ExpectedConditions.visibilityOf(Buttonstatus));
		System.out.println(Buttonstatus.isEnabled());
		
		
        
       
        
		
		
		
		
		
		
		
		
		
		
	}

}
