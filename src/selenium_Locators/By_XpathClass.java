package selenium_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class By_XpathClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\OWNER\\Desktop\\VELOCITY DATA\\VELOCITY NOTES\\Automation Notes\\SELENIUM Software\\chromedriver.exe");

		WebDriver object= new ChromeDriver();
		
		object.get("https://www.youtube.com/");
		Thread.sleep(2000);
		object.manage().window().maximize();
		Thread.sleep(2000);
		object.findElement(By.xpath("//input[@id='search']")).sendKeys("maza bappa kiti god disto");
		Thread.sleep(2000);
		object.findElement(By.xpath("//button[@class='style-scope ytd-searchbox']")).click();
		Thread.sleep(2000);
		object.findElement(By.xpath("//a[@title='Majha Bappa | Deeya Wadkar | Sneha Mahadik | Pravin Koli - Yogita Koli | Official Ganpati Bappa Song']")).click();
		
		object.findElement(By.xpath("//div[@class='ytp-ad-text ytp-ad-skip-button-text']")).click();
		//Thread.sleep(0)
		//object.findElement(By.xpath("//button[@aria-label='Play (k)']")).click();
		
		
	}

}
