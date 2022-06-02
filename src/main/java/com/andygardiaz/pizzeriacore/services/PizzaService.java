package com.andygardiaz.pizzeriacore.services;

import java.util.List;

import com.andygardiaz.pizzeriacore.entities.Pizza;

public interface PizzaService {
    public List <Pizza> findAll();
    public Pizza findById(long id);
    public Pizza save(Pizza pizza);
    public void delete (long id);
}
