package com.technoelevate.springwebmvc3.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.technoelevate.springwebmvc3.dto.EmployeeDto;

@Repository
public class EmployeeDaoImp implements EmployeeDao{

	@Override
	public EmployeeDto getData(int eid, String password) {
		try {
			EntityManagerFactory factory=Persistence.createEntityManagerFactory("hibernate");
			EntityManager entityManager = factory.createEntityManager();
			EntityTransaction transaction = entityManager.getTransaction();
			EmployeeDto find = entityManager.find(EmployeeDto.class, eid);
			if(password.equals(find.getPassword())) {
				return find;
			
			}
		} catch (Exception e) {
			e.printStackTrace();
			
			
		}
		
		return null;
	}

	@Override
	public EmployeeDto getData(int eid) {
		try {
			EntityManagerFactory factory=Persistence.createEntityManagerFactory("hibernate");
			EntityManager entityManager = factory.createEntityManager();
			EntityTransaction transaction = entityManager.getTransaction();
			EmployeeDto find = entityManager.find(EmployeeDto.class, eid);
			return find;
		} catch (Exception e) {
			e.printStackTrace();
		
		}
		
		return null;
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
		if(find != null) {
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
		}
		
		return find;
	}

	@Override
	public EmployeeDto deleteData(int eid) {
		try {
			EntityManagerFactory factory=Persistence.createEntityManagerFactory("hibernate");
			EntityManager entityManager = factory.createEntityManager();
			EntityTransaction transaction = entityManager.getTransaction();
			EmployeeDto find = entityManager.find(EmployeeDto.class, eid);
			EmployeeDto find2 =find;
			transaction.begin();
			entityManager.remove(find);
			transaction.commit();
			return find2;
		} catch (Exception e) {
			e.printStackTrace();
			
		
		}
		
		return null;
	}

	@Override
	public EmployeeDto registerData(int eid, String ename, String position, String password) {
		EmployeeDto dto=null;
		try {
			EntityManagerFactory factory=null;
			EntityManager entityManager=null;
			factory=Persistence.createEntityManagerFactory("hibernate");
			entityManager=factory.createEntityManager();
			EntityTransaction transaction = entityManager.getTransaction();
			transaction.begin();
			dto=new EmployeeDto();
			dto.setEid(eid);
			dto.setEname(ename);
			dto.setPassword(password);
			dto.setPosition(position);
			entityManager.persist(dto);
			transaction.commit();
			
			return dto;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dto;
	}

}
