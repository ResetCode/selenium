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

import org.apache.commons.lang3.StringUtils;
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
import com.selenum.dao.ScreenDao;
import com.selenum.dao.UsDataDao;
import com.selenum.dao.UsDataStateDao;
import com.selenum.dao.UserAgentDao;
import com.selenum.handler.USTemplatePoiHandler;
import com.selenum.handler.UsCj1Handler;
import com.selenum.handler.UsCj2Handler;
import com.selenum.handler.UsGetDataFromUrlHandler;
import com.selenum.model.Screen;
import com.selenum.model.UsData;
import com.selenum.model.UsDataState;
import com.selenum.model.UserAgent;
import com.using.common.core.bean.ErrorEnum;
import com.using.common.core.bean.JsonResult;

@RestController
@RequestMapping("cj/us")
public class UsCjController {

	@Autowired
	private UsDataDao usDataMapper;
	@Autowired
	private UsDataStateDao usDataStateMapper;
	@Autowired
	private UserAgentDao userAgentDao;
	@Autowired
	private ScreenDao screenDao;
	
	private static String prevIP = null;
	
	private static String defaultIP = "106.120.89.26";
	private final static String driverPath = "E:\\workspace\\selenium-master\\selenium\\src\\main\\resources\\chromedriver.exe";
	private final static String proxyToolPath = "C:\\Users\\lyx-pc-0018\\Desktop\\911S5 2018-05-23\\911S5 2018-05-23 fixed\\ProxyTool\\AutoProxyTool.exe";
	private final static String jsPath = "E:\\workspace\\selenium-master\\selenium\\src\\main\\resources\\main.js";
	private final static String filePath = "E:\\workspace\\selenium-master\\selenium\\src\\main\\resources\\us_data.xls";
	private final static String emailPath = "E:\\workspace\\selenium-master\\selenium\\src\\main\\resources\\EMAIL.txt";
	private final static String ipPath = "E:\\workspace\\selenium-master\\selenium\\src\\main\\resources\\ip.html";

	//家
	//	private static String defaultIP = "111.194.49.215";
//	private final static String driverPath = "E:\\workspaces\\Java\\selenium\\selenium\\src\\main\\resources\\chromedriver.exe";
//	private final static String proxyToolPath = "E:\\911S5 2018-09-10\\ProxyTool\\AutoProxyTool.exe";
//	private final static String jsPath = "E:\\workspaces\\Java\\selenium\\selenium\\src\\main\\resources\\main.js";
//	private final static String filePath = "E:\\workspaces\\Java\\selenium\\selenium\\src\\main\\resources\\us_data.xls";
//	private final static String emailPath = "E:\\workspaces\\Java\\selenium\\selenium\\src\\main\\resources\\EMAIL.txt";
//	private final static String ipPath = "E:\\workspaces\\Java\\selenium\\selenium\\src\\main\\resources\\ip.html";
	
	//meow 
//	private static String defaultIP = "113.77.46.183";
//	private final static String driverPath = "E:\\workspaces\\selenium\\src\\main\\resources\\chromedriver.exe";
//	private final static String proxyToolPath = "C:\\Users\\Administrator\\Desktop\\911S5 2018-05-23 fixed\\ProxyTool\\AutoProxyTool.exe";
//	private final static String jsPath = "E:\\workspaces\\selenium\\src\\main\\resources\\main.js";
//	private final static String filePath = "E:\\workspaces\\selenium\\src\\main\\resources\\us_data.xls";
//	private final static String emailPath = "E:\\workspaces\\selenium\\src\\main\\resources\\EMAIL.txt";
//	private final static String ipPath = "E:\\workspaces\\selenium\\src\\main\\resources\\ip.html";
	
	private final static List<String> usofferList = Lists.newArrayList();
	private final static Map<String, String> stateMap = Maps.newHashMap(); 
	
	static  {
		usofferList.add("http://www.braverymobtracking.com/tl?a=1372&o=18255"); //0  
		usofferList.add("http://www.braverymobtracking.com/tl?a=1372&o=17557"); //1
	}
	
