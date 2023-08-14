package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.demo.controller.bean.User;
import com.example.demo.service.UserService;
@Controller
public class UserController {
	@Autowired
	UserService userService;
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public  String loginPage() {
		return "login";
	}  
	@RequestMapping(value="/login",method = RequestMethod.POST)
	public  String welcomePage(ModelMap model, @RequestParam String userId, @RequestParam String password) {
    User user = userService.gatUserByUserId(userId);	
		//if(user.getPassword().equals(password)) {
		if(userId.equals("Deva") && password.equals("Deva@803")) {
		model.put("userId", userId);
		return "welcome";
	}
//	model.put("errorMsg","Pleassr can be you currect userID and Password");
//	return "login"
		return password;
   }
	@RequestMapping(value="/register",method = RequestMethod.GET)
	public String registerPage(Model model) {
		User user = new User();
		model.addAttribute("user", user);
		return "register";
}	
	@RequestMapping(value = "/register" , method = RequestMethod.POST)
	public String registerUser(@ModelAttribute("user")User user,ModelMap  model) {
		int count = userService.createNewUser(user);
		if(count != 1) {
			model.put("errorMsg","Some issue occered with regiseteratrion");
			return "register";
		}
		model.put("succesMsg","User created Successfully  !!!");
		return "login";
	} }
 //   java.lang.NullPointerException: Cannot invoke "String.equals(Object)" because the return value of
//"com.example.demo.controller.bean.User.getPassword()" is null
  //  		at com.example.demo.controller.LoginController.welcomePage(LoginController.java:24) ~[classes/:na]

