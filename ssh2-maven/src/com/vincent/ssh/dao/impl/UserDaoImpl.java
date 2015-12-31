package com.vincent.ssh.dao.impl;

import java.io.Serializable;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vincent.ssh.dao.IUserDAO;
import com.vincent.ssh.model.User;

@Repository("userDao")
public class UserDaoImpl implements IUserDAO {
	/**
	 * 使用@Autowired注解将sessionFactory注入到UserDaoImpl中
	 */
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Serializable save(User user) {
		return sessionFactory.getCurrentSession().save(user);
	}

}
