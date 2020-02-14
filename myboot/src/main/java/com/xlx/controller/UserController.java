package com.xlx.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xlx.inf.Menus;
import com.xlx.inf.Page;
import com.xlx.inf.User;
import com.xlx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @program: myboot
 * @ClassName UserController
 * @description: 控制器类，相当于servlet
 * @author: xlx
 * @create: 2020-01-06 10:50
 * @Version 1.0
 **/
@Controller
@RequestMapping("/user")
@SessionAttributes("user")
public class UserController
{
	@Autowired
	private UserService userService;
	@Autowired
	private Page p;
	@RequestMapping({"/login"})
	public String login(User user, Model model){
		User user1 = userService.frontLogin(user);
		if (user1!=null){
			model.addAttribute("user",user1);
			System.out.println("登录成功。。。");
			return "front/html/success";
		}else{
			System.out.println("登录失败。。。");
			return "html/login";
		}
	}
	@RequestMapping({"/backLogin"})
	public String backlogin(User user, Model model){
		User user1 = userService.backLogin(user);
		if (user1!=null){
			model.addAttribute("user",user1);
			HashMap<String, ArrayList<Menus>> map = userService.selectMenu();
			model.addAttribute("menu",map);
			System.out.println("登录成功。。。");
			return "back/html/manage";
		}else{
			System.out.println("登录失败。。。");
			model.addAttribute("fail","账户或密码错误，请重新输入");
			return "back/html/login";
		}

	}
	@RequestMapping(name="/find",produces = "application/json;charset=utf-8")
	@ResponseBody
	public Page find(int page,int limit){
		PageHelper.startPage(page,limit);
		List all = userService.findAll();
		PageInfo bean = new PageInfo(all);
		p.setCount(bean.getTotal());
		p.setData(bean.getList());
		p.setCode(0);
		p.setMsg("");
		return p;
	}
	@RequestMapping("/updateScore")
	public String updateScore(User u1){
		return "html/success";
	}
	@RequestMapping("/updateUser")
	public String updateUser(User u1){
		return "html/success";
	}
}