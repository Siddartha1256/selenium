package selenium_practice_scripts;

import org.openqa.selenium.chrome.ChromeDriver;

public class Chroquit {

	public static void main(String[] args) throws InterruptedException {
		String key="webdriver.chrome.driver";
		String value="./software/chromedriver.exe";
		System.setProperty(key, value);
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.close();//to close 1
		driver.quit();//to close all
	}
}
