package com.selenum.handler;

import java.util.Map;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.collect.Maps;
import com.selenum.model.AuData;
import com.selenum.model.AuWish;

/**
 * 模板一
 *
 */
public class AuCj6Handler {

	public static int handle(AuData data, ChromeDriver driver, String offerUrl,AuWish wish0) throws InterruptedException {
		Random r = new Random();
		int b = r.nextInt(101);
		
		WebDriverWait webDriverWait = new WebDriverWait(driver, 60);
		try{
			driver.get(offerUrl);
			driver.manage().deleteAllCookies();
			Thread.sleep(10000);

			//postcode					 
			try {
				driver.findElementByXPath("//*[@id=\"main-wrapper\"]/flow-step/teaser/div/div/div[2]/div/teaser-interest-questions/div/div[1]/div[2]/input").sendKeys(data.getZipCode());
				Thread.sleep(5000);
				
			} catch (Exception e) {
				driver.findElementByXPath("//*[@id=\"main-wrapper\"]/flow-step/teaser/div[2]/div/div[2]/div/teaser-interest-questions/div/div[1]/div[3]/div/div/div/input").sendKeys(data.getZipCode());
				Thread.sleep(5000);
			}
			
			//next					     
			try {
				
				driver.findElementByXPath("//*[@id=\"main-wrapper\"]/flow-step/teaser/div[2]/div/div[2]/div/teaser-interest-questions/div/div[1]/div[3]/div/div/div/span/button").click();
				Thread.sleep(5000);
			} catch (Exception e) {
				driver.findElementByXPath("//*[@id=\"main-wrapper\"]/flow-step/teaser/div/div/div[2]/div/teaser-interest-questions/div/div[1]/button").click();
				Thread.sleep(5000);
			}
			
			Integer sex = 1;
			if(data.getName().equals("f")) {
				sex = 2;
			} 						   
			
			try {
				driver.findElementByXPath("//*[@id=\"main-wrapper\"]/flow-step/teaser/div[2]/div/div[2]/div/teaser-interest-questions/div/div[1]/div[3]/div[" + sex + "]/button").click();
				Thread.sleep(20000);
			} catch (Exception e) {
				driver.findElementByXPath("//*[@id=\"main-wrapper\"]/flow-step/teaser/div/div/div[2]/div/teaser-interest-questions/div/div/div[2]/div[" + sex + "]/button").click();
				Thread.sleep(20000);
			}
			
			//day											          
			Select selectDay = new Select(driver.findElementByXPath("//*[@id=\"form\"]/div[2]/div/date-selector/div/div[2]/div[1]/select")); //birthday
			String day = data.getBirthDay();
			if(Integer.valueOf(day) < 10) {
				day = "0" + day;
			}
			selectDay.selectByVisibleText(day);
			
			//month
			Select selectMonth = new Select(driver.findElementByXPath("//*[@id=\"form\"]/div[2]/div/date-selector/div/div[2]/div[2]/select"));
			String month = data.getBirthMonth();
			
			String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
			Map<String, String> monthMap = Maps.newHashMap();
			for(int a=0; a < months.length; a++) {
				monthMap.put(new Integer(a+1).toString(), months[a]);
			}
			
			//year
			selectMonth.selectByVisibleText(monthMap.get(month));
			Select selectYear = new Select(driver.findElementByXPath("//*[@id=\"form\"]/div[2]/div/date-selector/div/div[2]/div[3]/select"));
			selectYear.selectByVisibleText(data.getBirthYear());
			Thread.sleep(5000);
			
			//firstName
			driver.findElementByXPath("//*[@id=\"form\"]/div[3]/div/input-field/input").sendKeys(data.getFirstName().trim());
			Thread.sleep(5000);
			
			//lastName
			driver.findElementByXPath("//*[@id=\"form\"]/div[4]/div/input-field/input").sendKeys(data.getLastName().trim());
			Thread.sleep(5000);
			
			//email
			driver.findElementByXPath("//*[@id=\"form\"]/div[5]/div/input-field/input").sendKeys(data.getEmail());
			Thread.sleep(5000);
			
			//phone
			driver.findElementByXPath("//*[@id=\"form\"]/div[6]/div/input-field/input").sendKeys("0" + data.getPhone());
			
			//city
												
			try {
				new Select(driver.findElementByXPath("//*[@id=\"form\"]/div[7]/div/div/div/div[2]/city-select/div/select")).selectByVisibleText(data.getCity());
			} catch (Exception e) {}//*[@id="form"]/div[7]/div/div/div/div[2]/city-select/div/input-field/input //此类不用选择
			
			//address
			driver.findElementByXPath("//*[@id=\"form\"]/div[7]/div/div/div/div[3]/input-field/input").sendKeys(data.getAddress2());
			Thread.sleep(5000);
			//continue
			driver.findElementByXPath("//*[@id=\"form\"]/div[8]/div/div/button").click();
			Thread.sleep(20000);
			
			driver.findElementByXPath("//*[@id=\"form\"]/div[2]/div/div/button").click();
			Thread.sleep(20000);
			
			for(int i=0; i< 30; i++) {
				
				if(answer(driver, 3290, getNumber(2))) continue;
				if(answer(driver, 5434, 4)) continue;
				if(answer(driver, 5434, 2)) continue;
				if(answer(driver, 7484, getNumber(2))) continue;
				if(answer(driver, 9646, getNumber(2))) continue;
				if(answer(driver, 12037, getNumber(2))) continue;
				if(answer(driver, 13302, getNumber(2))) continue;
				if(answer(driver, 12043, getNumber(2))) continue;
				if(answer(driver, 12340, getNumber(14))) continue;
				if(answer(driver, 12484, getNumber(2))) continue;//*[@id="questionnaire-question-9646"]/div[1]/div[2]/div/div/div[1]/label
				if(answer(driver, 12692, getNumber(2))) continue;
				if(answer(driver, 12695, getNumber(4))) continue;
				if(answer(driver, 13028, getNumber(2))) continue;
				if(answer(driver, 13031, getNumber(4))) continue;
				if(answer(driver, 13043, 2)) continue;
				if(answer(driver, 13249, 4)) continue;
				if(answer(driver, 13251, getNumber(2))) continue;
				if(answer(driver, 13299, getNumber(2))) continue;
				if(answer(driver, 13471, 2)) continue;
				if(answer(driver, 13506, getNumber(2))) continue;
				if(answer(driver, 13613, getNumber(2))) continue;
				if(answer(driver, 13619, getNumber(4))) continue;
				if(answer(driver, 13631, getNumber(2))) continue;
				if(answer(driver, 13637, 2)) continue; //是否愿意捐钱并联系
				if(answer(driver, 13683, getNumber(2))) continue; 
				if(answer(driver, 13686, 2)) continue; 
				if(answer(driver, 13731, 2)) continue;
				if(answer(driver, 13773, getNumber(2))) continue;
				if(answer(driver, 13776, 2)) continue; 
				if(answer(driver, 13851, getNumber(2))) continue;
				if(answer(driver, 13854, 2)) continue;
				if(answer(driver, 13899, getNumber(2))) continue;
				if(answer(driver, 13908, getNumber(2))) continue; //select
				if(answer(driver, 13956, getNumber(2))) continue; 
				if(answer(driver, 13959, 2)) continue; 
				if(answer(driver, 13965, 2)) continue; 
				if(answer(driver, 13968, 2)) continue; 
				if(answer(driver, 13968, getNumber(2))) continue; 
				if(answer(driver, 13974, getNumber(5))) continue; 
				
			}
			
			try {
				driver.findElementByXPath("//*[@id=\"main-wrapper\"]/preload/div/div/div[3]/div/div/div/prefilled-creative/div/div[2]/div/div[2]/a[" +getNumber(2) + "]").click();
			} catch (Exception e) {}
			try {
				//确认信息 				     
				driver.findElementByXPath("//*[@id=\"main-wrapper\"]/preload/div/div/div[2]/div/div[4]/div[2]/div/div/div/prefilled-creative/div/div[2]/div/div[2]/a[" +getNumber(2) + "]").click();
			} catch (Exception e) {}
			Thread.sleep(10000);
			return 1;
	   } catch(Exception e) {
		   e.printStackTrace();
		   Thread.sleep(60000);
		   return 3;
	   }
	}
	
	
	
