package com.andygardiaz.pizzeriacore.services;

import java.util.List;

import com.andygardiaz.pizzeriacore.dao.UsuarioDao;
import com.andygardiaz.pizzeriacore.entities.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioDao usuarioDao;

    @Override
    public List<Usuario> findAll() {
        return usuarioDao.findAll();
    }

    @Override
    public Usuario findById(long id) {
        return usuarioDao.findById(id).get();
    }

    @Override
    public Usuario save(Usuario usuario) {
        return usuarioDao.save(usuario);
    }

    @Override
    public void delete(long id) {
        usuarioDao.deleteById(id);
        
    }
    
}
