package com.natyprys.vendas2.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

//responder num terminal de endereço
@WebServlet (urlPatterns = "/produto")

public class Produto extends HttpServlet{
	
	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		//PrintWriter out = resp.getWriter();
		//out.println("<h1> Produtos </h1>");
		
		ArrayList<String> produtos = new ArrayList<String>();
		produtos.add("Tv");
		produtos.add("Celular");
		produtos.add("Computador");
		
		PrintWriter out = resp.getWriter();	
	
		for (String p : produtos) {
			out.printf("<h2>%s </h2>", p);
		}
	}

}
