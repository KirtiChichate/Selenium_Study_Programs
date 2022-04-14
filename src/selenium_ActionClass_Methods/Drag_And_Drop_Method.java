package selenium_ActionClass_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_Drop_Method {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\OWNER\\Desktop\\VELOCITY DATA\\VELOCITY NOTES\\Automation Notes\\SELENIUM Software\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://qavbox.github.io/demo/dragndrop/");
		driver.manage().window().maximize();
		Thread.sleep(1000);

		//step1)---> take locator of that element which we have to drag means locator of drag and store it in "source or dragLocation i take " ref variable
		WebElement DragLocation = driver.findElement(By.xpath("//div[@id='draggable']"));
		
				
		//setp2)--->take locator of that element which we have to drop means locator of drop and store it in "target or dropLocation i take" ref variable
	   WebElement DropLocation = driver.findElement(By.xpath("//div[@id='droppable']"));
	   
	  //step3)---> creat an actions class and store it
	   Actions moment= new Actions(driver);
	   Thread.sleep(1000);
	   
	   //Method 1--->use dragdrop method
	   moment.dragAndDrop(DragLocation, DropLocation).perform(); //dont forget to type perform() method after every method
		
	   
	   //Method 2
//	   moment.moveToElement(DragLocation).clickAndHold().moveToElement(DropLocation).release().build().perform(); //build() method is use to connect multiple method in one line
	   Thread.sleep(2000);
	   
	   
	   //now drag that from droplocation and drop in draglocation
	   //for this we need locator of blank side
	// WebElement Blankspace = driver.findElement(By.id("regform"));  //this is also correct path
	   WebElement Blankspace = driver.findElement(By.xpath("//body[@style='cursor: auto;']"));
	 
	 //method 2
//	 moment.moveToElement(DragLocation).clickAndHold().moveToElement(Blankspace).release().build().perform();
	 
	 Thread.sleep(2000);
	 //Method 1
	 moment.dragAndDrop(DropLocation, Blankspace).perform();
	 
	   driver.close();
	}

}
