package com.technoelevate.springwebmvc3.dao;

import com.technoelevate.springwebmvc3.dto.EmployeeDto;

public interface EmployeeDao {

	public EmployeeDto getData(int eid, String password);

	public EmployeeDto getData(int eid);

	public EmployeeDto updateData(int eid, String ename, String position, String password);

	public EmployeeDto deleteData(int eid);

	public EmployeeDto registerData(int eid, String ename, String position, String password);

}
