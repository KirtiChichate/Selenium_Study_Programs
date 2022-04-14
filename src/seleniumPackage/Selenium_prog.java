package seleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_prog {

	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\OWNER\\Desktop\\VELOCITY DATA\\VELOCITY NOTES\\Automation Notes\\SELENIUM Software\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
        
        driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=58075519359&hvpone=&hvptwo=&hvadid=486462454211&hvpos=&hvnetw=g&hvrand=887757701632563482&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9301365&hvtargid=kwd-64107830&hydadcr=14452_2154371&gclid=CjwKCAiA6Y2QBhAtEiwAGHybPcoy44Yw071xF5Jki9UKi2UEqBy64XkWv6L9warx2-hDB6NuJwqfChoCEIwQAvD_BwE");
	}

}
