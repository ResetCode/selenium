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
	
	//家
	private static String defaultIP = "111.194.44.70";
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
		//A
		auofferList.add("http://track.comgrate.com/click.php?c=44&key=knaqv147fu4cfyuf7z444uad");
		auofferList.add("http://track.comgrate.com/click.php?c=45&key=ca0meq3qudwad8z6w00f5dgj");
		auofferList.add("http://track.comgrate.com/click.php?c=46&key=47l5fgj8w4g8e75rz0zn10jt");
		
//		//B
//		auofferList.add("http://track.comgrate.com/click.php?c=17&key=839boky2b65dz7683774oqc9");
//		auofferList.add("http://track.comgrate.com/click.php?c=21&key=11l4t5q0lub41z41une7jjdr");
//		auofferList.add("http://www.braverymobtracking.com/tl?a=1372&o=14904");
//		//C
//		auofferList.add("http://track.comgrate.com/click.php?c=43&key=3ua4lez0m6e73rwwkc2mo4jq");
//		auofferList.add("http://track.comgrate.com/click.php?c=62&key=8tw590hijf33yvue74zreo30");
//		auofferList.add("http://track.comgrate.com/click.php?c=28&key=7820k83452m97kaz1wepyq50");
//		
//		//D
//		auofferList.add("http://track.comgrate.com/click.php?c=14&key=jd4bc580r023re7l02w5a9qq");
//		auofferList.add("http://track.comgrate.com/click.php?c=50&key=drkiow55j5ei9c9yd7icg4kw");
//		auofferList.add("http://track.comgrate.com/click.php?c=41&key=3v2k48603ufhsf4yuf8dz32q");
//		
//		//E
//		auofferList.add("http://track.comgrate.com/click.php?c=20&key=snavjz90v9sylbs14690j0h8");
//		auofferList.add("http://track.comgrate.com/click.php?c=40&key=q6sbnlj2f4s8kvgq5s55f965");
//		auofferList.add("http://www.braverymobtracking.com/tl?a=1372&o=14944");
//		
//		//F
//		auofferList.add("http://track.comgrate.com/click.php?c=49&key=c5rajcic7krq4hz533hj804a");
//		auofferList.add("http://track.comgrate.com/click.php?c=54&key=2bngqz5nb0847adv4r129863");
//		auofferList.add("http://track.comgrate.com/click.php?c=61&key=6t950e9sdvh0b0u9ahulb9m9");
		
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
	
		for(int i = 0; i< 20;i++) {
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
			auDataMapper.updateStatusById(99 + "," + 99 + "," + 99, data.getId(), new Date(), "");
			
			//处理州名
//			String state = data.getState();
//			data.setState(stateMap.get(state));

			//执行脚本1
			AuWish wish0 = wishDao.findOne(0);
			int result = AuCj1Handler.handle(data, driver, auofferList.get(offerIndex), wish0);
//			
			//执行脚本3
			AuWish wish1 = wishDao.findOne(1);
			int result3 = AuCj3Handler.handle(data, driver, auofferList.get(offerIndex3), wish1);
			//标识wish被使用
			wishDao.update(wish1);
			
			//执行脚本2
			int result2 = AuCj2Handler.handle(data, driver, auofferList.get(offerIndex2), wish0);
			//标识wish被使用
			wishDao.update(wish0);
			
			
			//再次表示资料数据
			StringBuffer resultBuffer = new StringBuffer();
			resultBuffer.append(result);
			resultBuffer.append(",").append(result2);
			resultBuffer.append(",").append(result3);
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
