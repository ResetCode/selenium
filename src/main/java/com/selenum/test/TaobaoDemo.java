package com.selenum.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TaobaoDemo {

	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(new ChromeOptions());
		
		driver.get("https://pub.alimama.com/");
		driver.manage().window().maximize();
		
		WebDriverWait webDriverWait = new WebDriverWait(driver, 10);
		WebDriver frame = webDriverWait.until(new ExpectedCondition<WebDriver>() {
            @Override
            public WebDriver apply(WebDriver d) {
                return d.switchTo().frame("taobaoLoginIfr");
            }
        });
		
		webDriverWait = new WebDriverWait(frame, 10);
		WebElement login = webDriverWait.until(new ExpectedCondition<WebElement>() {
            @Override
            public WebElement apply(WebDriver d) {
                return d.findElement(By.id("J_Quick2Static"));
            }
        });
		login.click();
	
		WebElement userName = frame.findElement(By.id("TPL_username_1"));
		WebElement password = frame.findElement(By.id("TPL_password_1"));
		WebElement submit = frame.findElement(By.id("J_SubmitStatic"));
		userName.sendKeys("mangguodawei@126.com");
		password.sendKeys("mgdw888888#");
		submit.click();
		
		try {
			WebElement verify = frame.findElement(By.id("nc_1_n1z"));
			verify.click();
			System.out.println("zzz");
			Actions action = new Actions(frame);
			action.dragAndDropBy(verify, 200,0).build().perform();;
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("xxx");
		}
		
	}
}
