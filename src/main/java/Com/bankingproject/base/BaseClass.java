package Com.bankingproject.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;
	public static String projectpath = System.getProperty("user.dir");
	public  void launchWebsite() {
	 
	
	 System.setProperty("webdriver.chrome.driver",projectpath+"\\drivers\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get("https://demo.guru99.com/V1/index.php");
		

	}
}