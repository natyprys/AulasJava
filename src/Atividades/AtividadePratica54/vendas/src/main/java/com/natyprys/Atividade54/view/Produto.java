package com.natyprys.Atividade54.view;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/produto")
public class Produto extends HttpServlet {
    
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        
        String nome = req.getParameter("nome");
        //tem q converter se eu quiser outro padrão pq vem em String
        String parametroValor = req.getParameter("valor");
        String parametroIDcategoria = req.getParameter("id_categoria");

            if (parametroValor != null && parametroIDcategoria != null){
                float valor = Float.parseFloat(parametroValor); 
                int id_categoria = Integer.parseInt(parametroIDcategoria); 
                out.printf("Modulo Produto = Produto = %s - %f - %f ", nome, valor, id_categoria);
            }
            else{
                out.printf("Modulo Produto = Produto = %s ", nome);
            }                
    }
    //dessa forma se os valores de id e valor forem nulos só vai imprimir o nome
}

