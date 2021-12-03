package com.natyprys.vendas.servlets;

import java.io.IOException;

import com.natyprys.vendas.dao.CategoriaDao;
import com.natyprys.vendas.models.Categoria;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/categoria/deletar")
public class CategoriaDeletarServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        CategoriaDao dao = new CategoriaDao(); 
        Categoria model = new Categoria();
               
        int id = Integer.parseInt(req.getParameter("id"));
        model.setId(id);
        dao.delete(model);

        //atualizar a lista
        RequestDispatcher rd = req.getRequestDispatcher("/categoria/listar");
        rd.forward(req, resp);
    }
}
