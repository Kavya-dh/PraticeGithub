package Package1;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "msedge/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(20, null);
		Actions action = new Actions(driver);
		//----------------Testcase 1--------------------
//		Actions action = new Actions(driver);
//		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
//		
//		WebElement drag = driver.findElement(By.xpath("//div[@id = 'box4']"));
//		WebElement drop = driver.findElement(By.xpath("//div[@id = 'box104']"));
//		action.dragAndDrop(drag, drop).perform();
//		WebElement drag1 = driver.findElement(By.xpath("//div[@id = 'box1']"));
//		WebElement drop1 = driver.findElement(By.xpath("//div[@id = 'box101']"));
//		action.dragAndDrop(drag1, drop1).perform();

	//----------------Testcase 2--------------------
		
//		driver.get("https://www.flipkart.com/");
//		WebElement tshirt = driver.findElement(By.xpath("//input[@class='Pke_EE']"));
//		tshirt.sendKeys("tshirts");
//		 Thread.sleep(10);
//		 List<WebElement> matches = driver.findElements(By.className("_1sFryS _2x2Mmc"));
//		 Thread.sleep(10);
//					for( WebElement Tshirtmatches:matches) {
//						System.out.println(Tshirtmatches.getText());					
//					}
//						driver.close();	
						
	//----------------Testcase 3----------------------
						
//			driver.get("https://www.facebook.com/login/");
//			WebElement mobilenum = driver.findElement(By.id("email"));
//			action.click(mobilenum).sendKeys("373738838").keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").perform();
//								
//			// Locate the password field and paste the copied number
//			  WebElement passwordField = driver.findElement(By.id("pass"));
//			 action.click(passwordField).keyDown(Keys.CONTROL).sendKeys("v").perform();
	
				//------------------------Testcase 5 --------------------
				
//				driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
//				String parentid = driver.getWindowHandle();
//				System.out.println(parentid);
//			
//				WebElement i = driver.findElement(By.id("newWindowsBtn"));		
//				 i.click();
//				 Set<String> allid = driver.getWindowHandles();
//				// for(String parentidchildid :    allid  ) {
//					// System.out.println(parentidchildid);
//					 allid.remove(parentid);
//					 for(String childid : allid) {
//					 System.out.println(childid);
//					 Thread.sleep(10);
//					 driver.switchTo().window(childid).close();
//					 Thread.sleep(20);
//					// driver.switchTo().window(parentid).close();	
//					 driver.quit();
//					 }
					 
						//------------------TestCase 6 ---------------------------------
	driver.get("https://www.youtube.com/");
	WebElement search = driver.findElement(By.xpath("//*[@id=\"center\"]/yt-searchbox/div[1]/form/input"));
					
	search.sendKeys("yaava mohana murali kareyithu song");
	Thread.sleep(30);
	driver.findElement(By.xpath("//*[@id=\"center\"]/yt-searchbox/button")).click();
	Thread.sleep(50);
	driver.findElement(By.xpath("//*[@id=\"video-title\"]/yt-formatted-string")).click();
//	Thread.sleep(20);				
//		try {
//			driver.findElement(By.xpath("//div[text() = 'Skip']")).click();
//		}catch (Exception e){
//			System.out.println("There is no skipad icon");
//										
//			}
//		Thread.sleep(20);
//	WebElement fullscreen = driver.findElement(By.xpath("//button[@title = 'Full screen (f)']"));
//	//driver.manage().window().fullscreen();
//	fullscreen.click();
//	Thread.sleep(20);
//	action.click(fullscreen).keyDown(Keys.ESCAPE).perform();
//	Thread.sleep(20);
//	action.moveToElement(fullscreen).perform();
//	Thread.sleep(20);
//	WebElement volume = driver.findElement(By.xpath("//button[@title='Mute (m)']"));
//	Thread.sleep(20);
//	action.moveToElement(volume).perform();
//	Thread.sleep(20);
//	driver.findElement(By.xpath("//*[@id=\"movie_player\"]/div[36]/div[2]/div[1]/span/div")).click();
//	driver.findElement(By.xpath("//*[@id=\"movie_player\"]/div[36]/div[2]/div[1]/button")).click();
//	//driver.findElement(By.xpath("//button[@title = 'Play (k)']")).click();
//						
//				    
	}

}
