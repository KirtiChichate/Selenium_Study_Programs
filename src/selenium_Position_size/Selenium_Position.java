package selenium_Position_size;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Selenium_Position {

	public static void main(String[] args) throws InterruptedException, IOException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\OWNER\\Desktop\\VELOCITY DATA\\VELOCITY NOTES\\Automation Notes\\SELENIUM Software\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.veenaworld.com/");
		Thread.sleep(1000);
		System.out.println(driver.manage().window().getPosition());
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		File Source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Thread.sleep(2000);
		Random ram= new Random(3);
		File Destination= new File("C:\\Users\\OWNER\\Desktop\\VELOCITY DATA\\ScreenShot By Automation\\"+ram+"vinabeforescreenshot.png");
		Thread.sleep(2000);
		FileHandler.copy(Source, Destination);
		Thread.sleep(1000);
		
		//step1)-->Now create an object of point class by using point class and store it in one reference variable
		//this point class accept arguments as a X and Y coordinate
		// X returns horizontal value and taking action on horizontally
		// Y returns vertical value and taking action on vertically
		
		
		Point position= new Point(100, 200);  //the default value of any browser page as X=10 Y=10
		
		Thread.sleep(1000);
      //step2)--->use setposition method and pass arugument in it argument is objename of point class
		driver.manage().window().setPosition(position);
		
		Thread.sleep(2000);
		File Source1= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File Destination1= new File("C:\\Users\\OWNER\\Desktop\\VELOCITY DATA\\ScreenShot By Automation\\posiscreenshot.png");
		FileHandler.copy(Source1, Destination1);
		Thread.sleep(2000);
		driver.close();
		
	}

}
