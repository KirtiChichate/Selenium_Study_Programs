package selenium_WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled_Method {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\OWNER\\Desktop\\VELOCITY DATA\\VELOCITY NOTES\\Automation Notes\\SELENIUM Software\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.discoveryplus.in/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		Thread.sleep(1000);
		
		//checking that getotp button is enable or not
		WebElement GetOtp = driver.findElement(By.xpath("//button[text()='Get OTP']"));
		 boolean GetOtpbutton = GetOtp.isEnabled();
		
		 //Printing the status of getout button
		System.out.println("GETOTP button is showing status "+GetOtpbutton);
		Thread.sleep(2000);
		
		//enter moblile no.
		driver.findElement(By.id("mobileNumber")).sendKeys("8785426578");
		Thread.sleep(1000);
		
		//again check that is getotp is enable or not
		boolean GetOtpbutton2 = GetOtp.isEnabled();
		System.out.println("After entering mob no is getotp button is enable "+GetOtpbutton2);
		Thread.sleep(2000);
		driver.close();
		

	}

}
