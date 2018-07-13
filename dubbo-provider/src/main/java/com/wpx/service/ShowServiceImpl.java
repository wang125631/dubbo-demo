package com.wpx.service;

import org.springframework.stereotype.Service;

/**
 * 实际的服务发布
 * 
 * @author wangpx
 */
@Service
public class ShowServiceImpl implements ShowService{

	@Override
	public String say() {
		System.out.println("Provider method invoke .. ");
		return "Hello Dubbo";
		
	}
}
