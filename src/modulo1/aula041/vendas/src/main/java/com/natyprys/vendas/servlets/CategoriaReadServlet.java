package com.natyprys.vendas.servlets;

import java.io.IOException;
import java.io.PrintWriter;


import com.natyprys.vendas.dao.CategoriaDao;
import com.natyprys.vendas.models.Categoria;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/categoria/listar")
public class CategoriaReadServlet extends HttpServlet {

    //doGet pq vou listar
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter out = resp.getWriter();
        CategoriaDao dao =  new CategoriaDao();
        for (Categoria model : dao.read()) {
            out.printf("%d - %s \n", model.getId(), model.getNome());
        }
    }
}
