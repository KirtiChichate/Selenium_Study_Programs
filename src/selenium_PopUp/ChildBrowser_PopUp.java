package selenium_PopUp;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser_PopUp {

	public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\OWNER\\Desktop\\VELOCITY DATA\\VELOCITY NOTES\\Automation Notes\\SELENIUM Software\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(2000);
		
		
		/* To switch the focus from main page to child browser page 1st it need to call the method
		 * i.e .getwindowhandle and .getwindowhandles
		 */
		
		//1st use only for single browser so it need .getwindowhandle method and store it in one variable name
		
		String getMainBrowserId = driver.getWindowHandle();
		System.out.println("Id of main browser page is : "+getMainBrowserId);
		
		
		//2ndly use for multiple browsers so it need .getwindowhandles method and store it on variable
		
		Set<String> MultipleId = driver.getWindowHandles();
		System.out.println("Id of Multiple browsers is :"+MultipleId);
		
		/*Now to switch the focus from main browser to child browser
		 * For that 1st it need to use object name getwindowhandles method and connect with Iterator interface and store that in one variable name */
		
		Iterator<String> objofiterator = MultipleId.iterator();  //This is the initial id or index means starting id so it count from length=index-1---> its at -1 index
	
		//now to go forward for next browser it need objectname of iterator with next method and store it in one variable name
		String MainBrowserId = objofiterator.next();  //this will come to main page now
		
		/*now creat same for the next browser and it need to creat till how much child browser u have and on that if u want to take action so u need to to go next next using next method and take action on that particular browser
		 * and now store it in one variable name
		 */
		String ChildBrowserId = objofiterator.next();  //this will came to the next immidiate child browser page
		
		/*now it get find the id of both main and child browser now its time to switch the focus of browser using switch method*/
		driver.switchTo().window(ChildBrowserId);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='HOME'])[1]")).click();
		Thread.sleep(2000);
		driver.close();
		
		//Now switch focus from child browser page to main page
		driver.switchTo().window(MainBrowserId);
		Thread.sleep(2000);
		driver.findElement(By.name("home")).click();
		Thread.sleep(3000);
		driver.close();
		
		

	}

}