	/**
	 * Us抽奖
	 * @return
	 * @throws InterruptedException 
	 */
	@RequestMapping("s/{offer}/{offer2}")
	public JsonResult<String> ua(@PathVariable("offer") Integer offerIndex,@PathVariable("offer2") Integer offerIndex2) throws InterruptedException {
	
		//查询资料
		UsData data = usDataMapper.findByUseStatus(0);
		if(data == null || data.getEmail()== null || data.getFirstName() == null) {
			return JsonResult.error(ErrorEnum.ERROR_DATA_NOT_EXISTS, "数据库没有可用数据！");
		}
		String state = data.getState();
		String stateCode = data.getStateCode();
		if(StringUtils.isBlank(state)) { //如果为空，则去匹配州全名
			if(StringUtils.isBlank(stateCode)) {
				return JsonResult.error(ErrorEnum.ERROR_DATA_EXISTS,"州名和州缩写全部为空！资料id:" + data.getId());
			}
			UsDataState UsDataState = usDataStateMapper.findByStateCode(stateCode);
			if(UsDataState == null) {
				return JsonResult.error(ErrorEnum.ERROR_DATA_EXISTS,"州名匹配错误！stateCode:" + stateCode);
			}
			state = UsDataState.getState();
			data.setState(state);
		}
		
		//查询user-agent
		Integer count = userAgentDao.findCount();
		Random random = new Random();
		UserAgent ua = userAgentDao.findOneByLimit(random.nextInt(count));
		
		Integer scount = screenDao.findCount();
		Screen screen = screenDao.findOneByLimit(random.nextInt(scount));
		
		//切换ip
		System.setProperty("webdriver.chrome.driver", driverPath);
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--user-agent=" + ua.getUserAgent());
		chromeOptions.addArguments("--window-size=" + screen.getScreen());
		chromeOptions.addArguments("--incognito");
		chromeOptions.addArguments("-lang=en-us");
		chromeOptions.addArguments("--disable-infobars");
		
		ChromeDriver driver = new ChromeDriver(chromeOptions);
		
		Runtime rt = Runtime.getRuntime();
		try {
			rt.exec(proxyToolPath + " -changeproxy/US");
		} catch (IOException e) {
			return JsonResult.error(ErrorEnum.ERROR_SYSTEM, "调用代理失败！");
		}
		Thread.sleep(5000);
		//检测ip
		WebElement ip = null;
		WebDriverWait webDriverWait = new WebDriverWait(driver, 60);
		try {
			driver.get(ipPath); 
			driver.navigate().to(driver.getCurrentUrl());
			Thread.sleep(5000);
			driver.navigate().to(driver.getCurrentUrl());
			ip = webDriverWait.until(new ExpectedCondition<WebElement>() {
				@Override
				public WebElement apply(WebDriver d) {
					return d.findElement(By.id("ip"));
				}
			});
			
		} catch (Exception e) {
			return JsonResult.error(ErrorEnum.ERROR_SYSTEM, "调用代理失败！");
		}
		
		String nowIP = ip.getText();
		if(defaultIP.equals(nowIP) || (prevIP != null && prevIP.equals(nowIP))) {
			System.out.println("调用代理失败");
			return JsonResult.error(ErrorEnum.ERROR_SYSTEM, "调用代理失败！");
		}
		prevIP = nowIP;
		System.err.println("调用代理成功！");
		
		driver.manage().deleteAllCookies();
		System.err.println("切换代理完毕，等待5s，offer自动化准备开始！");
		Thread.sleep(5000);
		
		//随机性别
		Random radom = new Random();
		Integer sex = radom.nextInt(2);
		data.setSex(sex == 2 ? 1 : sex);
		
		//标识资料数据被使用
		usDataMapper.updateStatusById(99 + "," + 99, data.getId(), new Date());
		
		int result = UsCj1Handler.handle(driver, data, jsPath, usofferList.get(offerIndex));
		int result2 = UsCj2Handler.handle(driver, data, usofferList.get(offerIndex2));
		
		//再次表示资料数据
		StringBuffer resultBuffer = new StringBuffer();
		resultBuffer.append(result);
		resultBuffer.append(",").append(result2);
		
		usDataMapper.updateStatusById(resultBuffer.toString(), data.getId(), new Date());
		driver.quit();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return JsonResult.success(null, "执行结束时间：" + sdf.format(new Date()));
	}
	
	
	/**
	 * 从外部excel文件中导入用户资料到US
	 * @throws Exception
	 */
	@RequestMapping("importUserMessageFromExcelToUs")
	public void importExcelData() throws Exception {
		List<UsData> ds = USTemplatePoiHandler.read(filePath);
		for(UsData d : ds) {
			usDataMapper.insert(d);
		}
	}
	
	/**
	 * 从指定URL地址中抓取用户资料到US
	 * @param num
	 * @return
	 */
	@RequestMapping("importUserMessageFromUrlToUs/{num}")
	public JsonResult<String> getDataFromUrl(@PathVariable("num") Integer num) {
		
		List<UsData> list = UsGetDataFromUrlHandler.handle(driverPath, num);
		for(UsData d : list) {
			UsData data = usDataMapper.findByFirstNameIsNull();
			if(data == null) {
				usDataMapper.insert(d);
				continue;
			}
			d.setId(data.getId());
			usDataMapper.update(d);
		}
		
		JsonResult<String> result = new JsonResult<>();
		result.setSuccessData("成功抓取" + num + "条数据！");
		return result;
	}
	
	
	/**
	 * 从外部txt文件导入邮箱到US
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("importEmailToUs")
	public JsonResult<String> importEmailData() throws Exception {
		
		File file = new File(emailPath);
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line = "";
		int num = 0;
		while ((line = br.readLine()) != null) {
			num++;
			UsData data = usDataMapper.findByEmailIsNull();
			if(data == null) {
				data = new UsData();
				data.setEmail(line);
				data.setCreateTime(new Date());
				data.setUseStatus("0");
				usDataMapper.insert(data);
				continue;
			}
			data.setEmail(line);
			usDataMapper.update(data);
		}
		
		br.close();
		JsonResult<String> result = new JsonResult<>();
		result.setSuccessData("成功" + num + "条数据！");
		return result;
	}
}
