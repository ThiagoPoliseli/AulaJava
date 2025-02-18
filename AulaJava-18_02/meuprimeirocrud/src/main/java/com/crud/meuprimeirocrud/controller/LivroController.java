package com.crud.meuprimeirocrud.controller;

import com.crud.meuprimeirocrud.model.LivroModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.crud.meuprimeirocrud.service.LivroServices;

import java.util.List;

@RestController
@RequestMapping(path = "/alunos")

public class LivroController {
@Autowired
    private LivroServices livroServices;

@GetMapping
    private List <LivroModel>findAll(){
    return livroServices.findAll();
}

    @PostMapping
    private LivroModel criarLivro(@RequestBody LivroModel livroModel){
        return livroServices.criarLivro(livroModel);
    }


}
