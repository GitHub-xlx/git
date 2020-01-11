package com.xlx.mapper;

import com.xlx.inf.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @program: Mybatis
 * @ClassName UserMapper
 * @description: 用户登录
 * @author: xlx
 * @create: 2019-12-23 22:20
 * @Version 1.0
 **/
@Mapper
@Component("userMapper")
public interface UserMapper
{
	//查询所有

	@Select("select * from tuser")
	List<User> findAll();

	@Update("update tuser set scroe=#{scroe}  where userid = #{userid} ")
	int updateScore(User user);

	@Select("select * from tuser where account = #{account} and code = #{code}")
	User findFrontUser(User user);

	@Select("select * from muser where account = #{account} and code = #{code}")
	User findBackUser(User user);

}
