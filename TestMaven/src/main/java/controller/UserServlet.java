package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("=====doGet=====");
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		System.out.println("doPost");
		String action = req.getParameter("action");
		if("login_input".equals(action)){
			req.getRequestDispatcher("login.jsp").forward(req, resp);
		}else if("login".equals(action)){
			String name = req.getParameter("name");
			String password = req.getParameter("password");
			System.out.println("name-->"+name+",password->"+password);
			
		}
	}
}
