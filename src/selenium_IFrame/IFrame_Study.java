package selenium_IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame_Study {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\OWNER\\Desktop\\VELOCITY DATA\\VELOCITY NOTES\\Automation Notes\\SELENIUM Software\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//to execute this iframe their r several steps
		//1)--> check and get locator types of xpath
		//2)---> find that xpath and try to get it if it is 1 of 1 then it ok
		//3)--->but after checking this path more time it shows exception error as "nosuch element is there" then
		//4)---> then think that as this path is from any iframe then try to find out that
		//5)---->for that check on the upper side of that find xpath that is there any tagname like iframe
		//6)--->and it shows such tagname it means this is iframe means basically this is the 2nd webpage which is going to paste on the main page thats y it cant found such path
		
		
		//(2)----switch main page to iframe
		driver.switchTo().frame("iframeResult");
		Thread.sleep(1000);
		//(1)-----find out the xpath
		WebElement Clickme = driver.findElement(By.xpath("//button[contains(text(),'Click me to display')]")); //this path is not found so
		                            //so 1st switch this main page to iframe page so do //(2)----switch
		Thread.sleep(1000);
		Clickme.click();
		
		//(3)-----now i want to take action on main page so again switch this from iframe to main page using 2 format
		//i)---by defaultcontent or by parentcontent
		
		driver.switchTo().defaultContent();
		Thread.sleep(500);
		WebElement theme = driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]"));
		Thread.sleep(500);
		theme.click();
		Thread.sleep(500);
		driver.close();
		

	}

}
