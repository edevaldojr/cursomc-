package com.edevaldojr.cursomc.repositories;

import com.edevaldojr.cursomc.domain.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository  extends JpaRepository<Cliente, Integer> {


    
}
