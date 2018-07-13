package com.wpx.controller;

import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wpx.service.ShowService;

/**
 * 用户控制层
 * @author wangpx
 */
@RestController
@RequestMapping("/show")
public class ShowController {

	@Autowired
	public ShowService showService; 
	
	@RequestMapping("/say")
	public String say(Map map) {
		
		String say = showService.say();
		
		System.out.println(say);
		return say;
	}
}
