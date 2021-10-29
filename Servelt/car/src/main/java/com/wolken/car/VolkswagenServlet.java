package com.wolken.car;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class VolkswagenServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.println("<html>"
				+ "<head>"
				+ "<title>Volkswagen cars</title>"
				+ "</head>"
				+ "<body>Volkswagen automobile company in German the Volks Wagenwerk, "
				+ "intended for public use vehicles, marking the VW for the full name the first letter. "
				+ "Signs such as by three with the middle finger and index finger to make the \"V\", "
				+ "said the public company and its products win-win-win."
				+ "</body>"
				+ "</html>");
		writer.close();
	}

}
