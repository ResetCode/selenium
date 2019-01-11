package com.selenum.handler;

import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.collect.Range;
import com.google.common.collect.RangeMap;
import com.google.common.collect.TreeRangeMap;
import com.selenum.model.AuData;

public class AuCj3Handler {

	public static int handle(AuData data, ChromeDriver driver, String offerUrl, String words) throws InterruptedException {
		
		try {
			driver.get(offerUrl);
			Thread.sleep(30000);
			
			try {
				driver.findElementByXPath("//*[@id=\"page1\"]/div[1]/div[1]/div[5]/button").click(); //let's do this right now
				Thread.sleep(3000);
				//How many times a week do you visit the supermarket?
				answer(driver, 1 , getNumber(2));
				//What do you typically spend a week on groceries?
				answer(driver, 2 , getNumber(2));
				//Have you ever had groceries delivered to your house?						   
				answer(driver, 3 , getNumber(2));
				Thread.sleep(10000); //回答完问题，等待跳转填写资料
			} catch (Exception e) {
				System.err.println("直接跳转填写资料！");
			}
		
			
			Integer sex = 1; 
			if(data.getName().equals("f")) {
				sex = 2;
			} 
			driver.findElementByXPath("//*[@id='input1']/div[1]/div/div[2]/div[2]/div/div[1]/div/label[" + sex + "]/label ").click();
			driver.findElementByXPath("//*[@id='first-name']").sendKeys(data.getFirstName());
			driver.findElementByXPath("//*[@id='last-name']").sendKeys(data.getLastName());
			driver.findElementByXPath("//*[@id='email']").sendKeys(data.getEmail());
			Select selectDay = new Select(driver.findElementByXPath("//*[@id=\"bdate-day\"]")); //birthday
			selectDay.selectByVisibleText(data.getBirthDay());
			Select selectMonth = new Select(driver.findElementByXPath("//*[@id=\"bdate-month\"]")); //不带0
			selectMonth.selectByValue(data.getBirthMonth());
			Select selectYear = new Select(driver.findElementByXPath("//*[@id=\"bdate-year\"]"));
			selectYear.selectByVisibleText(data.getBirthYear());
			Thread.sleep(20000);
			driver.findElementByXPath("//*[@id=\"input1\"]/div[1]/div/div[2]/div[2]/div/div[6]/div/button").click();
			driver.findElementByXPath("//*[@id=\"input1\"]/div[1]/div/div[2]/div[2]/div/div[6]/div/button").click();
			Thread.sleep(20000);
			
			
			
			driver.findElementByXPath("//*[@id=\"postcode\"]").sendKeys(data.getZipCode());
			Thread.sleep(2000);
			((JavascriptExecutor) driver).executeScript("document.getElementById('postcode').blur();");
			Thread.sleep(10000);
			((JavascriptExecutor) driver).executeScript("var city = document.getElementById('city');" + 
					"for(var i = 0; i < city.options.length; i++){" + 
					"    if(city.options[i].value == '" + data.getCity() + "') {" + 
					"       city.options[i].selected = true;" + 
					"       break;" + 
					"    }" + 
					"}");
			Thread.sleep(8000);
			
			WebDriverWait webDriverWait = new WebDriverWait(driver, 60);
			
			String ad = data.getAddress();
			Integer index = ad.indexOf(" ");
			String streetNumber = ad.substring(0, index);
			String street = ad.substring(index + 1, ad.length());
			
			driver.findElementById("street").sendKeys(street);
			Thread.sleep(10000);
			((JavascriptExecutor) driver).executeScript("document.getElementById('ui-id-2').getElementsByTagName('li')[0].click();");
			Thread.sleep(5000);
			((JavascriptExecutor) driver).executeScript("var city = document.getElementById('house-number');" + 
					"var randomNum = Math.random()*city.options.length;" + 
					"city.options[parseInt(randomNum,10)].selected = true;");
			
			Thread.sleep(5000);
			driver.findElementByXPath("//*[@id='phone']").clear();
			driver.findElementByXPath("//*[@id='phone']").sendKeys(data.getPhone());
			driver.findElementByXPath("//*[@id='phone']").sendKeys(data.getPhone());
			//What is your current housing situation?
			String[] aboutHouse = {"Own my own home","Paying off mortgage","Remortgaged","Renting"}; 
			Select aboutHouseSelect = new Select(driver.findElementByXPath("//*[@id=\"coreg-container\"]/div[1]/div/div/span/select"));
			Integer aboutHouseNumber = getNumberHas0(4);
			aboutHouseSelect.selectByVisibleText(aboutHouse[aboutHouseNumber]);
			Thread.sleep(3000);
			driver.findElementByXPath("//*[@id=\"coreg-container\"]/div[2]/label/div").click(); //确认复选框
			Thread.sleep(3000);
			driver.findElementByXPath("//*[@id=\"input2\"]/div[1]/div/div[2]/div[2]/div/div[5]/div/button").click();
			Thread.sleep(20000); //资料填写完毕，开始回答调查问卷
			
			
			//"Santa Claus was handing out presents to the children."
			// Who handed out presents?
			//*[@id="question-374"]/div/ul/li[2]/label/span
			webDriverWait.until(new ExpectedCondition<WebElement>() {
				@Override
				public WebElement apply(WebDriver driver) {
					return driver.findElement(By.xpath("//*[@id='question-374']/div/ul/li["+ 2 +"]/label"));
				}
			}).click();
			Thread.sleep(5000);
			
			
			//Do you wear hearing aids?
			Random random = new Random();
			Integer suiji = random.nextInt(100);
			if(suiji <= 30) {
				webDriverWait.until(new ExpectedCondition<WebElement>() {
					@Override
					public WebElement apply(WebDriver driver) {
						return driver.findElement(By.xpath("//*[@id=\"question-6519\"]/div/div[2]/button[1]"));
					}
				}).click();
				Thread.sleep(5000);
				webDriverWait.until(new ExpectedCondition<WebElement>() {
					@Override
					public WebElement apply(WebDriver driver) {
						return driver.findElement(By.xpath("//*[@id=\"question-6204\"]/div[2]/div[2]/button[2]"));
					}
				}).click();
				Thread.sleep(10000);
			} else {
				driver.findElementByXPath("//*[@id=\"question-6519\"]/div/div[2]/button[2]").click();
				Thread.sleep(10000);
				driver.findElementByXPath("//*[@id=\"question-6204\"]/div[2]/div[2]/button[1]").click();
				Thread.sleep(10000);
			}
			
			//Who is your current electricity supplier?
			Select electricitySelect = new Select(driver.findElementByXPath("//*[@id=\"question-437\"]/div/div[2]/select"));
			RangeMap<Integer, String> rangeMap = TreeRangeMap.create();
			rangeMap.put(Range.openClosed(0, 100), "Energy Australia"); //100
			rangeMap.put(Range.openClosed(100, 190), "Origin Energy"); //90
			rangeMap.put(Range.openClosed(190, 270), "AGL"); //80
			rangeMap.put(Range.openClosed(270, 340), "Alinta Energy"); //70
			rangeMap.put(Range.openClosed(340, 400), "Momentum Energy"); //60
			rangeMap.put(Range.openClosed(400, 450), "Powershop"); //50
			rangeMap.put(Range.openClosed(450, 490), "Red Energy"); //40
			rangeMap.put(Range.openClosed(490, 520), "Sumo Power"); //30
			rangeMap.put(Range.openClosed(520, 540), "Other"); //20
			electricitySelect.selectByVisibleText(rangeMap.get(random.nextInt(540)));
			Thread.sleep(10000);
			
			//We provide free legal services to Aboriginal communities and others in need across the Kimberley.
			driver.findElementByXPath("//*[@id=\"question-7083\"]/div[2]/div[3]/button[1]").click(); //yes
			Thread.sleep(10000);
			
			//Thank you, your support will help provide legal representation, respect for human rights and protection from discrimination. Select yes if you would like to donate
			suiji = random.nextInt(100);
			if(suiji <= 30) {
				driver.findElementByXPath("//*[@id=\"question-7085\"]/div[2]/div[2]/button[2]").click();
				Thread.sleep(10000);
			} else {
				driver.findElementByXPath("//*[@id=\"question-7085\"]/div[2]/div[2]/button[1]").click();
				Thread.sleep(10000);
			}
			
			//What is your current housing situation?
			aboutHouseSelect = new Select(driver.findElementByXPath("//*[@id=\"question-3560\"]/div/div[2]/select"));
			aboutHouseSelect.selectByVisibleText(aboutHouse[aboutHouseNumber]);
			Thread.sleep(10000);
			
			//Are you a member of Woolworths Rewards?
			driver.findElementByXPath("//*[@id=\"question-1811\"]/div/div[2]/button["+ getNumber(2)+ "]");
			Thread.sleep(10000);
			
			//JOIN Woolworths Rewards today to receive 1,700 Bonus Points to kick start your savings. Select ‘YES’ and we’ll send you the link to register via SMS & email.
			suiji = random.nextInt(100);
			if(suiji <= 30) {
				driver.findElementByXPath("//*[@id=\"question-1812\"]/div[2]/div[3]/button[2]");
				Thread.sleep(10000);
			} else {
				//*[@id="question-1812"]/div[2]/div[3]/button[1]
				driver.findElementByXPath("//*[@id=\"question-1812\"]/div[2]/div[3]/button[1]");
				Thread.sleep(10000);
			}
			
			//Join Kogan and get big discounts on electronics, appliances, homewares, fashion & more!
			suiji = random.nextInt(100);
			if(suiji <= 30) {
				driver.findElementByXPath("//*[@id=\"question-308\"]/div[2]/div[2]/button[2]");
				Thread.sleep(10000);
			} else {
				driver.findElementByXPath("//*[@id=\"question-308\"]/div[2]/div[2]/button[1]");
				Thread.sleep(10000);
			}
			
			//Do you love discounts?
			suiji = random.nextInt(100);
			if(suiji <= 10) {
				driver.findElementByXPath("//*[@id=\"question-1503\"]/div/div[2]/button[2]");
				Thread.sleep(10000);
			} else {
				driver.findElementByXPath("//*[@id=\"question-1503\"]/div/div[2]/button[1]");
				Thread.sleep(10000);
			}
			
			//Would you like to join FreeLotto.com and start playing for your chance to win over $11,000,000.00 Tonight for FREE?
			suiji = random.nextInt(100);
			if(suiji <= 30) {
				driver.findElementByXPath("//*[@id=\"question-2620\"]/div[2]/div[2]/button[2]");
				Thread.sleep(10000);
			} else {
				driver.findElementByXPath("//*[@id=\"question-2620\"]/div[2]/div[2]/button[1]");
				Thread.sleep(10000);
			}
			
			//Complete the survey by telling us why you should WIN in 25 words or less.
			suiji = random.nextInt(100);
			if(suiji < 50) {
				driver.findElementByXPath("//*[@id=\"question-387\"]/div/textarea").sendKeys(words);
				Thread.sleep(10000);
				driver.findElementByXPath("//*[@id=\"question-387\"]/div/button[1]");
				Thread.sleep(10000);
			} else {
				driver.findElementByXPath("//*[@id=\"question-387\"]/div/button[2]");
				Thread.sleep(10000);
			}
			
			//Aussies who haven't reviewed their Private Health Insurance in 5 years could be paying $800 more per year, for the same cover.
			suiji = random.nextInt(100);
			if(suiji < 30) {
				driver.findElementByXPath("//*[@id=\"question-4631\"]/div[2]/div[3]/button[2]");
				Thread.sleep(10000);
			} else {
				driver.findElementByXPath("//*[@id=\"question-4631\"]/div[2]/div[3]/button[1]"); //yes 弹offer
				Thread.sleep(10000);
			}
			
			//Do you feel you pay too much for Health Insurance?
			suiji = random.nextInt(100);
			if(suiji < 30) {
				driver.findElementByXPath("//*[@id=\"question-5232\"]/div[2]/div[2]/button[2]");
				Thread.sleep(10000);
			} else {
				driver.findElementByXPath("//*[@id=\"question-5232\"]/div[2]/div[2]/button[1]"); //yes 弹offer
				Thread.sleep(10000);
			}
			
			WebDriver sdriver = otherDriver(driver, 1);
			scoll(sdriver);
			otherDriver(driver, 0);
			Thread.sleep(10000);
			
			//Let Health Deal contact you to save your money on your health cover Plus, go into the draw to Win 6 Months Free Health Cover!
			suiji = random.nextInt(100);
			if(suiji < 30) {
				driver.findElementByXPath("//*[@id=\"question-5235\"]/div[2]/div[3]/button[2]"); //yes 弹offer
				Thread.sleep(10000);
			} else {
				driver.findElementByXPath("//*[@id=\"question-5235\"]/div[2]/div[3]/button[1]");
				Thread.sleep(10000);
			}
			Thread.sleep(20000); //问卷调查结束，等待跳转页面
			
			//点击跳转去抽奖
			suiji = random.nextInt(100);
			if(suiji < 10) {
				driver.findElementByXPath("/html/body/div/section[2]/div/div[1]/div/div[2]/a").click();
			} else if(suiji >= 10 && suiji <= 90) {
				driver.findElementByXPath("/html/body/div/section[2]/div/div[2]/div/div[2]/a").click();
				Thread.sleep(10000);
				driver.findElementByXPath("//*[@id=\"modal01\"]/div/div/button").click();//弹框
				Thread.sleep(5000);
				
				sdriver = otherDriver(driver, 1);
				Thread.sleep(5000);
				
				Integer clickNumber = getNumberHas0(12);
				sdriver.findElement(By.xpath("//*[@id='"+ clickNumber + "']/img")).click();
				Thread.sleep(5000);
				sdriver.findElement(By.xpath("//*[@id=\"update\"]")).click();
				Thread.sleep(5000);
				
				Integer clickNumber2 = getNumber(12, clickNumber);
				sdriver.findElement(By.xpath("//*[@id='"+ clickNumber2 + "']/img")).click();
				Thread.sleep(5000);
				sdriver.findElement(By.xpath("//*[@id=\"update\"]")).click();
				Thread.sleep(5000);
				
				Integer clickNumber3 = getNumber(12, clickNumber, clickNumber2);
				sdriver.findElement(By.xpath("//*[@id='"+ clickNumber3 + "']/img")).click();
				Thread.sleep(5000);
				sdriver.findElement(By.xpath("//*[@id=\"update\"]")).click();
				Thread.sleep(5000);
				
			} else {
				driver.findElementByXPath("/html/body/div/section[2]/div/div[3]/div/div[2]/a").click();
			}
		} catch (Exception e) {
			e.printStackTrace();
			Thread.sleep(60000);
			return 3;
		} finally {
//			driver.quit();
		}
		return 1;
		
	}
	
	public static boolean answer(ChromeDriver driver,int question, int number) throws NumberFormatException, InterruptedException  {
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
									   //*[@id="page1"]/div[2]/div[1]/div/div[2]/div/div[2]/div[3]/a[1]
			driver.findElementByXPath("//*[@id='page1']/div[2]/div[1]/div/div[2]/div/div[2]/div["+ question + "]/a["+ number + "]").click();
			Thread.sleep(Integer.valueOf(next.toString() + "000"));
			return true;
		} catch (Exception e) {}
		
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
	public static int getNumberHas0(Integer n) {
		Random random = new Random();
		int nextInt = random.nextInt(n);
		return nextInt;
	}
	
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
	
	public static int getNumber(Integer n, Integer...nots) {
		Random random = new Random();
		int nextInt = random.nextInt(n);
		
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
}
