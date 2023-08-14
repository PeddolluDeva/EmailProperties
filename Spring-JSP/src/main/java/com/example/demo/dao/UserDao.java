package com.example.demo.dao;

import com.example.demo.controller.bean.User;

public interface UserDao {
    
	 User getUserById(String userId);
	 int createNewUser(User user);
	 
}

//java.lang.NullPointerException: Cannot invoke "String.equals(Object)" because the return value of "com.example.demo.controller.bean.User.getPassword()" is null
	//at com.example.demo.controller.LoginController.welcomePage(LoginController.java:24) ~[classes/:na]
