package selenium_PopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//this program is not run exactly plz check again

public class Alert2_Popup {

	public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\OWNER\\Desktop\\VELOCITY DATA\\VELOCITY NOTES\\Automation Notes\\SELENIUM Software\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		 WebElement element = driver.findElement(By.xpath("(//button[text()='Click me'])[4]"));
		 Thread.sleep(1000);
		 element.click();
		 Thread.sleep(1000);
		 
		//now use the procedure to handle prompt alert popup
		//step1)-->cast the javascriptexecutor to driver and use the below argument and store it in one variable
		
		((JavascriptExecutor)driver).executeScript("argument[0].click()", element);
		
		
		
		//step2)--> switch the selenium focus from main page to popup and save it in one variable name
		Alert promptalt = driver.switchTo().alert();
		 Thread.sleep(2000);
		
		//step3)---> use the sendkeys method by initializing objectname of switchto
		promptalt.getText();
		Thread.sleep(2000);
		
		promptalt.sendKeys("Enter the text");
		Thread.sleep(2000);
		
		
//		promptalt.dismiss();
//		Thread.sleep(1000);
//		driver.close();

	}

}
