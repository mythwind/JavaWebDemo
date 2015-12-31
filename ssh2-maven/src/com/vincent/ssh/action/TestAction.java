package com.vincent.ssh.action;

import java.util.Date;
import java.util.UUID;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.beans.factory.annotation.Autowired;

import com.vincent.ssh.model.User;
import com.vincent.ssh.service.IUserService;

@ParentPackage("basePackage")
// 使用convention-plugin插件提供的@Action注解将一个普通java类标注为一个可以处理用户请求的Action，Action的名字为struts2Test
@Action(value = "strust2Test")
// 使用convention-plugin插件提供的@Namespace注解为这个Action指定一个命名空间
@Namespace("/")
public class TestAction {
	@Autowired
	private IUserService userService;

	// http://localhost:8080/SSHE/strust2Test!test.action
	public void test() {
		System.out.println("进入TestAction");
		userService.testCode();
	}

	/**
	 * http://localhost:8080/SSHE/strust2Test!saveUser.action
	 */
	public void saveUser() {
		System.out.println("进入saveUser");
		User user = new User();
		user.setId(UUID.randomUUID().toString().replaceAll("-", ""));
		user.setName("xdp孤傲苍狼");
		user.setPwd("123456");
		user.setCreatedatetime(new Date());
		userService.save(user);
	}
}
