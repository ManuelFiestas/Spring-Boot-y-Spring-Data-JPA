package com.manuel.appmundialv2.dao;

import com.manuel.appmundialv2.model.Jugador;
import com.manuel.appmundialv2.model.Pais;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IJugadorDao extends JpaRepository<Jugador, Integer>{
    Jugador findByNombre(String nombre);
    List<Jugador> findByPais(Pais pais);
}
