package com.eduit.spring.boot.jsf.repository;

import com.eduit.spring.boot.jsf.model.Articulo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface ArticuloRepository extends CrudRepository<Articulo, Long> {


     List<Articulo> findByNombre(String nombre);

     List<Articulo> findByNombreAndPresentacion(String nombre, String presentacion);

     List<Articulo> findByNombreOrPresentacion(String nombre, String presentacion);

}



