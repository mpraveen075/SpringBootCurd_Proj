package com.pack;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.pack.dao.LoginDao;
import com.pack.model.Login;

@Controller
public class CommonController {
	@Autowired
	LoginDao loginDao;

	 @RequestMapping(value ="/addUserForm") 
	 public String add(Model m) 
	 { 
		 m.addAttribute("emp", new Login()); 
	 return "RegisterForm";  
	 } 
	
@RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
public String addStudent(Login emp) {
		int res = loginDao.insertEmployee(emp);
		if (res >= 1)
			return "redirect:/viewForm";
		else
			return "adduser-error";
	}
@RequestMapping("/viewForm")    
public String viewemp(Model m){    
    List<Login> list=loginDao.viewAll();  
    m.addAttribute("list",list);  
    return "view";    
}  

@RequestMapping("/editEmployee")
public String modify(Login emp)
{
	int res=loginDao.modify(emp);
	if (res>=1)
		  return "redirect:/viewForm";
		 else
			 return "adduser-error";
	  			 
}


@RequestMapping(value="deleteEmp")
public String getid(@RequestParam("id") int id)
{
	int res=loginDao.delete(id);
	if (res>=1)
		  return "redirect:/viewForm";
		 else
			 return "adduser-error";
	  			 
}	

 
@RequestMapping("/editEmp")
public String getId(@RequestParam("id") int id, Model m) {
	Login l = loginDao.getEmpbyId(id);
	m.addAttribute("emp", l);
	return "editUser";
	
}
@RequestMapping("/edit")
public String editEmp(@ModelAttribute Login emp) {
    System.out.println(emp);
    if(loginDao.editEmployee(emp)>0)
        return "redirect:/viewForm";
    else
        return "adduser-error";

}

}
