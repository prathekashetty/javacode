package com.wolken.car;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PeugeotServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.println("<html>"
				+ "<head>"
				+ "<title>Peugeot cars</title>"
				+ "</head>"
				+ "<body>Peugeot Automobile Company, the predecessor of the Peugeot family,"
				+ " brothers Pierre in the early 19th century opened a production of the see-saw, spring,"
				+ " and other iron tools, small workshops. These iron products, the trademark is a mighty lion, "
				+ "it is a sign of the company is located Frendo repair Kundi province, invincible metaphorical. "
				+ "Reflects the three major advantages: Peugeot see-saw hardened wear-resistant serrated teeth like a lion, "
				+ "saw themselves as the backbone of the Lions flexible, see-saw performance like a lion to the unimpeded."
				+ "</body>"
				+ "</html>");
		writer.close();
	}

}
