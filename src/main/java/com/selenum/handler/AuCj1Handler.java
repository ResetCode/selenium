package com.selenum.handler;

import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.selenum.model.AuData;

/**
 * 模板一
 */
public class AuCj1Handler {

	private final static Logger logger = LoggerFactory.getLogger(AuCj1Handler.class);
	
	public static int handle(AuData data, ChromeDriver driver, String offerUrl) throws InterruptedException {
		Random r = new Random();
		int b = r.nextInt(101);
		
		WebDriverWait webDriverWait = new WebDriverWait(driver, 60);
		try{
			driver.get(offerUrl);
			driver.manage().deleteAllCookies();
			Timeouts timeouts = driver.manage().timeouts();
			
			
			driver.findElement(By.xpath("//*[@id='page-intro']/div[2]/div/div[2]/label[" + getNumber(3) + "]")).click(); //选颜色
			timeouts.implicitlyWait(3, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@id='page-intro']/div[3]/a")).click();
			timeouts.implicitlyWait(5, TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("//*[@id='page-basic']/div[2]/div[1]/div/label["+ getNumber(2) + "]/label")).click(); //性别
			timeouts.implicitlyWait(3, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@id='fieldFirstname']")).sendKeys(data.getFirstName()); //名
			timeouts.implicitlyWait(3, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@id='fieldLastname']")).sendKeys(data.getLastName()); //姓
			timeouts.implicitlyWait(3, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@id='fieldEmail']")).sendKeys(data.getEmail()); //邮箱
			timeouts.implicitlyWait(3, TimeUnit.SECONDS);
			
			
			Select fieldDay = new Select(driver.findElement(By.id("fieldDay"))); //生日
			Select fieldMonth = new Select(driver.findElement(By.id("fieldMonth")));
			Select fieldYear = new Select(driver.findElement(By.id("fieldYear")));
			
			fieldDay.selectByIndex(Integer.valueOf(data.getBirthDay()));
			Thread.sleep(3000);
			fieldMonth.selectByIndex(Integer.valueOf(data.getBirthMonth()));
			Thread.sleep(3000);
			fieldYear.selectByVisibleText(data.getBirthYear());
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//*[@id='fieldAgree1']/div/label/label/label")).click(); //同意选项
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='form-basic-button']")).click(); //下一步
			try {
				//再次点击下一步
				driver.findElement(By.xpath("//*[@id='form-basic-button']")).click(); //下一步
			} catch (Exception e) {}
			Thread.sleep(3000);
			
			webDriverWait.until(new ExpectedCondition<WebElement>() {
	            @Override
	            public WebElement apply(WebDriver d) {
	                return d.findElement(By.xpath("//*[@id='fieldAddress']"));
	            }
	        }).sendKeys(data.getAddress2()); 
			
			driver.findElement(By.xpath("//*[@id='fieldSuburb']")).sendKeys(data.getCity());
			Thread.sleep(3000);
			driver.findElement(By.id("fieldState")).sendKeys(data.getState());
			Thread.sleep(3000);
			
			driver.findElement(By.id("fieldPostcode")).sendKeys(data.getZipCode());
			Thread.sleep(3000);
			
			driver.findElement(By.id("fieldMobileNumber")).sendKeys(data.getPhone().substring(1));
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='page-address']/div[2]/div[7]/div/label/span")).click();
			Thread.sleep(3000);
			try {
				driver.findElementByXPath("//*[@id=\"page-address\"]/div[2]/div[9]/div/label/label").click();
			} catch (Exception e) {
				driver.findElementByXPath("//*[@id='page-address']/div[2]/div[8]/div/label/label/label").click();
			}
			Thread.sleep(3000);
			driver.findElementByXPath("//*[@id='page-address']/a").click();
			Thread.sleep(15000);
			
			if(b < 10) {
				logger.debug("0%-10%提交完毕！");
				return 1;
			}
			
