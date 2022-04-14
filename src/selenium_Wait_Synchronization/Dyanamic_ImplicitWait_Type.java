package selenium_Wait_Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dyanamic_ImplicitWait_Type {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\OWNER\\Desktop\\VELOCITY DATA\\VELOCITY NOTES\\Automation Notes\\SELENIUM Software\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.discoveryplus.in/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		driver.manage().window().maximize();
/*  Here we use Dyanamic wait/or selenium wait
 * 1. Implicit wait: 
 Applicable: complete webpage
 1 parameter: time value (seconds)
//2000ms--->100ms--->1900
implicit wait implement to load complete webpage means when we have to take action after loading complete then we use implicit wait timer
due to this we can solve the weasting of extra time means even if we provide max time then also it only take the actual time which require to load that page
syntax to call this--->driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000/time to given by user));
 *  
 * XXXXXX which is not follow now  //driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); syntax before selenium 4*/		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
	
		WebElement EnterMobNo = driver.findElement(By.id("mobileNumber"));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
		WebElement OtpButton = driver.findElement(By.xpath("//button[text()='Get OTP']"));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
		boolean status = OtpButton.isEnabled();
		System.out.println(status);


	}

}
