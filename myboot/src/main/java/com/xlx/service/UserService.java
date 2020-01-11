package com.xlx.service;

import com.xlx.inf.Menus;
import com.xlx.inf.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @program: Mybatis
 * @ClassName UserService
 * @description: 业务层接口
 * @author: xlx
 * @create: 2020-01-06 10:07
 * @Version 1.0
 **/
public interface UserService
{
	// 查询所有账户

	public List findAll();

	// 前台登录

	public User frontLogin(User user);

	// 后台登录

	public User backLogin(User user);

	// 后台登录

	public HashMap<String, ArrayList<Menus>> selectMenu();

}
