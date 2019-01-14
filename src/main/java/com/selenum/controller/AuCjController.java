package com.selenum.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.assertj.core.util.Lists;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.Maps;
import com.selenum.dao.AuDataDao;
import com.selenum.dao.AuWishDao;
import com.selenum.dao.ScreenDao;
import com.selenum.dao.UserAgentDao;
import com.selenum.handler.AUTemplatePoiHandler;
import com.selenum.handler.AuCj1Handler;
import com.selenum.handler.AuCj2Handler;
import com.selenum.handler.AuCj3Handler;
import com.selenum.handler.AuGetDataFromUrlHandler;
import com.selenum.model.AuData;
import com.selenum.model.AuWish;
import com.selenum.model.Screen;
import com.selenum.model.UserAgent;
import com.using.common.core.bean.ErrorEnum;
import com.using.common.core.bean.JsonResult;

@RestController
@RequestMapping("cj/au")
public class AuCjController {

	@Autowired
	private UserAgentDao userAgentDao;
	@Autowired
	private AuDataDao auDataMapper;
	@Autowired
	private AuWishDao wishDao;
	@Autowired
	private ScreenDao screenDao;
	
	private static String prevIP = null;
	
//	private static String defaultIP = "106.120.89.26";
//	private final static String driverPath = "E:\\workspace\\selenium-master\\selenium\\src\\main\\resources\\chromedriver.exe";
//	private final static String proxyToolPath = "C:\\Users\\lyx-pc-0018\\Desktop\\911S5 2018-05-23\\911S5 2018-05-23 fixed\\ProxyTool\\AutoProxyTool.exe";
//	private final static String au_filePath = "E:\\workspace\\selenium-master\\selenium\\src\\main\\resources\\au_data.xlsx";
//	private final static String ipPath = "E:\\workspace\\selenium-master\\selenium\\src\\main\\resources\\ip.html";
//	private final static String wishPath = "E:\\workspace\\selenium-master\\selenium\\src\\main\\resources\\au_wish.txt";
//	private final static String winPath = "E:\\workspace\\selenium-master\\selenium\\src\\main\\resources\\au_win.txt";

	//家
	//	private static String defaultIP = "111.194.49.215";
//	private final static String driverPath = "E:\\workspaces\\Java\\selenium\\selenium\\src\\main\\resources\\chromedriver.exe";
//	private final static String proxyToolPath = "E:\\911S5 2018-09-10\\ProxyTool\\AutoProxyTool.exe";
//	private final static String jsPath = "E:\\workspaces\\Java\\selenium\\selenium\\src\\main\\resources\\main.js";
//	private final static String filePath = "E:\\workspaces\\Java\\selenium\\selenium\\src\\main\\resources\\us_data.xls";
//	private final static String emailPath = "E:\\workspaces\\Java\\selenium\\selenium\\src\\main\\resources\\EMAIL.txt";
//	private final static String au_filePath = "E:\\workspaces\\Java\\selenium\\selenium\\src\\main\\resources\\au_data.xlsx";
//	private final static String uaPath = "E:\\workspaces\\Java\\selenium\\selenium\\src\\main\\resources\\ua.log";
//	private final static String ipPath = "E:\\workspaces\\Java\\selenium\\selenium\\src\\main\\resources\\ip.html";
	
	//meow 
	private static String defaultIP = "14.156.26.55";
	private final static String driverPath = "E:\\workspaces\\selenium\\src\\main\\resources\\chromedriver.exe";
	private final static String proxyToolPath = "C:\\Users\\Administrator\\Desktop\\911S5 2018-05-23\\911S5 2018-05-23 fixed\\ProxyTool\\AutoProxyTool.exe";
	private final static String au_filePath = "E:\\workspaces\\selenium\\src\\main\\resources\\au_data.xlsx";
	private final static String ipPath = "E:\\workspaces\\selenium\\src\\main\\resources\\ip.html";
	private final static String wishPath = "E:\\workspaces\\selenium\\src\\main\\resources\\au_wish.txt";
	private final static String winPath = "E:\\workspaces\\selenium\\selenium\\src\\main\\resources\\au_win.txt";
	
