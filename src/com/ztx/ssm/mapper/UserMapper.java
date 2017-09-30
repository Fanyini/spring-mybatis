package com.ztx.ssm.mapper;


import com.ztx.ssm.po.User;
/**
 *  dao接口，用户管理
 * @author dell
 *
 */
public interface UserMapper {

	// 
	public User findUserById(int id) throws Exception;
}
