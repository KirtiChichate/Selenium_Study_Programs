package selenium_FindElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements_use {

	public static void main(String[] args) throws InterruptedException {

   System.setProperty("webdriver.chrome.driver", "C:\\Users\\OWNER\\Desktop\\VELOCITY DATA\\VELOCITY NOTES\\Automation Notes\\SELENIUM Software\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//use findelements method for the links in google using tagname locator
		List<WebElement> AllLinks = driver.findElements(By.tagName("a"));
		
		System.out.println("Count Total number of links inside Google page "+AllLinks.size());
		
		//use each for loop for printing the same all links
		System.out.println("Printing the links of google page");
		for(WebElement alllink:AllLinks)
		{
			System.out.println(alllink);
		}
		
		WebElement Searchbutton = driver.findElement(By.xpath("//input[@type='text']"));
		Searchbutton.sendKeys("Honda");
		List<WebElement> linksearch = Searchbutton.findElements(By.tagName("span"));
		System.out.println("Count Total number of links inside search box "+linksearch.size());
		System.out.println("Printing the links of search box");
		for(WebElement Selinks:linksearch)
		{
			System.out.println(Selinks.getText());
		}

	}

}
