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
import com.selenum.handler.AuCj1_2Handler;
import com.selenum.handler.AuCj2Handler;
import com.selenum.handler.AuCj3Handler;
import com.selenum.handler.AuCj6Handler;
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
	
	//家
	private static String defaultIP = "111.194.49.85";
	private final static String driverPath = "E:\\workspaces\\Java\\selenium\\selenium\\src\\main\\resources\\chromedriver.exe";
	private final static String proxyToolPath = "E:\\911S5 2018-09-10\\ProxyTool\\AutoProxyTool.exe";
	private final static String au_filePath = "E:\\workspaces\\Java\\selenium\\selenium\\src\\main\\resources\\au_data.xlsx";
	private final static String ipPath = "E:\\workspaces\\Java\\selenium\\selenium\\src\\main\\resources\\ip.html";
	private final static String wishPath = "E:\\workspace\\Java\\selenium\\selenium\\src\\main\\resources\\au_wish.txt";
	private final static String winPath = "E:\\workspace\\Java\\selenium\\selenium\\src\\main\\resources\\au_win.txt";
	
//	private static String defaultIP = "113.77.45.113";
//	private final static String driverPath = "E:\\workspaces\\selenium\\src\\main\\resources\\chromedriver.exe";
//	private final static String proxyToolPath = "C:\\Users\\Administrator.USER-20190127FQ\\Desktop\\911S5+2018-0910\\911S5 2018-0910\\ProxyTool\\AutoProxyTool.exe";
//	private final static String au_filePath = "E:\\workspaces\\selenium\\src\\main\\resources\\au_data.xlsx";
//	private final static String ipPath = "E:\\workspaces\\selenium\\src\\main\\resources\\ip.html";
//	private final static String wishPath = "E:\\workspaces\\selenium\\src\\main\\resources\\au_wish.txt";
//	private final static String winPath = "E:\\workspaces\\selenium\\src\\main\\resources\\au_win.txt";
	
