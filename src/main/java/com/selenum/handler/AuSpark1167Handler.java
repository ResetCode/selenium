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

import com.selenum.model.AuData;

public class AuSpark1167Handler {

	private static int s_question = 0;
	
	public static int handle(AuData data, ChromeDriver driver, String offerUrl, String jsPath) throws InterruptedException {
		Random r = new Random();
		int b = r.nextInt(101);
		
		WebDriverWait webDriverWait = new WebDriverWait(driver, 60);
		try{
			driver.get(offerUrl);
			driver.manage().deleteAllCookies();
			Thread.sleep(20000);
			
			
			driver.findElement(By.xpath("//*[@id='page-intro']/div[2]/div/div[2]/label[" + getNumber(3) + "]")).click(); //选颜色
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='page-intro']/div[3]/a")).click();
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//*[@id='page-basic']/div[2]/div[1]/div/label["+ getNumber(2) + "]/label")).click(); //性别
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='fieldFirstname']")).sendKeys(data.getFirstName()); //名
			Thread.sleep(3000); 
			driver.findElement(By.xpath("//*[@id='fieldLastname']")).sendKeys(data.getLastName()); //姓
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='fieldEmail']")).sendKeys(data.getEmail()); //邮箱
			Thread.sleep(3000);
			
			
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
	        }).sendKeys(data.getAddress()); 
			
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
			
			driver.findElementByXPath("//*[@id='page-address']/div[2]/div[8]/div/label/label/label").click();
			Thread.sleep(3000);
			driver.findElementByXPath("//*[@id='page-address']/a").click();
			Thread.sleep(15000);
			
			if(b < 10) {
				System.err.println("0%-10%提交完毕！");
				return 1;
			}
			//开始问卷
			for(int i=0; i < 20; i++) {
				if(answer(driver, 1, getNumber(7)) == true) {
					if(b >= 10 & b < 15){
						System.err.println("10%-15%提交完毕！");
						return 1;
					}
					continue;
				} //1
				if(answer(driver, 2, getNumber(7)) == true) continue; //2
				try {
					driver.findElementByXPath("/html/body/main/div/div[1]/div[2]/div/div[4]/div[3]/div[3]/div/div/a["+ getNumber(2) + "]").click(); //3
					System.err.println("检测问题成功，问题是第3道题！");
					Thread.sleep(3000);
					if(b >= 15 & b < 20){
						System.err.println("15%-20%提交完毕！");
						return 1;
					}
					continue;
				} catch (Exception e) {}
				if(answer(driver, 4, getNumber(5)) == true) continue; //4
				if(answer(driver, 4, getNumber(2)) == true) continue; //4
				if(answer2(driver, 5, 1) == true) {
					if(b >= 20 & b < 25){
						System.err.println("20%-25%提交完毕！");
						return 1;
					}
					continue;
				} //5  //此选项必须为1
				if(answer(driver, 6, getNumber(5)) == true) continue; //6  Do you have a cat or dog at home?
				if(answer(driver, 7, getNumber(23)) == true) continue; //7
				if(answer(driver, 8, getNumber(14)) == true) {
					if(b >= 25 & b < 30){
						System.err.println("25%-30%提交完毕！");
						return 1;
					}
					continue;
				} //8
				if(answer(driver, 9, getNumber(5)) == true) continue; //9
				if(answer2(driver, 10, getNumber(2)) == true) continue; //10
				if(answer(driver, 11, getNumber(4)) == true) continue; //11
				if(answer2(driver, 12, getNumber(2)) == true) continue; //12
				if(answer2(driver, 13, getNumber(2)) == true) continue; //13 Do you own a car?
				if(answer(driver, 14, getNumber(7)) == true) continue; //14
				if(answer(driver, 15, getNumber(5)) == true) continue; //15 Do you gamble online?
				if(answer(driver, 16, getNumber(18)) == true) continue; //16
				if(answer(driver, 17, getNumber(9)) == true) continue; //17
				if(answer(driver, 18, 5) == true) {
					if(b >= 30 & b < 40){
						System.err.println("30%-40%提交完毕！");
						return 1;
					}
					continue;
				} //18
			}
			
			for(int j=0; j <= 15; j++) {
				answer3(driver);
				if(b >= 40 & b < 50 && j == 2){
					System.err.println("40%-50%提交完毕！");
					return 1;
				}
				
				if(b >= 50 & b < 60 && j == 4){
					System.err.println("50%-60%提交完毕！");
					return 1;
				}
				
				if(b >= 60 & b < 70 && j == 6){
					System.err.println("60%-70%提交完毕！");
					return 1;
				}
				continue;
			}
			
			System.err.println("完成问卷调查！点击next进行下一步！");
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
		   Thread.sleep(60000);
		   e.printStackTrace();
		   return 3;
	   }finally {
//		   driver.quit();
	   }
	}
	
	public static void answer3(ChromeDriver driver) throws NumberFormatException, InterruptedException  {
		Random r = new Random();
		Integer next = 5;
		while(true) {
			next = r.nextInt(11);
			if(next >= 5 && next <= 10) {
				break;
			}
		}
		
		try {
			driver.findElement(By.xpath("//*[@id='panel17']/div/div/div/div/div/div/div/div[" + getNumber(2) + "]/button")).click();
		} catch (Exception e) { }
		
		try {
			driver.findElement(By.xpath("//*[@id='panel398']/div/div/div/div/div/div/div/div["+ getNumber(2) + "]/button")).click();
		} catch (Exception e) { }
		
		try {
			driver.findElement(By.xpath("//*[@id='panel399']/div/div/div/div/div/div/div/div["+ getNumber(2) + "]/button")).click();
		} catch (Exception e) { }
		
		try {
			driver.findElement(By.xpath("//*[@id='panel316']/div/div/div/div/div/div/div/div["+ getNumber(2) + "]")).click();
		} catch (Exception e) { }
		
		
		try {
			driver.findElement(By.xpath("//*[@id='panel347']/div/div/div/div/div/div/div/div["+ getNumber(2) + "]/button")).click();
		} catch (Exception e) { }
		
		try {
			driver.findElement(By.xpath("//*[@id=\"panel360\"]/div/div[2]/div/div/div/div/div/div[1]/button")).click();
		} catch (Exception e) { }
		
		try {
			driver.findElement(By.xpath("//*[@id=\"panel410\"]/div/div[2]/div/div/div/div/div/div["+ getNumber(2) + "]/button")).click(); //选项1弹offer
		} catch (Exception e) { }
		
		try {
			driver.findElement(By.xpath("//*[@id=\"panel411\"]/div/div[2]/div/div/div/div/div/div["+ getNumber(2) +"]/button")).click(); //选项1弹offer
		} catch (Exception e) { }
		
		try {
			driver.findElement(By.xpath("//*[@id=\"panel413\"]/div/div[2]/div/div/div/div/div/div["+ getNumber(2) + "]/button")).click(); //选项1弹offer
		} catch (Exception e) { }
		
		try {
			driver.findElement(By.xpath("//*[@id=\"panel428\"]/div/div[2]/div/div/div/div/div/div["+ getNumber(3) + "]/button")).click();
		} catch (Exception e) { }
		try {
			driver.findElement(By.xpath("//*[@id='panel432']/div/div/div/div/div/div[1]/div/div[" + getNumber(2) + "]/button")).click();
		} catch (Exception e) { }
		Thread.sleep(Integer.valueOf(next.toString() + "000"));
	}
	
	public static boolean answer2(ChromeDriver driver,int question, int number)  {
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
			System.err.println("随机数为：" + number);
			driver.findElement(By.xpath("//*[@id='coregs']/div[" + question + "]/div/div/a[" + number + "]")).click();
			System.out.println("检测问题成功，问题是第" + question + "道题！");
			Thread.sleep(Integer.valueOf(next.toString() + "000"));
			s_question = question;
			return true;
		} catch (Exception e) {
			return false;
		}
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
			number = doAnswerBefore(driver,question, number);
			System.err.println("随机数为：" + number);
			try {
				driver.findElement(By.xpath("//*[@id='coregs']/div[" + question +"]/div/div/div/label[" + number +"]/input")).click();
				
			} catch (Exception e) {
				driver.findElement(By.xpath("//*[@id='coregs']/div["+ question +"]/div[1]/div/div/label["+ number +"]/input")).click();
			}
			System.out.println("检测问题成功，问题是第" + question + "道题！");
			try {												   //*[@id="coregs"]/div[4]/div/div/a
				WebElement noThanks = driver.findElement(By.xpath("//*[@id='coregs']/div[" + question + "]/div/div/a"));  //no thanks
				Random random = new Random();
				int bfb = random.nextInt(101);
				//检测
				if(bfb < 30) {
					noThanks.click();
					System.err.println("no thanks!");
				} else {
												 //*[@id="coregs"]/div[4]/div/div/button
					driver.findElement(By.xpath("//*[@id='coregs']/div[" + question + "]/div/div/button")).click();
				}
			} catch (Exception e) {
			}
			s_question = question;
			Thread.sleep(Integer.valueOf(next.toString() + "000"));
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	//对问题进行特殊性选择处理
	private static int doAnswerBefore(ChromeDriver driver,int question, int number) { 
		return number;
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
