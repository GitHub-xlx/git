package com.xlx.service.Impl;

import com.xlx.inf.Menus;
import com.xlx.inf.User;
import com.xlx.mapper.MenuMapper;
import com.xlx.mapper.UserMapper;
import com.xlx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @program: Mybatis
 * @ClassName UserServiceImpl
 * @description:
 * @author: xlx
 * @create: 2020-01-06 10:11
 * @Version 1.0
 **/
@Service("userService")
public class UserServiceImpl implements UserService
{

	@Autowired
	private UserMapper userMapper;
	@Autowired
	private MenuMapper menuMapper;
	@Override
	public List<User> findAll()
	{
		return userMapper.findAll();


	}

//	@Override
//	@Transactional
//	public int updateScore(User[] user)
//	{
//		System.out.println("业务层：修改用户积分。。。。");
//		int i = userMapper.updateScore(user[0]);
//
////		int i2=1/0;
//		int j = userMapper.updateScore(user[1]);
//
//		return i+j;
//	}

	@Override
	public User frontLogin(User user)
	{
		User frontUser = userMapper.findFrontUser(user);
		return frontUser;
	}

	@Override
	public User backLogin(User user)
	{
		return userMapper.findBackUser(user);
	}

	@Override
	public HashMap<String, ArrayList<Menus>> selectMenu()
	{
		ArrayList<Menus> menus = menuMapper.selectMenus();
		HashMap<String, ArrayList<Menus>> map = new HashMap<>();
		ArrayList<Menus> list = new ArrayList<>();
		for (Menus menu : menus) {
			if (map.containsKey(menu.getFather())){
				list.add(menu);
			}else{
				list= new ArrayList<>();
				list.add(menu);
				map.put(menu.getFather(),list);
			}
		}

		return map;
	}

}