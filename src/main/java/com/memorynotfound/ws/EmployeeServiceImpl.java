package com.memorynotfound.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "com.memorynotfound.ws.EmployeeService")
public class EmployeeServiceImpl implements EmployeeService {

	private String[] empLists = new String[3];

	@Override
	public int getEmployeeCount() {
		// TODO Auto-generated method stub
		
		return 3;
	}

	@Override
	public String[] getEmployeeList() {
		empLists[0] = new String("Bobby");
		empLists[1] = new String("Roy");
		empLists[2] = new String("Stefanie");
		return empLists;
	}

}
