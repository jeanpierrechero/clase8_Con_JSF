package com.eduit.spring.boot.jsf.model;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "articulos")
public class Articulo implements Serializable {


    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "presentacion")
    private String presentacion;
    @Column(name = "precio")
    private Float precio;
    @Column(name = "cantidad")
    private Integer cantidad;


    public Articulo(String nombre, String presentacion, Float precio, Integer cantidad) {
        super();
        this.nombre = nombre;
        this.presentacion = presentacion;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public Articulo() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }


    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }


    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

}
