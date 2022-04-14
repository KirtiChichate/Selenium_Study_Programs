package selenium_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BY_ID_name_class_typeLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\OWNER\\Desktop\\VELOCITY DATA\\VELOCITY NOTES\\Automation Notes\\SELENIUM Software\\chromedriver.exe");

		WebDriver object= new ChromeDriver();
		
		object.get("http://automationpractice.com/index.php");
		Thread.sleep(2000);
		object.manage().window().maximize();
		Thread.sleep(1000);
		
		//by using ID locator type
		object.findElement(By.id("search_query_top")).sendKeys("printed dresses");
		Thread.sleep(1000);
		
		//by using Name locator type
		object.findElement(By.name("submit_search")).click();
		Thread.sleep(1000);
		
		object.navigate().back();
		Thread.sleep(1000);
		
		object.findElement(By.className("sf-with-ul")).click();
		Thread.sleep(1000);

		object.findElement(By.xpath("(//a[contains(@class,'subcategory-na')])[2]")).click();
		Thread.sleep(1000);
	}

}
