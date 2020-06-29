package com.bjsxt.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bjsxt.App;
import com.bjsxt.dao.UsersRepository;
import com.bjsxt.pojo.Roles;
import com.bjsxt.pojo.Users;

/**
 * 一对多关联关系测试
 *
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=App.class)
public class OneToManyTest {
	
	@Autowired
	private UsersRepository usersRepository;
	
	/**
	 * 一对多关联关系的添加
	 */
	@Test
	public void testSave(){
		//创建一个用户
		Users users = new Users();
		users.setAddress("天津");
		users.setAge(32);
		users.setName("小刚");
		
		//创建一个角色
		Roles roles = new Roles();
		roles.setRolename("管理员");
		
		//关联
		roles.getUsers().add(users);
		users.setRoles(roles);
		
		//保存
		this.usersRepository.save(users);
	}
	
	/**
	 * 一对多关联关系的查询
	 */
	@Test
	public void testFind(){
		Users findOne = this.usersRepository.findOne(4);
		System.out.println(findOne);
		Roles roles = findOne.getRoles();
		System.out.println(roles.getRolename());
	}
}
