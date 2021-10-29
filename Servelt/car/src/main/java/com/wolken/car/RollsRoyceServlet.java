package com.wolken.car;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RollsRoyceServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.println("<html>"
				+ "<head>"
				+ "<title>RollsRoyce cars</title>"
				+ "</head>"
				+ "<body>Rolls-Royce Rawls · Luolao, Lewis Automotive logo two \"R\" overlap,"
				+ " a symbol of you have me, I have you, reflect both harmony and harmonious relationship."
				+ "</body>"
				+ "</html>");
		writer.close();
	}

}
