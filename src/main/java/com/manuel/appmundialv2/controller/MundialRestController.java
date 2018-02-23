package com.manuel.appmundialv2.controller;

import com.manuel.appmundialv2.model.Jugador;
import com.manuel.appmundialv2.model.Pais;
import com.manuel.appmundialv2.services.IJugadorService;
import com.manuel.appmundialv2.services.IPaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("localhost:4200")
@RestController
@RequestMapping("/api")
public class MundialRestController {

    @Autowired
    IPaisService iPaisService;

    @Autowired
    IJugadorService iJugadorService;

    @GetMapping("/paises")
    public List<Pais> getPaises(){
        return iPaisService.getPaises();
    }

    @GetMapping("/jugador/{nombre}")
    public Jugador getJugador(@PathVariable("nombre") String nombre) {
        return iJugadorService.getJugador(nombre);
    }

    @GetMapping("/jugadores/{idPais}")
    public List<Jugador> getJugadores(@PathVariable("idPais") Integer idPais) {
        return iJugadorService.getJugadores(idPais);
    }

    @GetMapping("/seleccionados/{nombrePais}")
    public List<Jugador> getJugadoresPais(@PathVariable("nombrePais") String n) {
        return iJugadorService.getJugadoresPais(n);
    }
}
