package com.technoelevate.springwebmvc2.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.technoelevate.springwebmvc2.dto.EmployeeDto;
@Repository
public class EmployeeDaoimpl implements EmployeeDao{

	@Override
	public EmployeeDto getData(int eid) {
		EntityManagerFactory factory=null;
		EntityManager entityManager=null;
		factory=Persistence.createEntityManagerFactory("hibernate");
		entityManager=factory.createEntityManager();
		EmployeeDto find=entityManager.find(EmployeeDto.class, eid);
		
		return find;
	}

	@Override
	public boolean addemp(EmployeeDto dto) {
		EntityManagerFactory factory=null;
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		boolean isAdded =false;
		try {
			factory=Persistence.createEntityManagerFactory("hibernate");
			entityManager=factory.createEntityManager();
			transaction=entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(dto);
			transaction.commit();
			return isAdded=true;
			
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
			
		}finally {
			factory.close();
			entityManager.close();
			
		}
		return isAdded;
	}

	@Override
	public EmployeeDto removeData(int eid) {
		EntityManagerFactory factory=null;
		EntityManager entityManager=null;
		factory=Persistence.createEntityManagerFactory("hibernate");
		entityManager=factory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		
		EmployeeDto find=entityManager.find(EmployeeDto.class, eid);
		entityManager.remove(find);
		transaction.commit();
		
		
		return find;
	}

	@Override
	public EmployeeDto updateData(int eid, String ename, String position, String password) {
		EntityManagerFactory factory=null;
		EntityManager entityManager=null;
		factory=Persistence.createEntityManagerFactory("hibernate");
		entityManager=factory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		
		EmployeeDto find=entityManager.find(EmployeeDto.class, eid);
		
		if(ename=="")
			find.setEname(find.getEname());
		else
			find.setEname(ename);	
		if(position=="")
			find.setPosition(find.getPosition());
			
			else
				find.setPosition(position);
		if(password=="")
			find.setEname(find.getEname());
			
			else
				find.setPassword(password);	
		entityManager.persist(find);
		
		transaction.commit();
	
		return find;
		
	}

	@Override
	public boolean authnicationData(int eid, String password) {
		EntityManagerFactory factory=null;
		EntityManager entityManager=null;
		boolean out=false;
		factory=Persistence.createEntityManagerFactory("hibernate");
		entityManager=factory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		
		EmployeeDto find=entityManager.find(EmployeeDto.class, eid);
		if(password.equals(find.getPassword())    && eid==find.getEid())
		return true;
		else
	
		return out;
	}

	

	
	
	
}
