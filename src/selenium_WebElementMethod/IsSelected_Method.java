package selenium_WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected_Method {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\OWNER\\Desktop\\VELOCITY DATA\\VELOCITY NOTES\\Automation Notes\\SELENIUM Software\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html#");
        Thread.sleep(1000);
        driver.manage().window().maximize();
        Thread.sleep(1000);
       WebElement optionselected = driver.findElement(By.id("checkBoxOption1"));
       boolean status = optionselected.isSelected();
       
       System.out.println("is this option is get selected or not "+status);
       
       //do selected that option 1 by clicking the optionselected as a click
       Thread.sleep(3000);
       optionselected.click();
       
      boolean status2 = optionselected.isSelected();
       
       System.out.println("is this option is get selected or not now "+status2);
		
	}

}