			//开始问卷
			for(int i=0; i < 20; i++) {
			
				if(answer(driver, 1, getNumber(7)) == true) {
					if(b >= 10 & b < 15){
						logger.debug("10%-15%提交完毕！");
						return 1;
					}
					continue;
				} //1
				
				if(answer(driver, 2, getNumber(7)) == true) continue; //2
				
				try {
					driver.findElementByXPath("/html/body/main/div/div[1]/div[2]/div/div[4]/div[3]/div[3]/div/div/a["+ getNumber(2) + "]").click(); //3
					logger.debug("检测问题成功，问题是第3道题！");
					Thread.sleep(3000);
					if(b >= 15 & b < 20){
						logger.debug("15%-20%提交完毕！");
						return 1;
					}
					continue;
				} catch (Exception e) {}
				if(answer(driver, 4, getNumber(5)) == true) continue; //4
				if(answer(driver, 4, getNumber(2)) == true) continue; //4
				if(answer(driver, 5, 1) == true) {
					if(b >= 20 & b < 25){
						logger.debug("20%-25%提交完毕！");
						return 1;
					}
					continue;
				} //5  //此选项必须为1
				if(answer(driver, 6, getNumber(5)) == true) continue; //6  Do you have a cat or dog at home?
				if(answer(driver, 7, getNumber(23)) == true) continue; //7
				if(answer(driver, 8, getNumber(14)) == true) {
					if(b >= 25 & b < 30){
						logger.debug("25%-30%提交完毕！");
						return 1;
					}
					continue;
				} //8
				if(answer(driver, 9, getNumber(5)) == true) continue; //9
				if(answer(driver, 10, getNumber(2)) == true) continue; //10
				if(answer(driver, 11, getNumber(4)) == true) continue; //11
				if(answer(driver, 12, getNumber(2)) == true) continue; //12
				if(answer(driver, 13, getNumber(2)) == true) continue; //13 Do you own a car?
				if(answer(driver, 14, getNumber(7)) == true) continue; //14
				if(answer(driver, 15, getNumber(5)) == true) continue; //15 Do you gamble online?
				if(answer(driver, 16, getNumber(18)) == true) continue; //16
				if(answer(driver, 17, getNumber(9)) == true) continue; //17
				if(answer(driver, 18, 5) == true) {
					if(b >= 30 & b < 40){
						logger.debug("30%-40%提交完毕！");
						return 1;
					}
					continue;
				} //18
			}
			
			for(int j=0; j <= 15; j++) {
				end_answer(driver);
				Integer next = 5;
				while(true) {
					next = r.nextInt(11);
					if(next >= 5 && next <= 10) {
						break;
					}
				}
				Thread.sleep(Integer.valueOf(next.toString() + "000"));
				
				if(b >= 40 & b < 50 && j == 2){
					logger.debug("40%-50%提交完毕！");
					return 1;
				}
				
				if(b >= 50 & b < 60 && j == 4){
					logger.debug("50%-60%提交完毕！");
					return 1;
				}
				
				if(b >= 60 & b < 70 && j == 6){
					logger.debug("60%-70%提交完毕！");
					return 1;
				}
				continue;
			}
			
			logger.debug("完成问卷调查！点击next进行下一步！");
			driver.findElement(By.id("next")).click();//完成进度条
			 
