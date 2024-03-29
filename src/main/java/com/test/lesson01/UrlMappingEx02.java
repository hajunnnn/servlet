package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson01/ex02")
public class UrlMappingEx02 extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		//한글 깨짐 방지
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		// 서블릿: 자바 코드 안에 + html
		// 1+2+3+4+5+6+7+8+9+10
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		out.println("<html><head><title></title></head><body>");
		out.print("합계:<b>" +sum +"</b>" );
		out.print("</body></html>");
	}

}
