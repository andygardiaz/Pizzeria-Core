package com.andygardiaz.pizzeriacore.services;

import java.util.List;

import com.andygardiaz.pizzeriacore.entities.Ingrediente;


public interface IngredienteService {
    public List <Ingrediente> findAll();
    public Ingrediente findById(long id);
    public Ingrediente save(Ingrediente ingrediente);
    public void delete(long id);




    
}
