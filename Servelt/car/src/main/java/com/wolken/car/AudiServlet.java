package com.wolken.car;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AudiServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.println("<html>"
				+ "<head>"
				+ "<title>Audi cars</title>"
				+ "</head>"
				+ "<body>Audi cars of the four rings logo, representing the four pre-merger companies. "
				+ "These companies have a manufacturer of bicycles, motorcycles and small passenger cars. "
				+ "The company was originally a merger of four companies, so each ring is a symbol of one of the companies."
				+ "</body>"
				+ "</html>");
		writer.close();
	}
}


