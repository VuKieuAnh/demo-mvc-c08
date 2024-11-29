package com.example.servertime2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DemoServlet", value = "/demo")
public class Demo1Servlet extends HttpServlet {
//	@Override
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		PrintWriter writer = response.getWriter();
//		writer.println("");
//		Date today = new Date();
//		writer.println("<h1>" + today + "</h1>");
//		writer.println("");
//	}


	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Do Post");
	}
}
