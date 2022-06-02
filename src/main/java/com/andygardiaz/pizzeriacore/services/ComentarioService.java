package com.andygardiaz.pizzeriacore.services;

import java.util.List;

import com.andygardiaz.pizzeriacore.entities.Comentario;

public interface ComentarioService {
    public List <Comentario> findAll();
    public Comentario findById(long id);
    public Comentario save(Comentario comentario);
    public void delete(long id);
}
