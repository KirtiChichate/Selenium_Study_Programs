package selenium_Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectBox_Multiselect {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\OWNER\\Desktop\\VELOCITY DATA\\VELOCITY NOTES\\Automation Notes\\SELENIUM Software\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//1.Identify list box to be handled and store it in reference variable
		WebElement Multiselectoption = driver.findElement(By.id("cars"));
		
		//2.Create an object of Select class which will accept WebElement as argument
		Select s1= new Select(Multiselectoption);
		
		//3. checking drop down can have multi select options
		boolean Ismultiselect = s1.isMultiple();
		
		System.out.println("Is this cars dropdown have multiselect option "+Ismultiselect);
		
		Thread.sleep(2000);
		//now if it have multiselection option then select that option by using selection option
		//1)---> select by usingvisible text
		s1.selectByVisibleText("Volvo");
		Thread.sleep(2000);
		s1.selectByValue("saab");
		Thread.sleep(2000);
		s1.selectByIndex(3);
		
		//deselect one by one using deselect method

		Thread.sleep(1000);
		s1.deselectByIndex(3);
		Thread.sleep(1000);
		s1.deselectByVisibleText("Volvo");
		Thread.sleep(1000);
		s1.selectByVisibleText("Opel");
		Thread.sleep(1000);
		s1.deselectAll();
		Thread.sleep(2000);
		driver.close();
		
	}

}
