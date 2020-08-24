package kdf;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {
	WebDriver driver;

	public void openBroswer() {
		driver = new ChromeDriver();
	}

	public void maximizeBroswerWindow() {
		driver.manage().window().maximize();
	}

	public void implementImplicitWait() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void navigateToAUT(String url) {
		driver.get(url);
	}

	public void enterUserId(String locValue, String userID) {
		driver.findElement(By.id(locValue)).sendKeys(userID);
	}

	public void enterPassword(String locValue, String password) {
		driver.findElement(By.id(locValue)).sendKeys(password);
	}

	public void clickButton(String loc, String locValue) {
		if (loc.equals("name")) {
		driver.findElement(By.name(locValue)).click();
	}
	else if (loc.equals("cssSelector")) {
		driver.findElement(By.cssSelector(locValue)).click();
	}

}

public String getErrorMessage(String loc,String LocValue) {
	String msg = null;
		if (loc.equals("cssSelector")) {
		msg = driver.findElement(By.cssSelector(LocValue)).getText();
	}
		else if(loc.equals("id")) {
		msg   =	driver.findElement(By.id(LocValue)).getText();
		}
		return msg;
	}

	public void closeApplication() {
		driver.close();
	}


}
