package com.wp.pofo.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.wp.pofo.entity.Users;
import com.wp.pofo.service.UsersDAO;
import com.wp.pofo.service.UsersDAOImplByMyBatis;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println('a');
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String pw = request.getParameter("pw");
		
		UsersDAO dao = new UsersDAOImplByMyBatis();
		Users existUser = dao.getUsersById(id);
		
		try {
			
			if (existUser != null && existUser.getPassword().equals(pw)) {
				HttpSession session = request.getSession();
				session.setAttribute("user", existUser);
			}
			
			else {
				if (existUser == null) {    
					response.setContentType("text/html; charset=UTF-8");
				    response.getWriter().write("<script>alert('아이디가 존재하지 않습니다1.');</script>");
				}
				
				else {
					response.setContentType("text/html; charset=UTF-8");
					response.getWriter().write("<script>alert('비밀번호가 일치하지 않습니다.');</script>");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			response.getWriter().write("<script>window.location.href='view/home.jsp';</script>");
		}
	}

}
