package selenium_practice_scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mmmm {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/scripts/checkboxes.html");
		List<WebElement> cbox = driver.findElements(By.xpath("//input"));
		int count = cbox.size();
		System.out.println(count);
		for (int i = 0; i <count; i++) 
		{
		WebElement we = cbox.get(i);
			we.click();
			Thread.sleep(1000);		
		}
		for (int i =count-1; i>=0; i--) 
		{
		WebElement we = cbox.get(i);
			we.click();
			Thread.sleep(1000);
	}}

}