	public static boolean answer(ChromeDriver driver,int question, int number) throws NumberFormatException, InterruptedException  {
		if(question == 13619) { //问是否可以接电话
			if(number == 1) {
				number = 3;
			} 
			if(number == 2) {
				number = 4;
			}
		} 
		
		
		Random r = new Random();
		Integer next = 5;
		//*[@id="questionnaire-question-13974"]/div/div[2]/div/div/div[1]
		try {							    
			next = r.nextInt(11);        
			driver.findElement(By.xpath("//*[@id='questionnaire-question-" + question + "']/div/div[2]/div/div/button[" + number + "]")).click();
			System.out.println("检测问题成功，问题是第 " + question + " 道题！随机数  " +  number);
			Thread.sleep(Integer.valueOf(next.toString() + "000"));
			return true;
		} catch (Exception e) {}
		
		try {							    
			next = r.nextInt(11); 		            	                 
			driver.findElement(By.xpath("//*[@id='questionnaire-question-" + question + "']/div[1]/div[2]/div/div/button[" + number + "]")).click();
			System.out.println("检测问题成功，问题是第 " + question + " 道题！随机数  " +  number);
			Thread.sleep(Integer.valueOf(next.toString() + "000"));
			return true;
		} catch (Exception e) {}
		
		try {							    
			next = r.nextInt(11); 		            	                 
			driver.findElement(By.xpath("//*[@id='questionnaire-question-" + question + "']/div/div[2]/div/div/div[" + number + "]/label")).click();
			System.out.println("检测问题成功，问题是第 " + question + " 道题！随机数  " +  number);
			Thread.sleep(Integer.valueOf(next.toString() + "000"));
			return true;
		} catch (Exception e) {}
		try {							    
			next = r.nextInt(11); 		            	                 
			driver.findElement(By.xpath("//*[@id='questionnaire-question-" + question + "']/div[1]/div[2]/div/div/div[" + number + "]/label")).click();
			System.out.println("检测问题成功，问题是第 " + question + " 道题！随机数  " +  number);
			Thread.sleep(Integer.valueOf(next.toString() + "000"));
			return true;
		} catch (Exception e) {}
		try {
			if(question == 13908) {
				Integer n = getNumber(10);
				if(n == 1) {
					n = 10;
				}
				new Select(driver.findElement(By.xpath("//*[@id='questionnaire-question-" + question + "']/div[1]/div[2]/div/div/select"))).selectByIndex(n);;
				System.out.println("检测问题成功，问题是第 " + question + " 道题！随机数  " +  number);
				Thread.sleep(Integer.valueOf(next.toString() + "000"));
				return true;
			}
			
		} catch (Exception e) {}
		
		System.out.println("不是第" + question + "道题，随机数为 " + number);
		return false;
	}
	

	
	
	
	public static int getNumber(Integer n) {
		Random random = new Random();
		int nextInt = random.nextInt(n + 1);
		if(nextInt == 0) {
			return getNumber(n);
		}
		return nextInt;
	}
	
	public static void scoll(WebDriver driver) throws InterruptedException {
		Thread.sleep(5000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight * 0.2)");
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight * 0.2, document.body.scrollHeight * 0.4)");
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight * 0.4, document.body.scrollHeight * 0.6)");
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight * 0.6, document.body.scrollHeight * 0.8)");
		Thread.sleep(5000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight * 0.8, document.body.scrollHeight)");
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight * 0.8, document.body.scrollHeight * 0.6)");
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight * 0.6, document.body.scrollHeight * 0.4)");
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight * 0.4, document.body.scrollHeight * 0.2)");
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight * 0.2, 0)");
	}
	
	public static WebDriver otherDriver(WebDriver driver, int index) {
		Set<String> handles = driver.getWindowHandles();
		TargetLocator to = driver.switchTo();
		Object[] objects = handles.toArray();
		WebDriver sdriver = to.window(objects[index].toString());
		return sdriver;
	}
}
