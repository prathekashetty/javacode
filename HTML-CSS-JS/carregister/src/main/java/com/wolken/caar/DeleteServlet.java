package com.wolken.caar;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wolken.caar.dto.LoginDTO;
import com.wolken.caar.service.RegistrationService;
import com.wolken.caar.service.RegistrationServiceImpl;


public class DeleteServlet  extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RegistrationService service=new RegistrationServiceImpl();
		String email=req.getParameter("email");
		LoginDTO loginDTO=new LoginDTO();
		
		String login=service.validateandDelete(email);
		resp.setContentType("text/html");
		PrintWriter writer=resp.getWriter();
		writer.println("<html>"
				+ "<body>"
				+ "Result:"+login
				+ "</body>"
				+ "</html>");
		
	}
}