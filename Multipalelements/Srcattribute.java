package multipalelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Srcattribute {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://amazon.in");
		List<WebElement> link = driver.findElements(By.xpath("//img"));
		int count = link.size();
		System.out.println(count);
		for (WebElement we : link)
		{
			  String t = we.getAttribute("src");
			System.out.println(t);

	}
}
	
}
