package org.maven;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static WebDriver launchBrowser(String BrowserName) {
		if(BrowserName.equalsIgnoreCase("chrome")) {	
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		}
	   else if(BrowserName.equalsIgnoreCase("firefox")) {
		WebDriverManager.firefoxdriver().setup(); 
	        driver=new FirefoxDriver();
	   }
	   else if(BrowserName.equalsIgnoreCase("edge")) {
		   WebDriverManager.edgedriver().setup();
		   driver=new EdgeDriver();
	   }
	   return driver;
	}
		public static WebDriver launchbrowser2( String BrowserName) {
		switch (BrowserName) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			 driver=new FirefoxDriver();
             break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			 driver=new EdgeDriver();
			 break;
			 default:
				 System.out.println("in valid browser");
		}
		 return driver;
		}
		 
		
	
//public static WebDriver ChromeDriver() {
//	WebDriverManager.chromedriver().setup();
//	return driver= new ChromeDriver();
//	
//}
//public static WebDriver fireFox() {
//	WebDriverManager.firefoxdriver().setup();
//	return driver = new FirefoxDriver();
//}
//public static WebDriver edgeDriver() {
//	WebDriverManager.edgedriver().setup();
//	// TODO Auto-generated method stub
//	return driver= new EdgeDriver(); 
// }
public static void launchUrl(String Url) {
	driver.get(Url);
	// TODO Auto-generated method stub
}
public static   String getCurrentUrl() { 
	String Url = driver.getCurrentUrl();
	return Url;
	// TODO Auto-generated method stub

}

public static void implicitWait(int e) {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(e));
}
public static void maximize() {
driver.manage().window().maximize();
}

public static void sendkeys(WebElement e, String value) {
	e.sendKeys(value);
}
public static void click(WebElement c) {
	c.click();
}
public static void dradAndDrop(WebElement src,WebElement target) {
Actions a=new Actions(driver);
a.moveToElement(target).perform();

}
public static void moveToElement(WebElement target) {
Actions a=new Actions(driver);
a.moveToElement(target).perform();
}

public static void selectByIndex(WebElement value,int e) {
Select s=new Select(value);
s.selectByIndex(e);
}
public static void selectByValue(WebElement value, String e) {
Select s=new Select(value);
s.selectByValue(e);
}
public static void selectByVisibleText(WebElement value, String e) {
Select s=new Select(value);
s.selectByVisibleText(e);
}


}