	private final static List<String> auofferList = Lists.newArrayList();
	private final static Map<String, String> stateMap = Maps.newHashMap(); 
	
	static  {
		auofferList.add("https://c.sparkletrace.com/?a=267&c=1144&E=kMiR3lfNIZU%3d&s1=");
		auofferList.add("https://c.sparkletrace.com/?a=267&c=1521&E=N%2fI8oeJiWSM%3d&s1=");
		auofferList.add("https://trck.addiliate.com/redirect.html?ad=84559E62");
		
		stateMap.put("New South Wales", "NSW");
		stateMap.put("Victoria", "Vic");
		stateMap.put("Queensland", "QLD");
		stateMap.put("South Australia", "SA");
		stateMap.put("Western Australia", "WA");
		stateMap.put("Tasmania", "TAS");
		stateMap.put("Northern Territory", "NT");
		stateMap.put("Australian Capital Territory", "ACT");
	}
	
	
	/**
	 * AU抽奖
	 * @return
	 * @throws InterruptedException 
	 */
	@RequestMapping("s/{offer}/{offer2}/{offer3}")
	public JsonResult<String> au(@PathVariable("offer") Integer offerIndex,@PathVariable("offer2") Integer offerIndex2,@PathVariable("offer3") Integer offerIndex3) throws InterruptedException {
	
		AuData data = auDataMapper.findByUseStatus(0);
		if(data == null || data.getEmail()== null || data.getFirstName() == null) {
			return JsonResult.error(ErrorEnum.ERROR_DATA_NOT_EXISTS, "数据库没有可用数据！");
		}
		
		//随机ua
		Integer count = userAgentDao.findCount();
		Random random = new Random();
		UserAgent ua = userAgentDao.findOneByLimit(random.nextInt(count));
		
		Integer scount = screenDao.findCount();
		Screen screen = screenDao.findOneByLimit(random.nextInt(scount));
		
		System.setProperty("webdriver.chrome.driver", driverPath);
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--user-agent=" + ua.getUserAgent());
		chromeOptions.addArguments("--window-size=" + screen.getScreen());
		chromeOptions.addArguments("--incognito");
		chromeOptions.addArguments("-lang=en-au");
		chromeOptions.addArguments("--disable-infobars");
		ChromeDriver driver = new ChromeDriver(chromeOptions);
		
		Random r = new Random();
		int step = r.nextInt(101);
		System.err.println("步骤随机数为:" + step);
		
		Runtime rt = Runtime.getRuntime();
		try {
			rt.exec(proxyToolPath + " -changeproxy/AU/" + data.getState());
		} catch (IOException e) {
			driver.quit();
			System.err.println("调用代理失败：插件路径错误！");
		}
		Thread.sleep(5000);
		
		//检测ip
		WebElement ip = null;
		WebDriverWait webDriverWait = new WebDriverWait(driver, 60);
		try {
			driver.get(ipPath); 
			driver.navigate().to(driver.getCurrentUrl());
			Thread.sleep(5000);
			driver.get(ipPath);
			Thread.sleep(5000);
			ip = webDriverWait.until(new ExpectedCondition<WebElement>() {
				@Override
				public WebElement apply(WebDriver d) {
					return d.findElement(By.id("ip"));
				}
			});
			
		} catch (Exception e) {
			driver.quit();
			return JsonResult.error(ErrorEnum.ERROR_SYSTEM, "调用代理失败，测试页面ip读取不到！");
		}
		
		String nowIP = ip.getText();
		if(defaultIP.equals(nowIP) || (prevIP != null && prevIP.equals(nowIP))) {
			System.out.println("调用代理失败：");
			driver.quit();
			return JsonResult.error(ErrorEnum.ERROR_SYSTEM, "调用代理失败！");
		}
		prevIP = nowIP;
		System.err.println("调用代理成功！");
		
		//标识资料数据被使用
		auDataMapper.updateStatusById(99 + "," + 99 + "," + 99, data.getId(), new Date(), "");
		
		//处理州名
//		String state = data.getState();
//		data.setState(stateMap.get(state));

		//执行脚本1
		int result = AuCj1Handler.handle(data, driver, auofferList.get(offerIndex));
//		
		//执行脚本2
		AuWish wish0 = wishDao.findOne(0);
		int result2 = AuCj2Handler.handle(data, driver, auofferList.get(offerIndex2), wish0);
		//标识wish被使用
		wishDao.update(wish0);
		
		
		//执行脚本3
		AuWish wish1 = wishDao.findOne(1);
		int result3 = AuCj3Handler.handle(data, driver, auofferList.get(offerIndex3), wish1);
		//标识wish被使用
		wishDao.update(wish1);
		
		//再次表示资料数据
		StringBuffer resultBuffer = new StringBuffer();
		resultBuffer.append(result);
		resultBuffer.append(",").append(result2);
		resultBuffer.append(",").append(result3);
		auDataMapper.updateStatusById(resultBuffer.toString(), data.getId(), new Date(), auofferList.get(offerIndex) + "," + auofferList.get(offerIndex2) + "," + auofferList.get(offerIndex3));

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return JsonResult.success(null, "执行结束时间：" + sdf.format(new Date()));
	}
	
