package Package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.By; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
//import org.openqa.selenium.browserlaunchers.*;
import org.openqa.selenium.firefox.FirefoxDriver;
public class LaunchBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "msedge/msedgedriver.exe");
		
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		//getTitle() and getCurrentUrl() and getPageSourceCode()
				String title = driver.getTitle();
				System.out.println(title);
//				
				String Currenturl = driver.getCurrentUrl();
				System.out.println(Currenturl);
//				
				String PageSourceCode = driver.getPageSource();
				System.out.println(PageSourceCode);
	}

}
