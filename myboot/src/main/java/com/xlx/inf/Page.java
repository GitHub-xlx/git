package com.xlx.inf;

import com.google.gson.Gson;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @program: Mybatis
 * @ClassName Page
 * @description:
 * @author: xlx
 * @create: 2019-12-26 16:13
 * @Version 1.0
 **/
@Component
public class Page
{
	private int code=0;
	private Long count;
	private String msg="";
	private List data;

	public int getCode()
	{
		return code;
	}

	public void setCode(int code)
	{
		this.code = code;
	}

	public Long getCount()
	{
		return count;
	}

	public void setCount(Long count)
	{
		this.count = count;
	}

	public String getMsg()
	{
		return msg;
	}

	public void setMsg(String msg)
	{
		this.msg = msg;
	}

	public List getData()
	{
		return data;
	}

	public void setData(List data)
	{
		this.data = data;
	}

	public Page()
	{
	}

	public Page(int code, Long count, String msg, List data)
	{
		this.code = code;
		this.count = count;
		this.msg = msg;
		this.data = data;
	}

	@Override
	public String toString()
	{
		Gson g = new Gson();
		return g.toJson(this);
	}
}