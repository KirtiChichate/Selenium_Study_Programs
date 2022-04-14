package selenium_TableHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableGuru {

	public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\OWNER\\Desktop\\VELOCITY DATA\\VELOCITY NOTES\\Automation Notes\\SELENIUM Software\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php#");
		Thread.sleep(500);
		driver.manage().window().maximize();
		Thread.sleep(500);
		
		
	int columnSize = driver.findElements(By.xpath("//table[@class='dataTable']//th")).size();
	System.out.println("columns available in this table: "+columnSize);
	
	int rowsize = driver.findElements(By.xpath("//table[@class='dataTable']//tr")).size();
	System.out.println("rows available in this table: "+rowsize);
	
	
	for(int i=1; i<=rowsize; i++)  //--->outer for loop for row
	{
		
		for(int j=1; j<=columnSize; j++)   //---->inner for loop for column
		{
			 String Headingtext;
			if(i==1)
			{
			   Headingtext = driver.findElement(By.xpath("//table[@class='dataTable']//tr["+i+"]//th["+j+"]")).getText();
			   System.out.print(Headingtext+" I ");
			} 
			else
			{
				//check this else part error   error    error
				Headingtext = driver.findElement(By.xpath("//table[@class='dataTable']//tr["+i+"]//td["+j+"]")).getText();
				 System.out.print(Headingtext+" I ");
			}
		}
		
		System.out.println();
	}
	
	

	}

}
