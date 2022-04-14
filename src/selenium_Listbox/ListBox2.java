package selenium_Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox2 {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\OWNER\\Desktop\\VELOCITY DATA\\VELOCITY NOTES\\Automation Notes\\SELENIUM Software\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement option = driver.findElement(By.name("country"));
		
		JavascriptExecutor JSE = ((JavascriptExecutor)driver);
		Thread.sleep(2000);
		
		JSE.executeScript("arguments[0].scrollIntoView();",option);
		Thread.sleep(1000);
		option.click();
		Thread.sleep(1000);
		Select s= new Select(option);
		Thread.sleep(1000);
		s.selectByVisibleText("ANDORRA");

	}

}
