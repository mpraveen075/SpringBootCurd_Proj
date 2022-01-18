package com.pack.dao;

import java.util.List;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.pack.model.Login;

@Repository
public class LoginDaoImpl implements LoginDao
{
	@Autowired
	private DataSource dataSource;


	public int insertEmployee(Login emp)
	{
		JdbcTemplate obj=new JdbcTemplate(dataSource);
		String sql="insert into Login values(?,?,?)";
		int i = obj.update(sql,emp.getLoginId(),emp.getUserName(),emp.getPassWord());
		return i;
	}

	public List<Login> viewAll()
	{
		JdbcTemplate insert = new JdbcTemplate(dataSource);
		String sql = "SELECT * from Login";
		List<Login> employees  = insert.query(sql,new BeanPropertyRowMapper<Login>(Login.class));
		return employees;

   }
	public int  modify(Login emp) {
   	 	
		JdbcTemplate insert = new JdbcTemplate(dataSource);
	int i=	insert.update("update Login set name='"+emp.getLoginId()+"',login='"+emp.getUserName()+"',username='"+emp.getPassWord()+"' where id="+emp.getLoginId());
	    return i;	
			} 
	
	public int  delete(int id) {
		JdbcTemplate del = new JdbcTemplate(dataSource);
		 int sql=del.update("delete  from Login where LoginId=" + id);    
		 return sql;
		   
	}

	@Override
	public Login getEmpbyId(int id) {
		JdbcTemplate del = new JdbcTemplate(dataSource);
		String sql="select * from Login where LoginId=" + id;
		
		Login emp= del.queryForObject(sql, new BeanPropertyRowMapper<Login>(Login.class));
		return emp;
	}

	public int editEmployee(Login  emp) {
        JdbcTemplate obj = new JdbcTemplate(dataSource);
        int i = obj.update("update Login set Username= '" + emp.getUserName()+"',Password='"+emp.getPassWord()+"' where LoginId = " + emp.getLoginId());
        return i;
    }
	
	

}
