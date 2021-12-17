package com.technoelevate.springwebmvc2.dao;

import com.technoelevate.springwebmvc2.dto.EmployeeDto;

public interface EmployeeDao {
	public EmployeeDto getData(int eid);
	public boolean addemp(EmployeeDto dto);
	public EmployeeDto removeData(int eid);
	public EmployeeDto updateData(int eid, String ename, String position, String password);
	public boolean authnicationData(int eid, String password);
	

}
