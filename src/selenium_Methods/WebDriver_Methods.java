package selenium_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Methods {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\OWNER\\Desktop\\VELOCITY DATA\\VELOCITY NOTES\\Automation Notes\\SELENIUM Software\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		WebDriver driver1= new ChromeDriver();
		driver.get("https://hclfirstcareers.com/");
		driver.manage().window().minimize();
		
		Thread.sleep(200);
		driver1.get("https://www.dominos.co.in/");
		
		//driver1.close();
		
		
		driver1.get("https://meesho.com/");
		//driver.quit();
		driver1.manage().window().minimize();
		
		driver.manage().window().maximize();
		Thread.sleep(20);
		driver.close();
		
		driver1.manage().window().minimize();
		driver1.close();
		
		WebDriver driver2= new ChromeDriver();
		driver2.get("https://www.onlinesbi.com/");
		Thread.sleep(10);
		driver2.navigate().to("https://www.gajananmaharaj.org/");
		Thread.sleep(15);
		driver2.navigate().back();
		Thread.sleep(10);
		driver2.navigate().forward();
		Thread.sleep(10);
		driver2.navigate().refresh();
		Thread.sleep(20);
		
		WebDriver driver3= new ChromeDriver();
		driver3.get("https://www.tuljabhavani.in/");
		driver3.getTitle();
		
		Thread.sleep(10);
		driver3.getCurrentUrl();
		
	}

}

