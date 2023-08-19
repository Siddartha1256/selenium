package handlingpopups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childbeowsers {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.findElement(By.xpath("//button[.='New window']")).click();
		Thread.sleep(1500);
        Set<String> id = driver.getWindowHandles();
        int count = id.size();
        System.out.println(count);
        for (String string : id) {
	    System.out.println(string);
}
	}

}
