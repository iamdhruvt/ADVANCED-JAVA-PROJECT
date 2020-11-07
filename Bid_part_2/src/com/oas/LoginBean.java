package com.oas;

public class LoginBean {
	private String name,password;
	public int id,quote;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuote() {
		return quote;
	}

	public void setQuote(int quote) {
		this.quote = quote;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public boolean validate(){
		if(password.equals("admin")){
			return true;
		}
		else{
			return false;
		}
	}
	}

