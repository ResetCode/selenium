package com.selenum.handler;

import java.util.Map;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.collect.Maps;
import com.selenum.model.AuData;

/**
 * 模板二-1：心愿
 */
public class AuCj2Handler {

//	private static int s_question = 0;
	
	public static int handle(AuData data, ChromeDriver driver, String offerUrl, String wish) throws InterruptedException {
		
		try {
			driver.get(offerUrl);
			Thread.sleep(30000);
			
			try {
				driver.findElement(By.xpath("//*[@id=\"fname\"]"));
			} catch (Exception e) {
				driver.navigate().to(driver.getCurrentUrl());
			}
			
			try {
				driver.findElement(By.xpath("//*[@id=\"fname\"]")).sendKeys(wish); //wish
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"question0\"]/div[2]/div")).click(); //enter now
				Thread.sleep(10000);
				
				driver.findElement(By.xpath("//*[@id=\"c_pic_"+ getNumber(4) +"_text\"]/input")); //q1
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"prize_picker\"]/div[3]/div[2]/div[4]/button")).click();
				Thread.sleep(3000);
			} catch (Exception e) {
				System.err.println("跳过心愿单！");
			}
			
			if(data.getName().equals("f")) {//sex
				JavascriptExecutor js = ((JavascriptExecutor) driver);
				String jsCode = "document.getElementById('gender_f').click();";
				js.executeScript(jsCode);
			} else {
				JavascriptExecutor js = ((JavascriptExecutor) driver);
				String jsCode = "document.getElementById('gender_m').click();";
				js.executeScript(jsCode);
			}
			Thread.sleep(3000);
			driver.findElementByXPath("//*[@id=\"firstname\"]").sendKeys(data.getFirstName()); //firstName
			Thread.sleep(3000);
			driver.findElementByXPath("//*[@id=\"lastname\"]").sendKeys(data.getLastName()); //lastName
			Thread.sleep(3000);
			driver.findElementByXPath("//*[@id=\"email\"]").sendKeys(data.getEmail());//email
			
			
			Select selectDay = new Select(driver.findElementByXPath("//*[@id=\"dob\"]")); //birthday
			String day = data.getBirthDay();
			if(Integer.valueOf(day) < 10) {
				day = "0" + day;
			}
			selectDay.selectByVisibleText(day);
			Select selectMonth = new Select(driver.findElementByXPath("//*[@id=\"mob\"]"));
			String month = data.getBirthMonth();
			
			String[] months = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
			Map<String, String> monthMap = Maps.newHashMap();
			for(int a=0; a < months.length; a++) {
				monthMap.put(new Integer(a+1).toString(), months[a]);
			}
			selectMonth.selectByVisibleText(monthMap.get(month));
			Select selectYear = new Select(driver.findElementByXPath("//*[@id=\"yob\"]"));
			selectYear.selectByVisibleText(data.getBirthYear());
			Thread.sleep(3000);
			driver.findElementByXPath("//*[@id=\"submitBtn\"]").click(); //continue
			Thread.sleep(6000);
			
			driver.findElementByXPath("//*[@id=\"phone\"]").sendKeys("0" + data.getPhone());
			Thread.sleep(3000);
			driver.findElementByXPath("//*[@id=\"number_and_street\"]").sendKeys(data.getAddress2());
			Thread.sleep(3000);
			driver.findElementByXPath("//*[@id=\"postcode\"]").sendKeys(data.getZipCode());
			Thread.sleep(3000);
			driver.findElementByXPath("//*[@id=\"address_field\"]").sendKeys(data.getCity());
			Thread.sleep(3000);
			try {
				driver.findElementByXPath("//*[@id=\"coreg_1006_yes\"]").click(); //yes
			} catch (Exception e) {
				try {
					driver.findElementByXPath("//*[@id=\"coreg_1163_yes\"]").click(); //yes
				} catch (Exception e2) {
					driver.findElementByXPath("//*[@id=\"coreg_1209_yes\"]").click(); //yes
				}
			}
			Thread.sleep(3000);
			driver.findElementByXPath("//*[@id=\"submitBtn\"]").click();
			Thread.sleep(6000);
			
			//问卷开始
			for(int i = 0; i < 40; i++) {
				if(answer(driver, 90, getNumberHas0(2))) continue;;
				if(answer(driver, 526, getNumberHas0(2))) continue;
				if(answer(driver, 563, getNumberHas0(4))) continue;
				if(answer(driver, 686, getNumberHas0(5))) continue;
				if(answer(driver, 696, getNumberHas0(4))) continue;
				if(answer(driver, 764, getNumberHas0(2))) continue;
				if(answer(driver, 796, getNumberHas0(5))) continue;
				if(answer(driver, 846, getNumberHas0(4))) continue;
				if(answer(driver, 814, getNumberHas0(2))) continue;
				if(answer(driver, 862, getNumberHas0(2))) continue;
				if(answer(driver, 909, getNumberHas0(2))) continue;
				if(answer(driver, 915, getNumberHas0(2))) continue;
				if(answer(driver, 997, getNumberHas0(2))) continue;
				if(answer(driver, 1005, getNumberHas0(3))) continue;
				if(answer(driver, 1045, getNumberHas0(2))) continue;
				if(answer(driver, 1046, getNumberHas0(2))) continue;
				if(answer(driver, 1049, getNumberHas0(5))) continue;
				if(answer(driver, 1066, getNumberHas0(2))) continue;
				if(answer(driver, 1083, getNumberHas0(2))) continue;
				if(answer(driver, 1083, getNumberHas0(4))) continue;
				if(answer(driver, 1088, getNumberHas0(2))) continue;
				if(answer(driver, 1125, getNumberHas0(2))) continue;
				if(answer(driver, 1127, getNumberHas0(3))) continue;
				if(answer(driver, 1131, getNumberHas0(2))) continue;
				if(answer(driver, 1139, getNumberHas0(2))) continue;
				if(answer(driver, 1181, getNumberHas0(2))) continue;
				if(answer(driver, 1187, getNumberHas0(2))) continue;
				if(answer(driver, 1191, getNumberHas0(2))) continue;
				if(answer(driver, 1196, getNumberHas0(2))) continue;
				if(answer(driver, 1207, getNumberHas0(2))) continue;
				if(answer(driver, 1213, getNumber(11))) {
					driver.findElementByXPath("//*[@id=\"submit_survey_multi_1213\"]").click();
					continue;
				};
				if(	answer(driver, 1219, getNumberHas0(2))) continue;
				if(	answer(driver, 1223, getNumberHas0(2))) continue;
				if(	answer(driver, 1230, getNumberHas0(2))) continue;
				if(	answer(driver, 1242, getNumberHas0(2))) continue;
				if(	answer(driver, 1243, getNumberHas0(2))) continue;
				if(	answer(driver, 1244, getNumberHas0(2))) continue;
				if(	answer(driver, 1245, getNumberHas0(2))) continue;
				if(answer(driver, 1246, getNumberHas0(2))) continue;
				if(answer(driver, 1247, getNumberHas0(2))) continue;
				if(answer(driver, 1250, getNumberHas0(2))) continue;
				if(	answer(driver, 1256, getNumberHas0(2))) continue;
				if(	answer(driver, 1268, getNumberHas0(2))) continue;
				if(answer(driver, 1270, getNumberHas0(2))) continue;
				if(answer(driver, 1271, getNumberHas0(2))) continue;
				if(	answer(driver, 1272, getNumberHas0(2))) continue;
				int number = getNumberHas0(2);
				if(	answer(driver, 1279, number)) {
					String[] types = {"Combined","Hospital","Extras"};
					String[] funds = {"Not Sure","Others","Not Insured"};
					String[] stages = {"Single","Couple","Family","Single Parent"};

					new Select(driver.findElementByXPath("//*[@id=\"complex_answer_1279_1\"]")).selectByVisibleText(types[getNumberHas0(3)]);
					Thread.sleep(3000);
					new Select(driver.findElementByXPath("//*[@id=\"complex_answer_1279_2\"]")).selectByVisibleText(funds[getNumberHas0(3)]);
					Thread.sleep(3000);
					new Select(driver.findElementByXPath("//*[@id=\"complex_answer_1279_3\"]")).selectByVisibleText(stages[getNumberHas0(4)]);
					Thread.sleep(3000);
					driver.findElement(By.xpath("//*[@id=\"submit_complex_1279\"]")).click();
					Thread.sleep(6000);
					continue;
				} 
				if(answer(driver, 1279, getNumberHas0(2))) continue;
				if(answer(driver, 1288, getNumberHas0(2))) continue;
				if(answer(driver, 1289, getNumberHas0(2))) continue;
			}
			
			driver.findElementByXPath("//*[@id=\"coreg_1005no0\"]/u").click();
			Thread.sleep(6000);
			driver.findElementByXPath("//*[@id=\"coreg_done_continue\"]/div").click();
			Thread.sleep(6000);
			driver.findElementByXPath("/html/body/div[4]/div[3]/div[3]/div[1]/button[2]").click();
			Thread.sleep(5000);
			
		} catch (Exception e) {
			e.printStackTrace();
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
			driver.findElement(By.xpath("//*[@id='coreg_"+ question + "_yes_"+ number + "']")).click();
			System.err.println("题为："+ question + "随机数为：" + number);
			Thread.sleep(Integer.valueOf(next.toString() + "000"));
			return true;
		} catch (Exception e) {}
		
		try {
			driver.findElement(By.xpath("//*[@id='coreg_"+ question + "_no_"+ number + "']")).click();
			System.err.println("题为："+ question + "随机数为：" + number);
			Thread.sleep(Integer.valueOf(next.toString() + "000"));
			return true;
		} catch (Exception e) {}
		
		try {
			driver.findElement(By.xpath("//*[@id='coreg_"+ question + "_yes']")).click();
			System.err.println("题为："+ question + "随机数为：" + number);
			Thread.sleep(Integer.valueOf(next.toString() + "000"));
			return true;
		} catch (Exception e2) { }
		
		try {
			driver.findElement(By.xpath("//*[@id='coreg_"+ question + "_no_pre_"+ number + "']")).click();
			System.err.println("题为："+ question + "随机数为：" + number);
			Thread.sleep(Integer.valueOf(next.toString() + "000"));
			return true;
		} catch (Exception e) {}
		try {
			driver.findElement(By.xpath("//*[@id='coreg_"+ question + "_yes_pre_"+ number + "']")).click();
			System.err.println("题为："+ question + "随机数为：" + number);
			Thread.sleep(Integer.valueOf(next.toString() + "000"));
			return true;
		} catch (Exception e3) {}
		try {
			driver.findElement(By.xpath("//*[@id='coreg_"+ question + "no"+ number + "']")).click();
			System.err.println("题为："+ question + "随机数为：" + number);
			Thread.sleep(Integer.valueOf(next.toString() + "000"));
			return true;
		} catch (Exception e) {
		}
		try {
			driver.findElementByXPath("//*[@id='coreg-inner-"+ question +"']/div[2]/div/label[" + number + "]").click();
			System.err.println("题为："+ question + "随机数为：" + number);
			Thread.sleep(3000);
			driver.findElementByXPath("//*[@id='submit_survey_multi_"+ question +"']");
			Thread.sleep(Integer.valueOf(next.toString() + "000"));
			return true;
		} catch (Exception e4) { }
		
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
	
}
