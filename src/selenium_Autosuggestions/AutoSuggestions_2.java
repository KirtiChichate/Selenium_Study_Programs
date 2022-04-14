package selenium_Autosuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestions_2 {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\OWNER\\Desktop\\VELOCITY DATA\\VELOCITY NOTES\\Automation Notes\\SELENIUM Software\\chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("lg washing machine");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
			Thread.sleep(2000);
			
			//This is correct now but before i pass in argument as {argument} only instead of {arguments} JSE.executeScript("arguments[0].scrollIntoView();",element);   
			WebElement element = driver.findElement(By.xpath("((//div[@class='_2kHMtA'])[4]//span)[4]"));
			Thread.sleep(1000);
			JavascriptExecutor JSE = ((JavascriptExecutor)driver);
			Thread.sleep(1000);
			JSE.executeScript("arguments[0].scrollIntoView();",element);   
			System.out.println(element.getText());
			Thread.sleep(1000);
			driver.close();
			
			
			//progrm is completed by 2nd way
			
/*			WebElement RatingResult = driver.findElement(By.xpath("((((//div[@class='_2kHMtA'])[1])//span)[5]//span)[2]"));
			Thread.sleep(1000);
			System.out.println(RatingResult.getText());   */
			

	}

}
