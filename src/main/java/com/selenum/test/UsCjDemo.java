package com.selenum.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsCjDemo {

	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(new ChromeOptions());
		
		Process p = null;
		Runtime rt = Runtime.getRuntime();
		try {
			p = rt.exec("C:\\Users\\lyx-pc-0018\\Desktop\\911S5 2018-05-23\\911S5 2018-05-23 fixed\\ProxyTool\\AutoProxyTool.exe -changeproxy/US -hwnd=" + Thread.currentThread());
			p.waitFor();
			InputStream is = p.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			String line = null;
			while((line=br.readLine())!=null)    
            {    
                 System.out.println(line);    
            }   
			
		} catch (IOException e) {
			System.out.println("error");
		}
		Thread.sleep(5000);
		
		if(2 > 1) {
			return;
		}
		
//		driver.get("http://trace.luckychooser.net/version-christmas-walmart/?transaction_id=f85cd9c49-9865-54ff-b44803d8c4cdf86905389c07f3212641613e8fd2ee70034&aff_id=109833&sub_affiliate_id=2767");
		driver.get("http://trace.luckychooser.net/version-christmas-walmart/");
//		driver.manage().window().maximize();
		WebDriverWait webDriverWait = new WebDriverWait(driver, 60);
		WebElement startBtn = webDriverWait.until(new ExpectedCondition<WebElement>() {
            @Override
            public WebElement apply(WebDriver d) {
                return d.findElements(By.className("van-button--normal")).get(0);
            }
        });
		
		//start
		startBtn.click();
		
		WebElement email = driver.findElement(By.className("van-field__control"));
//		email.sendKeys("e.alfaro@net.com");
		email.sendKeys("jaydas2807@yahoo.com");
		WebElement btnContinue = driver.findElement(By.className("btnContinue"));
		btnContinue.click();
		
		webDriverWait.until(new ExpectedCondition<WebElement>() {
            @Override
            public WebElement apply(WebDriver d) {
                return d.findElement(By.xpath("//input[@placeholder='First Name']"));
            }
        });
		
		WebElement firstName = driver.findElementByXPath("//input[@placeholder='First Name']");
		WebElement LastName = driver.findElementByXPath("//input[@placeholder='Last Name']");
		WebElement PrimaryPhone = driver.findElementByXPath("//input[@placeholder='Primary Phone']");
		WebElement StreetAddress = driver.findElementByXPath("//input[@placeholder='Street Address']");
		WebElement City = driver.findElementByXPath("//input[@placeholder='City']");
		WebElement ZipCode = driver.findElementByXPath("//input[@placeholder='Zip Code']");
		WebElement search = driver.findElementByXPath("//input[@type='search']");
		Integer man = 0;
		Integer woman = 1;
//		WebElement sex = driver.findElementsByClassName("custom_radio-inner").get(man); 
		WebElement sex = driver.findElementsByClassName("custom_radio-inner").get(woman);
		
		firstName.sendKeys("Aminat");
		LastName.sendKeys("Adio");
		PrimaryPhone.sendKeys("4012701372");
		StreetAddress.sendKeys("48 Phebe St. Apt. 2B");
		City.sendKeys("Providence");
		ZipCode.sendKeys("2904");
		sex.click();
//		search.sendKeys("Delaware"); 
		search.sendKeys("Rhode Island"); 
		search.sendKeys(Keys.RETURN);
		
		driver.findElement(By.className("custom_btn-inner-default")).click();
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		String jsCode = getText("E:\\workspace\\selenium\\src\\main\\resources\\main.js");
		js.executeScript(jsCode);
		
		Thread.sleep(2000);
		String jsCode2 = "return window.T.action()";
		js.executeScript(jsCode2);
		String jsCode3="document.getElementsByClassName('custom_btn-inner-default')[0].innerHTML = '21-03-1985';";
		js.executeScript(jsCode3);
		driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div[2]/div[1]/div[2]/div/div[1]/div[2]")).click();//comfirm
		
		Thread.sleep(10000);
		driver.findElement(By.className("submit")).click();
		
		
		WebElement survey = webDriverWait.until(new ExpectedCondition<WebElement>() {
            @Override
            public WebElement apply(WebDriver d) {
                return d.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div[2]/div/div/div/div/button[1]"));
            }
        });
		survey.click();
		
		//1
		System.out.println("问题1");
		answer(driver, getNumber(12));
		
		//2
		System.out.println("问题2");
		answer(driver, getNumber(2));
		
		//3
		System.out.println("问题3");
		answer(driver, getNumber(4));
		
		//4
		System.out.println("问题4");
		answer(driver, getNumber(2));
		
		//5
		System.out.println("问题5");
		try {
			answer(driver, getNumber(6));
		} catch (Exception e) {
			answer(driver, getNumber(4));
		}
		
		//6
		System.out.println("问题6");
		answer(driver, getNumber(4));
		
		//7
		System.out.println("问题7");
		answer(driver, getNumber(3));
		
		//8
		System.out.println("问题8");
		answer(driver, getNumber(2));
		
		//9
		System.out.println("问题9");
		answer(driver, getNumber(3));
		
		//10
		System.out.println("问题10");
		answer(driver, getNumber(2));
		
		//11
		System.out.println("问题11");
		try {
			answer(driver, getNumber(5));
		} catch (Exception e) {
			answer(driver, getNumber(2));
		}
		
		//12
		System.out.println("问题12");
		try {
			answer(driver, getNumber(5));
		} catch (Exception e) {
			answer(driver, getNumber(2));
		}
		
		//13
		System.out.println("问题13");
		answer(driver, getNumber(2));
		
		//14
		System.out.println("问题14");
		answer(driver, getNumber(2));
		
		//15
		System.out.println("问题15");
		answer(driver, getNumber(2));

		//16
		System.out.println("问题16");
		answer(driver, getNumber(2));
		
		//17
		//此问题有可能没有
		System.out.println("问题17");
		try {
			answer(driver, getNumber(2));
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		//18
		System.out.println("问题18");
		try {
			answer(driver, getNumber(2));
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		//19
		System.out.println("问题19");
		try {
			answer(driver, getNumber(2));
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		webDriverWait.until(new ExpectedCondition<WebElement>() {
            @Override
            public WebElement apply(WebDriver d) {
                return d.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div[2]/div[2]/div/div[1]/div/div"));
            }
        }).click();
		driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div[2]/div[3]/div")).click();
		
		//1 前三个是offer，第四个跳转问题2回答问题
		System.out.println("问题1");
//		Integer number = getNumber(4);
		Integer number = 4;
		answer2(driver, getNumber(4));
		
		if(number == 4) {
			
			//2 前三个是offer，第四个跳转offer列表
			System.out.println("问题2");
//			number = getNumber(4);
			number = 4;
			answer2(driver, number);
			
			//3  前三个是offer，第四个跳转offer列表
			if(number == 4) {
				answer2(driver, number);
				webDriverWait.until(new ExpectedCondition<WebElement>() {
		            @Override
		            public WebElement apply(WebDriver d) {
		                return d.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div[3]/div[2]/button[2]"));
		            }
		        }).click(); //offer列表弹窗
				
				int offerNumber = offerClick(driver, getNumber(14)); //点击一个offer
				offerClick(driver, (offerNumber - 1) > 0 ? (offerNumber - 1) : (offerNumber + 1)); //再点击一个offer
				
				jsCode = "document.getElementsByClassName('btn')[0].click();";
				js.executeScript(jsCode);//跳抽奖
				
				webDriverWait.until(new ExpectedCondition<WebElement>() {
		            @Override
		            public WebElement apply(WebDriver d) {
		                return d.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div[2]/div[2]/div/div[3]/div"));
		            }
		        }).click(); //点击抽奖
			}
		}
		
	}
	
	public static int offerClick(ChromeDriver driver, int number) throws InterruptedException {
		Random r = new Random();
		Integer next = 5;
		while(true) {
			next = r.nextInt(10);
			if(next >= 5 && next <= 10) {
				break;
			}
		}
		Thread.sleep(Integer.valueOf(next.toString() + "000"));
		System.err.println("随机数为：" + number);
		driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div[2]/ul/li["+ (number + 1) + "]/a/div[2]/div/div")).click();
		return number;
	}
	
	
	public static int getNumber(Integer n) {
		Random random = new Random();
		int nextInt = random.nextInt(n);
		if(nextInt == 0) {
			return getNumber(n);
		}
		return nextInt;
	}
	
	protected static void answer2(ChromeDriver driver, int number) throws InterruptedException {
		Random r = new Random();
		Integer next = 5;
		while(true) {
			next = r.nextInt(10);
			if(next >= 5 && next <= 10) {
				break;
			}
		}
		Thread.sleep(Integer.valueOf(next.toString() + "000"));
		System.err.println("随机数为：" + number);
		driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div[2]/div/div[2]/div[2]/div["+ number + "]")).click();
	}
	
	public static void answer(ChromeDriver driver, int number) throws Exception {
		
		Random r = new Random();
		Integer next = 5;
		while(true) {
			next = r.nextInt(10);
			if(next >= 5 && next <= 10) {
				break;
			}
		}
		Thread.sleep(Integer.valueOf(next.toString() + "000"));
		try {
			System.err.println("随机数为：" + number);
			driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div[2]/div/div/div/div/button["+ number + "]")).click();
		} catch (Exception e) {
			WebElement search = driver.findElementByXPath("//input[@type='search']");
			try {
				String[] money = {"Clay Or Slate Tile","Composite Shingle","Flat Tile - Concrete","Flat - Rolled Composite / Tar And Gravel",
						"Ground Mount","Membrane Or Foam","Metal Shingle","Shake - Wood; Fiber; Plastic","Sheet Metal","Standing Seam Metal","Unsure/Other"};
				search = driver.findElementByXPath("//input[@type='search']");
				int nextInt = getNumber(money.length);
				String text = money[nextInt - 1];
				search.sendKeys(text); 
				search.sendKeys(Keys.RETURN);
				if(search.getText().trim().equals("")) {
					throw new Exception("下拉框不匹配：" + text);
				}
			} catch (Exception e2) {
				try {
					String[] roof = {"$0-50","$51-100","$101-150","$151-200","$201-300","$301-400","$401-500","$501-600","$601-700","$701-800","$801+"};
					search = driver.findElementByXPath("//input[@type='search']");
					int nextInt = getNumber(roof.length);
					String text = roof[nextInt - 1];
					search.sendKeys(text); 
					search.sendKeys(Keys.RETURN);
					if(search.getText().trim().equals("")) {
						throw new Exception("下拉框不匹配：" + text);
					}
				} catch (Exception e3) {
					String[] toubao = {"Anthem", "Aetna", "Blue Cross", "Blue Shield", "Cigna", "Coventry", "PPO", "Private Insurance", "Tricare", "Medicaid", "Medicare", "Other Private Insurance", "United Healthcare", "Uninsured"};
					search = driver.findElementByXPath("//input[@type='search']");
					int nextInt = getNumber(toubao.length);
					String text = toubao[nextInt - 1];
					search.sendKeys(text); 
					search.sendKeys(Keys.RETURN);
				}
				
			} 
		}
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
	public static String  getText(String path) {
        File file=new File(path);
        String out=null;
        StringBuilder result=new StringBuilder();
        try{
            BufferedReader br = new BufferedReader(new FileReader(file));
            String s = null;
            while((s = br.readLine())!=null){
                result.append(s+"\n");
            }
            br.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        out=result.toString();
        return out;
    }
}
