package br.insper.campeonato.campeonato;


import br.insper.campeonato.partida.Partida;
import br.insper.campeonato.partida.PartidaService;
import br.insper.campeonato.time.Time;
import br.insper.campeonato.time.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class CampeonatoController {

    @Autowired
    private CampeonatoService campeonatoService;

    @Autowired
    private PartidaService partidaService;


    @GetMapping("/campeonato/{nome}")
    public ArrayList<Partida> getPartidasCampeonato(@PathVariable String nome) {
        return partidaService.listarPartidasCampeonato(nome);
    }

    @PostMapping("/campeonato")
    public void salvarCampeonato(@RequestBody Campeonato campeonato) {
        campeonatoService.cadastrarCampeonato(campeonato);
    }



}
