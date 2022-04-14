package selenium_Scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling_ByWebElement {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\OWNER\\Desktop\\VELOCITY DATA\\VELOCITY NOTES\\Automation Notes\\SELENIUM Software\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.rediff.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//find the locator of that webelement till which we have to scroll and store it in one ref variable
		WebElement elementToScroll = driver.findElement(By.xpath("//a[text()='More Movies']"));

		//to do scroll 1st cast the JavascriptExecutor in driver
		JavascriptExecutor JSE = ((JavascriptExecutor)driver);
		Thread.sleep(2000);
		
		JSE.executeScript("arguments[0].scrollIntoView();",elementToScroll);
	
		Thread.sleep(3000);
		elementToScroll.click();
		
	}

}
