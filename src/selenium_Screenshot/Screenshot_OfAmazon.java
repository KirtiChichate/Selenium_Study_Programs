package selenium_Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_OfAmazon {

	public static void main(String[] args) throws InterruptedException, IOException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\OWNER\\Desktop\\VELOCITY DATA\\VELOCITY NOTES\\Automation Notes\\SELENIUM Software\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		
		File Source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//to use same name as a screenshot but if u want to take different different image the use below format
		Random randomimage= new Random();  //this is use when we want same image multiple time for the future use that time we can use this
		                        //it will click screenshot of the same 
		
		File Destination= new File("C:\\Users\\OWNER\\Desktop\\VELOCITY DATA\\ScreenShot By Automation\\"+randomimage+"Scrrenshot2.png");
		
		FileHandler.copy(Source, Destination);

	}

}
