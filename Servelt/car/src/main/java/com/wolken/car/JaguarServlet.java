package com.wolken.car;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JaguarServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.println("<html>"
				+ "<head>"
				+ "<title>Jaguar cars</title>"
				+ "</head>"
				+ "<body> Jaguar's name origin can be traced back to 1937. June SS Motor Company officially took over the car companies Sunbeam (Wolverhampton)."
				+ " Sir Lyons was very much hope that can car called Sunbeam, Sunbeam had many world racing champions, which can be described as a \"victory\" sign."
				+ " Unfortunately, within the company there are some problems. Finally,"
				+ " forced to abandon the use of the name of the Sunbeam as a company. "
				+ "Sir Lyons last name-the Jaguar chose a clear pronunciation in various languages, it is named according to the World War "
				+ "I flying machine."
				+ "</body>"
				+ "</html>");
		writer.close();
	}

}
