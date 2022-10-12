package com.sharath.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	boolean authenticate(String name,String password){
		boolean isValidUsername=name.equalsIgnoreCase("sharath");
		boolean isValidPassword=password.equalsIgnoreCase("chandra");
		return isValidUsername&&isValidPassword;
	}
}
