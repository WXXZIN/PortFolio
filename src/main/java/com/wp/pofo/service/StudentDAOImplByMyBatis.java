package com.wp.pofo.service;

import org.apache.ibatis.session.SqlSession;

import com.wp.pofo.entity.Student;
import com.wp.pofo.utils.SqlSessionFactoryBean;

public class StudentDAOImplByMyBatis implements StudentDAO {

	@Override
	public Student SearchStudent(Student student) {
		SqlSession sqlSession = SqlSessionFactoryBean.getSqlSession();
		
		Student result = sqlSession.selectOne("com.wp.pofo.StudentMapper.SearchStudent", student);
		
		sqlSession.close();
		return result;
	}

}