package com.technoelevate.springwebmvc3.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.technoelevate.springwebmvc3.dto.EmployeeDto;
import com.technoelevate.springwebmvc3.service.EmployeeService;

@Controller
public class SpringController {
	@Autowired
	EmployeeService service;
	
	@GetMapping("/login")
	public String login() {
		return "loginpage";
	}
	@PostMapping("/login")
	public String loginData(ModelMap map,int eid,String password,HttpServletRequest request) {
		EmployeeDto dto = service.getData(eid,password);
		
		if(dto!=null) {
			HttpSession session=request.getSession();
			session.setAttribute("loginKey", dto);
			map.addAttribute("msg",dto.getEname());
			return "loginData";
			
		}else {
			map.addAttribute("errMsg","invalid password...please try once again..");
			return "loginpage";
		}
		
		
	}
	@GetMapping("/logout")
	public String logout(HttpSession session, ModelMap map) {
		session.invalidate();
		map.addAttribute("msg","Logged out successfully");
		return "loginpage";
	}
	
	
	@GetMapping("/search")
	public String search(@SessionAttribute(name = "loginKey" , required = false)EmployeeDto dto,ModelMap map) {
		if(dto!=null) {
		return "search";
		}else {
			map.addAttribute("errMsg","Please Login Before You Use");
			return "loginpage";
		}
	}
	
	
	
	@PostMapping("/search")
	public String getData(ModelMap map, @RequestParam("eid") int eid,@SessionAttribute(name= "loginKey" , required=false)EmployeeDto dto) {
		EmployeeDto data = service.getData(eid);
		if(dto!=null) {
			if(data!=null) {
			map.addAttribute("empData",data);
			}else {
				map.addAttribute("msg","Data not found");
			}
			return "find";
		}else {
			map.addAttribute("errMsg","Please Login first");
			return "loginpage";
		}
	
	}
	
	
	@GetMapping("/update")
	public String updateData(@SessionAttribute(name = "loginKey" , required = false)EmployeeDto dto,ModelMap map) {
		if(dto!=null) {
		return "update";
		}else {
			map.addAttribute("errMsg","Please Login Before You Use");
			return "loginpage";
		}
	}

	
	
	@PostMapping("/update")
	public String updateDataa(ModelMap map,  int eid,String ename,String position,String password,@SessionAttribute(name= "loginKey" , required=false)EmployeeDto dto) {
		
		if(dto!=null) {
			EmployeeDto data=service.updateData(eid,ename,position,password);
			if(data!=null) {
			map.addAttribute("empData",data);
			}else {
				map.addAttribute("msg","updation failed please enter valid id and try again");
			}
			return "find";
		}else {
			map.addAttribute("errMsg","Please Login first");
			return "loginPage";
		}
	
	}
	
	@GetMapping("/delete")
	public String deleteData(@SessionAttribute(name = "loginKey" , required = false)EmployeeDto dto,ModelMap map) {
		if(dto!=null) {
		return "delete";
		}else {
			map.addAttribute("errMsg","Please Login Before You Use");
			return "loginpage";
		}
	}

	
	
	@PostMapping("/delete")
	public String deleteDataa(ModelMap map,  int eid,@SessionAttribute(name= "loginKey" , required=false)EmployeeDto dto) {
		
		if(dto!=null) {
			EmployeeDto data = service.removeData(eid);
			if(data!=null) {
			map.addAttribute("regObj",data);
			}else {
				map.addAttribute("msg","Failed to remove your data please try again..");
			}
			return "delete";
		}else {
			map.addAttribute("errMsg","Please Login first");
			return "loginPage";
		}
	
	}
	
	
	
	
	@GetMapping("/register")
	public String insertData(@SessionAttribute(name = "loginKey" , required = false)EmployeeDto dto,ModelMap map) {
		if(dto!=null) {
		return "register";
		}else {
			map.addAttribute("errMsg","Please Login Before You Use");
			return "loginpage";
		}
	}

	
	
	@PostMapping("/register")
	public String registerDataa(ModelMap map,  int eid,String ename,String position,String password,@SessionAttribute(name= "loginKey" , required=false)EmployeeDto dto) {
		
		if(dto!=null) {
			EmployeeDto data = service.registerData(eid,ename,position,password);
			if(data!=null) {
			map.addAttribute("regObj",data);
			}else {
				map.addAttribute("msg","Oops!!! Registration Failed please try again.....");
			}
			return "register";
		}else {
			map.addAttribute("errMsg","Please Login first");
			return "loginPage";
		}
	
	}
	
	
	
	
	
	
	
	
	

}
