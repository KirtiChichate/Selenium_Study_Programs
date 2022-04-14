package selenium_PopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivision2_Popup {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\OWNER\\Desktop\\VELOCITY DATA\\VELOCITY NOTES\\Automation Notes\\SELENIUM Software\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
        driver.get("https://in.bookmyshow.com/explore/home/nagpur");
        Thread.sleep(1000);
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[text()='Not Now']")).click();
        
        
 
        
        
	}

}
