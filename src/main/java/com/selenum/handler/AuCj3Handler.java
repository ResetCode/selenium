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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.collect.Range;
import com.google.common.collect.RangeMap;
import com.google.common.collect.TreeRangeMap;
import com.selenum.model.AuData;
import com.selenum.model.AuWish;

/**
 * 模板三-2：校车
 */
public class AuCj3Handler {

	private final static Logger logger = LoggerFactory.getLogger(AuCj3Handler.class);
	
	@SuppressWarnings("null")
	public static int handle(AuData data, ChromeDriver driver, String offerUrl, AuWish wish) throws InterruptedException {
		
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
				logger.info("跳过prelander类型1直接跳转填写资料！");
			}
			
			try {
				driver.findElementByXPath("//*[@id=\"page1\"]/div[1]/div/div[2]/div[2]/div[2]/div[1]/a["+ getNumber(2) + "]").click();
				Thread.sleep(3000);
				driver.findElementByXPath("//*[@id=\"page1\"]/div[1]/div/div[2]/div[2]/div[2]/div[2]/a["+ getNumber(2) +"]").click();
				Thread.sleep(3000);
				try {
					driver.findElementByXPath("//*[@id=\"page1\"]/div[1]/div/div[2]/div[2]/div[2]/div[3]/a["+ getNumber(2) +"]").click();
				} catch (Exception e) {
					System.out.println("跳过prelander类型2第三道题直接填写资料！");
				}
				Thread.sleep(10000);
			} catch (Exception e) {
				System.out.println("跳过prelander类型2直接填写资料！");
			}
			
			try {//*[@id="page1"]/div[2]/div/div[2]/div/div[2]/div[1]/a[1]
				try {
					driver.findElementByXPath("//*[@id='page1']/div[2]/div/div[2]/div/div[2]/div[1]/a["+ getNumber(4) + "]").click();
				} catch (Exception e) {
					driver.findElementByXPath("//*[@id='page1']/div[2]/div/div[2]/div/div[2]/div[1]/a["+ getNumber(2) + "]").click();
				}
				Thread.sleep(3000);
				try {
					driver.findElementByXPath("//*[@id='page1']/div[2]/div/div[2]/div/div[2]/div[2]/a["+ getNumber(4) + "]").click();
				} catch (Exception e) {
					driver.findElementByXPath("//*[@id='page1']/div[2]/div/div[2]/div/div[2]/div[2]/a["+ getNumber(2) + "]").click();
				}
				Thread.sleep(3000);
				try {
					driver.findElementByXPath("//*[@id='page1']/div[2]/div/div[2]/div/div[2]/div[3]/a["+ getNumber(4) + "]").click();
					Thread.sleep(3000);
				} catch (Exception e) {
					System.out.println("跳过prelander类型3第三题！");
				}
				try {
					driver.findElementByXPath("//*[@id='page1']/div[2]/div/div[2]/div/div[2]/div[4]/a["+ getNumber(4) + "]").click();
				} catch (Exception e) {
					System.out.println("跳过prelander类型3第四题！");
				}
				Thread.sleep(10000);
			} catch (Exception e) {
				System.out.println("跳过prelander类型3直接填写资料！");
			}
			
			Integer sex = 1; 
			if(data.getName().equals("f")) {
				sex = 2;
			} 						  
			try {
				driver.findElementByXPath("//*[@id='input1']/div/div/div[3]/div[2]/div[3]/div[1]/div/label[" + sex + "]/label").click();
			} catch (Exception e) {
				driver.findElementByXPath("//*[@id='input1']/div[1]/div/div[2]/div[2]/div/div[1]/div/label[" + sex + "]/label").click();
			}
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
									    
