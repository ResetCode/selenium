package com.selenum.handler;

import java.util.Random;
import java.util.Set;

import org.mockito.asm.util.CheckAnnotationAdapter;
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
import com.selenum.model.AuWish;

/**
 * 模板一
 *
 */
public class AuCj1_2Handler {

	public static int handle(AuData data, ChromeDriver driver, String offerUrl,AuWish wish0) throws InterruptedException {
		Random r = new Random();
		int b = r.nextInt(101);
		
		WebDriverWait webDriverWait = new WebDriverWait(driver, 60);
		try{
			driver.get(offerUrl);
			driver.manage().deleteAllCookies();
			
			String code = driver.findElementByXPath("//*[@id=\"page-question\"]/div/div[1]/span").getText();
			driver.findElementByXPath("//*[@id=\"voucher-sent\"]").click();
			Thread.sleep(5000);
			
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id='page-basic']/div/div/div[2]/div/div[2]/div[1]/div/label["+ getNumber(2) + "]/label")).click(); //性别
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
			driver.findElement(By.xpath("//*[@id='fieldAgree1']/div/label")).click(); //同意选项
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='form-basic-button']")).click(); //下一步
			try {
				//再次点击下一步
				driver.findElement(By.xpath("//*[@id='form-basic-button']")).click(); //下一步
			} catch (Exception e) {}
			Thread.sleep(3000);
			
			try {
				webDriverWait.until(new ExpectedCondition<WebElement>() {
		            @Override
		            public WebElement apply(WebDriver d) {
		                return d.findElement(By.xpath("//*[@id='fieldAddress']"));
		            }
		        }).sendKeys(data.getAddress2()); 
			} catch (Exception e) {
				return 6;
			}
			
			
			driver.findElement(By.xpath("//*[@id='fieldSuburb']")).sendKeys(data.getCity());
			Thread.sleep(3000);
			driver.findElement(By.id("fieldState")).sendKeys(data.getState());
			Thread.sleep(3000);
			
			driver.findElement(By.id("fieldPostcode")).sendKeys(data.getZipCode());
			Thread.sleep(3000);
			
			driver.findElement(By.id("fieldMobileNumber")).sendKeys(data.getPhone().substring(1));
			Thread.sleep(3000);
											   
			for(int i = 1; i <= 12; i++) {
				try {						   
					driver.findElementByXPath("//*[@id=\"page-address\"]/div/div/div[2]/div/div[2]/div["+ i + "]/div/label").click(); //循环检查复选框
				} catch (Exception e4) {}
			}
			
			Thread.sleep(10000);
			driver.findElementByXPath("//*[@id='page-address']/div/div/div[2]/div/a").click();
			Thread.sleep(15000);
			
			try {
				String check = driver.findElementByXPath("//*[@id='coregs']/div[1]/p").getText();
				if("".equals(check.trim())) {
					return 5;
				}
			} catch (Exception e) {}
			if(b < 10) {
				System.out.println("0%-10%提交完毕！");
				return 1;
			}
			
