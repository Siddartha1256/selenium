package selenium_practice_scripts;

import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getwindowhandel {

	public static void main(String[] args) throws InterruptedException 
	{
			System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demoqa.com/browser-windows");
			Thread.sleep(2000);
			Set<String> pc_id = driver.getWindowHandles();
			int cout = pc_id.size();
			System.out.println(cout);
			for (String string : pc_id) {
				System.out.println(string);
			}
	}

}

