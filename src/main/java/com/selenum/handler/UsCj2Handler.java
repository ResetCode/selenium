package com.selenum.handler;

import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.selenum.model.UsData;

public class UsCj2Handler {

	private static int s_question = 0;
	
	public static int handle(ChromeDriver driver, UsData data, String offerUrl) throws InterruptedException {
		s_question = 0;
		try {
			Random r = new Random();
			//TODO 比例
			int step = r.nextInt(101);
			System.err.println("步骤随机数为:" + step);
			
//			//检测ip
			WebDriverWait webDriverWait = new WebDriverWait(driver, 60);
			
			driver.get(offerUrl);
			driver.navigate().to(driver.getCurrentUrl());
			Thread.sleep(5000);
			driver.manage().deleteAllCookies();
			
			Thread.sleep(60000);
			WebElement modal = webDriverWait.until(new ExpectedCondition<WebElement>() {
	            @Override
	            public WebElement apply(WebDriver d) {
	                return d.findElement(By.xpath("//*[@id=\"reward\"]"));
	            }
	        });
			modal.click(); //弹框确认
			
			//----------------------------------------------------------------
			
			webDriverWait.until(new ExpectedCondition<WebElement>() {
	            @Override
	            public WebElement apply(WebDriver d) {
	                return d.findElement(By.xpath("//*[@id=\"em\"]"));
	            }
	        }).sendKeys(data.getEmail()); //输入邮箱
			driver.findElement(By.xpath("//*[@id=\"rcsbt\"]")).click();
			Thread.sleep(2000);
			
			//----------------------------------------------------------------
			
			//等待页面跳转
			Thread.sleep(20000);
			//----------------------------------------------------------------
			WebElement firstName = webDriverWait.until(new ExpectedCondition<WebElement>() {
	            @Override
	            public WebElement apply(WebDriver d) {
	                return d.findElement(By.xpath("//*[@id=\"fn\"]"));
	            }
	        }); //输入邮箱
			
			if(!"".equals(firstName.getText())) {
				return 2; //检测废料
			}
			firstName.sendKeys(data.getFirstName());
			driver.findElement(By.xpath("//*[@id=\"ln\"]")).sendKeys(data.getLastName());
			driver.findElement(By.xpath("//*[@id=\"zp\"]")).sendKeys(data.getZipCode());
			
			webDriverWait.until(new ExpectedCondition<WebElement>() {
	            @Override
	            public WebElement apply(WebDriver d) {
	                return d.findElement(By.id("subbtn"));
	            }
	        }).click(); 
			
			Thread.sleep(5000);
			//----------------------------------------------------------------
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"ad\"]")).sendKeys(data.getStreetAddress());
			driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys(data.getCity());
			
			WebElement selectElement = driver.findElement(By.xpath("//*[@id=\"state-wrapper\"]/select"));
			Select state_code = new Select(selectElement);
			state_code.selectByValue(data.getStateCode());
			
			String[] phones = data.getPrimaryPhone().split("-");
			driver.findElement(By.xpath("//*[@id=\"CELLAREA\"]")).sendKeys(phones[0]);
			driver.findElement(By.xpath("//*[@id=\"cell2\"]")).sendKeys(phones[1]);
			driver.findElement(By.xpath("//*[@id=\"cell3\"]")).sendKeys(phones[2]);
			driver.findElement(By.id("subbtn")).click();
			Thread.sleep(5000);
			//----------------------------------------------------------------
			Thread.sleep(5000);
			selectElement = driver.findElement(By.xpath("//*[@id=\"dobmonth\"]"));
			Select dobmonth = new Select(selectElement);
			String month = data.getBirthMonth();
			if(Integer.valueOf(month) < 10) {
				month = "0" + month;
			}
			dobmonth.selectByValue(month);

			selectElement = driver.findElement(By.xpath("//*[@id=\"dobday\"]"));
			Select dobday = new Select(selectElement);
			String day = data.getBirthDay();
			if(Integer.valueOf(day) < 10) {
				day = "0" + day;
			}
			dobday.selectByValue(day);
			
