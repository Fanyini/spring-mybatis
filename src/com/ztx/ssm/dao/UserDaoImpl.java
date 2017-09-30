package com.ztx.ssm.dao;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.ztx.ssm.po.User;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

	@Override
	public User findUserById(int id) throws Exception {
		// 继承sqlSessionDaoSupport。通过this.getSqlSession 得到SqlSession
		SqlSession session = this.getSqlSession();

		User user = session.selectOne("test.findUserById", 1);

		// 通过spring来管理的话 方法结束就得到了
		// session.close();

		return user;
	}

}
