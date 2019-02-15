package com.yh.quartz.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yh.quartz.entity.User;
import com.yh.quartz.mapper.quartz.UserDao;
import com.yh.quartz.service.MyService;

@Service
public class MyServiceImpl implements MyService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public User findUserById(String id) {
		User user = userDao.findUserById(id);
		return user;
	}

}