			String question1 = "Want access to the BEST DEALS on worldwide cruises & travel? Simply select where in the world you would like to travel and Cruise Megastore will call you back with an unbelievable offer! Plus receive a FREE $100 cruise voucher.".trim();
			String question2 = "Get more of what you love in 2019 with Foxtel. Save $40* a month for 12mths on Platinum HD with no iQ4 set up costs. Click yes to receive a call, SMS & email.".trim();
			String question3 = "Would you consider supporting any of the following organisations?".trim();
			String question4 = "What is your annual income?".trim();
			String question5 = "Select any of the following organisations you would consider supporting".trim();
			String question6 = "Love big discounts?".trim();
			String question7 = "Tick YES to get your daily horoscope.".trim();
			String question8 = "Do you have a cat or dog at home?".trim();
			String question9 = "Please select your current retailer;".trim();
			String question10 = "Who is your current Broadband provider?".trim();
			String question11 = "Which of these Insurance Products do you already have?".trim();
			String question12 = "Are you interested in meeting new people via online dating?".trim();
			String question13 = "What time would work best for you to receive a call?".trim();
			String question14 = "Are you interested in solar energy?".trim();
			String question15 = "Do you own a car?".trim();
			String question16 = "When did you last buy a lottery ticket?".trim();
			String question17 = "Do you gamble online?".trim();
			String question18 = "Do you have an eligible life or income protection policy with any of the following:".trim();
			String question19 = "Choose the category you're most interested in to sign up to our newsletter and you will automatically enter for a chance to win the upcoming iPhone 7 when it’s released!".trim();
			String question20 = "What is the outcome of the following calculation: 2 + 3 = ?".trim();
			String question21 = "Complete the survey by telling us why you should win in 25 words or less:".trim();
			String question22 = "Do you have Superannuation and have had an INJURY in the last 2 years that is NOT HEALING?".trim();
			String question23 = "Only Foxtel brings you the best choice of live sport, blockbuster movies, new shows and complete series. Tick to get a call, SMS & Email.".trim();
			String question24 = "Choose the category you're most interested in to sign up to our newsletter and you will automatically enter for a chance to win the upcoming iPhone 7 when it’s released!".trim();
			String question25 = "Are you looking for the best care for your child? Speak to a Goodstart professional to find out why more Australians choose a Goodstart early education for their children.";
			String question26 = "Have you shopped at Woolworths Online in the last 3 months?";
			String question27 = "It makes great odds even better, every day. Click BET NOW if you would like to receive this offer via SMS and email.";
			//开始问卷
			for(int i=1; i < 25; i++) {
				
				String question = "";
				try {
					question = driver.findElementByXPath("//*[@id='coregs']/div[" + i + "]/p").getText().trim();
					System.out.println(question);
				} catch (Exception e) {
					System.err.println("调查问卷结束！");
					break;
				}
				
				Integer optionsNumber = 0;
				if(question.contains(question1)) {
					optionsNumber = 4;
				}
				if(question.contains(question2)) {
					optionsNumber = getNumber(2);
				}
				if(question.contains(question3)) {
					optionsNumber = getNumber(7);
				}
				if(question.contains(question4)) {
					optionsNumber = getNumber(7);
				}
				if(question.contains(question5)) {
					optionsNumber = getNumber(6);
				}
				if(question.contains(question6)) {
					optionsNumber = getNumber(2);
				}
				if(question.contains(question7)) {
					optionsNumber = getNumber(2);
				}
				if(question.contains(question8)) {
					optionsNumber = getNumber(5);
				}
				if(question.contains(question9)) {
					optionsNumber = getNumber(23);
				}
				if(question.contains(question10)) {
					optionsNumber = getNumber(14);
				}
				if(question.contains(question11)) {
					optionsNumber = getNumber(5);
				}
				if(question.contains(question12)) {
					optionsNumber = getNumber(2);
				}
				if(question.contains(question13)) {
					optionsNumber = 4;
				}
				if(question.contains(question14)) {
					optionsNumber = getNumber(2);
				}
				if(question.contains(question15)) {
					optionsNumber = getNumber(2);
				}
				if(question.contains(question16)) {
					optionsNumber = getNumber(7);
				}
				if(question.contains(question17)) {
					optionsNumber = getNumber(5);
				}
				if(question.contains(question18)) {
					optionsNumber = getNumber(18);
				}
				if(question.contains(question19)) {
					optionsNumber = getNumber(9);
				}
				if(question.contains(question20)) {
					optionsNumber = 5;
				}
				if(question.contains(question21)) {
					
					Integer wishNumber = getNumber(2);
					if(wishNumber == 1) {
						driver.findElementByXPath("//*[@id=\"skill-question-send\"]").click();
					} else {
						driver.findElementByXPath("//*[@id=\"skill_question\"]").sendKeys(wish0.getContent());
						wish0.setUseStatus("1");
						Thread.sleep(3000);
						driver.findElementByXPath("//*[@id=\"coregs\"]/div[21]/div/a[1]").click();
						Thread.sleep(5000);
					}
				}
				if(question.contains(question22)) {
					optionsNumber = getNumber(6);
				}
				if(question.contains(question23)) {
					optionsNumber = getNumber(2);
				}
				if(question.contains(question24)) {
					optionsNumber = getNumber(2);
				}
				if(question.contains(question25)) {
					optionsNumber = getNumber(4);
				}
				if(question.contains(question26)) {
					optionsNumber = getNumber(2);
				}
				if(question.contains(question27)) {
					optionsNumber = getNumber(2);
				}
				
				if(answer(driver, i, optionsNumber) == true) {
					Thread.sleep(5000);
					if(i== 3 && b >= 10 && b < 15){
						System.out.println("10%-15%提交完毕！");
						return 1;
					}
					if(i== 10 && b >= 25 && b < 30){
						System.out.println("25%-30%提交完毕！");
						return 1;
					}
					if(i== 13 && b >= 30 && b < 40){
						System.out.println("30%-40%提交完毕！");
						return 1;
					}
					if(i== 20 && b >= 40 && b < 60){
						System.out.println("40%-60%提交完毕！");
						return 1;
					}
					continue;
				}
				try {
					driver.findElementByXPath("/html/body/main/div/div[1]/div[2]/div/div[4]/div[3]/div[3]/div/div/a["+ getNumber(2) + "]").click(); //3
					System.out.println("检测问题成功，问题是第3道题！");
					Thread.sleep(3000);
					if(b >= 15 & b < 20){
						System.out.println("15%-20%提交完毕！");
						return 1;
					}
					continue;
				} catch (Exception e) {}
			}
			
