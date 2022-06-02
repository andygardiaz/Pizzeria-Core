package com.andygardiaz.pizzeriacore.dao;

import com.andygardiaz.pizzeriacore.entities.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioDao extends JpaRepository <Usuario, Long> {
    
}
