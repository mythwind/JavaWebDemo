package com.vincent.ssh.dao;

import java.io.Serializable;

import com.vincent.ssh.model.User;

public interface IUserDAO {
	Serializable save(User user);
}
