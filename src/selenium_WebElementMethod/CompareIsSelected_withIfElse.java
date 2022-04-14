package selenium_WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CompareIsSelected_withIfElse {

	public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\OWNER\\Desktop\\VELOCITY DATA\\VELOCITY NOTES\\Automation Notes\\SELENIUM Software\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html#");
        Thread.sleep(1000);
        driver.manage().window().maximize();
        Thread.sleep(1000);
       WebElement optionselected = driver.findElement(By.id("checkBoxOption1"));
       boolean status = optionselected.isSelected();
  
       if(status)
       {
    	   System.out.println("Status is selected means option1 isselected "+status);
    	   
       }
      
       else
       {
    	   System.out.println("status is not selected, then click on option1 & status is --- "+status);
    	   Thread.sleep(2000);
    	   optionselected.click();
    	   Thread.sleep(1000);
    	   boolean status2 = optionselected.isSelected();
    	   System.out.println("Now option1 is get selected & status is --- "+status2);
       }
       
      Thread.sleep(1000);
       driver.close();
       
     
       
     

	}

}
