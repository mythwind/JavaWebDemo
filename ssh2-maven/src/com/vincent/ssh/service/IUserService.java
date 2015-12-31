package com.vincent.ssh.service;

import java.io.Serializable;

import com.vincent.ssh.model.User;

public abstract interface IUserService {
	/**
	 * 测试方法
	 */
	public abstract void testCode();
	
	public Serializable save(User user);
	
}
