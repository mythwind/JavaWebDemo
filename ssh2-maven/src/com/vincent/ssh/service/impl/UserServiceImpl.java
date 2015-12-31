package com.vincent.ssh.service.impl;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vincent.ssh.dao.IUserDAO;
import com.vincent.ssh.model.User;
import com.vincent.ssh.service.IUserService;

//使用Spring提供的@Service注解将UserServiceImpl标注为一个Service
@Service("userService")
public class UserServiceImpl implements IUserService {
	@Autowired
	private IUserDAO userDao;
	
	@Override
	public void testCode() {
		System.out.println("Hello World!");
	}

	@Override
	public Serializable save(User user) {
		return userDao.save(user);
	}

}
