package com.selenum.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.selenum.dao.UserAgentDao;
import com.selenum.model.UserAgent;
import com.using.common.core.bean.JsonResult;

@RestController
@RequestMapping("ua")
public class UserAgentController {

	private final static String uaPath = "E:\\workspaces\\Java\\selenium\\selenium\\src\\main\\resources\\ua.log";
	
	@Autowired
	private UserAgentDao userAgentDao;
	
	/**
	 * 从外部文件txt导入ua到数据库
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("importUserAgentData")
	public JsonResult<String> importUserAgentData() throws Exception {
		
		File file = new File(uaPath);
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line = "";
		int num = 0;
		while((line = br.readLine()) != null) {
			num++;
			UserAgent userAgent = new UserAgent();
			userAgent.setUserAgent(line);
			userAgentDao.insert(userAgent);
		}
		
		br.close();
		JsonResult<String> result = new JsonResult<>();
		result.setSuccessData("成功" + num + "条数据！");
		return result;
	}
	
}
