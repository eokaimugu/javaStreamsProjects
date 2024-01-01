package streamsJavaDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class JavaStreamsDemo3 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='header-menu']/ul[1]/li[1]/a")).click();
		Select sortDrpDown = new Select(driver.findElement(By.id("products-orderby")));
		sortDrpDown.selectByVisibleText("Name: A to Z");
		List<WebElement> books = driver.findElements(By.xpath("//h2[@class='product-title']"));
		books.forEach(b->System.out.println(b.getText()));
		driver.close();
	}

}
