package com.selenum.handler;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.selenum.model.UsData;
import com.selenum.test.UsCjDemo;

public class UsSpark6063Handler extends UsCjDemo {

	public static int handle(ChromeDriver driver, UsData data, String jsPath, String offerUrl) throws InterruptedException {

		Random r = new Random();
		//TODO 比例
		int step = r.nextInt(100);
		System.err.println("步骤随机数为:" + step);

		WebDriverWait webDriverWait = new WebDriverWait(driver, 60);
		try {
			
			try {
				driver.get(offerUrl);
				scoll(driver);
			} catch (Exception e) {
				return -1;
			}

			String dataMail = data.getEmail();
			String dataFirstName = data.getFirstName();
			String dataLastName = data.getLastName();
//			String dataStateCode = data.getStateCode();
			String dataCity = data.getCity();
			String dataStreetAddress = data.getStreetAddress();
			String dataPrimaryPhone = data.getPrimaryPhone();
			String dataZipCode = data.getZipCode();
			String bYear = data.getBirthYear();
			String bMonth = data.getBirthMonth();
			String bDay = data.getBirthYear();
			
			driver.manage().window().maximize();
			WebElement startBtn = webDriverWait.until(new ExpectedCondition<WebElement>() {
				@Override
				public WebElement apply(WebDriver d) {
					return d.findElements(By.className("van-button--normal")).get(0);
				}
			});

			System.err.println("offer自动化开始，已打开抽奖页面！");
			startBtn.click();

			WebElement email = driver.findElement(By.className("van-field__control"));
			email.sendKeys(dataMail);
			WebElement btnContinue = driver.findElement(By.className("btnContinue"));
			btnContinue.click();

			System.err.println("Email填充完毕！");
			

			webDriverWait.until(new ExpectedCondition<WebElement>() {
				@Override
				public WebElement apply(WebDriver d) {
					return d.findElement(By.xpath("//input[@placeholder='First Name']"));
				}
			});

			WebElement firstName = driver.findElementByXPath("//input[@placeholder='First Name']");
			if(!"".equals(firstName.getText())) {
				return 2; //检测废料
			}
			firstName.sendKeys(dataFirstName);
		
			WebElement LastName = driver.findElementByXPath("//input[@placeholder='Last Name']");
			LastName.sendKeys(dataLastName);
			
			WebElement PrimaryPhone = driver.findElementByXPath("//input[@placeholder='Primary Phone']");
			PrimaryPhone.sendKeys(dataPrimaryPhone);

			WebElement StreetAddress = driver.findElementByXPath("//input[@placeholder='Street Address']");
			StreetAddress.sendKeys(dataStreetAddress);

			try {
				//TODO 6067
				WebElement City = driver.findElementByXPath("//input[@placeholder='City']");
				City.sendKeys(dataCity);
				
			} catch (Exception e) {
				//TODO 6069、6063、6065
				System.err.println("没有城市资料选项！");
			}

			WebElement ZipCode = driver.findElementByXPath("//input[@placeholder='Zip Code']");
			ZipCode.sendKeys(dataZipCode);

			// Integer man = 0;
			// Integer woman = 1;
			// WebElement sex =
			// driver.findElementsByClassName("custom_radio-inner").get(man);
//			WebElement sex = driver.findElementsByClassName("custom_radio-inner").get(dataSex);
			
			try {
				//TODO 6067
				WebElement search = driver.findElementByXPath("//input[@type='search']");
				search.sendKeys(data.getState());
				search.sendKeys(Keys.RETURN);
			} catch (Exception e) {
				//TODO 6069、6063、6065
				System.err.println("没有州选项！");
			}

			driver.findElement(By.className("custom_btn-inner-default")).click();
			JavascriptExecutor js = ((JavascriptExecutor) driver);
			String jsCode = getText(jsPath).replace("$s1", bYear).replace("$s2", bMonth).replace("$s3", bDay);
			js.executeScript(jsCode);

			Thread.sleep(2000);
			String jsCode2 = "return window.T.action()";
			js.executeScript(jsCode2);
			try {
				//TODO 6067
				driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div[2]/div[1]/div[2]/div/div[1]/div[2]")).click();// comfirm
			} catch (Exception e) {
				//TODO 6069、6063、6065
				driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div[2]/div[2]/div[2]/div/div[1]/div[2]")).click();// comfirm
				System.err.println("comfirm 重新定位！");
			}

			Thread.sleep(2000);
			driver.findElement(By.className("submit")).click();
			System.err.println("资料填充完毕，已提交！");
			
			WebElement survey = webDriverWait.until(new ExpectedCondition<WebElement>() {
				@Override
				public WebElement apply(WebDriver d) {
					return d.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div[2]/div/div/div/div/button[1]"));
				}
			});
			survey.click();
			
			System.err.println("问卷调查开始！");
			System.out.println("问题1");
			answer(driver, getNumber(12));

			System.out.println("问题2");
			answer(driver, getNumber(2));

			System.out.println("问题3");
			answer(driver, getNumber(4));

			System.out.println("问题4");
			answer(driver, getNumber(2));

			System.out.println("问题5");
			try {
				answer(driver, getNumber(6));
			} catch (Exception e) {
				answer(driver, getNumber(4));
			}

			System.out.println("问题6");
			answer(driver, getNumber(4));

			System.out.println("问题7");
			answer(driver, getNumber(3));

			System.out.println("问题8");
			answer(driver, getNumber(2));

			System.out.println("问题9");
			answer(driver, getNumber(3));

			System.out.println("问题10");
			answer(driver, getNumber(2));

			System.out.println("问题11");
			try {
				answer(driver, getNumber(5));
			} catch (Exception e) {
				answer(driver, getNumber(2));
			}

			System.out.println("问题12");
			try {
				answer(driver, getNumber(5));
			} catch (Exception e) {
				answer(driver, getNumber(2));
			}

			System.out.println("问题13");
			answer(driver, getNumber(2));

			System.out.println("问题14");
			answer(driver, getNumber(2));

			System.out.println("问题15");
			answer(driver, getNumber(2));

			System.out.println("问题16");
			answer(driver, getNumber(2));

			System.out.println("问题17");
			try {
				answer(driver, getNumber(2));
			} catch (Exception e) {
				System.err.println("不存在第17个问题！");
			}

			System.out.println("问题18");
			try {
				answer(driver, getNumber(2));
			} catch (Exception e) {
				System.err.println("不存在第18个问题！");
			}

			System.out.println("问题19");
			try {
				answer(driver, getNumber(2));
			} catch (Exception e) {
				System.err.println("不存在第19个问题！");
			}
			System.err.println("问卷调查结束,开始确认资料！");
			
			webDriverWait.until(new ExpectedCondition<WebElement>() {
				@Override
				public WebElement apply(WebDriver d) {
					return d.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div[2]/div[2]/div/div[1]/div/div"));
				}
			}).click();
			driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div[2]/div[3]/div")).click();
			System.err.println("资料确认完毕！");
			if(step <= 5) {
				System.err.println("5%占比自动化offer完成！");
				return 1;
			}
			
			
			//最后是两个问题， 问题1 四个选项，1、2、3跳转offer，4跳转第二个问题
			//              问题2 四个选项 ，1、2、3跳转offer，4跳转offer列表，offer列表选择两个打开，之后可以跳转抽奖
			
			//百分十 点击第一个问题的 1、2、3选项
			if(step > 5 && step <=15) {
				int number = getNumber(3);
				answer2(driver, number); //第一次点击
				
				WebDriver sdriver = otherDriver(driver, 0);
				
				if(number == 1) {
					WebDriverWait sWebDriverWait = new WebDriverWait(sdriver, 30);
					sWebDriverWait.until(new ExpectedCondition<WebElement>() {

						@Override
						public WebElement apply(WebDriver input) {
							return input.findElement(By.xpath("//*[@id=\"registration\"]/button"));
						}
						
					}).click();
				} else if(number == 2 || number == 3){
					scoll(sdriver);
					Random random = new Random();
					Actions action = new Actions(sdriver);
					int x = random.nextInt(800);
					int y = random.nextInt(800);
					System.out.println("移动到：("+ x + "," + y + ")");
					action.moveByOffset(x, y);
					action.click().perform();;
					x = random.nextInt(800);
					y = random.nextInt(800);
					System.out.println("移动到：("+ x + "," + y + ")");
					action.moveByOffset(x, y);
					action.click().perform();;
				}
				System.err.println("10%占比自动化offer完成！");
				return 1;
			}
			
			// 百分之八十五点击第一个问题的 4选项
			answer2(driver, 4);
			System.err.println("问题2");
			answer2(driver, 4);
			
			// 3 offer列表
			webDriverWait.until(new ExpectedCondition<WebElement>() {
				@Override
				public WebElement apply(WebDriver d) {
					return d.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div[3]/div[2]/button[2]"));
				}
			}).click(); // offer列表弹窗

			scoll(driver);
			int offerNumber = offerClick(driver, getNumber(14)); // 点击一个offer

			WebDriver sdriver = otherDriver(driver, 1);
			scoll(sdriver);
			otherDriver(driver, 0);
			
			offerClick(driver, (offerNumber - 1) > 0 ? (offerNumber - 1) : (offerNumber + 1)); // 再点击一个offer
			sdriver = otherDriver(driver, 2);
			scoll(sdriver);
			otherDriver(driver, 0);
			
			jsCode = "document.getElementsByClassName('btn')[0].click();";
			js.executeScript(jsCode);// 跳抽奖

			webDriverWait.until(new ExpectedCondition<WebElement>() {
				@Override
				public WebElement apply(WebDriver d) {
					return d.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div[2]/div[2]/div/div[3]/div"));
				}
			}).click(); // 点击抽奖
				
			Thread.sleep(10000);
			System.out.println("自动化offer完成！");
			return 1;
		} catch (Exception e){
			e.printStackTrace();
			Thread.sleep(30000);
			return 3;
		} 
		finally {
			Thread.sleep(10000);
//			driver.quit();
		}
		
	}
}
