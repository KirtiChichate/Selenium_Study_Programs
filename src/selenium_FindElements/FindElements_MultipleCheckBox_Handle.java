package selenium_FindElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements_MultipleCheckBox_Handle {

	public static void main(String[] args) throws InterruptedException {
		

		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\OWNER\\Desktop\\VELOCITY DATA\\VELOCITY NOTES\\Automation Notes\\SELENIUM Software\\chromedriver.exe");
				
				WebDriver driver= new ChromeDriver();
				driver.get("https://vctcpune.com/selenium/practice.html#");
				Thread.sleep(500);
				driver.manage().window().maximize();
				Thread.sleep(500);
			//	List<WebElement> AllcheckboxButtons = driver.findElements(By.xpath("((//section[@class='services-div1'])//div)[6]")); // u take very long and lenthy but just check what output you want and if that not found then go for the its outer parent
				List<WebElement> AllcheckboxButtons = driver.findElements(By.xpath("//input[@type='checkbox']"));
				
				System.out.println("Check how many checkboxbuttons is available "+AllcheckboxButtons.size());
				
				//use for each loop to do click
				for(WebElement clickRadio :AllcheckboxButtons)
				{
					clickRadio.click();
				}
				Thread.sleep(2000);
				//use for each loop to do unclick
				for(WebElement clickRadio :AllcheckboxButtons)
				{
					clickRadio.click();
				}

	}

}
