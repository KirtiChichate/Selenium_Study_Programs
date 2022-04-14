package selenium_Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_of_error {

	public static void main(String[] args) throws InterruptedException, IOException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\OWNER\\Desktop\\VELOCITY DATA\\VELOCITY NOTES\\Automation Notes\\SELENIUM Software\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.name("email")).sendKeys("26gsjkkc n");
        Thread.sleep(2000);
        driver.findElement(By.name("login")).click();
        Thread.sleep(2000);
        File Source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Thread.sleep(1000);
        Random ram= new Random(4);
        Thread.sleep(1000);
        File destination = new File("C:\\Users\\OWNER\\Desktop\\VELOCITY DATA\\ScreenShot By Automation\\"+ram+"ErrorScreenshot.png");
        Thread.sleep(1000);
        FileHandler.copy(Source, destination);
        Thread.sleep(2000);
        driver.close();
        
		
	}

}
