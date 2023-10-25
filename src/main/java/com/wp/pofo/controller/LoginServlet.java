package com.wp.pofo.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wp.pofo.entity.Users;
import com.wp.pofo.service.UsersDAO;
import com.wp.pofo.service.UsersDAOImplByMyBatis;

@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println('a');
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
		
		int id = Integer.parseInt(request.getParameter("id"));
		String pw = request.getParameter("pw");
		
		UsersDAO dao = new UsersDAOImplByMyBatis();
		Users existUser = dao.getUsersById(id);
		
		try {
			if (existUser != null && existUser.getPassword().equals(pw)) {
				response.getWriter().write("{\"success\": true}");
			}
			
			else {
				response.getWriter().write("{\"success\": false}");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}