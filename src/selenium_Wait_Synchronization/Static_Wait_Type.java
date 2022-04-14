package selenium_Wait_Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Static_Wait_Type {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\OWNER\\Desktop\\VELOCITY DATA\\VELOCITY NOTES\\Automation Notes\\SELENIUM Software\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.discoveryplus.in/");
//    Static wait/java wait--->Wait time is fixed, irrespective of condition. Script will be hold for mentioned seconds.		
		
		Thread.sleep(3000);  //this is one kind of static wait/synchronization
		/*                    so what is happened in this static wait we pass some time in milisec so if the particular page or element is open before that user time then that extra   
		 *                      time we use is totally weasted and due to this our test script get to see too lengthy and its time get increased so to overcome this we have dynamic wait  */
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		Thread.sleep(3000);
		WebElement EnterMobNo = driver.findElement(By.id("mobileNumber"));
		WebElement OtpButton = driver.findElement(By.xpath("//button[text()='Get OTP']"));
		boolean status = OtpButton.isEnabled();
		System.out.println(status);

	}

}
