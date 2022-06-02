package com.andygardiaz.pizzeriacore.dao;

import com.andygardiaz.pizzeriacore.entities.Pizza;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PizzaDao extends JpaRepository <Pizza, Long> {
    
}