			try {
				driver.findElementByXPath("//*[@id=\"input1\"]/div/div/div[3]/div[2]/div[3]/div[6]/div/button").click();
				driver.findElementByXPath("//*[@id=\"input1\"]/div/div/div[3]/div[2]/div[3]/div[6]/div/button").click();
			} catch (Exception e) {
				driver.findElementByXPath("//*[@id=\"input1\"]/div[1]/div/div[2]/div[2]/div/div[6]/div/button").click();
				driver.findElementByXPath("//*[@id=\"input1\"]/div[1]/div/div[2]/div[2]/div/div[6]/div/button").click();
			}
			Thread.sleep(20000);
			
			
			WebDriverWait webDriverWait = new WebDriverWait(driver, 60);
			String[] aboutHouse = {"Own my own home" , "Paying off mortgage" , "Remortgaged" , "Renting"};
			Select aboutHouseSelect = null;
			Integer aboutHouseNumber = 0;
			
			driver.findElementByXPath("//*[@id=\"postcode\"]").sendKeys(data.getZipCode());
			Thread.sleep(2000);
			((JavascriptExecutor) driver).executeScript("document.getElementById('postcode').blur();");
			Thread.sleep(20000);
			((JavascriptExecutor) driver).executeScript("var city = document.getElementById('city');city.options[1].selected = true") ; 
//					"for(var i = 0; i < city.options.length; i++){" + 
//					"    if(city.options[i].value == '" + data.getCity() + "') {" + 
//					"       city.options[i].selected = true;" + 
//					"       break;" + 
//					"    }" + 
//					"}");
			Thread.sleep(8000);
			
			String address = data.getAddress();
			driver.findElementById("street").sendKeys(address);
			Thread.sleep(20000);
			((JavascriptExecutor) driver).executeScript("document.getElementById('ui-id-2').getElementsByTagName('li')[0].click();");
			Thread.sleep(20000);
			((JavascriptExecutor) driver).executeScript("var city = document.getElementById('house-number');" + 
					"var randomNum = Math.random()*city.options.length;" + 
					"city.options[parseInt(randomNum,10)].selected = true;");
			
			Thread.sleep(5000);
			driver.findElementByXPath("//*[@id='phone']").sendKeys(data.getPhone().substring(1));
			//What is your current housing situation?
			try {
				aboutHouseNumber = getNumberHas0(4);
				aboutHouseSelect = new Select(driver.findElementByXPath("//*[@id=\"coreg-container\"]/div[1]/div/div/span/select"));
				aboutHouseSelect.selectByVisibleText(aboutHouse[aboutHouseNumber]);
			} catch (Exception e) {}
			try {
				aboutHouseSelect = new Select(driver.findElementByXPath("//*[@id=\"coreg-container\"]/div/div/div/span/select"));
				aboutHouseNumber = getNumberHas0(4);
				aboutHouseSelect.selectByVisibleText(aboutHouse[aboutHouseNumber]);
			} catch (Exception e) {}
			
			
			Thread.sleep(60000);
			Integer beforeSubmitNumber = getNumberHas0(6);
			String[] beforeSubmit = {"Pacific Islands" , "Europe" , "Alaska" , "NZ/ Australia","Asia","Other","Not interested"};
			try {
				new Select(driver.findElementByXPath("//*[@id=\"coreg-container\"]/div[3]/div/div/span/select")).selectByVisibleText(beforeSubmit[3]);
				Thread.sleep(3000);
			} catch (Exception e) {
				System.out.println("未检测到手机号最后一步选项！");
			}
			try {
				new Select(driver.findElementByXPath("//*[@id=\"coreg-container\"]/div[2]/div/div/span/select")).selectByVisibleText(beforeSubmit[3]);
				Thread.sleep(3000);
			} catch (Exception e2) {
				System.out.println("未检测到手机号最后一步选项！");
			}
			try {
				new Select(driver.findElementByXPath("//*[@id=\"coreg-container\"]/div/div/div/span/select")).selectByVisibleText(beforeSubmit[3]);
				Thread.sleep(3000);
			} catch (Exception e) {
				System.out.println("未检测到手机号最后一步选项！");
			}
			
			
			
			try {
				driver.findElementByXPath("//*[@id=\"coreg-container\"]/div[2]/label/div").click(); //确认复选框
				Thread.sleep(3000);
			} catch (Exception e) {}
			
