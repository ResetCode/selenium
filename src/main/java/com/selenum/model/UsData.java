package com.selenum.model;

import java.util.Date;

public class UsData {
	/**  */
	protected Long id;
	/**  */
	protected String email;
	/**  */
	protected String firstName;
	/**  */
	protected String lastName;
	/**  */
	protected String primaryPhone;
	/**  */
	protected String streetAddress;
	/**  */
	protected String city;
	/**  */
	protected String zipCode;
	/**  */
	protected Integer sex;
	/** 州全名 */
	protected String state;
	/**  */
	protected String birthYear;
	/**  */
	protected String birthMonth;
	/**  */
	protected String birthDay;
	/**  */
	protected Date createTime;
	/** 州缩写 */
	protected String stateCode;
	/** 抽奖状态：0未使用1使用2废资料3提交后异常，默认为0，多个以逗号隔开 */
	protected String useStatus;
	/** 提交时间 */
	protected Date submitTime;
	/** offer提交地址 */
	protected String submitOffer;

	public UsData() {

	}

	/**
	 * 获取
	 * 
	 * @return 
	 */
	public Long getId() {
		return id;
	}

	/**
	 * 设置
	 * 
	 * @param id
	 *            
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * 获取
	 * 
	 * @return 
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * 设置
	 * 
	 * @param email
	 *            
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * 获取
	 * 
	 * @return 
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * 设置
	 * 
	 * @param firstName
	 *            
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * 获取
	 * 
	 * @return 
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * 设置
	 * 
	 * @param lastName
	 *            
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * 获取
	 * 
	 * @return 
	 */
	public String getPrimaryPhone() {
		return primaryPhone;
	}

	/**
	 * 设置
	 * 
	 * @param primaryPhone
	 *            
	 */
	public void setPrimaryPhone(String primaryPhone) {
		this.primaryPhone = primaryPhone;
	}

	/**
	 * 获取
	 * 
	 * @return 
	 */
	public String getStreetAddress() {
		return streetAddress;
	}

	/**
	 * 设置
	 * 
	 * @param streetAddress
	 *            
	 */
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	/**
	 * 获取
	 * 
	 * @return 
	 */
	public String getCity() {
		return city;
	}

	/**
	 * 设置
	 * 
	 * @param city
	 *            
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * 获取
	 * 
	 * @return 
	 */
	public String getZipCode() {
		return zipCode;
	}

	/**
	 * 设置
	 * 
	 * @param zipCode
	 *            
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	/**
	 * 获取
	 * 
	 * @return 
	 */
	public Integer getSex() {
		return sex;
	}

	/**
	 * 设置
	 * 
	 * @param sex
	 *            
	 */
	public void setSex(Integer sex) {
		this.sex = sex;
	}

	/**
	 * 获取州全名
	 * 
	 * @return 州全名
	 */
	public String getState() {
		return state;
	}

	/**
	 * 设置州全名
	 * 
	 * @param state
	 *            州全名
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * 获取
	 * 
	 * @return 
	 */
	public String getBirthYear() {
		return birthYear;
	}

	/**
	 * 设置
	 * 
	 * @param birthYear
	 *            
	 */
	public void setBirthYear(String birthYear) {
		this.birthYear = birthYear;
	}

	/**
	 * 获取
	 * 
	 * @return 
	 */
	public String getBirthMonth() {
		return birthMonth;
	}

	/**
	 * 设置
	 * 
	 * @param birthMonth
	 *            
	 */
	public void setBirthMonth(String birthMonth) {
		this.birthMonth = birthMonth;
	}

	/**
	 * 获取
	 * 
	 * @return 
	 */
	public String getBirthDay() {
		return birthDay;
	}

	/**
	 * 设置
	 * 
	 * @param birthDay
	 *            
	 */
	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	/**
	 * 获取
	 * 
	 * @return 
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * 设置
	 * 
	 * @param createTime
	 *            
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * 获取州缩写
	 * 
	 * @return 州缩写
	 */
	public String getStateCode() {
		return stateCode;
	}

	/**
	 * 设置州缩写
	 * 
	 * @param stateCode
	 *            州缩写
	 */
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	/**
	 * 获取抽奖状态：0未使用1使用2废资料3提交后异常，默认为0，多个以逗号隔开
	 * 
	 * @return 抽奖状态：0未使用1使用2废资料3提交后异常，默认为0，多个以逗号隔开
	 */
	public String getUseStatus() {
		return useStatus;
	}

	/**
	 * 设置抽奖状态：0未使用1使用2废资料3提交后异常，默认为0，多个以逗号隔开
	 * 
	 * @param useStatus
	 *            抽奖状态：0未使用1使用2废资料3提交后异常，默认为0，多个以逗号隔开
	 */
	public void setUseStatus(String useStatus) {
		this.useStatus = useStatus;
	}

	/**
	 * 获取提交时间
	 * 
	 * @return 提交时间
	 */
	public Date getSubmitTime() {
		return submitTime;
	}

	/**
	 * 设置提交时间
	 * 
	 * @param submitTime
	 *            提交时间
	 */
	public void setSubmitTime(Date submitTime) {
		this.submitTime = submitTime;
	}

	/**
	 * 获取offer提交地址
	 * 
	 * @return offer提交地址
	 */
	public String getSubmitOffer() {
		return submitOffer;
	}

	/**
	 * 设置offer提交地址
	 * 
	 * @param submitOffer
	 *            offer提交地址
	 */
	public void setSubmitOffer(String submitOffer) {
		this.submitOffer = submitOffer;
	}

}
