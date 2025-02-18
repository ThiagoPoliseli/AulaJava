package com.crud.meuprimeirocrud.controller;

import com.crud.meuprimeirocrud.model.LivroModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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


}
