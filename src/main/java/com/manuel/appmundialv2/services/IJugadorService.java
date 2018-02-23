package com.manuel.appmundialv2.services;

import com.manuel.appmundialv2.model.Jugador;

import java.util.List;

public interface IJugadorService {
    Jugador getJugador(String nombre);
    List<Jugador> getJugadores(Integer idPais);
    List<Jugador> getJugadoresPais(String nombre);
}
