package com.pack.service;

import java.util.List;


import com.pack.model.Login;

public interface LoginService 
{
	public void insertEmployee(Login emp);
	public List<Login> viewAll();
	public int  modify(Login emp);
	public int  delete(int emp);	

}
