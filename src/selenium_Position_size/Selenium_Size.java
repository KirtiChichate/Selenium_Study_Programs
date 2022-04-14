package selenium_Position_size;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Size {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\OWNER\\Desktop\\VELOCITY DATA\\VELOCITY NOTES\\Automation Notes\\SELENIUM Software\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.veenaworld.com/");
		Thread.sleep(1000);
		System.out.println(driver.manage().window().getSize());
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//step1)----> create an object of dimension class which have argument as width and height
		Dimension dia= new Dimension(500, 200); //default size is width=1050 height=650
		
		//step2)--->use setsize method and pass argument as objname of dimension class inside it
		driver.manage().window().setSize(dia);
		Thread.sleep(2000);
		driver.close();
		

	}

}
