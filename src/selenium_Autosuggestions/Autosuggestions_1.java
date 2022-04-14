package selenium_Autosuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestions_1 {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\OWNER\\Desktop\\VELOCITY DATA\\VELOCITY NOTES\\Automation Notes\\SELENIUM Software\\chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.google.co.in/");
			driver.manage().window().maximize();
			Thread.sleep(1000);
			WebElement Searchbutton = driver.findElement(By.name("q"));
			Thread.sleep(1000);
			Searchbutton.sendKeys("Honda");
			Thread.sleep(1000);
		
			List<WebElement> SearchDisplay = driver.findElements(By.xpath("((//ul[@class='G43f7e'])[1])//li"));
			Thread.sleep(1000);
			System.out.println("count of searches: "+SearchDisplay.size());
			
			//with the help of for loop u got the text
			for(WebElement clickpath: SearchDisplay)
			{
				System.out.println(clickpath.getText());
				
			}

			Thread.sleep(1000);
			
			for(WebElement text: SearchDisplay)
			{
				String ActualResult=text.getText();
				String ExpectedResult="honda city";
				if(ActualResult.equals(ExpectedResult))
				{
					text.click();
					break;
				}
				
			}
			
			Thread.sleep(1000);
			
			
			driver.findElement(By.linkText("Images")).click();  
	}

}
