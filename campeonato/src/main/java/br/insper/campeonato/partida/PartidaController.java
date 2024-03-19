package br.insper.campeonato.partida;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class PartidaController {

    @Autowired
    private PartidaService partidaService;



    @GetMapping("/partida/{identificador}")
    public ArrayList<Partida> getPartidasMandante(@PathVariable String identificador) {
        return partidaService.listarPartidasMandante(identificador);
    }



    @GetMapping("/partida")
    public ArrayList<Partida> getPartidas() {
        return partidaService.listarPartidas();
    }


    @PostMapping("/partida")
    public void salvarPartida(@RequestBody Partida partida) {
        partidaService.cadastrarPartida(partida);
    }



}
