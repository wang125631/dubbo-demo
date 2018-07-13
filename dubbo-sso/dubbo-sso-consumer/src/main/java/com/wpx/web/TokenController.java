package com.wpx.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wpx.service.sso.TokenService;

@Controller
@RequestMapping("/sso")
public class TokenController {

	@Resource
	private  TokenService tokenService;
	
}
