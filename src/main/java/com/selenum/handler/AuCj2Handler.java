package com.selenum.handler;

import java.util.Map;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.collect.Maps;
import com.selenum.model.AuData;
import com.selenum.model.AuWish;

public class AuCj2Handler {

	public static int handle(AuData data, ChromeDriver driver, String offerUrl, AuWish wish0) throws InterruptedException {
		
		try {
			driver.get(offerUrl);
			Thread.sleep(30000);
			int number0 = 0;
			try {
				
				driver.findElementByXPath("//*[@id=\"question0\"]/div[2]/div").click();
				Thread.sleep(3000);
				try {
					number0 = getNumber(4) + 1;
					driver.findElementByXPath("//*[@id=\"question1\"]/div[" + number0 + "]/div").click();
					Thread.sleep(3000);
				} catch (Exception e) {
					number0 = getNumber(2) + 1;
					driver.findElementByXPath("//*[@id=\"question1\"]/div[" + number0 + "]/div").click();
					Thread.sleep(3000);
				}
				
				number0 = getNumber(2) + 1;
				driver.findElementByXPath("//*[@id=\"question2\"]/div[" + number0 + "]/div").click();
				Thread.sleep(3000);
				
				try {
					number0 = getNumber(3) + 1;
					driver.findElementByXPath("//*[@id=\"question3\"]/div[" + number0 + "]/div").click();
					Thread.sleep(20000);
				} catch (Exception e) {
					System.out.println("跳过prelander第3道题！");
					Thread.sleep(20000);
				}
				try {
					driver.findElementByXPath("//*[@id=\"checking_result\"]/div[2]/div").click();
					Thread.sleep(20000);
				} catch (Exception e) {
					driver.findElementByXPath("//*[@id=\"question4\"]/div[2]/div").click();
					Thread.sleep(20000);
				}
				
				try {						    
//					driver.findElementByXPath("//*[@id=\"c_pic_" + getNumber(4) +"_text\"]/span").click();
//					Thread.sleep(3000);
					driver.findElementByXPath("//*[@id=\"prize_picker\"]/div[3]/div[2]/div[4]/button").click();
					Thread.sleep(20000);
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println("跳过prelander选择颜色步骤！");
				}
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("跳过prelander类型1问答！");
			}
			
			try {						     
				driver.findElementByXPath("//*[@id=\"question_1\"]/button["+ getNumber(4) +"]").click();
				Thread.sleep(5000);
				driver.findElementByXPath("//*[@id=\"question_2\"]/button["+ getNumber(4) +"]").click();
				Thread.sleep(5000);
				driver.findElementByXPath("//*[@id=\"question_3\"]/button["+ getNumber(4) +"]").click();
				Thread.sleep(30000);
			} catch (Exception e) {
				System.out.println("跳过prelander类型2问答！");
			}
			
			try {
				driver.findElement(By.xpath("//*[@id=\"fname\"]")).sendKeys(wish0.getContent()); //wish
				//标记被使用
				wish0.setUseStatus("1");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"question0\"]/div[2]/div")).click(); //enter now
				Thread.sleep(10000);
				
				driver.findElement(By.xpath("//*[@id=\"c_pic_"+ getNumber(4) +"_text\"]/input")); //q1
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"prize_picker\"]/div[3]/div[2]/div[4]/button")).click();
				Thread.sleep(3000);
			} catch (Exception e) {
				System.out.println("跳过prelander心愿单！");
			}
			
			
			////////正式开始///////
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
			driver.findElementByXPath("//*[@id=\"submitBtn\"]").click(); //continue //*[@id="submitBtn"]
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
					try {
						driver.findElementByXPath("//*[@id=\"coreg_1209_yes\"]").click(); //yes
					} catch (Exception e3) {
						driver.findElementByXPath("//*[@id=\"coreg_1014_yes\"]").click();
					}
				}
				
			}
			Thread.sleep(3000);
			driver.findElementByXPath("//*[@id=\"submitBtn\"]").click(); 
			Thread.sleep(6000);
			
			Integer glabo = -1;
			Random r = new Random();
			Integer n = r.nextInt(100);
			//问卷开始
			for(int i = 0; i < 50; i++) {
				if(answer(driver, 90, getNumberHas0(2))) continue;;
				if(answer(driver, 526, getNumberHas0(7))) continue;
				if(answer(driver, 526, getNumberHas0(2))) continue;
				if(answer(driver, 563, getNumberHas0(4))) {
					if(n <= 10) {
						return 1;
					}
					continue;
				} 
				if(answer(driver, 686, getNumberHas0(5))) continue;
				if(answer(driver, 696, getNumberHas0(4))) continue;
				if(answer(driver, 764, getNumberHas0(2))) continue;
				if(answer(driver, 796, getNumberHas0(5))) continue;
				if(answer(driver, 846, getNumberHas0(4)))  {
					if(n <= 20 && n > 10) {
						return 1;
					}
					continue;
				} 
				if(answer(driver, 814, getNumberHas0(2))) continue;
				if(answer(driver, 824, getNumberHas0(5))) continue;
				if(answer(driver, 862, getNumberHas0(2))) continue;
				if(answer(driver, 909, getNumberHas0(2))) continue;
				if(answer(driver, 915, getNumberHas0(2))) continue;
				if(answer(driver, 997, getNumberHas0(2))) continue;
				if(answer(driver, 1005, getNumberHas0(3))) continue;
				if(answer(driver, 1029, getNumberHas0(2))) continue;
				if(answer(driver, 1045, getNumberHas0(2)))  {
					if(n <= 30 && n > 20) {
						return 1;
					}
					continue;
				} 
				if(answer(driver, 1046, getNumberHas0(2))) continue;
				if(answer(driver, 1049, getNumberHas0(5))) continue;
				if(glabo == -1) {
					glabo = getNumberHas0(2);
				}
				if(answer(driver, 1066, glabo)) continue;
				if(answer(driver, 1083, getNumberHas0(2))) continue;
				if(answer(driver, 1083, getNumberHas0(4))) continue;
				if(answer(driver, 1088, getNumberHas0(2))) continue;
				if(answer(driver, 1125, getNumberHas0(2))) continue;
				if(answer(driver, 1127, getNumberHas0(3)))  {
					if(n <= 40 && n > 30) {
						return 1;
					}
					continue;
				} 
				if(answer(driver, 1131, getNumberHas0(2))) continue;
				if(answer(driver, 1139, getNumberHas0(2))) continue;
				if(answer(driver, 1141, getNumberHas0(2))) continue;
				//*[@id="coreg_1160_yes_0"]
				if(answer(driver, 1160, 0)) continue;
				if(answer(driver, 1181, getNumberHas0(2))) continue;
				if(answer(driver, 1187, getNumberHas0(2))) continue;
				if(answer(driver, 1191, getNumberHas0(2))) continue;
				if(answer(driver, 1196, getNumberHas0(2))) continue;
				if(answer(driver, 1204, getNumberHas0(2))) continue;
				if(answer(driver, 1207, getNumberHas0(2))) continue;
				if(answer(driver, 1210, getNumberHas0(2))) continue;
				if(answer(driver, 1212, getNumberHas0(2))) continue;
				if(answer(driver, 1213, getNumber(11))) {
					driver.findElementByXPath("//*[@id=\"submit_survey_multi_1213\"]").click();
					continue;
				};
				if(	answer(driver, 1218, getNumberHas0(2))) continue;
				if(	answer(driver, 1219, getNumberHas0(2))) continue;
				if(	answer(driver, 1223, getNumberHas0(2))) continue;
				if(	answer(driver, 1224, getNumberHas0(2))) continue;
				if(	answer(driver, 1230, getNumberHas0(2))) continue;
				if(	answer(driver, 1242, getNumberHas0(2))) continue;
				if(	answer(driver, 1243, getNumberHas0(2))) continue;
				if(	answer(driver, 1244, getNumberHas0(2)))  {
					if(n <= 50 && n > 40) {
						return 1;
					}
					continue;
				} 
				if(	answer(driver, 1245, getNumberHas0(2))) continue;
				if(answer(driver, 1246, getNumberHas0(2))) continue;
				if(answer(driver, 1247, getNumberHas0(2))) continue;
				if(answer(driver, 1250, getNumberHas0(2))) continue;
				if(answer(driver, 1251, getNumberHas0(2))) continue;
				if(	answer(driver, 1252, getNumberHas0(2))) continue;
				if(	answer(driver, 1256, getNumberHas0(2)))  {
					if(n <= 60 && n > 50) {
						return 1;
					}
					continue;
				} 
				if(	answer(driver, 1268, getNumberHas0(2))) continue;
				if(answer(driver, 1270, getNumberHas0(2))) continue;
				if(answer(driver, 1271, getNumberHas0(2))) continue;
				if(	answer(driver, 1272, getNumberHas0(2))) continue;
				if(	answer(driver, 1276, getNumberHas0(2))) continue;
				if(	answer(driver, 1278, getNumberHas0(2))) continue;
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
				if(answer(driver, 1281, getNumberHas0(2)))  {
					if(n <= 70 && n > 60) {
						return 1;
					}
					continue;
				} 
				if(answer(driver, 1288, getNumberHas0(2))) continue;
				if(answer(driver, 1289, getNumberHas0(2))) continue;
				if(answer(driver, 1290, getNumberHas0(2))) continue;
				if(answer(driver, 1291, getNumberHas0(2))) continue;
				if(answer(driver, 1292, getNumberHas0(5))) continue;
				if(answer(driver, 1292, getNumberHas0(2))) continue;
				if(answer(driver, 1293, getNumberHas0(2)))  {
					if(n <= 80 && n > 70) {
						return 1;
					}
					continue;
				} 
				if(answer(driver, 1295, getNumberHas0(2))) continue;
				if(answer(driver, 1297, getNumberHas0(2))) continue;
				if(answer(driver, 1299, getNumberHas0(2))) continue;
				if(answer(driver, 1300, getNumberHas0(8))) continue;
				if(answer(driver, 1307, getNumberHas0(2))) continue;
				if(answer(driver, 1311, getNumberHas0(5))) continue;
				if(answer(driver, 1311, getNumberHas0(2))) continue;
				if(answer(driver, 1311, getNumberHas0(5))) continue;

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
		} catch (Exception e) {}
		try {
			driver.findElementByXPath("//*[@id='coreg-inner-"+ question +"']/div[2]/div/label[" + number + "]").click();
			System.err.println("题为："+ question + "随机数为：" + number);
			Thread.sleep(3000);		   //*[@id="submit_survey_multi_1300"]
			driver.findElementByXPath("//*[@id='submit_survey_multi_"+ question +"']").click();
			Thread.sleep(Integer.valueOf(next.toString() + "000"));
			return true;
		} catch (Exception e4) { }
		System.out.println("不是题：" + question + "随机数：" + number);
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
