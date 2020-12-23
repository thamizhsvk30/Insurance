package com.insurence.commonaction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Comaction {

	public static  WebDriver driver;
	private static String homeWindow = null;
	
	public WebDriver launch(String url) throws Throwable {

		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("disable-infobars");
		chromeOptions.addArguments("start-maximized");
		driver = new ChromeDriver(chromeOptions);
		driver.get(url);
		pagewait();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		return driver;

	}
		public void pagewait() throws Throwable {
		Thread.sleep(5000);
		}
		
		public static void closeBrowser() {
			try {
				driver.quit();
			} catch (Exception e) {
			}
		}

		
		public static void selectByValue(WebElement element, String value) {
			try {
				Select obj_select = new Select(element);
				obj_select.selectByValue(value);
			} catch (Exception e) {
			}
		}

		public static void selectByText(WebElement element, String text) {
			try {
				Select obj_select = new Select(element);
				obj_select.selectByVisibleText(text);
			} catch (Exception e) {
			}
		}

		public void jsScrollPagedowntoEnd() {
			try {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			}
			catch (Exception e) {
			}
		}
		

	}
