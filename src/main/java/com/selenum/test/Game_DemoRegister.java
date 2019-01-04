package com.selenum.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Game_DemoRegister {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(new ChromeOptions());
		
		driver.get("https://us.forgeofempires.com/");
		driver.manage().window().maximize();
		
		WebElement userName = driver.findElement(By.id("registration_nickname"));
		WebElement password = driver.findElement(By.id("registration_password"));
		WebElement accept = driver.findElement(By.id("registration_acceptTerms")); 
		WebElement playNow = driver.findElement(By.id("registration_register"));
		
//		userName.sendKeys("bruinhahah");
		userName.sendKeys("bruinhahaha");
		password.sendKeys("123456789");
		accept.click();
		Thread.sleep(5000);
		playNow.click();
	}
}
