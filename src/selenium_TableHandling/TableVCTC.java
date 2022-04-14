package selenium_TableHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableVCTC {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\OWNER\\Desktop\\VELOCITY DATA\\VELOCITY NOTES\\Automation Notes\\SELENIUM Software\\chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();
			driver.get("https://vctcpune.com/selenium/practice.html#");
			Thread.sleep(1000);
			driver.manage().window().maximize();
			Thread.sleep(1000);
			
			//here u can take step by step this path (//table[@class='table-display']//tr[1])//th or u can take its relative xpath //table[@class='table-display']//th
		//	driver.findElements(By.xpath("(//table[@class='table-display']//tr[1])//th"));  //step by step relative xpath
			
		 WebElement Table = driver.findElement(By.xpath("//table[@id='product']"));
		 Thread.sleep(1000);
		 JavascriptExecutor JEX = ((JavascriptExecutor)driver);
		 Thread.sleep(1000);
			JEX.executeScript("arguments[0].scrollIntoView();",Table);
			
			 int HeadingTablecolumnsize = driver.findElements(By.xpath("//table[@class='table-display']//th")).size();
			Thread.sleep(1000);
		System.out.println("size of the table heading : "+HeadingTablecolumnsize);
		
		int TableRowsSize = driver.findElements(By.xpath("//table[@class='table-display']//tr")).size();
		Thread.sleep(1000);
		System.out.println("size of the rows : "+TableRowsSize);
		
		//this is row for loop
		for(int i=1; i<=TableRowsSize; i++)
		{
        	//this is column for loop
			for(int j=1; j<=HeadingTablecolumnsize; j++)
			{
				String text;
				if(i==1)
				{
				 text = driver.findElement(By.xpath("//table[@class='table-display']//tr["+i+"]//th["+j+"]")).getText();
				 System.out.print(text+" ");
				}
				else
				{
				 text=driver.findElement(By.xpath("//table[@class='table-display']//tr["+i+"]//td["+j+"]")).getText();
				 System.out.print(text+" ");
				}
				
			}
			System.out.println();
		}
		
		
		
	}

}
