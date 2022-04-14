package selenium_PopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prompt_AlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		  
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\OWNER\\Desktop\\VELOCITY DATA\\VELOCITY NOTES\\Automation Notes\\SELENIUM Software\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://demoqa.com/alerts");
		   driver.manage().window().maximize();
		  // This step will result in an alert on screen
		   WebElement element = driver.findElement(By.id("promtButton"));
		   ((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
		   Alert promptAlert  = driver.switchTo().alert();
		   String alertText = promptAlert.getText();
		   System.out.println("Alert text is " + alertText);
		  //Send some text to the alert
		   promptAlert.sendKeys("Test User");
		   promptAlert.accept();
		  }
		

		

	}


