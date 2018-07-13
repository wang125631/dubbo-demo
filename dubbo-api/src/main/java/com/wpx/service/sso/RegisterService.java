package com.wpx.service.sso;

import com.wpx.pojo.Result;
import com.wpx.pojo.User;

public interface RegisterService {

	Result selectType(String param,int typeID);
	
	Result userRegister(User user);
}
