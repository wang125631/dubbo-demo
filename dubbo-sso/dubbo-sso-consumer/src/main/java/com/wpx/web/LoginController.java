package com.wpx.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wpx.service.sso.LoginService;

@Controller
@RequestMapping("/sso")
public class LoginController {

	@Resource
	private LoginService loginService;
	
}
