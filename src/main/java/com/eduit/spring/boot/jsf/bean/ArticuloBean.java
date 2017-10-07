package com.eduit.spring.boot.jsf.bean;

import com.eduit.spring.boot.jsf.model.Articulo;
import com.eduit.spring.boot.jsf.service.ArticuloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.eduit.spring.boot.jsf.scope.ScopeName;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Component("articuloBean")
@Scope(ScopeName.VIEW)
public class ArticuloBean {

    @Autowired
    private ArticuloService articuloService;
    private Articulo articulo = new Articulo();
    private List<Articulo> articulos = new ArrayList<>();


    public void save() {
        articuloService.salvarArticulo(articulo);
        articulo = new Articulo();
    }

    public void list(){
        articulos = articuloService.listarArticulos();
    }

    public void delete(Articulo articulo){
        articuloService.borrarArticulo(articulo);
        articulos = articuloService.listarArticulos();
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public List<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(List<Articulo> articulos) {
        this.articulos = articulos;
    }
}
