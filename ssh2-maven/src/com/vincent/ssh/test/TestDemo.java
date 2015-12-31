package com.vincent.ssh.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vincent.ssh.model.Person;
import com.vincent.ssh.service.IUserService;

public class TestDemo {

	@Test
	public void testSpringEnv(){
	    //加载Spring的配置文件，得到ApplicationContext对象
	    ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	    //获取bean对象
	    Person person = (Person) context.getBean("person");
	    System.out.println(person.getAge());
	}
	
	@Test
	public void testSpring(){
		// 加载Spring的配置文件，得到ApplicationContext对象
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		// 从Spring的IOC容器中获取bean对象
		IUserService userService = (IUserService) context.getBean("userService");
		// 执行测试方法
		userService.testCode();
	}
}
