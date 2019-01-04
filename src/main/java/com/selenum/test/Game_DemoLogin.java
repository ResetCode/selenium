package com.selenum.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Game_DemoLogin {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(new ChromeOptions());
		
		driver.get("https://us.forgeofempires.com/");
		driver.manage().window().maximize();
		
		WebElement userName = driver.findElement(By.id("registration_nickname"));
		WebElement password = driver.findElement(By.id("registration_password"));
		WebElement accept = driver.findElement(By.id("registration_acceptTerms")); 
		WebElement playNow = driver.findElement(By.id("registration_register"));
		
//		userName.sendKeys("bruinhahah");
		userName.sendKeys("bruinhahaha");
		password.sendKeys("123456789");
		accept.click();
		Thread.sleep(5000);
		playNow.click();
		
		WebDriverWait webDriverWait = new WebDriverWait(driver, 10);
		WebElement play_now_button = webDriverWait.until(new ExpectedCondition<WebElement>() {
            @Override
            public WebElement apply(WebDriver d) {
                return d.findElement(By.id("play_now_button"));
            }
        });
		play_now_button.click();
		
		WebElement world_select_button = webDriverWait.until(new ExpectedCondition<WebElement>() {
            @Override
            public WebElement apply(WebDriver d) {
                return d.findElement(By.className("world_select_button"));
            }
        });
		world_select_button.click();
		
		WebElement canvas = webDriverWait.until(new ExpectedCondition<WebElement>() {
            @Override
            public WebElement apply(WebDriver d) {
                return d.findElement(By.xpath("//*[@id='container']/div/canvas"));
            }
        });
		
		Thread.sleep(10000);
		
		mouseClick(driver, canvas, 50, 200);
		mouseClick(driver, canvas, 1461, 628);
		mouseClick(driver, canvas, 24, 823);
		mouseClick(driver, canvas, 43, 527);
		
//		JavascriptExecutor js = ((JavascriptExecutor)driver);
//		String jsCode=getText("E:\\workspace\\selenium\\src\\main\\resources\\main.js");
//		js.executeScript(jsCode);
//		
//		String script = "return window.T.getNext()";
//		Object object = js.executeScript(script);
	}
	
	
	/**
	 *左键点击元素上的具体坐标位置
	 * @param driver
	 * @param abnormElement  需要点击的元素
	 * @param x 需要点击的元素上的点的X坐标
	 * @param y 需要点击的元素上的点的Y坐标
	 */
	public static void mouseClick(WebDriver driver, WebElement abnormElement, int x, int y) {
		Actions actions = new Actions(driver);    
		actions.release();
		actions.moveToElement(abnormElement, x, y).click().build().perform();
	}
   
	/**
	 *右键点击元素上的具体坐标位置
	 * @param driver
	 * @param abnormElement  需要点击的元素
	 * @param x 需要点击的元素上的点的X坐标
	 * @param y 需要点击的元素上的点的Y坐标
	 */
	public static void mouseRightClick(WebDriver driver, WebElement abnormElement, int x, int y) {
		Actions actions = new Actions(driver);    
		actions.release();
	    actions.moveToElement(abnormElement, x, y).contextClick().build().perform();
	}
	
	/**
	 *拖拽元素上的具体坐标位置
	 * @param driver
	 * @param abnormElement  需要点击的元素
	 * @param x 需要点击的元素上的点的X坐标
	 * @param y 需要点击的元素上的点的Y坐标
	 */
	public static void mouseMoveto(WebDriver driver, WebElement abnormElement, int x, int y){
		Actions actions = new Actions(driver);    
		actions.release();
	    actions.moveToElement(abnormElement, x, y).clickAndHold().release().build().perform();
	}
	
	/**
	 * 拖拽元素上的具体坐标位置
	 * @param driver
	 * @param abnormElement  需要点击的元素
	 * @param x 需要拖拽元素点的X坐标
	 * @param y 需要拖拽元素点的Y坐标
	 * @param to_x 拖拽元素点目标位置的X坐标
	 * @param to_y 拖拽元素点目标位置的Y坐标
	 */
	public static void mouseDragAndDrop(WebDriver driver, WebElement abnormElement, int x, int y,int to_x,int to_y){
		Actions actions = new Actions(driver);    
		actions.release();
	    actions.moveToElement(abnormElement, x, y).clickAndHold().moveByOffset(to_x,to_y).release().build().perform();    
	}
	
	static String  getText(String path) {
        File file=new File(path);
        String out=null;
        StringBuilder result=new StringBuilder();
        try{
            BufferedReader br = new BufferedReader(new FileReader(file));//����һ��BufferedReader������ȡ�ļ�
            String s = null;
            while((s = br.readLine())!=null){//ʹ��readLine������һ�ζ�һ��
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
