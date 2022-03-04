package com.edevaldojr.cursomc.repositories;

import com.edevaldojr.cursomc.domain.Categoria;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository  extends JpaRepository<Categoria, Integer> {

    

    
}
