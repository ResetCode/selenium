package com.selenum.handler;

import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;

import com.selenum.model.AuData;
import com.selenum.model.AuWish;

/**
 * 模板一
 *
 */
public class AuCj7Handler {

	public static int handle(AuData data, ChromeDriver driver, String offerUrl,AuWish wish1) throws InterruptedException {
		
		try{
			driver.get(offerUrl);
			driver.manage().deleteAllCookies();
			Thread.sleep(10000);
			
			try {
				String text = driver.findElementByXPath("//*[@id=\"main-message\"]/h1/span").getText();
				if(text.contains("This page isn’t working") || text.contains("This site can’t be reached")) {
					System.out.println("页面未打开，刷新当前页面！");
					driver.get(offerUrl);
					Thread.sleep(30000);
				}
			} catch (Exception e) {}

			//email					 
			driver.findElementByXPath("//*[@id=\"f_email\"]").sendKeys(data.getEmail());
			Thread.sleep(5000);
			
			try {
				//check phone sms          /html/body/div[2]/div/div[1]/div[2]/div/div/form[1]/fieldset/div[2]/div/label
				driver.findElementByXPath("/html/body/div[2]/div/div[1]/div[2]/div/div/form[1]/fieldset/div[2]/div/label").click();
				Thread.sleep(5000);
			} catch (Exception e) {}
			
			try {
				//check                    /html/body/div[2]/div/div[1]/div[2]/div/div/form[1]/fieldset/div[3]/div/label
				driver.findElementByXPath("/html/body/div[2]/div/div[1]/div[2]/div/div/form[1]/fieldset/div[3]/div/label").click();
				Thread.sleep(5000);
			} catch (Exception e) {}		
			
			//next
			driver.findElementByXPath("//*[@id=\"_sbtn_1\"]").click();
			Thread.sleep(50000);
			
			try {
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			//开始问卷
			answer(driver, wish1);
			//continue
			try {
				driver.findElementByXPath("/html/body/div[2]/div[2]/div/div[1]/div/div[4]/form/button").click();
			} catch (Exception e) {
				driver.findElementByXPath("/html/body/div[2]/div[2]/div/div[1]/div/div[4]/button").click();
			}
			Thread.sleep(10000);
			
			answer(driver, wish1);
			try {
				driver.findElementByXPath("/html/body/div[2]/div[2]/div/div[1]/div/div[4]/form/button").click();
			} catch (Exception e) {
				driver.findElementByXPath("/html/body/div[2]/div[2]/div/div[1]/div/div[4]/button").click();
			}
			Thread.sleep(10000);
			
			answer(driver, wish1);
			try {
				driver.findElementByXPath("/html/body/div[2]/div[2]/div/div[1]/div/div[4]/form/button").click();
			} catch (Exception e) {
				driver.findElementByXPath("/html/body/div[2]/div[2]/div/div[1]/div/div[4]/button").click();
			}
			Thread.sleep(10000);
			
			try {
				driver.findElementByXPath("/html/body/div[2]/div[2]/div/div[1]/div/div[4]/form/button").click();
			} catch (Exception e) {
				driver.findElementByXPath("/html/body/div[2]/div[2]/div/div[1]/div/div[4]/button").click();
			}
			
			return 1;
	   } catch(Exception e) {
		   e.printStackTrace();
		   Thread.sleep(120000);
		   return 3;
	   }
	}
	
	public static void answer(ChromeDriver driver, AuWish wish1) {
		
		for(int i=1; i < 25; i++) {
			Random random = new Random();
			int suiji = random.nextInt(100);
			
			String as = "Do you currently own a house or paying off a mortgage?";
			try {
				if(suiji <= 30) {
					answer(driver, 1311, 1);
				} else {
					answer(driver, 1311, 2);
				}
				System.out.println("yes - {} " +  as);
				Thread.sleep(10000);
				continue;
			} catch (Exception e) {System.out.println("no - {}" +  as);}
			
			as = "Want more data from your mobile plan?  Get 6GB + unlimited calls and text in Aus with Dodo for just $20/mth Powered by the Optus 4G Plus Network. 12mth min cost $240+$10P&H?";
			try {
				if(suiji <= 95) {
					answer(driver, 1862, 1);
				} else {
					answer(driver, 1862, 2); //百分之5接
				}
				System.out.println("yes - {} " +  as);
				Thread.sleep(10000);
				continue;
			} catch (Exception e) {System.out.println("no - {}" +  as);}
			
			as = "Love discount?";
			try {
				if(suiji <= 30) {
					answer(driver, 1329, 1);
				} else {
					answer(driver, 1329, 2); 
				}
				System.out.println("yes - {} " +  as);
				Thread.sleep(10000);
				continue;
			} catch (Exception e) {System.out.println("no - {}" +  as);}
			
			as = "Are you interested in being contacted by Platinum Selections about 4 weeks FREE horse racing tips from an ex-bookie? Click yes to learn more!";
			try {
				if(suiji <= 30) {
					answer(driver, 2005, 1);
				} else {
					answer(driver, 2005, 2); //百分之5接
				}
				System.out.println("yes - {} " +  as);
				Thread.sleep(10000);
				continue;
			} catch (Exception e) {System.out.println("no - {}" +  as);}
			
			as = "Do you want to win the new Samsung smartphone? Complete this quick survey for a chance to win.";
			try {
				answer(driver, 1819, 0);
				System.out.println("yes - {} " +  as);
				Thread.sleep(10000);
				continue;
			} catch (Exception e) {System.out.println("no - {}" +  as);}
			
			as = "Have you been trying to lose weight for ages? There's no time like now! With a tasty menu filled with your favourite foods, coupled with a personal Consultant, you’ll receive the support and guidance you need to reach your goals.";
			try {
				answer(driver, 1999, 0);
				System.out.println("yes - {} " +  as);
				Thread.sleep(10000);
				continue;
			} catch (Exception e) {System.out.println("no - {}" +  as);}
			
			as = "You will receive a reply from Miranda within 48 hours and she will help you to improve your life";
			try {
				answer(driver, 1996, 2);
				System.out.println("yes - {} " +  as);
				Thread.sleep(10000);
				continue;
			} catch (Exception e) {System.out.println("no - {}" +  as);}
			
			as = "Register now for a chance to win a gift card to spend at Starbucks";
			try {
				answer(driver, 2000, 2);
				System.out.println("yes - {} " +  as);
				Thread.sleep(10000);
				continue;
			} catch (Exception e) {System.out.println("no - {}" +  as);}
			
			as = "Magicdate will find your match. Play our popular meeting game and find matches! It’s easy to start a conversation.";
			try {
				answer(driver, 1885, 2);
				System.out.println("yes - {} " +  as);
				Thread.sleep(10000);
				continue;
			} catch (Exception e) {System.out.println("no - {}" +  as);}
			
			as = "Do you want to get paid by taking surveys online?";
			try {
				answer(driver, 1892, 2);
				System.out.println("yes - {} " +  as);
				Thread.sleep(10000);
				continue;
			} catch (Exception e) {System.out.println("no - {}" +  as);}
			
			as = "Receive FREE samples of Maltesers products!";
			try {
				answer(driver, 1353, 2);
				System.out.println("yes - {} " +  as);
				Thread.sleep(10000);
				continue;
			} catch (Exception e) {System.out.println("no - {}" +  as);}
			
			as = "Do you want to go to the Cinema for FREE for 1 year?";
			try {
				answer(driver, 1351, 2);
				System.out.println("yes - {} " +  as);
				Thread.sleep(10000);
				continue;
			} catch (Exception e) {System.out.println("no - {}" +  as);}
			
			as = "This is your chance to win a $500 voucher to spend at Gumtree!";
			try {
				answer(driver, 1403, 2);
				System.out.println("yes - {} " +  as);
				Thread.sleep(10000);
				continue;
			} catch (Exception e) {System.out.println("no - {}" +  as);}
			
			as = "Receive an offer reward worth $120 to spend at Coles!";
			try {
				answer(driver, 1984, 2);
				System.out.println("yes - {} " +  as);
				Thread.sleep(10000);
				continue;
			} catch (Exception e) {System.out.println("no - {}" +  as);}
			
			as = "Receive a special reward with a minimum value of $100!";
			try {
				answer(driver, 1985, 2);
				System.out.println("yes - {} " +  as);
				Thread.sleep(10000);
				continue;
			} catch (Exception e) {System.out.println("no - {}" +  as);}
			
			
			as = "填写资料！";
			try {
				driver.findElementByXPath("//*[@id=\"cor_1281_1\"]").sendKeys(wish1.getContent());; //wish
				wish1.setUseStatus("1");
				System.out.println("yes - {} " +  as);
				Thread.sleep(10000);
				continue;
			} catch (Exception e) {}
		}
	}
	
	public static boolean answer(ChromeDriver driver,int question, int number) throws Exception   {
		
		Random r = new Random();
		Integer next = 5;
		try {							    
			next = r.nextInt(11);        
			driver.findElement(By.xpath("//*[@id='" + question  + "']/div[2]/div/div[2]/div/div/div[" + number + "]/div/label")).click();
			System.out.println("检测问题成功，问题是第 " + question + " 道题！随机数  " +  number);
			Thread.sleep(Integer.valueOf(next.toString() + "000"));
			return true;
		} catch (Exception e) {}
		
		try {							    
			next = r.nextInt(11);
			driver.findElement(By.xpath("//*[@id='" + question  + "']/div[2]/div/div[2]/div/div/div/label")).click();
			System.out.println("检测问题成功，问题是第 " + question + " 道题！随机数  " +  number);
			Thread.sleep(Integer.valueOf(next.toString() + "000"));
			return true;
		} catch (Exception e) {
			throw e;
		}
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
