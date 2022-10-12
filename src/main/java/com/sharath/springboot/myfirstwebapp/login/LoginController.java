package com.sharath.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
@SessionAttributes("name")
@Controller
public class LoginController {
	AuthenticationService authenticateservice;
	
	
public LoginController(AuthenticationService authenticateservice) {
		super();
		this.authenticateservice = authenticateservice;
	}


@RequestMapping(value="login",method=RequestMethod.GET)
public String gotoLoginPage() { 
	return "login";
}


@RequestMapping(value="login",method=RequestMethod.POST)
public String gotoWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) { 
	if(authenticateservice.authenticate(name,password)) {
	model.put("name",name);
	model.put("password",password);
	return "welcome";
	}
	
	model.put("errorMessage", "invalid creds try again!");
	return "login";	
}
}
