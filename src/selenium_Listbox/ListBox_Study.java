package selenium_Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox_Study {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\OWNER\\Desktop\\VELOCITY DATA\\VELOCITY NOTES\\Automation Notes\\SELENIUM Software\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Kirti");
		Thread.sleep(1000);
		driver.findElement(By.name("lastname")).sendKeys("Chichate");
		Thread.sleep(1000);
		driver.findElement(By.name("reg_email__")).sendKeys("chichatekirti@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("password_step_input")).sendKeys("Myaim@job");
		Thread.sleep(1000);
		
		
		System.out.println("This all steps of printing dateofbirth ");
		Thread.sleep(4000);
//	Step 1)--->Identify list box to be handled and store it in reference variable
		WebElement dateofbirth = driver.findElement(By.xpath("//select[@aria-label='Day']"));
		
//  step 2)---->Create an object of Select class which will accept WebElement as argument
		Select s1= new Select(dateofbirth);
		
//  step 3)--->	By using one of the select class methods we can select values form list box like 
		
//		1. selectByVisibleText: selectByVisibleText(String arg0) 
//		2. selectByIndex: selectByIndex(int arg0) 
//		3. selectByValue: selectByValue(String arg0)
		
		Thread.sleep(2000);
		//1. selectByVisibleText: selectByVisibleText(String arg0) 
		s1.selectByVisibleText("13");
		
		//3. selectByValue: selectByValue(String arg0)
		Thread.sleep(2000);
		s1.selectByValue("14");
		
	//	2. selectByIndex: selectByIndex(int arg0) 
		Thread.sleep(2000);
		s1.selectByIndex(3);
		
		
		System.out.println("This all steps of printing Monthofbirth");

// step  1)-->Identify list box to be handled and store it in reference variable
		WebElement MonthofBirth = driver.findElement(By.name("birthday_month"));
		
// step 2)--->Create an object of Select class which will accept WebElement as argument
		Select s2= new Select(MonthofBirth);
		
// step 3)---> By using one of the select class methods we can select values form list box like 
		
//		1. selectByVisibleText: selectByVisibleText(String arg0) 
//		2. selectByIndex: selectByIndex(int arg0) 
//		3. selectByValue: selectByValue(String arg0)
		Thread.sleep(2000);
		s2.selectByVisibleText("Mar");
		Thread.sleep(2000);
		s2.selectByValue("8");
		Thread.sleep(2000);
		s2.selectByIndex(6);
		
		
		System.out.println("This all steps of printing Yearofbirth");
// step  1)-->Identify list box to be handled and store it in reference variable
		WebElement Yearofbirth = driver.findElement(By.id("year"));
// step 2)--->Create an object of Select class which will accept WebElement as argument		
		Select s3= new Select(Yearofbirth);
// step 3)---> By using one of the select class methods we can select values form list box like 
		
//		1. selectByVisibleText: selectByVisibleText(String arg0) 
//		2. selectByIndex: selectByIndex(int arg0) 
//		3. selectByValue: selectByValue(String arg0)
		Thread.sleep(2000);
		s3.selectByIndex(10);
		Thread.sleep(2000);
		s3.selectByValue("1995");
		Thread.sleep(2000);
		s3.selectByVisibleText("1990");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		Thread.sleep(2000);
		driver.close();
		

	}

}
