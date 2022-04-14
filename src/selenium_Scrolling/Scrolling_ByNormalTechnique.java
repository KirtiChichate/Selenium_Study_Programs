package selenium_Scrolling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling_ByNormalTechnique {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\OWNER\\Desktop\\VELOCITY DATA\\VELOCITY NOTES\\Automation Notes\\SELENIUM Software\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.rediff.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//to do scroll 1st cast the javascriptexecutor in driver
		JavascriptExecutor JEX = ((JavascriptExecutor)driver);
		Thread.sleep(2000);
		
		//use "executeScript" method of "javascriptexecutor" and pass the arugument in it as window.scrollBy(startingpoint,endingpoint)
		JEX.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(1000);
		JEX.executeScript("window.scrollBy(0,-700)");
		Thread.sleep(1000);
		driver.close();
		

	}

}
