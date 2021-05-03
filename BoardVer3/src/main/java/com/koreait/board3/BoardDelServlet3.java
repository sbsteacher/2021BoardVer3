package com.koreait.board3;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/del3")
public class BoardDelServlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String iBoard = request.getParameter("pk");
		int intIboard = Integer.parseInt(iBoard);
				
		BoardVO3 param = new BoardVO3();
		param.setIboard(intIboard);
		
		BoardDAO.delBoard(param);	
		
		response.sendRedirect("/list3");
	}
}
