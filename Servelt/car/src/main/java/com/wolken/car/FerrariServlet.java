package com.wolken.car;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FerrariServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.println("<html>"
				+ "<head>"
				+ "<title>Ferrari cars</title>"
				+ "</head>"
				+ "<body> Ferrari logo is a leaping horse. In the First World War,"
				+ " Italy has a performance very good pilot; his aircraft had this one will bring him good luck in the Yamaha. "
				+ "In the first Ferrari racing after winning the pilot's parents - a pair of Earl couple suggestions:"
				+ " Ferrari should also be in the car printed on this horse, bring good luck in the Yamaha. "
				+ "The pilot was killed, the horse became a black color; the logo background color of Modena canary."
				+ "</body>"
				+ "</html>");
		writer.close();
	}

}
