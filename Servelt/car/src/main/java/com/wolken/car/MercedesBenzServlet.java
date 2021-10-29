package com.wolken.car;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MercedesBenzServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.println("<html>"
				+ "<head>"
				+ "<title>MercedesBenz cars</title>"
				+ "</head>"
				+ "<body>Apply for Daimler company registered in June 1909 pointed star as a car flag, "
				+ "the symbol of landing on water and air mechanization. "
				+ "Coupled with a circle around it in 1916, set with four small stars in the top of the circle, "
				+ "the following Mercedes \"Mercedes\" word. \"Mercedes\" is the meaning of happiness, "
				+ "meaning Daimler's production of car owners who will bring happiness."
				+ "</body>"
				+ "</html>");
		writer.close();
	}

}
