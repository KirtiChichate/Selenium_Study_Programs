package selenium_WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CompareIsEnable_WithIfElse {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\OWNER\\Desktop\\VELOCITY DATA\\VELOCITY NOTES\\Automation Notes\\SELENIUM Software\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.discoveryplus.in/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		Thread.sleep(3000);

		//Checking getOtp button is enable or not
		WebElement GetOtp = driver.findElement(By.xpath("//button[text()='Get OTP']"));
		 WebElement EnterMobNo = driver.findElement(By.id("mobileNumber"));
		boolean CheckStatus = GetOtp.isEnabled();
		
		if(CheckStatus)
		{
			GetOtp.click();
			System.out.println("Now this CheckStatus is already enabled");
		}
		
		else
		{
			System.out.println("GetOtp button is disable so 1st enter the mobile number and then check isenable button and do click");
			EnterMobNo.sendKeys("8574612458");
			Thread.sleep(1000);
			GetOtp.click();
		}
	}

}
