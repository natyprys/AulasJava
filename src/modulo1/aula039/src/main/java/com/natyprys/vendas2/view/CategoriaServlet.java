package com.natyprys.vendas2.view;

import java.io.IOException;
import java.io.PrintWriter;

import com.natyprys.vendas2.dao.CategoriaDao;
import com.natyprys.vendas2.model.Categoria;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


//adicionando uma nota��o do servlet
@WebServlet(urlPatterns = "/categoria")
// o /categoria � o endere�o do navegador. Quando escrever /categoria no navegador ele imprime o println no terminal
//n�o precisa do ponto e virgula pq � uma nota��o

public class CategoriaServlet extends HttpServlet{
	//criando um servlet
	// recebo uma requisi��o e retorno uma resposta
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//para capturar a informa��o do nome feita no index. Colocar no parametro o name que foi colocado no html
		//-String nome = req.getParameter("nome");  --retirado
		// colocando as categorias:
		
		Categoria model = new Categoria();
		model.setNome(req.getParameter("nome"));
		
		//importando dao
		//CategoriaDao dao = new CategoriaDao();
		//dao.insert(model);
		// precisamos fazer uma conex�o
		
			
		System.out.println("Recebendo requisi��o");
		//super.service(req, resp);
		
		//vamos escrever uma resposta
		PrintWriter out = resp.getWriter();
		out.println ("<html>");
		out.println ("<body>");
		//out.println ("<h1> Cadastro de categorias </h1>");
		
		//colocando req.getParameter
		out.printf ("<h1> Categoria salva: %s </h1>", model.getNome());
		// vai aparecer no servlet - Cadastro de categorias: chocolate . nome=chocolate
		out.println ("</body>");
		out.println ("</html>");
		
	} 
}
