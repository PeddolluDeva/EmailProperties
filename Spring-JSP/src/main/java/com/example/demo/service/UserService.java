package com.example.demo.service;

import com.example.demo.controller.bean.User;

public interface UserService {
   
	User gatUserByUserId(String userId);
	//int creatNewUser(User user);
	int createNewUser(User user);
}