			for(int j=0; j <= 15; j++) {
				end_answer(driver,data);
				Integer next = 5;
				while(true) {
					next = r.nextInt(11);
					if(next >= 5 && next <= 10) {
						break;
					}
				}
				Thread.sleep(Integer.valueOf(next.toString() + "000"));
				
				if(b >= 40 & b < 50 && j == 2){
					System.out.println("40%-50%提交完毕！");
					return 1;
				}
				
				if(b >= 50 & b < 60 && j == 4){
					System.out.println("50%-60%提交完毕！");
					return 1;
				}
				
				if(b >= 60 & b < 70 && j == 6){
					System.out.println("60%-70%提交完毕！");
					return 1;
				}
				continue;
			}
			
			System.out.println("完成问卷调查！点击next进行下一步！");
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
		   Thread.sleep(6000);
		   return 3;
	   }
	}
	
	
	
	public static boolean answer(ChromeDriver driver,int question, int number) throws NumberFormatException, InterruptedException  {
		
		Random r = new Random();
		Integer next = 5;
		try {							    
			next = r.nextInt(11);		               //*[@id="coregs"]/div[1]/div/div/div/label[1]/span
			driver.findElement(By.xpath("//*[@id='coregs']/div[" + question +"]/div/div/div/label[" + number +"]/input")).click();
			System.out.println("检测问题成功，问题是第 " + question + " 道题！随机数  " +  number);
			check(driver, question, number);
			return true;
		} catch (Exception e) {}
		
		try {
			driver.findElement(By.xpath("//*[@id='coregs']/div[" + question +"]/div[1]/div/div/label["+ number +"]/input")).click();
			System.out.println("检测问题成功，问题是第 " + question + " 道题！随机数  " +  number);
			check(driver, question, number);
			return true;
		} catch (Exception e1) {}
		
		try {
			driver.findElement(By.xpath("//*[@id='coregs']/div[" + question +"]/div[1]/div/div/label["+ number +"]/span")).click();
			System.out.println("检测问题成功，问题是第 " + question + " 道题！随机数  " +  number);
			check(driver, question, number);
			return true;
		} catch (Exception e2) {}
		try {							               //*[@id="coregs"]/div[2]/div[1]/div/a[1]  
			driver.findElement(By.xpath("//*[@id='coregs']/div["+ question + "]/div[1]/div/a[" + number + "]")).click();
			System.out.println("检测问题成功，问题是第 " + question + " 道题！随机数  " +  number);
			check(driver, question, number);
			return true;
		} catch (Exception e3) {}
		
		try {
			driver.findElement(By.xpath("//*[@id='coregs']/div[" + question +"]/div/div/a[" + number + "]")).click();
			System.out.println("检测问题成功，问题是第 " + question + " 道题！随机数  " +  number);
			check(driver, question, number);
			return true;
		} catch (Exception e) {}
		Thread.sleep(Integer.valueOf(next.toString() + "000"));
		System.out.println("不是第" + question + "道题，随机数为 " + number);
		return false;
	}
	
	public static void check(ChromeDriver driver, Integer question, Integer number) {
		Random r = new Random();
		try {												  
			WebElement noThanks = driver.findElement(By.xpath("//*[@id='coregs']/div[" + question + "]/div/div/a"));  //no thanks
			int bfb = r.nextInt(101);
			//检测
			if(bfb < 30) {
				noThanks.click();
				System.out.println("no thanks!");
			} else {
				driver.findElement(By.xpath("//*[@id='coregs']/div[" + question + "]/div/div/button")).click();
				System.out.println("continue!");
			}
		} catch (Exception e) {}
	}
	
	public static void end_answer(ChromeDriver driver, AuData data) throws NumberFormatException, InterruptedException  {
		try {
			driver.findElement(By.xpath("//*[@id='panel17']/div/div/div/div/div/div/div/div[" + getNumber(2) + "]/button")).click();
			return;
		} catch (Exception e) { }
		
		try {
			driver.findElement(By.xpath("//*[@id='panel130']/div/div/div/div/div/div/div/div["+ getNumber(2) + "]/button")).click();
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
			driver.findElement(By.xpath("//*[@id='panel316']/div/div/div/div/div/div/div/div["+ getNumber(2) + "]/button")).click();
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
		try {
			driver.findElement(By.xpath("//*[@id='panel448']/div/div/div/div/div/div[1]/div/div[" + getNumber(2) + "]/button")).click();
			return;
		} catch (Exception e) { }
		try {
			//*[@id="mid_continue_pyvrossy7d"]  use
			//*[@id="mid_pyvrossy7d"]/div/div[2]/button  no thanks
			//*[@id="mid_phone_pyvrossy7d"] sendKey
			Random r = new Random();
			int next = r.nextInt(100);
			if(next <= 33) {
				driver.findElementByXPath("//*[@id=\"mid_continue_pyvrossy7d\"]").click();
				return;
			} else if(next > 33 && next <= 66) {
				driver.findElementByXPath("//*[@id=\"mid_pyvrossy7d\"]/div/div[2]/button").click();
				return;
			} else {
				driver.findElementByXPath("//*[@id=\"mid_phone_pyvrossy7d\"]").sendKeys(data.getPhone().substring(1));
				return;
			}
		} catch (Exception e) {}
		System.out.println("现有题库未检测到当前问题！");
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
