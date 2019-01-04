package com.selenum.test;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetDataFromUrlDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver(new ChromeOptions());
		driver.get("https://www.fakenamegenerator.com/gen-random-us-us.php");
		WebDriverWait webDriverWait = new WebDriverWait(driver, 60);
		
		for(int i = 0; i < 5; i++) {
		
			WebElement nameWebElement = webDriverWait.until(new ExpectedCondition<WebElement>() {
	            @Override
	            public WebElement apply(WebDriver d) {
	                return d.findElement(By.xpath("//*[@id=\"details\"]/div[2]/div[2]/div/div[1]/h3"));
	            }
	        });
			
			//抓取数据
			String[] names = nameWebElement.getText().split(" ");
			String[] addressMessage = driver.findElement(By.xpath("//*[@id=\"details\"]/div[2]/div[2]/div/div[1]/div")).getText().split("\n");
	
			String birthDayMessage = driver.findElement(By.xpath("//*[@id=\"details\"]/div[2]/div[2]/div/div[2]/dl[6]/dd")).getText();
			String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
			List<String> monthList = Arrays.asList(months);
			String[] births = birthDayMessage.split(" ");
			
			//分析数据
			String email = driver.findElement(By.xpath("//*[@id=\"details\"]/div[2]/div[2]/div/div[2]/dl[9]/dd")).getText().split("\n")[0];
			String firstName = names[0];
			String lastName = names[2];
			String primaryPhone = driver.findElement(By.xpath("//*[@id=\"details\"]/div[2]/div[2]/div/div[2]/dl[4]/dd")).getText();
			String streeAddress = addressMessage[0];
			
			String[] address = addressMessage[1].split(",");
			String city = address[0];
			String stateCode = address[1].split(" ")[1];
			String zipCode = address[1].split(" ")[2];
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
			
			System.err.println("addressMessage1:" + addressMessage[1]);
			System.err.println("===========================");
			System.err.println("email:" + email);
			System.err.println("firstName:" + firstName);
			System.err.println("lastName:" + lastName);
			System.err.println("phone:" + primaryPhone);
			System.err.println("address:" + streeAddress);
			System.err.println("city:" + city);
			System.err.println("zipCode:" + zipCode);
			System.err.println("stateCode:" + stateCode);
			System.err.println("birthMonth:" + birthMonth);
			System.err.println("birthDay:" + birthDay);
			System.err.println("birthYear:" + birthYear);
			System.err.println("===========================");
			driver.findElement(By.id("genbtn")).click();
		}
	}
}
