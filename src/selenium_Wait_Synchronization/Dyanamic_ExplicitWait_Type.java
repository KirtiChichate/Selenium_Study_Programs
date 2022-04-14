package selenium_Wait_Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dyanamic_ExplicitWait_Type {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\OWNER\\Desktop\\VELOCITY DATA\\VELOCITY NOTES\\Automation Notes\\SELENIUM Software\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.trip.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));  //Dynamic implicit wait
		driver.manage().window().maximize();
		Thread.sleep(4000);   //static wait
		driver.findElement(By.className("mc-hd__login-btn")).click();

	}

}
