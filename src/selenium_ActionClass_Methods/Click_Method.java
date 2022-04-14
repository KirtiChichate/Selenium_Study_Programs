package selenium_ActionClass_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click_Method {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\OWNER\\Desktop\\VELOCITY DATA\\VELOCITY NOTES\\Automation Notes\\SELENIUM Software\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.shaadi.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//use the click method of Actions class
		//step1)--->find the action which try to execute like link on the login button so to do so we need to take this action using mouse actions methods
		//so find the locator of that element and save it in one ref variable
		
		WebElement LoginButton = driver.findElement(By.xpath("//a[text()='Login']"));
		
		//step2)--->create an action class and pass a arugment as a driver and save that in one ref variable
		
		Actions moment= new Actions(driver);
		
		//step3)-->now we can do actions using mouse actions method
		
		//Method 1---> by direct method
		moment.click(LoginButton).perform();  //in this mouse actions class for executing anythings it just need to pass perform() method everytime
		
		
		
		//Method 2---> by step step moving of mouse manually and do actions by implementing using code
		//moment.moveToElement(LoginButton).click().perform();
		
		driver.close();
		
	}
	

}
