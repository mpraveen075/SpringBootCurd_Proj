package com.pack.model;
public class Login
{	
	
	
@Override
public String toString() {
	return "Login [loginId=" + loginId + ", userName=" + userName + ", passWord=" + passWord + "]";
}

private int loginId;
private String userName;
private String passWord;
public int getLoginId()
{
	return loginId;
}
public void setLoginId(int loginId) 
{
	this.loginId = loginId;
}
public String getUserName()
{
	return userName;
}
public void setUserName(String userName) 
{
	this.userName = userName;
}
public String getPassWord() 
{
	return passWord;
}
public void setPassWord(String passWord) 
{
	this.passWord = passWord;
}
}
