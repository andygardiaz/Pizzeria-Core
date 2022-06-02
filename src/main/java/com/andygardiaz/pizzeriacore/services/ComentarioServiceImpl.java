package com.andygardiaz.pizzeriacore.services;

import java.util.List;

import com.andygardiaz.pizzeriacore.dao.ComentarioDao;
import com.andygardiaz.pizzeriacore.entities.Comentario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ComentarioServiceImpl implements ComentarioService {

    @Autowired
    private ComentarioDao comentarioDao;

    @Override
    public List<Comentario> findAll() {
        return comentarioDao.findAll();
    }

    @Override
    public Comentario findById(long id) {
        return comentarioDao.findById(id).get();
    }

    @Override
    public Comentario save(Comentario comentario) {
        return comentarioDao.save(comentario);
    }

    @Override
    public void delete(long id) {
        comentarioDao.deleteById(id);
        
    }
    
}
