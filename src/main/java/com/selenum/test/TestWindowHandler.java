package com.selenum.test;

import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestWindowHandler {

	private static String defaultIP = "106.120.89.26";
	private static String prevIP = null; 
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\workspace\\selenium-master\\selenium\\src\\main\\resources\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		ChromeDriver driver = new ChromeDriver(chromeOptions);
		driver.get("C:\\Users\\lyx-pc-0018\\Desktop\\test.html");
		
		((JavascriptExecutor) driver).executeScript("document.getElementById('street').value = '123';");
		
		Thread.sleep(10000);							 
		((JavascriptExecutor) driver).executeScript("document.getElementById('street').value = '456'");
//		Set<String> handles = driver.getWindowHandles();
//		Object[] objects = handles.toArray();
//		TargetLocator to = driver.switchTo();
//		WebDriver sdriver = to.window(String.valueOf(objects[1]));
//		sdriver.findElement(By.xpath("//*[@id=\"form\"]/button")).click();
//		((ChromeDriver)sdriver).executeScript("document.documentElement.scrollTop=10000");
//		Thread.sleep(5000);
//		((ChromeDriver)sdriver).executeScript("document.documentElement.scrollTop=0");
//		
//		Random random = new Random();
//		Actions action = new Actions(sdriver);
//		int x = random.nextInt(800);
//		int y = random.nextInt(800);
//		System.out.println("移动到：("+ x + "," + y + ")");
//		action.moveByOffset(x, y);
//		action.click().perform();;
//		x = random.nextInt(800);
//		y = random.nextInt(800);
//		System.out.println("移动到：("+ x + "," + y + ")");
//		action.moveByOffset(x, y);
//		action.click().perform();;
		
//		String xx = "您的IP是：[108.14.66.251] 来自：美国";
//		int a = xx.indexOf("[");
//		int b = xx.indexOf("]");
//		System.out.println(xx.substring(a+1, b));
	}
}
