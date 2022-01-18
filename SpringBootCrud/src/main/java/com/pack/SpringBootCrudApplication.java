package com.pack;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class SpringBootCrudApplication 
{
	public static void main(String[] args) {
 SpringApplication.run(SpringBootCrudApplication.class, args);
		
	}

}
/*
 * ApplicationContext context = (ApplicationContext)
 * SpringApplication.run(SpringBootCrudApplication.class, args);
 * 
 * 
 * LoginDao dao = ((BeanFactory) context).getBean(LoginDao.class);
 * //dao.insertEmployee(new Login(1, "aliya", "123")); //dao.delete(1); //
 */