package com.wpx.service.sso;

import com.wpx.pojo.Result;

public interface LoginService {

	Result userLogin(String username,String password);
	
}
