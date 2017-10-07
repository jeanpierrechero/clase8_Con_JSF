package com.eduit.spring.boot.jsf.service;

import com.eduit.spring.boot.jsf.model.Articulo;
import com.eduit.spring.boot.jsf.repository.ArticuloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArticuloService {

    @Autowired
    private ArticuloRepository articuloRepository;


    public Articulo salvarArticulo(Articulo articulo) {
        return articuloRepository.save(articulo);
    }

    public void borrarArticulo(Articulo articulo) {
        articuloRepository.delete(articulo);
    }

    public List<Articulo> listarArticulos() {
        List<Articulo> articulos = new ArrayList<Articulo>();
        for(Articulo articulo : articuloRepository.findAll()){
            articulos.add(articulo);
        }
        return articulos;
    }

    public Articulo obtenerPorId(Long id) {
        return articuloRepository.findOne(id);
    }

    public Articulo modificarrArticulo(Articulo articulo) {
        return articuloRepository.save(articulo);
    }

    public boolean exists(Articulo articulo){
        return articuloRepository.exists(articulo.getId());
    }


}
