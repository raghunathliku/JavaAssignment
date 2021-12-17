package com.technoelevate.springwebmvc3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.technoelevate.springwebmvc3.dao.EmployeeDao;
import com.technoelevate.springwebmvc3.dto.EmployeeDto;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeDao dao;

	@Override
	public EmployeeDto getData(int eid, String password) {
		
		return dao.getData(eid,password) ;
	}

	@Override
	public EmployeeDto removeData(int eid) {
		if(eid<=0) {
			return null;
		}
		return dao.deleteData(eid);
	}
	
	@Override
	public EmployeeDto getData(int eid) {
		if(eid<=0) {
			return null;
		}
		return dao.getData(eid);
	}

	@Override
	public EmployeeDto updateData(int eid, String ename, String position, String password) {
		if(eid<=0) {
			return null;
			
		}else
			return dao.updateData(eid,ename,position,password);
	}

	@Override
	public EmployeeDto registerData(int eid, String ename, String position, String password) {
		if(eid<=0) {
			return null;
			
		}else
			return dao.registerData(eid,ename,position,password);
	}

}
