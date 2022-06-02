package com.andygardiaz.pizzeriacore.services;

import java.util.List;

import com.andygardiaz.pizzeriacore.dao.PizzaDao;
import com.andygardiaz.pizzeriacore.entities.Pizza;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PizzaServiceImpl implements PizzaService {

    @Autowired
    private PizzaDao pizzaDao;

    @Override
    public List<Pizza> findAll() {
        return pizzaDao.findAll();
    }

    @Override
    public Pizza save(Pizza pizza) {
        return pizzaDao.save(pizza);
        
    }

    @Override
    public void delete(long id) {
        pizzaDao.deleteById(id); 
    }

    @Override
    public Pizza findById(long id) {
        return pizzaDao.findById(id).get();
    }
    
}
