package com.crud.meuprimeirocrud.repositories;

import com.crud.meuprimeirocrud.model.LivroModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository <LivroModel,Long> {

}
