package selenium_WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsMethods {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\OWNER\\Desktop\\VELOCITY DATA\\VELOCITY NOTES\\Automation Notes\\SELENIUM Software\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
 
	driver.get("https://www.facebook.com/");
	Thread.sleep(1000);
	
	driver.manage().window().maximize();
	Thread.sleep(1000);
	
	WebElement username = driver.findElement(By.name("email"));
	
	username.sendKeys("kirtichichate");
	Thread.sleep(1000);
	username.clear();
	Thread.sleep(1000);
	username.sendKeys("9404192018");
	Thread.sleep(1000);
	
	driver.findElement(By.id("pass")).sendKeys("123456");
	Thread.sleep(1000);
	driver.findElement(By.name("login")).click();
	
	WebElement login = driver.findElement(By.xpath("//button[text()='Log In']"));
	 
	String Actualtext = login.getText();
	String Expectedtext = "log off";
	
	if(Actualtext.equals(Expectedtext))
	{
		System.out.println("content is matching");
	}
	else
	{
		System.out.println("content is not matching");
	}
	

	}

}
