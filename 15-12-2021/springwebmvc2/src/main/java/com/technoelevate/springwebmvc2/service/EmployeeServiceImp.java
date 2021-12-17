package com.technoelevate.springwebmvc2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.technoelevate.springwebmvc2.dao.EmployeeDao;
import com.technoelevate.springwebmvc2.dto.EmployeeDto;
@Service
public class EmployeeServiceImp implements EmployeeService{
	@Autowired
EmployeeDao dao;
	@Override
	public EmployeeDto getData(int eid) {
		if(eid<=0) {
			return null;
			
		}else
			return dao.getData(eid);
		
	}
	@Override
	public boolean addEmp(EmployeeDto dto) {
		if(dto==null) {
			return false;
		}else {
			return dao.addemp(dto);
		}
		
	}
	@Override
	public EmployeeDto removeData(int eid) {
		
			if(eid<=0) {
				return null;
				
			}else
				return dao.removeData(eid);
		}
	
	
	@Override
	public EmployeeDto updateData(int eid,String ename, String position, String password) {
		if(eid<=0) {
			return null;
			
		}else
			return dao.updateData(eid,ename,position,password);
		
	}
	@Override
	public boolean authnicationData(int eid, String password) {
		if(eid<=0 || eid>=6) {
			return false;
			
		}else
			return dao.authnicationData(eid,password);
	}

	
	
}
