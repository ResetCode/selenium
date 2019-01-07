package com.selenum.handler;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.collect.Lists;
import com.selenum.model.AuData;
import com.selenum.model.UsData;

public class AuGetDataFromUrlHandler {

	public static List<AuData> handle(String driverPath,Integer num) {
		
		System.setProperty("webdriver.chrome.driver", driverPath);
		ChromeDriver driver = new ChromeDriver(new ChromeOptions());
		
		try {
			driver.get("https://www.fakenamegenerator.com/gen-random-us-us.php");
			WebDriverWait webDriverWait = new WebDriverWait(driver, 60);
			
			List<AuData> list = Lists.newArrayList();
			for(int i = 0; i < num; i++) {
			
				WebElement nameWebElement = webDriverWait.until(new ExpectedCondition<WebElement>() {
		            @Override
		            public WebElement apply(WebDriver d) {
		                return d.findElement(By.xpath("//*[@id=\"details\"]/div[2]/div[2]/div/div[1]/h3"));
		            }
		        }); //檢測
				
				//抓取数据
		
				String birthDayMessage = driver.findElement(By.xpath("//*[@id=\"details\"]/div[2]/div[2]/div/div[2]/dl[6]/dd")).getText();
				String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
				List<String> monthList = Arrays.asList(months);
				String[] births = birthDayMessage.split(" ");
				
				//分析数据
				String birthMonth = String.valueOf(monthList.indexOf(births[0]) + 1);
				String birthDay = births[1].replace(",", "").trim();
				String birthYear = births[2];
				Integer birthYearNumber = Integer.valueOf(birthYear);
				Random random = new Random();
				Integer suji = random.nextInt(30);
				if(birthYearNumber < 1970) {
					birthYear = new Integer(1970 + suji).toString();
				}
				if(birthYearNumber > 2000) {
					birthYear = new Integer(2000 - suji).toString();
				}
				
				System.err.println("birthMonth:" + birthMonth);
				System.err.println("birthDay:" + birthDay);
				System.err.println("birthYear:" + birthYear);
				System.err.println("===========================");
				
				AuData data = new AuData();
				data.setBirthMonth(birthMonth);
				data.setBirthDay(birthDay);
				data.setBirthYear(birthYear);
				list.add(data);
				driver.findElement(By.id("genbtn")).click();
			}
			return list;
		} finally {
			driver.quit();
		}
		
	}
}
