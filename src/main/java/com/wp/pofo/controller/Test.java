package com.wp.pofo.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wp.pofo.entity.Student;
import com.wp.pofo.entity.Users;
import com.wp.pofo.service.StudentDAO;
import com.wp.pofo.service.StudentDAOImplByMyBatis;
import com.wp.pofo.service.UsersDAO;
import com.wp.pofo.service.UsersDAOImplByMyBatis;

/**
 * Servlet implementation class Test
 */
@WebServlet("/Test")
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Test() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Student stu = new Student();
		stu.setStudno(201995096);
		stu.setName("최원진");
		stu.setTel("010-0000-0000");
		
		StudentDAO sdao = new StudentDAOImplByMyBatis();
		Student s = sdao.SearchStudent(stu);
		
		if (s != null) {
			Users users = new Users();
			users.setId(s.getStudno());
			users.setPassword("12345");
			UsersDAO udao = new UsersDAOImplByMyBatis();
			
			int result = udao.updatePwUsers(users);
			
			if (result == 1) {
				System.out.println(users.toString());
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
