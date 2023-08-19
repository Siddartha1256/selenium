package selenium_practice_scripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Closeparentbrowser {

	public static void main(String[] args) throws InterruptedException 
	{
			System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://skpatro.github.io/demo/links/");
			Thread.sleep(2000);
			driver.findElement(By.name("NewWindow")).click();
			Thread.sleep(2000);
			String p_id = driver.getWindowHandle();
			Set<String> all_id = driver.getWindowHandles();
			for (String id : all_id) 
			{
				driver.switchTo().window(id);
				String title = driver.getTitle();
				System.out.println(title);
				Thread.sleep(2000);
				if (p_id.equals(id)) 
				{
				driver.close();
				}
			}
	}

}