	/**
	 * 从外部excel文件中导入用户资料到AU
	 * @throws Exception
	 */
	@RequestMapping("getUserMessageFromExcel")
	public void importUserMessageFromExcelToAu() throws Exception {
		List<AuData> ds = AUTemplatePoiHandler.read(au_filePath);
		for(AuData d : ds) {
			auDataMapper.insert(d);
		}
	}
	
	
	
	/**
	 * 从指定URL地址中抓取用户资料到AU
	 * @param num
	 * @return
	 */
	@RequestMapping("getUserMessageFromUrl/{num}")
	public JsonResult<String> importUserMessageFromUrlToAu(@PathVariable("num") Integer num) {
		
		List<AuData> list = AuGetDataFromUrlHandler.handle(driverPath, num);
		for(AuData d : list) {
			AuData data = auDataMapper.findBirthYearIsNull();
			if(data == null) {
				auDataMapper.insert(d);
				continue;
			}
			d.setId(data.getId());
			auDataMapper.update(d);
		}
		
		JsonResult<String> result = new JsonResult<>();
		result.setSuccessData("成功抓取" + num + "条数据！");
		return result;
	}
	
	@RequestMapping("getWish")
	public JsonResult<String> importWishToAU() throws IOException {
		File file = new File(wishPath);
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line = "";
		int num = 0;
		while((line = br.readLine()) != null) {
			num++;
			AuWish wish = new AuWish();
			wish.setContent(line);
			wish.setUseStatus("0");
			wish.setType(0);
			wishDao.insert(wish);
		}
		
		br.close();
		JsonResult<String> result = new JsonResult<>();
		result.setSuccessData("成功" + num + "条数据！");
		return result; 
	}
	
	@RequestMapping("getWinReason")
	public JsonResult<String> importWinReasonToAU() throws IOException {
		File file = new File(winPath);
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line = "";
		int num = 0;
		while((line = br.readLine()) != null) {
			num++;
			AuWish wish = new AuWish();
			wish.setContent(line);
			wish.setUseStatus("0");
			wish.setType(1);
			wishDao.insert(wish);
		}
		
		br.close();
		JsonResult<String> result = new JsonResult<>();
		result.setSuccessData("成功" + num + "条数据！");
		return result; 
	}
	
}
