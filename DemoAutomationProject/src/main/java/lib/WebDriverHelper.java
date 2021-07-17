package lib;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverHelper extends DriverSetup {

	public void waitForElementClickable(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public void waitForElementVisible(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public String takeScreenShot(String screenshotname) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(System.getProperty("user.dir") + "\\target\\screenshots\\" + screenshotname);
		String dest = destination.getAbsolutePath();
		try {
			FileUtils.copyFile(source, destination);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return dest;
	}

	public List<String> findBrokenLinks() {
		List<String> brokenlinks = new ArrayList<String>();
		try {
			List<WebElement> links = driver.findElements(By.tagName("a"));
			for (WebElement element : links) {
				String url = element.getAttribute("href");
				URL link = new URL(url);
				HttpURLConnection http = (HttpURLConnection) link.openConnection();
				http.connect();
				int rescode = http.getResponseCode();
				if (rescode >= 400) {
					brokenlinks.add(url);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return brokenlinks;
	}

}