			Thread.sleep(10000);
			//跳转新offer 做浏览操作
			scoll(driver);
			if(getNumber(2) == 1) {
				driver.findElement(By.xpath("/html/body/div[2]/div[1]/a")).click(); //skip
			} else {						
				driver.findElement(By.xpath("/html/body/center/div[2]/table[2]/tbody/tr[2]/td/table[1]/tbody/tr[2]/td/table/tbody/tr/td/p[1]/a")).click();//操作弹offer
			}
			return 1;
			
	   } catch(Exception e) {
		   e.printStackTrace();
		   return 3;
	   }
	}
	
	
	
	public static boolean answer(ChromeDriver driver,int question, int number)  {
		
		Random r = new Random();
		try {
			logger.debug("随机数为 {} " , number);
			try {
				driver.findElement(By.xpath("//*[@id='coregs']/div[" + question +"]/div/div/div/label[" + number +"]/input")).click();
			} catch (Exception e) {
			try {
				driver.findElement(By.xpath("//*[@id='coregs']/div[" + question +"]/div[1]/div/div/label["+ number +"]/input")).click();
			} catch (Exception e1) {
				driver.findElement(By.xpath("//*[@id='coregs']/div[" + question +"]/div/div/a[" + number + "]")).click();
			}}
			
			logger.debug("检测问题成功，问题是第 {} 道题！", question);
			try {												  
				WebElement noThanks = driver.findElement(By.xpath("//*[@id='coregs']/div[" + question + "]/div/div/a"));  //no thanks
				int bfb = r.nextInt(101);
				//检测
				if(bfb < 30) {
					noThanks.click();
					logger.debug("no thanks!");
				} else {
					driver.findElement(By.xpath("//*[@id='coregs']/div[" + question + "]/div/div/button")).click();
				}
			} catch (Exception e) {}
			
			
			Integer next = 5;
			while(true) {
				next = r.nextInt(11);
				if(next >= 5 && next <= 10) {
					break;
				}
			}
			Thread.sleep(Integer.valueOf(next.toString() + "000"));
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public static void end_answer(ChromeDriver driver) throws NumberFormatException, InterruptedException  {
		
		try {
			driver.findElement(By.xpath("//*[@id='panel17']/div/div/div/div/div/div/div/div[" + getNumber(2) + "]/button")).click();
			return;
		} catch (Exception e) { }
		
		try {
			driver.findElement(By.xpath("//*[@id='panel398']/div/div/div/div/div/div/div/div["+ getNumber(2) + "]/button")).click();
			return;
		} catch (Exception e) { }
		
		try {
			driver.findElement(By.xpath("//*[@id='panel399']/div/div/div/div/div/div/div/div["+ getNumber(2) + "]/button")).click();
			return;
		} catch (Exception e) { }
		
		try {
			driver.findElement(By.xpath("//*[@id='panel316']/div/div/div/div/div/div/div/div["+ getNumber(2) + "]")).click();
			return;
		} catch (Exception e) { }
		
		
		try {
			driver.findElement(By.xpath("//*[@id='panel347']/div/div/div/div/div/div/div/div["+ getNumber(2) + "]/button")).click();
			return;
		} catch (Exception e) { }
		
		try {
			driver.findElement(By.xpath("//*[@id=\"panel360\"]/div/div[2]/div/div/div/div/div/div[1]/button")).click();
			return;
		} catch (Exception e) { }
		
		try {
			driver.findElement(By.xpath("//*[@id=\"panel410\"]/div/div[2]/div/div/div/div/div/div["+ getNumber(2) + "]/button")).click(); //选项1弹offer
			return;
		} catch (Exception e) { }
		
		try {
			driver.findElement(By.xpath("//*[@id=\"panel411\"]/div/div[2]/div/div/div/div/div/div["+ getNumber(2) +"]/button")).click(); //选项1弹offer
			return;
		} catch (Exception e) { }
		
		try {
			driver.findElement(By.xpath("//*[@id=\"panel413\"]/div/div[2]/div/div/div/div/div/div["+ getNumber(2) + "]/button")).click(); //选项1弹offer
			return;
		} catch (Exception e) { }
		
		try {
			driver.findElement(By.xpath("//*[@id=\"panel428\"]/div/div[2]/div/div/div/div/div/div["+ getNumber(3) + "]/button")).click();
			return;
		} catch (Exception e) { }
		try {
			driver.findElement(By.xpath("//*[@id='panel432']/div/div/div/div/div/div[1]/div/div[" + getNumber(2) + "]/button")).click();
			return;
		} catch (Exception e) { }
		logger.error("现有题库未检测到当前问题！");
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