			selectElement = driver.findElement(By.xpath("//*[@id=\"DOBYEAR\"]"));
			Select dobyear = new Select(selectElement);
			dobyear.selectByValue(data.getBirthYear());
			driver.findElement(By.xpath("//*[@id=\"chkboxn\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"subbtn\"]")).click();
			Thread.sleep(5000);
			if(step <= 10) {
				System.err.println("10%占比自动化offer完成！");
				return 1;
			}
			//----------------------------------------------------------------
			//等待页面跳转
			Thread.sleep(15000);
			for(int i = 0; i <= 90; i ++ ) {
				
					if(answer(driver, 1, getNumber(4)) == true) continue; 
					if(answer(driver, 2, getNumber(10))  == true) continue ; 
					if(answer(driver, 3, getNumber(2))  == true) continue ; 
					if(answer(driver, 4, getNumber(2))  == true) continue ; 
					if(answer(driver, 5, getNumber(4))  == true) continue ; 
					
					if(answer(driver, 6, getNumber(4))  == true) continue ; 
					
					if(answer(driver, 7, getNumber(4))  == true) continue ; 
					
					if(answer(driver, 8, getNumber(4))  == true) continue ; 
					
					if(answer(driver, 9, getNumber(3))  == true) continue ; 
					
					if(answer(driver, 10, getNumber(12))  == true) continue ; 
					
					if(answer(driver, 11, getNumber(3))  == true) continue ; 
					
					if(answer(driver, 12, getNumber(12))  == true) continue ; 
					
					if(answer(driver, 13, getNumber(16))  == true) continue ; 
					
					if(answer(driver, 14, getNumber(16))  == true) continue ; 
					
					if(answer(driver, 15, getNumber(16))  == true) continue ; 
					
					if(answer(driver, 16, getNumber(16))  == true) continue ; 
					
					if(answer(driver, 17, getNumber(16))  == true) continue ; 
					
					if(answer(driver, 18, getNumber(5))  == true) continue ; 
					
					if(answer(driver, 19, getNumber(4))  == true) continue ;
					
					if(answer(driver, 20, getNumber(3))  == true) continue ;
					
					if(answer(driver, 21, getNumber(6))  == true) continue ;
					
					if(answer(driver, 22, getNumber(6))  == true) continue ;
					
					if(answer(driver, 23, getNumber(6))  == true) continue ;
					
					if(answer(driver, 24, getNumber(6))  == true) continue ;
					
					if(answer(driver, 25, getNumber(5))  == true) continue ;
					
					if(answer(driver, 26, getNumber(3))  == true) continue ;
					
					if(answer(driver, 27, getNumber(2))  == true) continue ;
					
					if(answer(driver, 28, getNumber(4))  == true) continue ;
					
					if(answer(driver, 29, getNumber(2))  == true) continue ;
					
					if(answer(driver, 30, getNumber(4))  == true) continue ;
					
					if(answer(driver, 31, getNumber(4))  == true) continue ;
					
					if(answer(driver, 32, getNumber(20))  == true) continue ;
					
					if(answer(driver, 33, getNumber(4))  == true) continue ;
					
					if(answer(driver, 34, getNumber(20))  == true) continue ;
					
					if(answer(driver, 35, getNumber(4))  == true) continue ;
					
					if(answer(driver, 36, getNumber(6))  == true) continue ;
					
					if(answer(driver, 37, getNumber(29))  == true) continue ;
					
					if(answer(driver, 38, getNumber(30))  == true) continue ;
					
					if(answer(driver, 39, getNumber(29))  == true) continue ;
					
					if(answer(driver, 40, getNumber(30))  == true) continue ;
					
					if(answer(driver, 41, getNumber(3))  == true) continue ;
					
					if(answer(driver, 42, getNumber(6))  == true) continue ;
					
					if(answer(driver, 43, getNumber(4))  == true) continue ;
					
					if(answer(driver, 44, getNumber(7))  == true) continue ;
					
					if(answer(driver, 45, getNumber(4))  == true) continue ;
					
					if(answer(driver, 46, getNumber(6))  == true) continue ;
					if(answer(driver, 47, getNumber(2))  == true) continue ;
					if(answer(driver, 48, getNumber(3))  == true) continue ;
					if(answer(driver, 49, getNumber(3))  == true) continue ;
					if(answer(driver, 50, getNumber(4))  == true) continue ;
					if(answer(driver, 51, getNumber(3))  == true) continue ;
					if(answer(driver, 52, getNumber(3))  == true) continue ;
					if(answer(driver, 53, getNumber(5))  == true) continue ;
					if(answer(driver, 54, getNumber(4))  == true) continue ;
					if(answer(driver, 55, getNumber(2))  == true) continue ;
					if(answer(driver, 56, getNumber(7))  == true) {
						Thread.sleep(2000);
						
						continue ;
					}
					//? 这里好像有一个提交按钮 yes 、no 、submit
					if(answer(driver, 57, getNumber(8))  == true) continue ;
					if(answer(driver, 58, getNumber(2))  == true) continue ;
					if(answer(driver, 59, getNumber(11))  == true) continue ;
					if(answer(driver, 60, getNumber(2))  == true) continue ;
					if(answer(driver, 61, getNumber(3))  == true) continue ;
					if(answer(driver, 62, getNumber(3))  == true) continue ;
					if(answer(driver, 63, getNumber(4))  == true) continue ;
					if(answer(driver, 64, getNumber(7))  == true) continue ;
					if(answer(driver, 65, getNumber(2))  == true) continue ;
					if(answer(driver, 66, getNumber(3))  == true) continue ;
					if(answer(driver, 67, getNumber(3))  == true) continue ;
					if(answer(driver, 68, getNumber(6))  == true)  {
						Thread.sleep(2000);
						
						continue ;
					}
					//? 这里好像有一个提交按钮 yes 、no 、submit
					if(answer(driver, 69, getNumber(4))  == true) continue ;
					if(answer(driver, 70, getNumber(5))  == true) continue ;
					if(answer(driver, 71, getNumber(4))  == true) continue ;
					if(answer(driver, 72, getNumber(3))  == true) continue ;
					if(answer(driver, 73, getNumber(3))  == true) continue ;
					if(answer(driver, 74, getNumber(3))  == true) continue ;
					if(answer(driver, 75, getNumber(3))  == true) continue ;
					if(answer(driver, 76, getNumber(3))  == true) continue ;
					if(answer(driver, 77, getNumber(2))  == true) continue ;
					if(answer(driver, 78, getNumber(4))  == true) continue ;
					if(answer(driver, 79, getNumber(2))  == true) continue ;
					if(answer(driver, 80, getNumber(7))  == true)  {
						Thread.sleep(2000);
						continue ;
					}
					//? 这里好像有一个提交按钮 yes 、no 、submit
					if(answer(driver, 81, getNumber(2))  == true) continue ;
					if(answer(driver, 82, getNumber(6))  == true)  {
						Thread.sleep(2000);
						continue ;
					}
					//? 这里好像有一个提交按钮 yes 、no 、submit
					if(answer(driver, 83, getNumber(2))  == true) continue ;
					if(answer(driver, 84, getNumber(5))  == true) {
						Thread.sleep(2000);
						continue ;
					}
					//? 这里好像有一个提交按钮 yes 、no 、submit
					if(answer(driver, 85, getNumber(2))  == true) continue ;
					if(answer(driver, 86, getNumber(3))  == true) continue ;
					if(answer(driver, 87, getNumber(3))  == true) continue ;
					if(answer(driver, 88, getNumber(2))  == true) continue ;
					if(answer(driver, 89, getNumber(5))  == true) continue ;
					if(answer(driver, 90, getNumber(10))  == true)  {
						Thread.sleep(2000);
						continue ;
					}
					//? 这里好像有一个提交按钮 yes 、no 、submit
					if(answer(driver, 91, getNumber(2))  == true) continue ;
					if(answer(driver, 92, getNumber(5))  == true) {
						Thread.sleep(2000);
						continue ;
					}
					if(answer(driver, 93, getNumber(3))  == true) continue ;
			}
			
