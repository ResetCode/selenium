package com.selenum.model;

public class UserAgent {
	/**  */
	protected Integer id;
	/** 设备名 */
	protected String device;
	/** 操作系统 */
	protected String system;
	/** 浏览器 */
	protected String browser;
	/** User_Agent */
	protected String userAgent;
	/** 1:是手机，0：是pc */
	protected Integer isMobile;

	public UserAgent() {

	}

	/**
	 * 获取
	 * 
	 * @return 
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * 设置
	 * 
	 * @param id
	 *            
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * 获取设备名
	 * 
	 * @return 设备名
	 */
	public String getDevice() {
		return device;
	}

	/**
	 * 设置设备名
	 * 
	 * @param device
	 *            设备名
	 */
	public void setDevice(String device) {
		this.device = device;
	}

	/**
	 * 获取操作系统
	 * 
	 * @return 操作系统
	 */
	public String getSystem() {
		return system;
	}

	/**
	 * 设置操作系统
	 * 
	 * @param system
	 *            操作系统
	 */
	public void setSystem(String system) {
		this.system = system;
	}

	/**
	 * 获取浏览器
	 * 
	 * @return 浏览器
	 */
	public String getBrowser() {
		return browser;
	}

	/**
	 * 设置浏览器
	 * 
	 * @param browser
	 *            浏览器
	 */
	public void setBrowser(String browser) {
		this.browser = browser;
	}

	/**
	 * 获取User_Agent
	 * 
	 * @return User_Agent
	 */
	public String getUserAgent() {
		return userAgent;
	}

	/**
	 * 设置User_Agent
	 * 
	 * @param userAgent
	 *            User_Agent
	 */
	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}

	/**
	 * 获取1:是手机，0：是pc
	 * 
	 * @return 1:是手机，0：是pc
	 */
	public Integer getIsMobile() {
		return isMobile;
	}

	/**
	 * 设置1:是手机，0：是pc
	 * 
	 * @param isMobile
	 *            1:是手机，0：是pc
	 */
	public void setIsMobile(Integer isMobile) {
		this.isMobile = isMobile;
	}

}
