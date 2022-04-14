package selenium_ActionClass_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick_Method {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\OWNER\\Desktop\\VELOCITY DATA\\VELOCITY NOTES\\Automation Notes\\SELENIUM Software\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//step1)---> trace the element on which action need to perform and store it in one ref variable
		WebElement DoubleClickButton = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));

		//step2)--->creat object of Action class and give argument in it as a driver
		Actions moment= new Actions(driver);
		
		//step3)--->apply action class method to do doubleclick
	    //Method 1
		moment.doubleClick(DoubleClickButton).perform(); //dont forget to type perform() method after every method
		
		//Method 2
	//	moment.moveToElement(DoubleClickButton).doubleClick().perform();  //dont forget to type perform() method after every method
		Thread.sleep(1000);
		driver.close();
	}

}
