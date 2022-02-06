package org.click;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Elanchezhiyan\\eclipse-workspace\\Gana\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("Https://facebook.com/");
		
		List<WebElement> linkCount = driver.findElements(By.tagName("a"));
		int size = linkCount.size();
		System.out.println(size);
		int brokenCount = 0;
		for(int i=0; i<linkCount.size(); i++) {
			WebElement element = linkCount.get(i);
			String attribute = element.getAttribute("href");
			URL url = new URL(attribute);
			URLConnection openConnection = url.openConnection();
			HttpsURLConnection urlConnections = (HttpsURLConnection) openConnection;
			int responseCode = urlConnections.getResponseCode();
			if(responseCode!=200) {
				System.out.println(attribute);
				brokenCount++;
			}
		}
		System.out.println("Broken link count is :"+ brokenCount);

	}

}
