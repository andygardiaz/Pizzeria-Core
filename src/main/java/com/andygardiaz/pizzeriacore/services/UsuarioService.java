package com.andygardiaz.pizzeriacore.services;

import java.util.List;

import com.andygardiaz.pizzeriacore.entities.Usuario;

public interface UsuarioService {
    public List <Usuario> findAll();
    public Usuario findById(long id);
    public Usuario save(Usuario usuario);
    public void delete(long id);
}