//	private static String defaultIP = "183.22.35.81";
//	private final static String driverPath = "D:\\workspaces\\workspaces\\selenium\\src\\main\\resources\\chromedriver.exe";
//	private final static String proxyToolPath = "C:\\Users\\Administrator.USER-20190131AX\\Desktop\\911S5+2018-0910\\911S5 2018-0910\\ProxyTool\\AutoProxyTool.exe";
//	private final static String au_filePath = "D:\\workspaces\\workspaces\\selenium\\src\\main\\resources\\au_data.xlsx";
//	private final static String ipPath = "D:\\workspaces\\workspaces\\selenium\\src\\main\\resources\\ip.html";
//	private final static String wishPath = "D:\\workspaces\\workspaces\\selenium\\src\\main\\resources\\au_wish.txt";
//	private final static String winPath = "D:\\workspaces\\workspaces\\selenium\\src\\main\\resources\\au_win.txt";
	
	
	private final static List<String> auofferList = Lists.newArrayList();
	private final static Map<String, String> stateMap = Maps.newHashMap(); 
	
	static  {
		
		auofferList.add("https://trck.addiliate.com/redirect.html?ad=253F654X&add1=");
		//A 0/1/2
		auofferList.add("http://www.kolosia.com/t/u82-mu9-oro?clickid=[IMPRESSIONID]&bid=[BID]&websiteid=[WEBSITEID]&quality=[QUALITY]&categoryid=[CATEGORYID]&country=[COUNTRY]&formfactorname=[FORMFACTORNAME]&campaignid=[CAMPAIGNID]&campaignname=[CAMPAIGNNAME]&screenresolution=[SCREENRESOLUTION]");
		auofferList.add("http://www.kolosia.com/t/h5g-v0o-r69?clickid=[IMPRESSIONID]&bid=[BID]&websiteid=[WEBSITEID]&quality=[QUALITY]&categoryid=[CATEGORYID]&country=[COUNTRY]&formfactorname=[FORMFACTORNAME]&campaignid=[CAMPAIGNID]&campaignname=[CAMPAIGNNAME]&screenresolution=[SCREENRESOLUTION]");
		auofferList.add("http://www.kolosia.com/t/17e-aos-d11?clickid=[IMPRESSIONID]&bid=[BID]&websiteid=[WEBSITEID]&quality=[QUALITY]&categoryid=[CATEGORYID]&country=[COUNTRY]&formfactorname=[FORMFACTORNAME]&campaignid=[CAMPAIGNID]&campaignname=[CAMPAIGNNAME]&screenresolution=[SCREENRESOLUTION]");
		
		//B 3/4/5
		auofferList.add("http://www.kolosia.com/t/57r-h70-5u8?clickid=[IMPRESSIONID]&bid=[BID]&websiteid=[WEBSITEID]&quality=[QUALITY]&categoryid=[CATEGORYID]&country=[COUNTRY]&formfactorname=[FORMFACTORNAME]&campaignid=[CAMPAIGNID]&campaignname=[CAMPAIGNNAME]&screenresolution=[SCREENRESOLUTION]");
		auofferList.add("http://www.kolosia.com/t/ubu-coo-chr?clickid=[IMPRESSIONID]&bid=[BID]&websiteid=[WEBSITEID]&quality=[QUALITY]&categoryid=[CATEGORYID]&country=[COUNTRY]&formfactorname=[FORMFACTORNAME]&campaignid=[CAMPAIGNID]&campaignname=[CAMPAIGNNAME]&screenresolution=[SCREENRESOLUTION]");
		auofferList.add("http://www.kolosia.com/t/rfg-10a-qcg?clickid=[IMPRESSIONID]&bid=[BID]&websiteid=[WEBSITEID]&quality=[QUALITY]&categoryid=[CATEGORYID]&country=[COUNTRY]&formfactorname=[FORMFACTORNAME]&campaignid=[CAMPAIGNID]&campaignname=[CAMPAIGNNAME]&screenresolution=[SCREENRESOLUTION]");
		//C 6/7/8
		auofferList.add("http://www.kolosia.com/t/glh-c7t-8bs?clickid=[IMPRESSIONID]&bid=[BID]&websiteid=[WEBSITEID]&quality=[QUALITY]&categoryid=[CATEGORYID]&country=[COUNTRY]&formfactorname=[FORMFACTORNAME]&campaignid=[CAMPAIGNID]&campaignname=[CAMPAIGNNAME]&screenresolution=[SCREENRESOLUTION]");
		auofferList.add("http://www.kolosia.com/t/ok6-lam-hgj?clickid=[IMPRESSIONID]&bid=[BID]&websiteid=[WEBSITEID]&quality=[QUALITY]&categoryid=[CATEGORYID]&country=[COUNTRY]&formfactorname=[FORMFACTORNAME]&campaignid=[CAMPAIGNID]&campaignname=[CAMPAIGNNAME]&screenresolution=[SCREENRESOLUTION]");
		auofferList.add("http://www.kolosia.com/t/3lq-65b-hce?clickid=[IMPRESSIONID]&bid=[BID]&websiteid=[WEBSITEID]&quality=[QUALITY]&categoryid=[CATEGORYID]&country=[COUNTRY]&formfactorname=[FORMFACTORNAME]&campaignid=[CAMPAIGNID]&campaignname=[CAMPAIGNNAME]&screenresolution=[SCREENRESOLUTION]");
		
		//D 9/10/11
		auofferList.add("http://www.kolosia.com/t/a2e-1do-lhb?clickid=[IMPRESSIONID]&bid=[BID]&websiteid=[WEBSITEID]&quality=[QUALITY]&categoryid=[CATEGORYID]&country=[COUNTRY]&formfactorname=[FORMFACTORNAME]&campaignid=[CAMPAIGNID]&campaignname=[CAMPAIGNNAME]&screenresolution=[SCREENRESOLUTION]");
		auofferList.add("http://www.kolosia.com/t/a73-ubq-ls7?clickid=[IMPRESSIONID]&bid=[BID]&websiteid=[WEBSITEID]&quality=[QUALITY]&categoryid=[CATEGORYID]&country=[COUNTRY]&formfactorname=[FORMFACTORNAME]&campaignid=[CAMPAIGNID]&campaignname=[CAMPAIGNNAME]&screenresolution=[SCREENRESOLUTION]");
		auofferList.add("http://www.kolosia.com/t/01b-u0h-sa0?clickid=[IMPRESSIONID]&bid=[BID]&websiteid=[WEBSITEID]&quality=[QUALITY]&categoryid=[CATEGORYID]&country=[COUNTRY]&formfactorname=[FORMFACTORNAME]&campaignid=[CAMPAIGNID]&campaignname=[CAMPAIGNNAME]&screenresolution=[SCREENRESOLUTION]");
						 
//		E 12/13/14
		auofferList.add("http://www.kolosia.com/t/ned-3u2-qqb?clickid=[IMPRESSIONID]&bid=[BID]&websiteid=[WEBSITEID]&quality=[QUALITY]&categoryid=[CATEGORYID]&country=[COUNTRY]&formfactorname=[FORMFACTORNAME]&campaignid=[CAMPAIGNID]&campaignname=[CAMPAIGNNAME]&screenresolution=[SCREENRESOLUTION]");
		auofferList.add("http://www.kolosia.com/t/0np-h3u-l76?clickid=[IMPRESSIONID]&bid=[BID]&websiteid=[WEBSITEID]&quality=[QUALITY]&categoryid=[CATEGORYID]&country=[COUNTRY]&formfactorname=[FORMFACTORNAME]&campaignid=[CAMPAIGNID]&campaignname=[CAMPAIGNNAME]&screenresolution=[SCREENRESOLUTION]");
		auofferList.add("http://www.kolosia.com/t/vq3-9d4-jgo?clickid=[IMPRESSIONID]&bid=[BID]&websiteid=[WEBSITEID]&quality=[QUALITY]&categoryid=[CATEGORYID]&country=[COUNTRY]&formfactorname=[FORMFACTORNAME]&campaignid=[CAMPAIGNID]&campaignname=[CAMPAIGNNAME]&screenresolution=[SCREENRESOLUTION]");
		
		//F 15/16/17
		auofferList.add("http://www.kolosia.com/t/cui-7d3-m7c?clickid=[IMPRESSIONID]&bid=[BID]&websiteid=[WEBSITEID]&quality=[QUALITY]&categoryid=[CATEGORYID]&country=[COUNTRY]&formfactorname=[FORMFACTORNAME]&campaignid=[CAMPAIGNID]&campaignname=[CAMPAIGNNAME]&screenresolution=[SCREENRESOLUTION]");
		auofferList.add("http://www.kolosia.com/t/fuc-7hm-gq7?clickid=[IMPRESSIONID]&bid=[BID]&websiteid=[WEBSITEID]&quality=[QUALITY]&categoryid=[CATEGORYID]&country=[COUNTRY]&formfactorname=[FORMFACTORNAME]&campaignid=[CAMPAIGNID]&campaignname=[CAMPAIGNNAME]&screenresolution=[SCREENRESOLUTION]");
		auofferList.add("http://www.kolosia.com/t/2mm-vcl-v3b?clickid=[IMPRESSIONID]&bid=[BID]&websiteid=[WEBSITEID]&quality=[QUALITY]&categoryid=[CATEGORYID]&country=[COUNTRY]&formfactorname=[FORMFACTORNAME]&campaignid=[CAMPAIGNID]&campaignname=[CAMPAIGNNAME]&screenresolution=[SCREENRESOLUTION]");
		
		//A2 18/19/20
		auofferList.add("http://www.kolosia.com/t/52v-vse-a4f?clickid=[IMPRESSIONID]&bid=[BID]&websiteid=[WEBSITEID]&quality=[QUALITY]&categoryid=[CATEGORYID]&country=[COUNTRY]&formfactorname=[FORMFACTORNAME]&campaignid=[CAMPAIGNID]&campaignname=[CAMPAIGNNAME]&screenresolution=[SCREENRESOLUTION]");
		auofferList.add("http://www.kolosia.com/t/2j9-444-vhs?clickid=[IMPRESSIONID]&bid=[BID]&websiteid=[WEBSITEID]&quality=[QUALITY]&categoryid=[CATEGORYID]&country=[COUNTRY]&formfactorname=[FORMFACTORNAME]&campaignid=[CAMPAIGNID]&campaignname=[CAMPAIGNNAME]&screenresolution=[SCREENRESOLUTION]");
		auofferList.add("http://www.kolosia.com/t/4sd-9hc-rq5?clickid=[IMPRESSIONID]&bid=[BID]&websiteid=[WEBSITEID]&quality=[QUALITY]&categoryid=[CATEGORYID]&country=[COUNTRY]&formfactorname=[FORMFACTORNAME]&campaignid=[CAMPAIGNID]&campaignname=[CAMPAIGNNAME]&screenresolution=[SCREENRESOLUTION]");
		
		//B2 21/22/23
		auofferList.add("http://www.kolosia.com/t/q57-cfq-ktf?clickid=[IMPRESSIONID]&bid=[BID]&websiteid=[WEBSITEID]&quality=[QUALITY]&categoryid=[CATEGORYID]&country=[COUNTRY]&formfactorname=[FORMFACTORNAME]&campaignid=[CAMPAIGNID]&campaignname=[CAMPAIGNNAME]&screenresolution=[SCREENRESOLUTION]");
		auofferList.add("http://www.kolosia.com/t/h4k-mis-ti2?clickid=[IMPRESSIONID]&bid=[BID]&websiteid=[WEBSITEID]&quality=[QUALITY]&categoryid=[CATEGORYID]&country=[COUNTRY]&formfactorname=[FORMFACTORNAME]&campaignid=[CAMPAIGNID]&campaignname=[CAMPAIGNNAME]&screenresolution=[SCREENRESOLUTION]");
		auofferList.add("http://www.kolosia.com/t/1d3-v2r-gv9?clickid=[IMPRESSIONID]&bid=[BID]&websiteid=[WEBSITEID]&quality=[QUALITY]&categoryid=[CATEGORYID]&country=[COUNTRY]&formfactorname=[FORMFACTORNAME]&campaignid=[CAMPAIGNID]&campaignname=[CAMPAIGNNAME]&screenresolution=[SCREENRESOLUTION]");
		
		//C2 24/25/26
		auofferList.add("http://www.kolosia.com/t/n4d-e0m-c7s?clickid=[IMPRESSIONID]&bid=[BID]&websiteid=[WEBSITEID]&quality=[QUALITY]&categoryid=[CATEGORYID]&country=[COUNTRY]&formfactorname=[FORMFACTORNAME]&campaignid=[CAMPAIGNID]&campaignname=[CAMPAIGNNAME]&screenresolution=[SCREENRESOLUTION]");
		auofferList.add("http://www.kolosia.com/t/oni-ahs-n49?clickid=[IMPRESSIONID]&bid=[BID]&websiteid=[WEBSITEID]&quality=[QUALITY]&categoryid=[CATEGORYID]&country=[COUNTRY]&formfactorname=[FORMFACTORNAME]&campaignid=[CAMPAIGNID]&campaignname=[CAMPAIGNNAME]&screenresolution=[SCREENRESOLUTION]");
		auofferList.add("http://www.kolosia.com/t/4sg-qcu-ang?clickid=[IMPRESSIONID]&bid=[BID]&websiteid=[WEBSITEID]&quality=[QUALITY]&categoryid=[CATEGORYID]&country=[COUNTRY]&formfactorname=[FORMFACTORNAME]&campaignid=[CAMPAIGNID]&campaignname=[CAMPAIGNNAME]&screenresolution=[SCREENRESOLUTION]");
		
		//D2 27/28/29
		auofferList.add("http://www.kolosia.com/t/tag-6uc-uh2?clickid=[IMPRESSIONID]&bid=[BID]&websiteid=[WEBSITEID]&quality=[QUALITY]&categoryid=[CATEGORYID]&country=[COUNTRY]&formfactorname=[FORMFACTORNAME]&campaignid=[CAMPAIGNID]&campaignname=[CAMPAIGNNAME]&screenresolution=[SCREENRESOLUTION]");
		auofferList.add("http://www.kolosia.com/t/o6t-kgg-86o?clickid=[IMPRESSIONID]&bid=[BID]&websiteid=[WEBSITEID]&quality=[QUALITY]&categoryid=[CATEGORYID]&country=[COUNTRY]&formfactorname=[FORMFACTORNAME]&campaignid=[CAMPAIGNID]&campaignname=[CAMPAIGNNAME]&screenresolution=[SCREENRESOLUTION]");
		auofferList.add("http://www.kolosia.com/t/i1n-urp-0h2?clickid=[IMPRESSIONID]&bid=[BID]&websiteid=[WEBSITEID]&quality=[QUALITY]&categoryid=[CATEGORYID]&country=[COUNTRY]&formfactorname=[FORMFACTORNAME]&campaignid=[CAMPAIGNID]&campaignname=[CAMPAIGNNAME]&screenresolution=[SCREENRESOLUTION]");
		
		//E2 30/31/32
		auofferList.add("http://www.kolosia.com/t/3kq-d7q-a5u?clickid=[IMPRESSIONID]&bid=[BID]&websiteid=[WEBSITEID]&quality=[QUALITY]&categoryid=[CATEGORYID]&country=[COUNTRY]&formfactorname=[FORMFACTORNAME]&campaignid=[CAMPAIGNID]&campaignname=[CAMPAIGNNAME]&screenresolution=[SCREENRESOLUTION]");
		auofferList.add("http://www.kolosia.com/t/777-vhg-sk1?clickid=[IMPRESSIONID]&bid=[BID]&websiteid=[WEBSITEID]&quality=[QUALITY]&categoryid=[CATEGORYID]&country=[COUNTRY]&formfactorname=[FORMFACTORNAME]&campaignid=[CAMPAIGNID]&campaignname=[CAMPAIGNNAME]&screenresolution=[SCREENRESOLUTION]");
		auofferList.add("http://www.kolosia.com/t/qnv-f7k-5eq?clickid=[IMPRESSIONID]&bid=[BID]&websiteid=[WEBSITEID]&quality=[QUALITY]&categoryid=[CATEGORYID]&country=[COUNTRY]&formfactorname=[FORMFACTORNAME]&campaignid=[CAMPAIGNID]&campaignname=[CAMPAIGNNAME]&screenresolution=[SCREENRESOLUTION]");

		//F2 33/34/35
		auofferList.add("http://www.kolosia.com/t/0r9-kc1-bkh?clickid=[IMPRESSIONID]&bid=[BID]&websiteid=[WEBSITEID]&quality=[QUALITY]&categoryid=[CATEGORYID]&country=[COUNTRY]&formfactorname=[FORMFACTORNAME]&campaignid=[CAMPAIGNID]&campaignname=[CAMPAIGNNAME]&screenresolution=[SCREENRESOLUTION]");
		auofferList.add("http://www.kolosia.com/t/1t9-9qn-lsq?clickid=[IMPRESSIONID]&bid=[BID]&websiteid=[WEBSITEID]&quality=[QUALITY]&categoryid=[CATEGORYID]&country=[COUNTRY]&formfactorname=[FORMFACTORNAME]&campaignid=[CAMPAIGNID]&campaignname=[CAMPAIGNNAME]&screenresolution=[SCREENRESOLUTION]");
		auofferList.add("http://www.kolosia.com/t/m0g-3df-lhh?clickid=[IMPRESSIONID]&bid=[BID]&websiteid=[WEBSITEID]&quality=[QUALITY]&categoryid=[CATEGORYID]&country=[COUNTRY]&formfactorname=[FORMFACTORNAME]&campaignid=[CAMPAIGNID]&campaignname=[CAMPAIGNNAME]&screenresolution=[SCREENRESOLUTION]");

		
		
		
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
	@RequestMapping("s/{offer}/{offer2}/{offer3}/{offer4}")
	public JsonResult<String> au(@PathVariable("offer") Integer offerIndex,@PathVariable("offer2") Integer offerIndex2,
			@PathVariable("offer3") Integer offerIndex3,@PathVariable("offer4") Integer offerIndex4) throws InterruptedException {
	
		for(int i = 0; i< Integer.MAX_VALUE;i++) {
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
			chromeOptions.addArguments("--lang=en-au");
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
//				return JsonResult.error(ErrorEnum.ERROR_SYSTEM, "调用代理失败，测试页面ip读取不到！");
				continue;
			}
			
			String nowIP = ip.getText();
			if(defaultIP.equals(nowIP) || (prevIP != null && prevIP.equals(nowIP))) {
				System.out.println("调用代理失败：");
				driver.quit();
//				return JsonResult.error(ErrorEnum.ERROR_SYSTEM, "调用代理失败！");
				continue;
			}
			prevIP = nowIP;
			System.err.println("调用代理成功！");
			
			//标识资料数据被使用
			auDataMapper.updateStatusById("99,99,99", data.getId(), new Date(), "");
			
			//处理州名
//			String state = data.getState();
//			data.setState(stateMap.get(state));
			
			//执行脚本1
			AuWish wish0 = wishDao.findOne(0);
			int result = -1;
			if(offerIndex.intValue() == 24) {
				result = AuCj1_2Handler.handle(data, driver, auofferList.get(offerIndex), wish0);
			} else {
				result = AuCj1Handler.handle(data, driver, auofferList.get(offerIndex), wish0);
			}
			if(result == 5) {
				auDataMapper.updateStatusById(result + "", data.getId(), new Date(), "phone no pass！");
				driver.quit();
				continue;
			} else if(result == 6){
				auDataMapper.updateStatusById(result + "", data.getId(), new Date(), "email no pass！");
				driver.quit();
				continue;
			}

			//执行脚本3
			AuWish wish1 = wishDao.findOne(1);
			int result3 = AuCj3Handler.handle(data, driver, auofferList.get(offerIndex3), wish1);
			//标识wish被使用
			wishDao.update(wish1);
			
			//执行脚本6
			int result4 = AuCj6Handler.handle(data, driver, auofferList.get(offerIndex4), null);
			
			//执行脚本2
			int result2 = AuCj2Handler.handle(data, driver, auofferList.get(offerIndex2), wish0);
			//标识wish被使用
			wishDao.update(wish0);
			
			
			//再次表示资料数据
			StringBuffer resultBuffer = new StringBuffer();
			resultBuffer.append(result);
			resultBuffer.append(",").append(result2);
			resultBuffer.append(",").append(result3);
			resultBuffer.append(",").append(result4);
			auDataMapper.updateStatusById(resultBuffer.toString(), data.getId(), new Date(), auofferList.get(offerIndex) + "," + auofferList.get(offerIndex2) + "," + auofferList.get(offerIndex3));
			Thread.sleep(20000);
			driver.quit();
		}
		
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
