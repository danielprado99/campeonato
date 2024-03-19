package br.insper.campeonato.time;


import br.insper.campeonato.partida.PartidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class TimeController {

    @Autowired
    private TimeService timeService;

    @Autowired
    private PartidaService partidaService;

    @GetMapping("/time")
    public ArrayList<Time> getTimes(@RequestParam(required = false) String nome, String estado) {
        if (estado == null) {
            return timeService.listarTimes(nome);
        }
        else{
            return timeService.ListarTimesEstado(estado);
        }
    }

    @GetMapping("/time/{identificador}")
    public Time getTime(@PathVariable String identificador) {
        return timeService.getTime(identificador);
    }

    @GetMapping("time/{identificador}/vitoria")
    public Integer getVitoria(@PathVariable String identificador){
        return partidaService.contarVitorias(identificador);
    }


    @PostMapping("/time")
    public void salvarTime(@RequestBody Time time) {
        timeService.cadastrarTime(time);
    }


}
