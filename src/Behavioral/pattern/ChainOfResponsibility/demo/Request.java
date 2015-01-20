/**
 * 
 */
package pattern.ChainOfResponsibility.demo;

/**
 * 请求枚举
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-6-1
 */
public enum Request {

	LEAVE("请假"), RAISES("加薪"), PROMOTION("晋升"), OTHER("其他大事");

	private String description;// 请求描述

	private Request(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
}