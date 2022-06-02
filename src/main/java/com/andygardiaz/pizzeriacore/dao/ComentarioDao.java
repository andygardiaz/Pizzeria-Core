package com.andygardiaz.pizzeriacore.dao;

import com.andygardiaz.pizzeriacore.entities.Comentario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComentarioDao extends JpaRepository <Comentario, Long> {
    
}
