package com.manuel.appmundialv2.dao;

import com.manuel.appmundialv2.model.Pais;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface IPaisDao extends JpaRepository<Pais,Integer> {
    Optional<Pais> findById(Integer id);
    Pais findByNombre(String nombre);
    Pais findByContinente(String continente);
    List<Pais> findAll();

}

