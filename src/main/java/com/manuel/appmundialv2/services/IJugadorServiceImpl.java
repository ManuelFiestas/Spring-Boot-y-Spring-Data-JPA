package com.manuel.appmundialv2.services;

import com.manuel.appmundialv2.dao.IJugadorDao;
import com.manuel.appmundialv2.dao.IPaisDao;
import com.manuel.appmundialv2.model.Jugador;
import com.manuel.appmundialv2.model.Pais;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IJugadorServiceImpl implements IJugadorService {

    @Autowired
    IJugadorDao iJugadorDao;

    @Autowired
    IPaisDao iPaisDao;

    @Override
    public Jugador getJugador(String nombre) {
        return iJugadorDao.findByNombre(nombre);
    }

    @Override
    public List<Jugador> getJugadores(Integer idPais) {
        Optional<Pais> optional = iPaisDao.findById(idPais);
        Pais pais = optional.get();
        return iJugadorDao.findByPais(pais);
    }

    @Override
    public List<Jugador> getJugadoresPais(String nombre) {
        Pais pais = iPaisDao.findByNombre(nombre);
        return iJugadorDao.findByPais(pais);
    }
}
