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


@WebServlet(urlPatterns = "/categoria")
public class CategoriaServlet extends HttpServlet{
    @Override
    protected void doPost (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CategoriaDao dao =new CategoriaDao();        
        Categoria model = new Categoria();
        
        model.setNome(req.getParameter("nome"));
        model.setDescricao(req.getParameter("descricao"));
        int id = dao.insert(model);
        model.setId(id);

        // - retirado para usar o request- PrintWriter out = resp.getWriter();

        //RequestDispatcher- para pegar minha requisição e mandar para outro lugar
        
        

        RequestDispatcher rd = req.getRequestDispatcher("categoria-sucesso.jsp");
        req.setAttribute("id", model.getId());
        rd.forward(req, resp);
        
        //out.printf("Categoria Salva com sucesso XML- Id gerado %d", model.getId());
    }

//  @Override protected void service - aceita get e post  
//  @Override protected void doPost -só aceita quando usamos method="post" no jsp

}
