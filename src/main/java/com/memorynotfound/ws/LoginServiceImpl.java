package com.memorynotfound.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "com.memorynotfound.ws.LoginService")
public class LoginServiceImpl implements LoginService {

	@Override
	public boolean login(String uid, String pwd) {
		// TODO Auto-generated method stub
		if (validateUid(uid).length() == 0);
		{
			if (uid.equalsIgnoreCase("bobby") && pwd.equalsIgnoreCase("bobby")) {
				return true;
			} else
				return false;
		}
	}

	String validateUid(String uid) {
		if (uid == null || uid.trim().equalsIgnoreCase("")) {
			return "User id can not be empty";
		}
		return "";
	}

}
