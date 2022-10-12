package com.sharath.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
	
	@RequestMapping("hello")
	@ResponseBody
	public String Hello() {
		return "Hello! What are you doing today from meth1 ?";
	}


	@RequestMapping("hello-jsp")
	
	public String HelloJSP() {
		return "hello";
	}
}


//other way of doing this is
//@RestController
//public class SayHelloController {
//	
//	@GetMapping("hello")
//	public String Hello() {
//		return "Hello! What are you doing today?";
//	}
//}
//@RequestMapping("hello-html")
//@ResponseBody
//public String HelloHtml() {
//	StringBuffer sb = new StringBuffer();
//	sb.append("<html>");
//	sb.append("<body>");
//	sb.append("<h1>");
//	sb.append("Hello! I am from HTML");
//	sb.append("</h1>");
//	sb.append("</body>");	
//	sb.append("</html>");
//	return sb.toString();
//}