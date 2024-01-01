package streamsJavaDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Find the number of links on the page
//Print Link texts for all the links
//Check how many links which do not have href attribute(broken links)

public class JavaStreamsDemo {

	public static void main(String[] args)
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		/*for(WebElement link:links) {
			System.out.println(link.getText());
		}*/		
		
		//lambda expression
		links.forEach(l->System.out.println(l.getText()));
		
		//Processing the elements using filter on the links 
		
		long workingLinks = links.stream().filter(l->l.getAttribute("href")!=null).count();
		System.out.println("Here are the working links "+workingLinks);
		
		driver.close();
	}

}
