package com.wp.pofo.service;

import org.apache.ibatis.session.SqlSession;

import com.wp.pofo.entity.Users;
import com.wp.pofo.utils.SqlSessionFactoryBean;

public class UsersDAOImplByMyBatis implements UsersDAO {

	@Override
	public Users getUsersById(int id) {
		SqlSession sqlSession = SqlSessionFactoryBean.getSqlSession();
		
		Users result = sqlSession.selectOne("com.wp.pofo.UsersMapper.getUsersById", id);
		
		sqlSession.close();
		return result;
	}

	@Override
	public int updatePwUsers(Users users) {
		SqlSession sqlSession = SqlSessionFactoryBean.getSqlSession();
		
		int result = sqlSession.update("com.wp.pofo.UsersMapper.updateUsers", users);
		
		sqlSession.close();
		return result;
	}
}