package com.example.servertime2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet(name = "DemoServlet", value = "/demo")
public class DemoServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("name");
		System.out.println("Name " + username);
		String password = request.getParameter("password");
		System.out.println("Password " + password);
		String demo = request.getParameter("demo");
		System.out.println("Demo " + demo);
	}


	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Do Post");
		String username = req.getParameter("name");
		System.out.println("Name " + username);
		String password = req.getParameter("password");
		System.out.println("Password " + password);
		String demo = req.getParameter("demo");
		switch (demo){
			case "add":
				System.out.println("fjsfh");
				break;
		}

	}
}