			try {
				driver.findElementByXPath("//*[@id=\"input2\"]/div[1]/div/div[2]/div[2]/div/div[5]/div/button").click();
			} catch (Exception e) {
				try {
					driver.findElementByXPath("//*[@id=\"input2\"]/div/div/div[3]/div[2]/div[3]/div[5]/div/button").click();
				} catch (Exception e2) {
					driver.findElementByXPath("//*[@id=\"input2\"]/div[1]/div/div[2]/div[3]/div/div[5]/div/button").click();
				}
			}
			
			Thread.sleep(20000); //资料填写完毕，开始回答调查问卷
			
			//选项一是 the bus， 选项二是圣诞老人
			String firstAnswer = webDriverWait.until(new ExpectedCondition<WebElement>() {
				@Override
				public WebElement apply(WebDriver driver) {
					return driver.findElement(By.xpath("//*[@id=\"question-374\"]/div/ul/li[1]/label/span"));
				}
			}).getText();
			String sencodAnswer = driver.findElement(By.xpath("//*[@id=\"question-374\"]/div/ul/li[2]/label/span")).getText();
			Integer firstLabel = 0;
			if(firstAnswer.contains("The Bus") == true) {
				firstLabel = 1;
				System.out.println("问卷调查检测第一题为 校车问答！答案选择为 {}" +  firstLabel);
			} else if(sencodAnswer.contains("The School Bus") == true) {
				firstLabel = 2;
				System.out.println("问卷调查检测第一题为 校车问答！答案选择为 {}" +  firstLabel);
			} else {
				firstLabel = 2;
				System.out.println("问卷调查检测第一题为 圣诞老人！答案选择为 {}" +  firstLabel);
			}
			driver.findElement(By.xpath("//*[@id='question-374']/div/ul/li["+ firstLabel +"]/label")).click();
			Thread.sleep(15000);
			
