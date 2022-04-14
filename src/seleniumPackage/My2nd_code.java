package seleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class My2nd_code {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\OWNER\\Desktop\\VELOCITY DATA\\VELOCITY NOTES\\Automation Notes\\SELENIUM Software\\chromedriver.exe");

		WebDriver obj= new ChromeDriver();
		
		
		obj.get("https://in.bookmyshow.com/");
	}

}
