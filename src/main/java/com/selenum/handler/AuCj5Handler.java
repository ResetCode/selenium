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
 * 模板五
 *
 */
public class AuCj5Handler {

	public static int handle(AuData data, ChromeDriver driver, String offerUrl,AuWish wish0) throws InterruptedException {
		Random r = new Random();
		int b = r.nextInt(101);
		
		WebDriverWait webDriverWait = new WebDriverWait(driver, 60);
		try{
			driver.get(offerUrl);
			driver.manage().deleteAllCookies();
			Thread.sleep(60000);
			
			try {
				driver.findElementByXPath("//*[@id='mobimg" +  getNumber(6) + "']").click();
				Thread.sleep(3000);
			} catch (Exception e) {}
			
			try {
				driver.findElementByXPath("//*[@id='mobimg" +  getNumber(4) + "']").click();
				Thread.sleep(3000);
			} catch (Exception e) {}
			
			try {
				driver.findElementByXPath("//*[@id='mobimg" +  getNumber(3) + "']").click();
				Thread.sleep(3000);
			} catch (Exception e) {}
			
			try {
				driver.findElementByXPath("//*[@id='img" +  getNumber(4) + "']").click();
				Thread.sleep(3000);
			} catch (Exception e) {}
			
			try {
				driver.findElementByXPath("//*[@id='img" +  getNumber(2) + "']").click();
				Thread.sleep(3000);
			} catch (Exception e) {}
			
			try {
				driver.findElementByXPath("//*[@id=\"question-box\"]/div[2]/a[" + getNumber(2) + "]").click();
				Thread.sleep(3000);
			} catch (Exception e) {}
			
			try {
				driver.findElementByXPath("//*[@id=\"question-box\"]/div[1]/a[" + getNumber(3) + "]").click();
				Thread.sleep(3000);
			} catch (Exception e) {}
			try {
				driver.findElementByXPath("//*[@id=\"question-box\"]/div[1]/a[" + getNumber(2) + "]").click();
				Thread.sleep(3000);
			} catch (Exception e) {}
			
			try {
				driver.findElement(By.xpath("//*[@id=\"question-box\"]/div[2]/a[" + getNumber(3) + "]")).click();
				Thread.sleep(3000);
			} catch (Exception e) {}
			
			Thread.sleep(10000);
			String sex = "ld_gender_M";
			if(data.getName().equals("f")) {
				sex = "ld_gender_F";
			}
			driver.findElement(By.xpath("//*[@id='" + sex + "']")).click(); //性别
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"14\"]")).sendKeys(data.getFirstName()); //名
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"18\"]")).sendKeys(data.getLastName()); //姓
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"22\"]")).sendKeys(data.getEmail()); //邮箱
			Thread.sleep(3000);
			
			
			Select fieldDay = new Select(driver.findElement(By.xpath("//*[@id=\"90\"]/select"))); //生日
			Select fieldMonth = new Select(driver.findElement(By.xpath("//*[@id=\"118\"]/select")));
			Select fieldYear = new Select(driver.findElement(By.xpath("//*[@id=\"252\"]/select")));
			
			fieldDay.selectByVisibleText(data.getBirthDay());
			Thread.sleep(3000);
			String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
			Map<String, String> monthMap = Maps.newHashMap();
			for(int a=0; a < months.length; a++) {
				monthMap.put(new Integer(a+1).toString(), months[a]);
			}
			
			//year
			fieldMonth.selectByVisibleText(monthMap.get(data.getBirthMonth()));
			Thread.sleep(3000);
			fieldYear.selectByVisibleText(data.getBirthYear());
			Thread.sleep(3000);
			
			Integer number = getNumber(100);
			try {
				if(number < 30) {
					driver.findElement(By.xpath("//*[@id=\"sd_homeownership_home_owner\"]")).click(); //同意选项
				}
			} catch (Exception e) {}
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"qubiq-container\"]/main/div/form/div/div[3]/button")).click(); //下一步
			Thread.sleep(3000);
			
			driver.findElement(By.id("269")).sendKeys(data.getZipCode());
			((JavascriptExecutor) driver).executeScript("document.getElementById('269').blur();");
			Thread.sleep(5000);
			
			try {
				new Select(driver.findElementByXPath("//*[@id=\"273\"]/select")).selectByVisibleText(data.getCity());
			} catch (Exception e) {}
			
			try {
				new Select(driver.findElementByXPath("//*[@id=\"273\"]/select")).selectByIndex(1);
			} catch (Exception e) {
				new Select(driver.findElementByXPath("//*[@id=\"273\"]/select")).selectByIndex(0);
			}
			
			Thread.sleep(3000);
					
			driver.findElement(By.xpath("//*[@id='277']")).sendKeys(data.getAddress2());
			Thread.sleep(3000);
			
			driver.findElement(By.id("282")).sendKeys(data.getPhone().substring(1));
			Thread.sleep(3000);
			
			driver.findElementByXPath("//*[@id=\"qubiq-container\"]/main/div/form/div/div[3]/button").click();
			Thread.sleep(15000);
			
			try {
				String check = driver.findElementByXPath("//*[@id=\"headerRef_oi_coh__foxtel\"]/div/h3").getText();
				if("".equals(check.trim())) {
					return 5;
				}
			} catch (Exception e) {}
			
					
			//开始问卷
			for(int i=1; i < 25; i++) {
				
				Random random = new Random();
				int suiji = random.nextInt(100);
				
				String as = "email&sms";
				try {
					if(suiji <= 30) {
						driver.findElement(By.xpath("//*[@id=\"oi_coh__foxtel_no\"]")).click();
					} else {
						driver.findElementByXPath("//*[@id=\"oi_coh__foxtel_yes\"]").click();
					}
					System.out.println("yes - {} " +  as);
					Thread.sleep(10000);
					continue;
				} catch (Exception e) {System.out.println("no - {}" +  as);}
				
				as = "Plan International stands against violence and intimidation of girls";
				try {
					if(suiji <= 30) {
						driver.findElement(By.xpath("//*[@id=\"5996acf1ba3700010099ad56\"]/div[2]/div/div[2]/label")).click();
					} else {
						driver.findElementByXPath("//*[@id=\"5996acf1ba3700010099ad56\"]/div[2]/div/div[1]/label").click();
					}
					System.out.println("yes - {} " +  as);
					Thread.sleep(10000);
					continue;
				} catch (Exception e) {System.out.println("no - {}" +  as);}
			
				as = "What is your housing situation?";
				try {
					if(number < 30) {
						driver.findElement(By.xpath("//*[@id=\"57b58c68a7f39001000d11cf\"]/div[2]/div/div[1]/label")).click(); //my own home
						Thread.sleep(3000);
						new Select(driver.findElementByXPath("//*[@id=\"5c9cc71b554c620100224575\"]/div[2]/div/div/select")).selectByIndex(getNumber(4) + 1);
						System.out.println("yes - {} " +  as);
						Thread.sleep(10000);
						continue;
					}
					driver.findElement(By.xpath("//*[@id=\"57b58c68a7f39001000d11cf\"]/div[2]/div/div[" + (getNumber(5) + 1) + "]/label")).click();
					System.out.println("yes - {} " +  as);
					Thread.sleep(10000);
					continue;
				} catch (Exception e) {System.out.println("no - {}" +  as);}
				
				as = "What is you household income?";
				try {
					new Select(driver.findElement(By.xpath("//*[@id=\"58e66c4f80dd880100c8a519\"]/div[2]/div/div/select"))).selectByIndex(getNumber(5) + 1);;
					System.out.println("yes - {} " +  as);
					Thread.sleep(10000);
					continue;
				} catch (Exception e) {System.out.println("no - {}" +  as);}
				
				as = "Who is your current energy provider?";
				try {
					new Select(driver.findElement(By.xpath("//*[@id=\"587d28340fefcd0100e58cad\"]/div[2]/div/div/select"))).selectByIndex(getNumber(12) + 1);;
					System.out.println("yes - {} " +  as);
					Thread.sleep(10000);
					continue;
				} catch (Exception e) {System.out.println("no - {}" +  as);}
				
				as = "Would you like to subscribe to Glow Church to hear more information about a NEW CHURCH that will be launching close to you in Melbourne in 2019?";
				try {
					if(suiji <= 30) {
						driver.findElement(By.xpath("//*[@id=\"5bcd73107ba2200100055e71\"]/div[2]/div/div[2]/label")).click();
					} else {
						driver.findElementByXPath("//*[@id=\"5bcd73107ba2200100055e71\"]/div[2]/div/div[1]/label").click();
					}
					System.out.println("yes - {} " +  as);
					Thread.sleep(10000);
					continue;
				} catch (Exception e) {System.out.println("no - {}" +  as);}
				
				as = "Get 6GB + unlimited calls and text in Aus with Dodo for just $20/mth Powered by the Optus 4G Plus Network It’s simple to get started, just click YES and we’ll give you a call !";
				try {
					if(suiji <= 30) {
						driver.findElement(By.xpath("//*[@id=\"5c80d80f5db1790100b98218\"]/div[2]/div/div[2]/label")).click();
					} else {
						driver.findElementByXPath("//*[@id=\"5c80d80f5db1790100b98218\"]/div[2]/div/div[1]/label").click();
					}
					System.out.println("yes - {} " +  as);
					Thread.sleep(10000);
					continue;
				} catch (Exception e) {System.out.println("no - {}" +  as);}
				
				as = "Thinking about buying a coffee machine for home?";
				try {
					if(suiji <= 30) {
						driver.findElement(By.xpath("//*[@id=\"5c35da20f971fb0100950e89\"]/div[2]/div/div[2]/label")).click();
					} else {
						driver.findElementByXPath("//*[@id=\"5c35da20f971fb0100950e89\"]/div[2]/div/div[1]/label").click();
					}
					System.out.println("yes - {} " +  as);
					Thread.sleep(10000);
					continue;
				} catch (Exception e) {System.out.println("no - {}" +  as);}
				
				as = "Start earning up to $5,- per survey with valued opinions. Do you want to know more?";
				try {
					if(suiji <= 30) {
						driver.findElement(By.xpath("//*[@id=\"bodyRef_oi_5bcf08ce4726b8010034cad6\"]/div/div[1]/label")).click();
					} else {
						driver.findElementByXPath("//*[@id=\"bodyRef_oi_5bcf08ce4726b8010034cad6\"]/div/div[2]/label").click();
					}
					System.out.println("yes - {} " +  as);
					Thread.sleep(10000);
					continue;
				} catch (Exception e) {System.out.println("no - {}" +  as);}

				as = "Would you like to join* FreeLotto.com and start playing for your chance to win a Samsung 65 3D LED Smart TV or another cool brand name prize?";
				try {
					if(suiji <= 30) {
						driver.findElement(By.xpath("//*[@id=\"bodyRef_oi_5bbcbc21fb14010100e6d66c\"]/div/div[1]/label")).click();
					} else {
						driver.findElementByXPath("//*[@id=\"bodyRef_oi_5bbcbc21fb14010100e6d66c\"]/div/div[2]/label").click();
					}
					System.out.println("yes - {} " +  as);
					Thread.sleep(10000);
					continue;
				} catch (Exception e) {System.out.println("no - {}" +  as);}
				
				as = "Earn online rewards and redeem them for giftcards. Do you want to join Rewardia for free?";
				try {
					if(suiji <= 30) {
						driver.findElement(By.xpath("//*[@id=\"bodyRef_oi_5c516b17ffa4020100b25a82\"]/div/div[1]/label")).click();
					} else {
						driver.findElementByXPath("//*[@id=\"bodyRef_oi_5c516b17ffa4020100b25a82\"]/div/div[2]/label").click();
					}
					System.out.println("yes - {} " +  as);
					Thread.sleep(10000);
					continue;
				} catch (Exception e) {System.out.println("no - {}" +  as);}
				
				as = "Guide Dogs Victoria need your SupPAWt to help our puppies graduate and you could win $20K in prizes.";
				try {
					if(suiji <= 30) {
						driver.findElement(By.xpath("//*[@id=\"5cac677f6136070100c37570\"]/div[2]/div/div[1]/label")).click();
					} else {
						driver.findElementByXPath("//*[@id=\"5cac677f6136070100c37570\"]/div[2]/div/div[2]/label").click();
					}
					System.out.println("yes - {} " +  as);
					Thread.sleep(10000);
					continue;
				} catch (Exception e) {System.out.println("no - {}" +  as);}

				as = "Act for Kids support abused and neglected Australian children in need.Show your support and you could WIN your choice between 2 brand-new luxury Mercedes, in the Platinum Class Lottery.";
				try {
					if(suiji <= 30) {
						driver.findElement(By.xpath("//*[@id=\"5cac6961344c170100d0f702\"]/div[2]/div/div[1]/label")).click();
					} else {
						driver.findElementByXPath("//*[@id=\"5cac6961344c170100d0f702\"]/div[2]/div/div[2]/label").click();
					}
					System.out.println("yes - {} " +  as);
					Thread.sleep(10000);
					continue;
				} catch (Exception e) {System.out.println("no - {}" +  as);}
				
				as = "Want access to the BEST DEALS on worldwide cruises & travel? Simply select where in the world you would like to travel and Cruise Megastore will call you back with an unbelievable offer! Plus receive a FREE $100 cruise voucher.";
				try {
					driver.findElement(By.xpath("//*[@id=\"bodyRef_oi_coh__cruise_multi\"]/div/div["+ getNumber(7)+"]")).click();
					System.out.println("yes - {} " +  as);
					Thread.sleep(10000);
					continue;
				} catch (Exception e) {System.out.println("no - {}" +  as);}
				
				as = "Click yes to confirm that you want to be contacted about these amazing Raffle Prizes.";
				try {
					driver.findElement(By.xpath("//*[@id=\"5cac67db6136070100c38070\"]/div[2]/div/div[2]/label")).click();
					System.out.println("yes - {} " +  as);
					Thread.sleep(10000);
					continue;
				} catch (Exception e) {System.out.println("no - {}" +  as);}
				
				as = "Sign up and double your deposit! Are you interested to join Unique Casino?";
				try {
					if(suiji <= 30) {
						driver.findElement(By.xpath("//*[@id=\"5c7d3c9698c0e00100863d62\"]/div[2]/div/div[2]/label")).click();
					} else {
						driver.findElementByXPath("//*[@id=\"5c7d3c9698c0e00100863d62\"]/div[2]/div/div[1]/label").click();
					}
					System.out.println("yes - {} " +  as);
					Thread.sleep(10000);
					continue;
				} catch (Exception e) {System.out.println("no - {}" +  as);}
				
				as = "Sick of expensive electricity and gas? We can help to compare energy prices.";
				try {
					if(suiji <= 30) {
						driver.findElement(By.xpath("//*[@id=\"5cb048380ee5990100dab719\"]/div[2]/div/div[2]/label")).click();
					} else {
						driver.findElementByXPath("//*[@id=\"5cb048380ee5990100dab719\"]/div[2]/div/div[1]/label").click();
					}
					System.out.println("yes - {} " +  as);
					Thread.sleep(10000);
					continue;
				} catch (Exception e) {System.out.println("no - {}" +  as);}
				
				as = "Would you like to join* FreeLotto.com and start playing for your chance to win a Samsung 65\" 3D LED Smart TV or another cool brand name prize?";
				try {
					if(suiji <= 30) {
						driver.findElement(By.xpath("//*[@id=\"5bbcbc21fb14010100e6d66c\"]/div[2]/div/div[2]/label")).click();
					} else {
						driver.findElementByXPath("//*[@id=\"5bbcbc21fb14010100e6d66c\"]/div[2]/div/div[1]/label").click();
					}
					System.out.println("yes - {} " +  as);
					Thread.sleep(10000);
					continue;
				} catch (Exception e) {System.out.println("no - {}" +  as);}
				
				as = "Are you a Woolworths Rewards member?";
				try {
					if(suiji <= 30) {
						driver.findElement(By.xpath("//*[@id=\"oi_opt__woolworths_rewards_no\"]")).click();
					} else {
						driver.findElementByXPath("//*[@id=\"oi_opt__woolworths_rewards_yes\"]").click();
					}
					System.out.println("yes - {} " +  as);
					Thread.sleep(10000);
					continue;
				} catch (Exception e) {System.out.println("no - {}" +  as);}
				
				as = "Basirat, please tell us why you should win the prize (max 260 characters)";
				try {
					if(suiji <= 30) {
						driver.findElement(By.xpath("//*[@id=\"313\"]/textarea")).sendKeys(wish0.getContent());;
						wish0.setUseStatus("1");
					} 
					driver.findElementByXPath("//*[@id=\"qubiq-container\"]/main/div/form/div/div[3]/button").click();
					System.out.println("yes - {} " +  as);
					Thread.sleep(10000);
					continue;
				} catch (Exception e) {System.out.println("no - {}" +  as);}
				
				try {
					if(suiji <= 30) {
						driver.findElement(By.xpath("//*[@id=\"oi_5c3c9871b17dd20100706a02_world_animal_protection\"]")).click();
						
					} else if(suiji > 30 && suiji <= 60){
						driver.findElementByXPath("//*[@id=\"oi_5ca1c7b32433b40100137ba3_rspca\"]").click();
					} else {
						driver.findElement(By.xpath("//*[@id=\"oi_5c3c9871b17dd20100706a02_world_animal_protection\"]")).click();
						Thread.sleep(3000);
						driver.findElementByXPath("//*[@id=\"oi_5ca1c7b32433b40100137ba3_rspca\"]").click();
					}
					System.out.println("yes - {} " +  as);
					Thread.sleep(3000);
					driver.findElementByXPath("//*[@id=\"qubiq-container\"]/main/div/form/div/div[3]/button").click();
					Thread.sleep(10000);
					continue;
				} catch (Exception e) {System.out.println("no - {}" +  as);}
				
				as = "It’s your lucky day! You can get a FREE espresso coffee machine thanks to MyCino. Simply purchase the espresso coffee pods and we will deliver to your door. Select yes to receive a call and place your order.";
				try {
					driver.findElement(By.xpath("//*[@id=\"5c35da40623e8a0100476f97\"]/div[2]/div/div[2]/label")).click();
					System.out.println("yes - {} " +  as);
					Thread.sleep(10000);
					continue;
				} catch (Exception e) {System.out.println("no - {}" +  as);}
				
				
				as = "The last season of Game of Thrones is coming soon on Foxtel.Get Sport + Drama + Entertainment +HD for $58* a month on a 12 month plan. Includes 2 store movies within 12 months.Click yes to receive a call, SMS & Email";
				try {
					driver.findElement(By.xpath("//*[@id=\"5c614f23d3e72a0100e14ea6\"]/div[2]/div/div[2]/label")).click();
					System.out.println("yes - {} " +  as);
					Thread.sleep(10000);
					continue;
				} catch (Exception e) {System.out.println("no - {}" +  as);}
				
				as = "An Australian life is lost every 12 minutes to cardiovascular disease – our biggest killer. With your help the Baker Institute can change this and keep more families together";
				try {
					driver.findElement(By.xpath("//*[@id=\"5c62932f8d960c01004920ca\"]/div[2]/div/div[2]/label")).click();
					System.out.println("yes - {} " +  as);
					Thread.sleep(10000);
					continue;
				} catch (Exception e) {System.out.println("no - {}" +  as);}
				
				as = "Get 20GB + unlimited calls and text in Aus with Dodo for just $30/mth Powered by the Optus 4G Plus Network It’s simple to get started, just click YES and we’ll give you a call";
				try {
					driver.findElement(By.xpath("//*[@id=\"5c77a53a9250be0100e22291\"]/div[2]/div/div[2]/label")).click();
					System.out.println("yes - {} " +  as);
					Thread.sleep(10000);
					continue;
				} catch (Exception e) {System.out.println("no - {}" +  as);}
				
				
			}
			
			System.out.println("完成问卷调查！点击next进行下一步！");
			driver.findElement(By.id("next")).click();//完成进度条
			Thread.sleep(10000);
			scoll(driver);
			if(getNumber(2) == 1) {
				driver.findElement(By.xpath("/html/body/div[2]/div[1]/a")).click(); //skip
			} else {						
				driver.findElement(By.xpath("/html/body/center/div[2]/table[2]/tbody/tr[2]/td/table[1]/tbody/tr[2]/td/table/tbody/tr/td/p[1]/a")).click();//操作弹offer
			}
			Thread.sleep(30000);
			return 1;
			
	   } catch(Exception e) {
		   e.printStackTrace();
		   Thread.sleep(60000);
		   return 3;
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
