package selenium_mockAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebDriWebEleMethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\OWNER\\Desktop\\VELOCITY DATA\\VELOCITY NOTES\\Automation Notes\\SELENIUM Software\\chromedriver.exe");

		WebDriver object= new ChromeDriver();
		object.get("https://www.booking.com/");
		Thread.sleep(1000);
		object.manage().window().maximize();
		Thread.sleep(1000);
		object.findElement(By.xpath("//input[@type='search']")).sendKeys("Goa,India");
		Thread.sleep(1000);
		object.findElement(By.xpath("(//span[contains(@class,'sb-date-field__icon sb-date-field__icon-btn bk-svg-')])[1]")).click();
		Thread.sleep(1000);
		object.findElement(By.xpath("//span[@aria-label='27 February 2022']")).click();
		Thread.sleep(1000);
		object.findElement(By.xpath("//span[@aria-label='26 March 2022']")).click();
		Thread.sleep(1000);
		object.findElement(By.className("xp__input")).click();
		Thread.sleep(1000);
		object.findElement(By.xpath("(//button[@class='bui-button bui-button--secondary bui-stepper__add-button '])[2]")).click();
		Thread.sleep(1000);
		object.findElement(By.xpath("//select[@name='age']")).sendKeys("9 years old");
//		object.findElement(By.xpath("//option[@value='5']")).click();     //error yetoy asa kela ki tr direct line no 29 madhe click ghenyachya ayvji sendkeys ghaycha
		Thread.sleep(1000);
		object.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		Thread.sleep(1000);
		object.findElement(By.xpath("//div[@data-placeholder='Check-out Date']")).click();
		Thread.sleep(1000);
		object.findElement(By.xpath("//span[@aria-label='20 March 2022']")).click();
		Thread.sleep(1000);
		object.close();

		
		
	
	}

}
