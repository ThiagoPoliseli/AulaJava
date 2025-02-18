package com.crud.meuprimeirocrud.model;

import jakarta.persistence.*;

@Entity
@Table(name = "TBL_LIVRO")
public class LivroModel {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String autor;

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public LivroModel(){

    }
}
