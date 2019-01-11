package com.selenum.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

public class TestWindowHandler {

	private static String defaultIP = "106.120.89.26";
	private static String prevIP = null; 
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
//		System.setProperty("webdriver.chrome.driver", "E:\\workspace\\selenium-master\\selenium\\src\\main\\resources\\chromedriver.exe");
//		ChromeOptions chromeOptions = new ChromeOptions();
//		ChromeDriver driver = new ChromeDriver(chromeOptions);
//		driver.get("C:\\Users\\lyx-pc-0018\\Desktop\\test.html");
//		
//		((JavascriptExecutor) driver).executeScript("document.getElementById('street').value = '123';");
//		
//		Thread.sleep(10000);							 
//		((JavascriptExecutor) driver).executeScript("document.getElementById('street').value = '456'");
		
//		File file = new File("C:\\Users\\lyx-pc-0018\\Desktop\\2018快递鸟接口支持快递公司编码.xlsx");
//		InputStream is = new FileInputStream(file);
//		XSSFWorkbook workbook = new XSSFWorkbook(is);
//		Sheet sheet = workbook.getSheetAt(0);
//		
//		List<Map<String, String>> list = Lists.newArrayList();
//		for(int i = 2; i < sheet.getLastRowNum(); i ++) {
//			
//			Row row = sheet.getRow(i);
//			for(Cell cell : row) {
//				cell.setCellType(CellType.STRING);
//			}
//			
//			Map<String, String> map = Maps.newHashMap();
//			map.put("expCode", row.getCell(3).getStringCellValue());
//			map.put("expName", row.getCell(2).getStringCellValue());
//			list.add(map);
//		}
//		workbook.close();
//		is.close();
//		System.err.println(JSONObject.toJSONString(list));
		System.err.println("450923262".substring(1));
		
//		Set<String> handles = driver.getWindowHandles();
//		Object[] objects = handles.toArray();
//		TargetLocator to = driver.switchTo();
//		WebDriver sdriver = to.window(String.valueOf(objects[1]));
//		sdriver.findElement(By.xpath("//*[@id=\"form\"]/button")).click();
//		((ChromeDriver)sdriver).executeScript("document.documentElement.scrollTop=10000");
//		Thread.sleep(5000);
//		((ChromeDriver)sdriver).executeScript("document.documentElement.scrollTop=0");
//		
//		Random random = new Random();
//		Actions action = new Actions(sdriver);
//		int x = random.nextInt(800);
//		int y = random.nextInt(800);
//		System.out.println("移动到：("+ x + "," + y + ")");
//		action.moveByOffset(x, y);
//		action.click().perform();;
//		x = random.nextInt(800);
//		y = random.nextInt(800);
//		System.out.println("移动到：("+ x + "," + y + ")");
//		action.moveByOffset(x, y);
//		action.click().perform();;
		
//		String xx = "您的IP是：[108.14.66.251] 来自：美国";
//		int a = xx.indexOf("[");
//		int b = xx.indexOf("]");
//		System.out.println(xx.substring(a+1, b));
	}
}
