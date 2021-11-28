package com.natyprys.Atividade53.view;

import java.io.IOException;

import java.io.PrintWriter;

import com.natyprys.Atividade53.dao.CategoriaDao;
import com.natyprys.Atividade53.model.Categoria;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/categoria")

public class CategoriaServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Categoria model = new Categoria();
		model.setNome(req.getParameter("nome"));
		
			
		System.out.println("Recebendo requisição");

		PrintWriter out = resp.getWriter();
		out.println ("<html>");
		out.println ("<body>");

		out.printf ("<h1>  Modulo Categoria  </h1>");
		out.println ("</html>");
		
	} 
}