			System.err.println("完成问卷调查！");
			Thread.sleep(9000);
			if(step > 10 && step <= 20) {
				System.err.println("10%占比自动化offer完成！");
				return 1;
			}
			//确认资料
			driver.findElement(By.xpath("//*[@id=\"cb\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"tcpaSubBtn\"]")).click();
			Thread.sleep(15000); //跳转后面的问卷调查
			if(step > 20 && step <= 30) {
				System.err.println("10%占比自动化offer完成！");
				return 1;
			}
			
			driver.findElement(By.xpath("//*[@id=\"cMainWrap\"]/div[2]/div[1]")).click();
			//弹框offer 
			 //等待
			Thread.sleep(15000);
			
			driver.findElement(By.xpath("//*[@id=\"dcontbtn\"]")).click(); //点击确认可进行浏览
			scoll(driver); 
			Thread.sleep(10000);
			//弹框offer
			System.err.println("70%占比自动化offer完成！");
		} catch(Exception e){
			e.printStackTrace();
			Thread.sleep(3000);
			return 3;
		}finally {
//			driver.quit();
		}
		
		return 1;
		
	}
	
	public static int getNumber(Integer n) {
		Random random = new Random();
		int nextInt = random.nextInt(n + 1);
		if(nextInt == 0) {
			return getNumber(n);
		}
		return nextInt;
	}
	
	public static int getNumber(Integer n, Integer...nots) {
		Random random = new Random();
		int nextInt = random.nextInt(n + 1);
		if(nextInt == 0) {
			return getNumber(n, nots);
		}
		
		boolean notVerify = false;
		for(Integer not : nots) {
			if(nextInt == not) {
				notVerify = false;
				break;
			}
			notVerify = true;
		}
		
		if(notVerify == true) {
			return nextInt;
		}
		return getNumber(n, nots);
	}
	
	public static boolean answer(ChromeDriver driver,int question, int number)  {
		if(question <= s_question) {
			return false;
		}
		Random r = new Random();
		Integer next = 5;
		while(true) {
			next = r.nextInt(11);
			if(next >= 5 && next <= 10) {
				break;
			}
		}
		
		
		try {
			WebElement element = driver.findElement(By.id("Qnum" + number));
			int reusult = element.findElements(By.tagName("div")).size();
			
//			driver.findElement(By.xpath("//*[@id='Qnum" + question + "']/table/tbody/tr/td/div[" + number +"]/label")).click();
			try {
				driver.findElement(By.xpath("//*[@id='Qnum" + question + "']/table/tbody/tr/td/div[" + getNumber(reusult) +"]/label")).click();
			} catch (Exception e) {
				driver.findElement(By.xpath("//*[@id='Qnum" + question + "']/table/tbody/tr/td/div[" + getNumber(2) +"]/label")).click();
			}
			try {
				driver.findElement(By.xpath("//*[@id=\"btnSubmitQid32401\"]")).click();
			} catch (Exception e) { }
			try {
				driver.findElement(By.xpath("//*[@id=\"btnSubmitQid49319\"]")).click();
			} catch (Exception e) { }
			try {
				driver.findElement(By.xpath("//*[@id=\"btnSubmitQid52869\"]")).click();
			} catch (Exception e) { }
			try {
				driver.findElement(By.xpath("//*[@id=\"btnSubmitQid53109\"]")).click();
				
			} catch (Exception e) { }
			try {
				driver.findElement(By.xpath("//*[@id=\"btnSubmitQid55769\"]")).click();
				
			} catch (Exception e) { }
			try {
				driver.findElement(By.xpath("//*[@id=\"btnSubmitQid57669\"]")).click();
				
			} catch (Exception e) { }
			try {
				driver.findElement(By.xpath("//*[@id=\"btnSubmitQid61379\"]")).click();
			} catch (Exception e) { }
			
			System.err.println("检测问题成功，问题是第" + question + "道题！");
			s_question = question;
			Thread.sleep(Integer.valueOf(next.toString() + "000"));
			return true;
		} catch (Exception e) {
			System.out.println("检测问题成功，问题不是第" + question + "道题！");
			return false;
		}
	}

	
	//对问题进行特殊性选择处理
	
	public static WebDriver otherDriver(WebDriver driver, int index) {
		Set<String> handles = driver.getWindowHandles();
		TargetLocator to = driver.switchTo();
		Object[] objects = handles.toArray();
		WebDriver sdriver = to.window(objects[index].toString());
		return sdriver;
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
	
}
