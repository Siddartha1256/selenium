package selenium_practice_scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getattriofsrcimg {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		 List<WebElement> link = driver.findElements(By.xpath("//img"));
		 int count = link.size();
		 System.out.println(count);
		 for (WebElement webell : link) 
		 {
			 String t = webell.getAttribute("src");
			 System.out.println(t);
		}

}

}
