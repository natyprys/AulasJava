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
            if (parametroValor != null){
                float valor = Float.parseFloat(parametroValor); 
                out.printf("Modulo Produto = Produto = %s - %f ", nome, valor);
            }
            else{
                out.printf("Modulo Produto = Produto = %s ", nome);
            }


    }
}

