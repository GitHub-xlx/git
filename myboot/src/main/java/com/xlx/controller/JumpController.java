package com.xlx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: Mybatis
 * @ClassName UserController
 * @description: ssm框架中控制器类，相当于servlet
 * @author: xlx
 * @create: 2020-01-06 10:50
 * @Version 1.0
 **/
@Controller
@RequestMapping("/jump")
public class JumpController
{
	//这就不用写很多跳转
	@RequestMapping({"/front/{id}"})
	public String jumpFront(@PathVariable("id")String id){
		return "front/html/"+id;
	}
	@RequestMapping({"/back/{id}"})
	public String jumpBack(@PathVariable("id")String id){
		return "back/html/"+id;
	}
//	@RequestMapping({"/frontlogin"})
//	public String login(){
//		return "front/html/login";
//	}
//	@RequestMapping({"/reg"})
//	public String reg(){
//		return "front/html/reg";
//	}
//	@RequestMapping({"/backlogin"})
//	public String backlogin(){
//		return "back/html/login";
//	}
//	@RequestMapping({"/userTable"})
//	public String userTable(){
//		return "back/html/userTable";
//	}
}