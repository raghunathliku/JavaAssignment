package com.technoelevate.springwebmvc2.service;

import com.technoelevate.springwebmvc2.dto.EmployeeDto;

public interface EmployeeService {
	public EmployeeDto getData(int eid);
	public boolean addEmp(EmployeeDto dto);
	public EmployeeDto removeData(int eid);
	 EmployeeDto updateData(int eid,String ename, String position, String password);
	public boolean authnicationData(int eid, String password);

}
