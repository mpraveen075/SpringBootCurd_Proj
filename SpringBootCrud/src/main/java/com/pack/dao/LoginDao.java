package com.pack.dao;
import java.util.List;

import com.pack.model.Login;
public interface LoginDao
{
	public int insertEmployee(Login emp);
	public List<Login> viewAll();
	public int  modify(Login emp);
	public int  delete(int id);	
	public Login getEmpbyId(int id);
	public int editEmployee(Login emp);
}
