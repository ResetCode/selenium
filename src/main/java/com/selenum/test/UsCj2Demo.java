package com.selenum.test;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsCj2Demo {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\workspaces\\using\\selenium\\src\\main\\resources\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(new ChromeOptions());
		driver.get("http://sparklemob.go2cloud.org/aff_c?offer_id=6207&aff_id=2767");
		
		driver.manage().deleteAllCookies();
		
		Thread.sleep(60000);
		WebDriverWait webDriverWait = new WebDriverWait(driver, 60);
		WebElement modal = webDriverWait.until(new ExpectedCondition<WebElement>() {
            @Override
            public WebElement apply(WebDriver d) {
                return d.findElement(By.xpath("//*[@id=\"reward\"]"));
            }
        });
		modal.click(); //弹框确认
		Thread.sleep(2000);
		
		//----------------------------------------------------------------
		
		driver.findElement(By.xpath("//*[@id=\"em\"]")).sendKeys("email"); //输入邮箱
		driver.findElement(By.xpath("//*[@id=\"rcsbt\"]")).click();
		Thread.sleep(2000);
		
		//----------------------------------------------------------------
		
		//等待页面跳转
		
		//----------------------------------------------------------------
		driver.findElement(By.xpath("//*[@id=\"fn\"]")).sendKeys("firstName"); 
		driver.findElement(By.xpath("//*[@id=\"ln\"]")).sendKeys("lastName");
		driver.findElement(By.xpath("//*[@id=\"zp\"]")).sendKeys("zipcode");
		driver.findElement(By.xpath("//*[@id=\"subbtn\"]")).click();
		Thread.sleep(2000);
		//----------------------------------------------------------------
		
		driver.findElement(By.xpath("//*[@id=\"ad\"]")).sendKeys("street address");
		driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("city");
		
		WebElement selectElement = driver.findElement(By.xpath("//*[@id=\"state-wrapper\"]/select"));
		Select state_code = new Select(selectElement);
		state_code.selectByValue("state_code");
		
		driver.findElement(By.xpath("//*[@id=\"CELLAREA\"]")).sendKeys("phone1");
		driver.findElement(By.xpath("//*[@id=\"cell2\"]")).sendKeys("phone2");
		driver.findElement(By.xpath("//*[@id=\"cell3\"]")).sendKeys("phone3");
		Thread.sleep(2000);
		//----------------------------------------------------------------

		selectElement = driver.findElement(By.xpath("//*[@id=\"dobmonth\"]"));
		Select dobmonth = new Select(selectElement);
		dobmonth.selectByValue("month");

		selectElement = driver.findElement(By.xpath("//*[@id=\"dobday\"]"));
		Select dobday = new Select(selectElement);
		dobday.selectByValue("dobday");
		
		selectElement = driver.findElement(By.xpath("//*[@id=\"DOBYEAR\"]"));
		Select dobyear = new Select(selectElement);
		dobyear.selectByValue("dobyear");
		driver.findElement(By.xpath("//*[@id=\"chkboxn\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"subbtn\"]")).click();
		Thread.sleep(2000);
		//----------------------------------------------------------------
		//等待页面跳转
		
		for(int i = 0; i <= 50; i ++ ) {
			
				if(answer(driver, 1, getNumber(4)) == true) return; 
				if(answer(driver, 2, getNumber(10))  == true) return ; 
				if(answer(driver, 3, getNumber(2))  == true) return ; 
				if(answer(driver, 4, getNumber(2))  == true) return ; 
				if(answer(driver, 5, getNumber(4))  == true) return ; 
				if(answer(driver, 6, getNumber(4))  == true) return ; 
				if(answer(driver, 7, getNumber(4))  == true) return ; 
				if(answer(driver, 8, getNumber(4))  == true) return ; 
				if(answer(driver, 9, getNumber(3))  == true) return ; 
				if(answer(driver, 10, getNumber(12))  == true) return ; 
				if(answer(driver, 11, getNumber(2))  == true) return ; 
				if(answer(driver, 12, getNumber(2))  == true) return ; 
				if(answer(driver, 13, getNumber(16))  == true) return ; 
				if(answer(driver, 14, getNumber(16))  == true) return ; 
				if(answer(driver, 15, getNumber(16))  == true) return ; 
				if(answer(driver, 16, getNumber(5))  == true) return ; 
				if(answer(driver, 17, getNumber(2))  == true) return ; 
				if(answer(driver, 18, getNumber(3))  == true) return ; 
				if(answer(driver, 19, getNumber(4))  == true) return ;
				if(answer(driver, 20, getNumber(3))  == true) return ;
				if(answer(driver, 21, getNumber(6))  == true) return ;
				if(answer(driver, 22, getNumber(6))  == true) return ;
				if(answer(driver, 23, getNumber(5))  == true) return ;
				if(answer(driver, 24, getNumber(3))  == true) return ;
				if(answer(driver, 25, getNumber(2))  == true) return ;
				if(answer(driver, 26, getNumber(3))  == true) return ;
				if(answer(driver, 27, getNumber(2))  == true) return ;
				if(answer(driver, 28, getNumber(4))  == true) return ;
				if(answer(driver, 29, getNumber(2))  == true) return ;
				if(answer(driver, 30, getNumber(2))  == true) return ;
				if(answer(driver, 31, getNumber(4))  == true) return ;
				if(answer(driver, 32, getNumber(20))  == true) return ;
				if(answer(driver, 33, getNumber(3))  == true) return ;
				if(answer(driver, 34, getNumber(6))  == true) return ;
				if(answer(driver, 35, getNumber(4))  == true) return ;
				if(answer(driver, 36, getNumber(2))  == true) return ;
				if(answer(driver, 37, getNumber(29))  == true) return ;
				if(answer(driver, 38, getNumber(30))  == true) return ;
				if(answer(driver, 39, getNumber(3))  == true) return ;
				if(answer(driver, 40, getNumber(2))  == true) return ;
				if(answer(driver, 41, getNumber(2))  == true) return ;
				if(answer(driver, 42, getNumber(6))  == true) return ;
				if(answer(driver, 43, getNumber(4))  == true) return ;
				if(answer(driver, 44, getNumber(7))  == true) return ;
				if(answer(driver, 45, getNumber(2))  == true) return ;
				if(answer(driver, 46, getNumber(6))  == true) return ;
				if(answer(driver, 47, getNumber(2))  == true) return ;
				if(answer(driver, 48, getNumber(3))  == true) return ;
				if(answer(driver, 49, getNumber(3))  == true) return ;
				if(answer(driver, 50, getNumber(4))  == true) return ;
				if(answer(driver, 51, getNumber(3))  == true) return ;
				if(answer(driver, 52, getNumber(3))  == true) return ;
				if(answer(driver, 53, getNumber(5))  == true) return ;
				if(answer(driver, 54, getNumber(4))  == true) return ;
				if(answer(driver, 55, getNumber(2))  == true) return ;
				if(answer(driver, 56, getNumber(7))  == true) {
					
					return ;
				}
				//? 这里好像有一个提交按钮 yes 、no 、submit
				if(answer(driver, 57, getNumber(8))  == true) return ;
				if(answer(driver, 58, getNumber(2))  == true) return ;
				if(answer(driver, 59, getNumber(11))  == true) return ;
				if(answer(driver, 60, getNumber(2))  == true) return ;
				if(answer(driver, 61, getNumber(3))  == true) return ;
				if(answer(driver, 62, getNumber(3))  == true) return ;
				if(answer(driver, 63, getNumber(4))  == true) return ;
				if(answer(driver, 64, getNumber(7))  == true) return ;
				if(answer(driver, 65, getNumber(2))  == true) return ;
				if(answer(driver, 66, getNumber(3))  == true) return ;
				if(answer(driver, 67, getNumber(3))  == true) return ;
				if(answer(driver, 68, getNumber(6))  == true)  {
					
					return ;
				}
				//? 这里好像有一个提交按钮 yes 、no 、submit
				if(answer(driver, 69, getNumber(4))  == true) return ;
				if(answer(driver, 70, getNumber(5))  == true) return ;
				if(answer(driver, 71, getNumber(4))  == true) return ;
				if(answer(driver, 72, getNumber(3))  == true) return ;
				if(answer(driver, 73, getNumber(3))  == true) return ;
				if(answer(driver, 74, getNumber(3))  == true) return ;
				if(answer(driver, 75, getNumber(3))  == true) return ;
				if(answer(driver, 76, getNumber(3))  == true) return ;
				if(answer(driver, 77, getNumber(2))  == true) return ;
				if(answer(driver, 78, getNumber(4))  == true) return ;
				if(answer(driver, 79, getNumber(2))  == true) return ;
				if(answer(driver, 80, getNumber(7))  == true)  {
					
					return ;
				}
				//? 这里好像有一个提交按钮 yes 、no 、submit
				if(answer(driver, 81, getNumber(2))  == true) return ;
				if(answer(driver, 82, getNumber(6))  == true)  {
					
					return ;
				}
				//? 这里好像有一个提交按钮 yes 、no 、submit
				if(answer(driver, 83, getNumber(2))  == true) return ;
				if(answer(driver, 84, getNumber(5))  == true) {
					
					return ;
				}
				//? 这里好像有一个提交按钮 yes 、no 、submit
				if(answer(driver, 85, getNumber(2))  == true) return ;
				if(answer(driver, 86, getNumber(3))  == true) return ;
				if(answer(driver, 87, getNumber(3))  == true) return ;
				if(answer(driver, 88, getNumber(2))  == true) return ;
				
				if(answer(driver, 89, getNumber(5))  == true) return ;
				if(answer(driver, 90, getNumber(10))  == true)  {
					
					return ;
				}
				//? 这里好像有一个提交按钮 yes 、no 、submit
				if(answer(driver, 91, getNumber(2))  == true) return ;
				if(answer(driver, 92, getNumber(5))  == true) return ;
				if(answer(driver, 93, getNumber(3))  == true) return ;
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
	
	public static int getNumber(Integer n, Integer...nots) {
		Random random = new Random();
		int nextInt = random.nextInt(n + 1);
		if(nextInt == 0) {
			return getNumber(n, nots);
		}
		
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
	
	public static boolean answer(ChromeDriver driver,int question, int number)  {
		
		Random r = new Random();
		Integer next = 5;
		while(true) {
			next = r.nextInt(10);
			if(next >= 5 && next <= 10) {
				break;
			}
		}
		
		
		try {
			number = doAnswer(question, number);
			System.err.println("随机数为：" + number);
			driver.findElement(By.xpath("//*[@id=\"Qnum" + question + "]/table/tbody/tr/td/div[" + number +"]/label")).click();
			System.out.println("检测问题成功，问题是第" + question + "道题！");
			Thread.sleep(Integer.valueOf(next.toString() + "000"));
			return true;
		} catch (Exception e) {
			System.out.println("检测问题成功，问题不是第" + question + "道题！");
			return false;
		}
	}

	
	//对问题进行特殊性选择处理
	private static int doAnswer(int question, int number) {
		
		Random random = new Random();
		int bfb = random.nextInt(101);
		
		if(question == 12) {
			if(bfb <= 30) {
				return 1;
			} else {
				return 2;
			}
		}
		
		if(question == 18) {
			return 1;
		}
		
		if(question == 19) {
			return getNumber(4,1);
		}
		
		if(question == 22) {
			return getNumber(6, 2,3,4);
		}
		
		if(question == 23) {
			return getNumber(5, 4);
		}
		
		if(question == 26) {
			return getNumber(3, 3);
		}
		
		if(question == 38) {
			return getNumber(30, 1,2,3,4,5,6,7,8,9,10,30);
		}
		
		if(question == 40) {
			return 1;
		}
		
		if(question == 42) {
			
			if(bfb < 20) {
				return getNumber(6, 6);
			} else {
				return 6;
			}
		}
		
		if(question == 44) {
			if(bfb < 20) {
				return 1;
			} 
			if(bfb >= 20 && bfb <30) {
				return 2;
			} else {
				return 6;
			}
		}
		
		if(question == 45) {
			
			if(bfb < 70) {
				return 1;
			}
			return 2;
		}
		
		if(question == 46) {
			
			if(bfb < 20) {
				return getNumber(6, 2,3,4);
			}
			return getNumber(6, 1,5,6);
		}
		
		if(question == 52) {
			return 1;
		}
		
		if(question == 57) {
			if(bfb < 80) {
				return 1;
			}
			if(bfb >= 80 && bfb < 90) {
				return 2;
			}
			return 4;
		}
		if(question == 58) {
			return 1;
		}
		
		return number;
	} 
	
	
}
