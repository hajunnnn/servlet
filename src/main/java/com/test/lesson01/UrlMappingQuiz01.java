package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UrlMappingQuiz01 extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest requst, HttpServletResponse responst) throws IOException {
		 ServletResponse response = null;
		 
		 response.setContentType("text/plain");
		 response.setCharacterEncoding("utf-8");
		 
		 Date date = new Date(0);


		 
		 SimpleDateFormat sdf = new SimpleDateFormat("오늘의 날짜는 yyyy-MM-dd");
		 PrintWriter out = response.getWriter();
		 out.println(sdf.format(date));
	}

}
