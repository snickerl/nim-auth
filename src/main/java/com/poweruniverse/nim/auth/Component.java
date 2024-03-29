package com.poweruniverse.nim.auth;

import com.poweruniverse.nim.bean.ComponentInfo;
import com.poweruniverse.nim.interfaces.ComponentI;
import com.poweruniverse.nim.utils.ComponentServicePublisher;

/**
 * 读取系统定义 系统参数
 * 
 * 启动配置文件中确定的系统中  发布webservice服务
 */
public class Component implements ComponentI{
	
	/**
	 * 初始化本组件 
	 * 在指定地址和端口号上 发布当前组件中的webservice服务
	 */
	public void initial(String contextPath,ComponentInfo componentInfo) {
		if(componentInfo.isLocalMode()){
			ComponentServicePublisher.publish(contextPath, componentInfo);
		}
	}
	
	
	@Override
	public String getComponentName() {
		return "nim-auth";
	}
}
