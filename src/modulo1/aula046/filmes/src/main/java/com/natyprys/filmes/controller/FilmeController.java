package com.natyprys.filmes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//mapeia que isso é uma controller de requisição
@Controller
public class FilmeController {

    //respondendo a uma determinada rota
    //tem q ser colocada em cada metodo
    //diferencia get de post, delete ...

    @GetMapping("/filme")
    public String filmes(){
        return "filmes";
    }
}
