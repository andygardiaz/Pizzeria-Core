package com.andygardiaz.pizzeriacore.services;

import java.util.List;

import com.andygardiaz.pizzeriacore.dao.IngredienteDao;
import com.andygardiaz.pizzeriacore.entities.Ingrediente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IngredienteServiceImpl implements IngredienteService {

    @Autowired
    private IngredienteDao ingredienteDao;

    @Override
    public List<Ingrediente> findAll() {
        return ingredienteDao.findAll();
    }

    @Override
    public Ingrediente findById(long id) {
        return ingredienteDao.findById(id).get();
    }

    @Override
    public Ingrediente save(Ingrediente ingrediente) {
        return ingredienteDao.save(ingrediente);
    }

    @Override
    public void delete(long id) {
        ingredienteDao.deleteById(id);
        
    }
    
}
