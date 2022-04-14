package seleniumCompareWithIfElseStatement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CompareTextUsingIf_ElseOn_VelocityPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\OWNER\\Desktop\\VELOCITY DATA\\VELOCITY NOTES\\Automation Notes\\SELENIUM Software\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@placeholder='Type to Select Countries']")).sendKeys("India");
		Thread.sleep(1000);
		
		//now compare actual text and expected text
		WebElement text = driver.findElement(By.xpath("//a[contains(text(),'Velocity Corporate Training Center')]"));
		
		String Actualtext = text.getText();
		
		String Expectedtext= "VELOCITY CORPORATE TRAINING CENTER";
		
		if (Actualtext.equals(Expectedtext))
		{
			System.out.println("Text written is matching");
		}
		else
		{
			System.out.println("Text written is not matching");
		}

	}

}
