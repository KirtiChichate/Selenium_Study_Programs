package selenium_text_contains_index;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_text {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\OWNER\\Desktop\\VELOCITY DATA\\VELOCITY NOTES\\Automation Notes\\SELENIUM Software\\chromedriver.exe");

		WebDriver object= new ChromeDriver();
		
		object.get("https://phptravels.com/demo/");
		Thread.sleep(2000);
		
		object.manage().window().maximize();
		Thread.sleep(2000);
		
		//Xpath with attribute
		object.findElement(By.xpath("//a[@title='php travels']")).click();
		Thread.sleep(2000);
		
		//Xpath with text
		object.findElement(By.xpath("//a[text()='Overview Demo']")).click();
		Thread.sleep(200);
		
		//xpath with index
		object.findElement(By.xpath("(//a[@class='lvl-0 link nav-link'])[2]")).click();
		Thread.sleep(200);
		
		object.navigate().back();
		Thread.sleep(200);
		
		// Xpath with contains by text
		
		object.findElement(By.xpath("//a[contains(text(),'Log')]")).click();
		Thread.sleep(2000);
		
		
		//Xpath with contains by attribute
		object.findElement(By.xpath("(//input[contains(@class,'form-control input-')])[1]")).sendKeys("chichatekirti@gmail.com");
		
	}

}
