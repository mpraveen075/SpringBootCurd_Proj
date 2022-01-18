package com.pack.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.pack.dao.LoginDao;
import com.pack.model.Login;

public class LoginServiceImpl  implements LoginService 
{
	@Autowired
	LoginDao loginDao;

	@Override
	public void insertEmployee(Login emp) {
		loginDao.insertEmployee(emp);
	}

	public List<Login> viewAll() 
	{
		return loginDao.viewAll();
		}

	@Override
	public int modify(Login emp) {
		
		return loginDao.modify(emp);
	}

	@Override
	public int delete(int emp) {
		return loginDao.delete(emp);
	}
	
	
}