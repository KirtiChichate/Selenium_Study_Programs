package selenium_IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_prog2 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\OWNER\\Desktop\\VELOCITY DATA\\VELOCITY NOTES\\Automation Notes\\SELENIUM Software\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html#");
		Thread.sleep(500);
		driver.manage().window().maximize();
		
		driver.switchTo().frame("courses-iframe");
		Thread.sleep(500);
		WebElement aboutus = driver.findElement(By.xpath("(//a[text()='About us'])[1]"));
		Thread.sleep(500);
		aboutus.click();
		
		Thread.sleep(500);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		WebElement Mainaboutus = driver.findElement(By.partialLinkText("https://vctcpune.co")); //error   showing
		Thread.sleep(1000);
		Mainaboutus.click();
		

	}

}
