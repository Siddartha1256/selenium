package selenium_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basiclocater {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chromedriver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/USER/Desktop/textfield.html");
Thread.sleep(1500);
WebElement first = driver.findElement(By.tagName("input"));
first.sendKeys("sucess");
Thread.sleep(1500);
first.clear();
WebElement second = driver.findElement(By.id("a1"));
second.sendKeys("sucess");
Thread.sleep(1500);
second.clear();

}
}