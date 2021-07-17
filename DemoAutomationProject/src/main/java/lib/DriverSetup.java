package lib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;

public class DriverSetup {

	public static WebDriver driver;
	public static Configuration config = new Configuration();

	public DriverSetup() {
	
	}

	public static void setUp(String browser) {
		if(config.getProperty("browser").equalsIgnoreCase(browser)) {
		WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		}
		else if (config.getProperty("browser").equalsIgnoreCase(browser)) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.get(config.getProperty("url"));	
	}

	public void tearDown() {
		driver.quit();
	}
     
	
}
