package com.wolken.car;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FordServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.println("<html>"
				+ "<head>"
				+ "<title> Ford cars</title>"
				+ "</head>"
				+ "<body>Ford logo Ford English Ford \"blue-white. As founder Henry Ford, "
				+ "like small animals, so the logo designers Ford English painting into a pattern of small white rabbit look like."
				+ "</body>"
				+ "</html>");
		writer.close();
	}

}
