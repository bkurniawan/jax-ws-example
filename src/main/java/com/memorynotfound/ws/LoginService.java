package com.memorynotfound.ws;


import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;


@WebService
@SOAPBinding(style=Style.RPC)
public interface LoginService {

	@WebMethod
	boolean login(String uid, String pwd);
	
}
