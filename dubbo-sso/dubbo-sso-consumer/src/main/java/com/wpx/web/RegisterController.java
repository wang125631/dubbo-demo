package com.wpx.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wpx.service.sso.RegisterService;

@Controller
@RequestMapping("/sso")
public class RegisterController {

	@Resource
	private RegisterService registerService;
	
	
}
