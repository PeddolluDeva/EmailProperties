package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.controller.bean.User;
import com.example.demo.dao.UserDao;
import com.example.demo.service.UserService;

@Service
public class UserServiceimpl implements UserService {

	@Autowired
	UserDao userDao;
	
	@Override
	public User gatUserByUserId(String userId) {
		User user = userDao.getUserById(userId);
		return user;
	}

	@Override
	public int createNewUser(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

//	@Override
	//public int creatNewUser(User user) {
		// TODO Auto-generated method stub
		//return userDao.createNewUser(user);
	}


