package com.xlx.mapper;

import com.xlx.inf.Menus;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

/**
 * @program: myboot
 * @ClassName MenuMapper
 * @description:
 * @author: xlx
 * @create: 2019-12-25 15:50
 * @Version 1.0
 **/
@Mapper
@Component("menuMapper")
public interface MenuMapper
{
	@Select({"select a.MNAME,a.PATH,b.MNAME father from " +
			"(select * from menus where father is not null) a,menus b " +
			"where a.FATHER=b.MENUID"})
	ArrayList<Menus> selectMenus();


}
