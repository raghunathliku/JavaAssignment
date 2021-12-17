package com.technoelevate.springwebmvc2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.technoelevate.springwebmvc2.dto.EmployeeDto;
import com.technoelevate.springwebmvc2.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	
	@GetMapping("/search")
	public String search() {
		return "find";
	}
	@PostMapping("/search")
	public String getData(ModelMap map,@RequestParam("id") int eid) {
		EmployeeDto data=service.getData(eid);
		map.addAttribute("empKey",data);
		
		return "diplay";
	}
	//---------------------------------------------------------------------------------------------------------------------------------
	@GetMapping("/insert")
	public String insertData() {
		return "insert";
	}
	
	@PostMapping("/insert")
	public String readData(ModelMap map,EmployeeDto dto) {
		boolean result = service.addEmp(dto);
		if(result== true ) {
			String msg="data inserted sucessfully";
			map.addAttribute("msgKey",msg);
			
		}else{
			String msg=" Sorry data insertation failed";	
			map.addAttribute("msgKey",msg);
			
		}
		
		return "insertstatus";
	}
	//----------------------------------------------------------------------------------------------------------------------------------------
	@GetMapping("/delete")
	public String deleteData() {
		return "delete";
	}
	@PostMapping("/delete")
	public String deleteData2(ModelMap map,@RequestParam int eid) {
		EmployeeDto data=service.removeData(eid);
		if(data!=null) {
			String msg="Deleted sucessfully";
			map.addAttribute("empKey",msg);	
		}else {
			String msg="Sorry No data found on this id try again.....";
			map.addAttribute("empKey",msg);
		}
		
		
		return "diplay2";
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@GetMapping("/update")
	public String updateData() {
		return "update";
	}
	@PostMapping("/update")
	public String deleteData2(ModelMap map,int eid,String ename,String position,String password) {
		EmployeeDto data=service.updateData(eid,ename,position,password);
		if(data!=null) {
			String msg="updated sucessfully";
			map.addAttribute("empKey",msg);	
		}else {
			String msg="Sorry No data found on this id try again.....";
			map.addAttribute("empKey",msg);
		}
		
		return "diplay2";
	}
	
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	@GetMapping("/auth")
	public String authnicate() {
		return "auth";
	}
	@PostMapping("/auth")
	public String authData(ModelMap map,int eid,String password) {
		boolean data=service.authnicationData(eid,password);
		if (data!=true) {		
				String msg="Invalid authntication !!! please check your  id or password once  again.....";
			map.addAttribute("empKey",msg);	
			//return "authData";
			return "redirect:/authData";
			
		}else
		return "redirect:/insert";
		       //to return the insert value so used insert here
	}
	
	
	//----------------------------------------------------------------------------------------------------------------------------------------
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
