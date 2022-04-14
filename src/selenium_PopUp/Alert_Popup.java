package selenium_PopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Popup {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\OWNER\\Desktop\\VELOCITY DATA\\VELOCITY NOTES\\Automation Notes\\SELENIUM Software\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[text()='Click me'])[1]")).click();
		Thread.sleep(1000);
		/*now switch the main page to the alert page using syntax
		syntax---driver.switchTo().alert();
		Now save this it into one objectname like
		Alert alertpopup= driver.SwitchTo().alert();  */
		
		Alert AlertPopup = driver.switchTo().alert();
		Thread.sleep(1000);
		
		AlertPopup.accept();
		
		/* now after click on that popup using accept method our driver is by defaultly switch to main page now
		 * so there is no need to switch now */
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[text()='Click me'])[3]")).click();
		
		/*now again one popup shows 
		 * So to go to that popup first we need to switch to that alert page*/
		Thread.sleep(1000);
		Alert AlertPopup2 = driver.switchTo().alert();
		
		Thread.sleep(1000);
		AlertPopup2.dismiss();


		Thread.sleep(2000);
		driver.close();
	}

}
