package com.natyprys.Atividade53.view;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.ArrayList;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

//responder num terminal de endere�o
@WebServlet (urlPatterns = "/produto")

public class Produto extends HttpServlet{
	
	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out = resp.getWriter();
		out.println ("<html>");
		out.println ("<body>");

		out.printf ("<h1>  Modulo Categoria  </h1>");
		out.println ("</html>");
		
	}

}
