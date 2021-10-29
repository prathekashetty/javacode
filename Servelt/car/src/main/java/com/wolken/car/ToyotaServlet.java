package com.wolken.car;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ToyotaServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.println("<html>"
				+ "<head>"
				+ "<title>Toyota cars</title>"
				+ "</head>"
				+ "<body>Toyota's three oval logos are from early 1990. Large oval logo on behalf of the Earth, "
				+ "in the middle by a vertical combination of two ellipses into a T-word, on behalf of Toyota."
				+ "</body>"
				+ "</html>");
		writer.close();
	}

}
