package com.xlx.inf;

import com.google.gson.Gson;
import org.springframework.stereotype.Repository;

import java.io.Serializable;


/**
 * @program: Mybatis
 * @ClassName User
 * @description:
 * @author: xlx
 * @create: 2019-12-23 22:20
 * @Version 1.0
 **/
@Repository("user")
public class User implements Serializable
{


	private int userid;
	private int userid2;
	private String account;
	private int phone;
	private int scroe;
	private int start;
	private String code;
	private String usertime;

	public int getUserid2()
	{
		return userid2;
	}

	public void setUserid2(int userid2)
	{
		this.userid2 = userid2;
	}

	public int getUserid()
	{
		return userid;
	}

	public void setUserid(int userid)
	{
		this.userid = userid;
	}

	public String getAccount()
	{
		return account;
	}

	public void setAccount(String account)
	{
		this.account = account;
	}

	public int getPhone()
	{
		return phone;
	}

	public void setPhone(int phone)
	{
		this.phone = phone;
	}

	public int getScroe()
	{
		return scroe;
	}

	public void setScroe(int scroe)
	{
		this.scroe = scroe;
	}

	public int getStart()
	{
		return start;
	}

	public void setStart(int start)
	{
		this.start = start;
	}

	public String getCode()
	{
		return code;
	}

	public void setCode(String code)
	{
		this.code = code;
	}

	public String getUsertime()
	{
		return usertime;
	}

	public void setUsertime(String usertime)
	{
		this.usertime = usertime;
	}

	public User()
	{
	}

	public User(int userid, int userid2, String account, int phone, int scroe, int start, String code, String usertime)
	{
		this.userid = userid;
		this.userid2 = userid2;
		this.account = account;
		this.phone = phone;
		this.scroe = scroe;
		this.start = start;
		this.code = code;
		this.usertime = usertime;
	}

	@Override
	public String toString() {
		return new Gson().toJson(this);

	}
}