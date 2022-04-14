package selenium_WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed_method_CompareIfElse {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\OWNER\\Desktop\\VELOCITY DATA\\VELOCITY NOTES\\Automation Notes\\SELENIUM Software\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html#");
        Thread.sleep(1000);
        driver.manage().window().maximize();
        Thread.sleep(1000);
        
        WebElement hidebox = driver.findElement(By.id("hide-textbox"));
        WebElement DisplayBox = driver.findElement(By.id("displayed-text"));
       boolean DisplayStatus = DisplayBox.isDisplayed();
        System.out.println("Status of Displaybox at starting is showing now "+DisplayStatus);
        hidebox.click();
        Thread.sleep(4000);
        boolean DisplayStatus2 = DisplayBox.isDisplayed();
        System.out.println("Status of displaybox after click on hidebox is showing now "+DisplayStatus2);
      
        Thread.sleep(1000);
      WebElement showbox = driver.findElement(By.id("show-textbox"));
     Thread.sleep(1000);
     boolean DisplayStatus3 = DisplayBox.isDisplayed();
     System.out.println("Status of displaybox after click on showbox is showing now "+DisplayStatus3);
     
      showbox.click();
      System.out.println("Status of displaybox after click on showbox is showing now "+DisplayStatus3);
     
      DisplayBox.sendKeys("Type a Text");
      
      

	}

}
