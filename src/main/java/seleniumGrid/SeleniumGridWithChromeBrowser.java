package seleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SeleniumGridWithChromeBrowser {
	
	WebDriver driver;
	
	@Test(priority=1)
	void setup() throws MalformedURLException
	{
		String nodeURL = "http://192.168.12.187:5555";	///wd/hub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--selenium-manager");
		options.addArguments("--selenium-manager");	
		options.setCapability("browserName", "chrome");
		options.setCapability("platform", "Windows");
					
		driver = new RemoteWebDriver(new URL(nodeURL), options);
		
		//DesiredCapabilities cap = new DesiredCapabilities();
		//cap.setCapability("browserName", "chrome");
		//cap.setPlatform(Platform.WIN11);				
		//options.merge(cap);
		//driver = new RemoteWebDriver(new URL(nodeURL), caps);	
				
		
	}
	
	@Test(priority=2)
	void login()
	{
		/*driver.get("https://practice.automationtesting.in/my-account/");
		driver.findElement(By.id("reg_email")).sendKeys("okaius@comcast.net");
		driver.findElement(By.id("reg_password")).sendKeys("2Cor5+vrs17");
		driver.findElement(By.name("register")).click();*/
		
		driver.get("https://practice.automationtesting.in/my-account/");
		driver.findElement(By.id("username")).sendKeys("okaius@comcast.net");
		driver.findElement(By.id("password")).sendKeys("2Cor5+vrs17");
		driver.findElement(By.name("login")).click();
		
		
		String capText = driver.findElement(By.xpath("//p[contains(text(),'Hello')]")).getText();
		if(capText.contains("okaius"))
		{
			System.out.println("Test passed");
		}
		else {
			System.out.println("Test failed");
		}
		driver.close();
	}

}
