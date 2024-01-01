package streamsJavaDemo;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaStreasDemo2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.switchTo().newWindow(WindowType.TAB);  //This makes you switch to a new window in the browser
		
		driver.get("https://www.amazon.com/"); // Open this site after switching to a new window		
		//Your requirement is to get the titles of each web page
		Set<String> windowIds = driver.getWindowHandles();
		/*for(String winId:windowIds) {
			System.out.println(driver.switchTo().window(winId).getTitle());
			
			driver.quit();
		}*/
		
		windowIds.forEach(w->System.out.println(driver.switchTo().window(w).getCurrentUrl()));
		driver.quit();
	}

}
