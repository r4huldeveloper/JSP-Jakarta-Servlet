package com.servlet;

public class LoginBean {
	
	private String name,password;
	
	public String getName() {
		return name;
	}
	public String setName(String name) {
		return this.name = name;
	}
	
	public String getPassword() {
		return password;
	}
	public String setPassword(String password) {
		return this.password = password;
	}
	
	public boolean validate() {
		if(password.equals("admin")) {
			return true;
		}
		else {
			return false;
		}
	}

}
