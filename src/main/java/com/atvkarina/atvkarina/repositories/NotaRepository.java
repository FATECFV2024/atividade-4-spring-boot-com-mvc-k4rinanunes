package com.atvkarina.atvkarina.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.atvkarina.atvkarina.entities.Nota;

@Repository
public interface NotaRepository extends JpaRepository<Nota, Integer> {

    
} 
