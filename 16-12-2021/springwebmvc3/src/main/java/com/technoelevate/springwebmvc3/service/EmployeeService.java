package com.technoelevate.springwebmvc3.service;

import com.technoelevate.springwebmvc3.dto.EmployeeDto;

public interface EmployeeService {

	public EmployeeDto getData(int eid, String password);

	public EmployeeDto getData(int eid);

	public EmployeeDto updateData(int eid, String ename, String position, String password);

	EmployeeDto removeData(int eid);

	public EmployeeDto registerData(int eid, String ename, String position, String password);

}