			Random random = new Random();
			Integer suiji = random.nextInt(100);
			Integer gloab = getNumber(2);
			for(int i = 0; i <= 29; i++) {
				
				String as = "//Do you wear hearing aids?";
				try {
					if(suiji <= 30) {
						driver.findElement(By.xpath("//*[@id=\"question-6519\"]/div/div[2]/button[1]")).click();
					} else {
						driver.findElementByXPath("//*[@id=\"question-6519\"]/div/div[2]/button[2]").click();
					}
					System.out.println("yes - {} " +  as);
					Thread.sleep(10000);
					continue;
				} catch (Exception e) {System.out.println("no - {}" +  as);}
				
				as = "In 2016 alone, warming oceans killed almost a quarter of the Great Barrier Reef's coral, yet the government has approved the world's biggest coal mine right on its doorstep.";
				try {
					if(suiji <= 30) {
						driver.findElement(By.xpath("//*[@id=\"question-981\"]/div/div[2]/button[1]")).click();
					} else {
						driver.findElementByXPath("//*[@id=\"question-981\"]/div/div[2]/button[2]").click();
					}
					System.out.println("yes - {} " +  as);
					Thread.sleep(10000);
					continue;
				} catch (Exception e) {System.out.println("no - {}" +  as);}
				
				
				as = "//Only Foxtel brings you the best choice of live sport, blockbuster movies, new shows and complete series.";
				try {
					if(suiji <= 30) {
						driver.findElement(By.xpath("//*[@id=\"question-6204\"]/div[2]/div[2]/button[2]")).click();
					} else {
						driver.findElementByXPath("//*[@id=\"question-6204\"]/div[2]/div[2]/button[1]").click();
					}
					System.out.println("yes - {}" +  as );
					Thread.sleep(10000);
					continue;
				} catch (Exception e) {System.out.println("no - {} " +  as);}
				
				as = "Are you prepared to donate to a Charity?";
				try {
					driver.findElement(By.xpath("//*[@id=\"question-7809\"]/div/div[2]/button[2]")).click();
					System.out.println("yes - {}" +  as );
					Thread.sleep(10000);
					continue;
				} catch (Exception e) {System.out.println("no - {} " +  as);}
				as = "In 2016 alone, warming oceans killed almost a quarter of the Great Barrier Reef's coral, yet the government has approved the world's biggest coal mine right on its doorstep.";
				try {
					if(suiji <= 30) {
						driver.findElement(By.xpath("//*[@id=\"question-981\"]/div[2]/div[3]/button[2]")).click();
					} else {
						driver.findElementByXPath("//*[@id=\"question-981\"]/div[2]/div[3]/button[1]").click();
					}
					System.out.println("yes - {}" +  as );
					Thread.sleep(10000);
					continue;
				} catch (Exception e) {System.out.println("no - {} " +  as);}
				
				as = "//Who is your current electricity supplier?";
				try {
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
					System.out.println("yes - {} " +  as);
					Thread.sleep(10000);
					continue;
				} catch (Exception e) {System.out.println("no - {} " +  as);}
				
				as = "Do you enjoy a glass of wine occasionally?";
				try {
					if(suiji <= 30) {
						driver.findElement(By.xpath("//*[@id=\"question-6494\"]/div[2]/div[2]/button[2]")).click();
					} else {
						driver.findElementByXPath("//*[@id=\"question-6494\"]/div[2]/div[2]/button[1]").click();
					}
					System.out.println("yes - {}" +  as );
					Thread.sleep(10000);
					continue;
				} catch (Exception e) {System.out.println("no - {} " +  as);}
						
						
				as = "Receive an e-mail with a 15% off voucher from Princess Polly";
				try {
					Select electricitySelect = new Select(driver.findElementByXPath("//*[@id=\"question-3533\"]/div[2]/div[3]/select"));
					RangeMap<Integer, String> rangeMap = TreeRangeMap.create();
					rangeMap.put(Range.openClosed(0, 100), "Clothes"); //100
					rangeMap.put(Range.openClosed(100, 190), "Accessories"); //90
					rangeMap.put(Range.openClosed(190, 270), "Beauty"); //80
					rangeMap.put(Range.openClosed(520, 540), "No thanks"); //20
					electricitySelect.selectByVisibleText(rangeMap.get(random.nextInt(540)));
					System.out.println("yes - {} " +  as);
					Thread.sleep(10000);
					continue;
				} catch (Exception e) {System.out.println("no - {} " +  as);}
				
				as = "Compare & Connect helps thousands of Australians save hundreds of dollars per year by comparing and switching energy providers.";
				try {
					suiji = random.nextInt(100);
					if(suiji <= 30) {
						driver.findElementByXPath("//*[@id=\"question-5991\"]/div[2]/div[2]/button[2]").click();
					} else {
						driver.findElementByXPath("//*[@id=\"question-5991\"]/div[2]/div[2]/button[1]").click();
					}
					System.out.println("yes - {} " +  as);
					Thread.sleep(10000);
					continue;
				} catch (Exception e) {System.out.println("no - {} " +  as);}
				
				
				as = "//Do you pay the electricity bills in your household?";
				try {
					driver.findElementByXPath("//*[@id=\"question-6420\"]/div/div[2]/button[1]").click(); //yes
					System.out.println("yes - {} " +  as);
					Thread.sleep(10000);
					continue;
				} catch (Exception e) {System.out.println("no - {} " +  as);}
				
				as = "Want access to the BEST DEALS on worldwide cruises & travel?";
				try {
					driver.findElementByXPath("//*[@id=\"question-3284\"]/div[2]/ul/li["+ (beforeSubmitNumber + 1) + "]/label/span").click(); //yes
					System.out.println("yes - {} " +  as);
					Thread.sleep(10000);
					continue;
				} catch (Exception e) {System.out.println("no - {} " +  as);}
				
				
				as = "//We provide free legal services to Aboriginal communities and others in need across the Kimberley.";
				try {
					driver.findElementByXPath("//*[@id=\"question-7083\"]/div[2]/div[3]/button[1]").click(); //yes
					System.out.println("yes - {} " +  as);
					Thread.sleep(10000);
					continue;
				} catch (Exception e) {System.out.println("no - {} " +  as);}
				as = "In Australia today a staggering 1.1 million children and young people are living in poverty. ";
				try {
					driver.findElementByXPath("//*[@id=\"question-3359\"]/div[2]/div[3]/button[1]").click(); //yes
					System.out.println("yes - {} " +  as);
					Thread.sleep(10000);
					continue;
				} catch (Exception e) {System.out.println("no - {} " +  as);}
				
				as = "//Thank you, your support will help provide legal representation, respect for human rights and protection from discrimination. Select yes if you would like to donate";
				try {
					suiji = random.nextInt(100);
					if(suiji <= 30) {
						driver.findElementByXPath("//*[@id=\"question-7085\"]/div[2]/div[2]/button[2]").click();
					} else {
						driver.findElementByXPath("//*[@id=\"question-7085\"]/div[2]/div[2]/button[1]").click();
					}
					System.out.println("yes - {} " +  as);
					Thread.sleep(10000);
					continue;
				} catch (Exception e) {System.out.println("no - {} " +  as);}
				
				as = "//What is your current housing situation?";
				try {
					aboutHouseSelect = new Select(driver.findElementByXPath("//*[@id=\"question-3560\"]/div/div[2]/select"));
					aboutHouseSelect.selectByVisibleText(aboutHouse[aboutHouseNumber]);
					System.out.println("yes - {} " +  as);
					Thread.sleep(10000);
					continue;
				} catch (Exception e) {System.out.println("no - {} " +  as);}
				
				
				as = "What is your annual income? ";
				try {
					Select select = new Select(driver.findElementByXPath("//*[@id=\"question-7497\"]/div/div[2]/select"));
					select.selectByIndex(getNumber(2));
					System.out.println("yes - {} " +  as);
					Thread.sleep(10000);
					continue;
				} catch (Exception e) {System.out.println("no - {} " +  as);}
				
				as = "Win a year’s supply of premium wine from Wine Selectors valued at over $1000. Simply tell us who’s wine advice would you value the most?";
				try {
					Select select = new Select(driver.findElementByXPath("//*[@id=\"question-6495\"]/div[2]/div[2]/select"));
					select.selectByIndex(getNumber(4));
					System.out.println("yes - {} " +  as);
					Thread.sleep(10000);
					continue;
				} catch (Exception e) {System.out.println("no - {} " +  as);}
				
				as = "//Want access to the BEST DEALS on worldwide cruises & travel?";
				try {
					driver.findElementByXPath("//*[@id=\"question-3284\"]/div[2]/ul/li["+ getNumber(7) + "]/label/span").click();
					System.out.println("yes - {} " +  as);
					Thread.sleep(10000);
					continue;
				} catch (Exception e) {System.out.println("no - {} " +  as);}
				
				as = "Would you consider supporting any of the following organisations?";
				try {
					driver.findElementByXPath("//*[@id=\"question-197\"]/div/ul/li["+ getNumber(3) + "]/label").click();
					Thread.sleep(3000);
					driver.findElementByXPath("//*[@id=\"question-197\"]/div/button").click();
					System.out.println("yes - {} " +  as);
					Thread.sleep(10000);
					continue;
				} catch (Exception e) {System.out.println("no - {} " +  as);}
				
				as = "//Are you a member of Woolworths Rewards?";
				try {
					driver.findElementByXPath("//*[@id=\"question-1811\"]/div/div[2]/button["+ gloab + "]").click();
					System.out.println("yes - {} " +  as);
					Thread.sleep(10000);
					continue;
				} catch (Exception e) {System.out.println("no - {} " +  as);}
				
				as = "//Join Kogan and get big discounts on electronics, appliances, homewares, fashion & more!";
				try {
					suiji = random.nextInt(100);
					if(suiji <= 30) {
						driver.findElementByXPath("//*[@id=\"question-308\"]/div[2]/div[2]/button[2]").click();
					} else {
						driver.findElementByXPath("//*[@id=\"question-308\"]/div[2]/div[2]/button[1]").click();
					}
					System.out.println("yes - {} " +  as);
					Thread.sleep(10000);
					continue;
				} catch (Exception e) {System.out.println("no - {} " +  as);}
				
				
				as = "//JOIN Woolworths Rewards today to receive 1,700 Bonus Points to kick start your savings. Select  send you the link to register via SMS & email.";
				try {
					suiji = random.nextInt(100);
					if(suiji <= 30) {
						driver.findElementByXPath("//*[@id=\"question-1812\"]/div[2]/div[3]/button[2]").click();
					} else {
						driver.findElementByXPath("//*[@id=\"question-1812\"]/div[2]/div[3]/button[1]").click();
					}
					System.out.println("yes - {} " +  as);
					Thread.sleep(10000);
					continue;
				} catch (Exception e) {System.out.println("no - {} " +  as);}
				
				as = "//Do you love discounts?";
				try {
					suiji = random.nextInt(100);
					if(suiji <= 10) {
						driver.findElementByXPath("//*[@id=\"question-1503\"]/div/div[2]/button[2]").click();
					} else {
						driver.findElementByXPath("//*[@id=\"question-1503\"]/div/div[2]/button[1]").click();
					}
					System.out.println("yes - {} " +  as);
					Thread.sleep(10000);
					continue;
				} catch (Exception e) {System.out.println("no - {} " +  as);}
				
				as = "//Would you like to join FreeLotto.com and start playing for your chance to win over $11,000,000.00 Tonight for FREE?";
				try {
					suiji = random.nextInt(100);
					if(suiji <= 30) {
						driver.findElementByXPath("//*[@id=\"question-2620\"]/div[2]/div[2]/button[2]").click();
					} else {
						driver.findElementByXPath("//*[@id=\"question-2620\"]/div[2]/div[2]/button[1]").click();
					}
					System.out.println("yes - {} " +  as);
					Thread.sleep(10000);
					continue;
				} catch (Exception e) {System.out.println("no - {} " +  as); }
				
				as = "//Complete the survey by telling us why you should WIN in 25 words or less.";
				try {
					suiji = random.nextInt(100);
					if(suiji < 50) {
						
						driver.findElementByXPath("//*[@id=\"question-387\"]/div/textarea").sendKeys(wish.getContent());
						wish.setUseStatus("1");
						
						Thread.sleep(10000);
						driver.findElementByXPath("//*[@id=\"question-387\"]/div/button[1]").click();
					} else {
						driver.findElementByXPath("//*[@id=\"question-387\"]/div/button[2]").click();
					}
					System.out.println("yes - {} " +  as);
					Thread.sleep(10000);
					continue;
				} catch (Exception e) {System.out.println("no - {} " +  as);}
				
				
				as = "//Aussies who haven't reviewed their Private Health Insurance in 5 years could be paying $800 more per year, for the same cover.";
				try {
					suiji = random.nextInt(100);
					if(suiji < 30) {
						driver.findElementByXPath("//*[@id=\"question-4631\"]/div[2]/div[3]/button[2]").click();
					} else {
						driver.findElementByXPath("//*[@id=\"question-4631\"]/div[2]/div[3]/button[1]").click(); //yes 弹offer
					}
					System.out.println("yes - {} " +  as);
					Thread.sleep(10000);
					continue;
				} catch (Exception e) {System.out.println("no - {} " +  as);}
				
				
				as = "//Do you want to have the chance to be one of the next millionaires?";
				try {
					driver.findElementByXPath("//*[@id=\"question-7462\"]/div[2]/ul/li["+getNumber(2)+"]/label/span").click();
					System.out.println("yes - {} " +  as);
					Thread.sleep(10000);
					continue;
				} catch (Exception e) {System.out.println("no - {} " +  as);}
				
				as = "//Do you feel you pay too much for Health Insurance?";
				try {
					suiji = random.nextInt(100);
					if(suiji < 30) {
						driver.findElementByXPath("//*[@id=\"question-5232\"]/div[2]/div[2]/button[2]").click();
					} else {
						driver.findElementByXPath("//*[@id=\"question-5232\"]/div[2]/div[2]/button[1]").click(); //yes 弹offer
					}
					System.out.println("yes - {} " +  as);
					Thread.sleep(10000);
					continue;
				} catch (Exception e) {System.out.println("no - {} " +  as);}
				
				as = "//Let Health Deal contact you to save your money on your health cover Plus, go into the draw to Win 6 Months Free Health Cover!";
				try {
					suiji = random.nextInt(100);
					if(suiji < 30) {
						driver.findElementByXPath("//*[@id=\"question-5235\"]/div[2]/div[3]/button[2]").click(); //yes 寮筼ffer
					} else {
						driver.findElementByXPath("//*[@id=\"question-5235\"]/div[2]/div[3]/button[1]").click();
					}
					System.out.println("yes - {} " +  as);
					Thread.sleep(10000);
					continue;
				} catch (Exception e) {System.out.println("no - {} " +  as);}
				
				as = "Get 40% off electricity usage charges and 26% off ";
				try {
					suiji = random.nextInt(100);
					if(suiji < 30) {
						driver.findElementByXPath("//*[@id=\"question-6423\"]/div[2]/div[2]/button[2]").click(); //yes 寮筼ffer
					} else {
						driver.findElementByXPath("//*[@id=\"question-6423\"]/div[2]/div[2]/button[1]").click();
					}
					System.out.println("yes - {} " +  as);
					Thread.sleep(10000);
					continue;
				} catch (Exception e) {System.out.println("no - {} " +  as);}
				as = "Thinking about buying a coffee machine for home?";
				try {
					suiji = random.nextInt(100);
					if(suiji < 30) {
						driver.findElementByXPath("//*[@id=\"question-7506\"]/div/div[2]/button[2]").click(); //yes 寮筼ffer
					} else {
						driver.findElementByXPath("//*[@id=\"question-7506\"]/div/div[2]/button[1]").click();
					}
					System.out.println("yes - {} " +  as);
					Thread.sleep(10000);
					continue;
				} catch (Exception e) {System.out.println("no - {} " +  as);}
				
				as = "*****?";
				try {
					suiji = random.nextInt(100);
					if(suiji < 30) {
						driver.findElementByXPath("//*[@id=\"question-3577\"]/div[2]/div[3]/button[2]").click(); //yes 寮筼ffer
					} else {
						driver.findElementByXPath("//*[@id=\"question-3577\"]/div[2]/div[3]/button[1]").click();
					}
					System.out.println("yes - {} " +  as);
					Thread.sleep(10000);
					continue;
				} catch (Exception e) {System.out.println("no - {} " +  as);}
				as = "It’s your lucky day! You can get a FREE espresso coffee machine thanks to MyCino.";
				try {
					suiji = random.nextInt(100);
					if(suiji < 30) {
						driver.findElementByXPath("//*[@id=\"question-7507\"]/div[2]/div[3]/button[2]").click(); //yes 寮筼ffer
					} else {
						driver.findElementByXPath("//*[@id=\"question-7507\"]/div[2]/div[3]/button[1]").click();
					}
					System.out.println("yes - {} " +  as);
					Thread.sleep(10000);
					continue;
				} catch (Exception e) {System.out.println("no - {} " +  as);}
				as = "Thinking about buying a coffee machine for home?";
				try {
					suiji = random.nextInt(100);
					if(suiji < 30) {
						driver.findElementByXPath("//*[@id=\"question-7541\"]/div[2]/div[2]/button[2]").click(); //yes 寮筼ffer
					} else {
						driver.findElementByXPath("//*[@id=\"question-7541\"]/div[2]/div[2]/button[1]").click();
					}
					System.out.println("yes - {} " +  as);
					Thread.sleep(10000);
					continue;
				} catch (Exception e) {System.out.println("no - {} " +  as);}
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
				
				WebDriver sdriver = otherDriver(driver, 1);
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
			Thread.sleep(180000);
			return 3;
		} finally {
//			driver.quit();
		}
		return 1;
		
	}
	
	public static boolean answer(ChromeDriver driver,int question, int number) throws NumberFormatException, InterruptedException  {
		try {
			System.out.println("随机数为 {}" + number);
			driver.findElementByXPath("//*[@id='page1']/div[2]/div[1]/div/div[2]/div/div[2]/div["+ question + "]/a["+ number + "]").click();
			
			Random r = new Random();
			Integer next = 5;
			next = r.nextInt(11);
			Thread.sleep(Integer.valueOf(next.toString() + "000"));
			return true;
		} catch (Exception e) {return false;}
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
