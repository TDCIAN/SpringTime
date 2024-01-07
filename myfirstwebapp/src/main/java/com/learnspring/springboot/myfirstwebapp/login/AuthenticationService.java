package com.learnspring.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	public boolean authenticate(String username, String password) {
		boolean isValidUserName = username.equalsIgnoreCase("ranga");
		boolean isValidPassword = password.equalsIgnoreCase("dummy");
		System.out.println("유저네임: "+ username + " 그래서 맞음?: " + isValidUserName);
		System.out.println("패스워드!: "+ password + " 그래서 맞음?: " + isValidPassword);
		return isValidUserName && isValidPassword;
	}
}
