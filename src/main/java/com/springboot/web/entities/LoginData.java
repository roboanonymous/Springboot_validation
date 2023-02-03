package com.springboot.web.entities;



import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class LoginData {
	
	@jakarta.validation.constraints.NotBlank (message = "User Name can not be empty !!")
	@Size(min =3 , max = 12 , message = "User name must be between 3-12 character !!!")
	private String userName;
	
	@Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message= "Invalid Email !!")
	private String Email;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	@Override
	public String toString() {
		return "LoginData [userName=" + userName + ", Email=" + Email + "]";
	}
	

}
