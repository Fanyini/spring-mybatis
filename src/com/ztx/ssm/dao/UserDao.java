package com.ztx.ssm.dao;

import com.ztx.ssm.po.User;

/**
 *  dao接口，用户管理
 * @author dell
 *
 */
public interface UserDao {

	// 
	public User findUserById(int id) throws Exception;
}
