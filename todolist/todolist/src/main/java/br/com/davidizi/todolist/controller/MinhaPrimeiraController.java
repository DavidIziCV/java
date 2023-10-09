package br.com.davidizi.todolist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/primeiraRota")
public class MinhaPrimeiraController {
    
    /**
     * Métodos de acesso do HTTP
     * GET- Buscar informação
     * POST - Adicionar um dado/informação
     * PUT - Alterar um dado/informação
     * DELETE - Remover um dado
     * PATCH  - Alterar somente uma parte da informação/dado
     */

     //Método (Funcionalidade) de uma classe
     @GetMapping("/")
    public String primeiraMensgem(){
        return "Funcionou" ;
    }
}
