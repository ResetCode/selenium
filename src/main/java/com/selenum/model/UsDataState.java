package com.selenum.model;

public class UsDataState {
	/**  */
	protected String state;
	/** 州缩写 */
	protected String stateCode;
	/**  */
	protected String stateName;

	public UsDataState() {

	}

	/**
	 * 获取
	 * 
	 * @return 
	 */
	public String getState() {
		return state;
	}

	/**
	 * 设置
	 * 
	 * @param state
	 *            
	 */
	public void setState(String state) {
		this.state = state;
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
	 * 获取
	 * 
	 * @return 
	 */
	public String getStateName() {
		return stateName;
	}

	/**
	 * 设置
	 * 
	 * @param stateName
	 *            
	 */
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

}
