package com.crud.meuprimeirocrud.service;

import com.crud.meuprimeirocrud.model.LivroModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.crud.meuprimeirocrud.repositories.LivroRepository;

import java.util.List;

@Service
public class LivroServices {

    @Autowired
    private LivroRepository LivroRepository;
    public List<LivroModel>findAll(){
    return LivroRepository.findAll();
    }
}
