package br.insper.campeonato.partida;

import br.insper.campeonato.campeonato.Campeonato;
import br.insper.campeonato.campeonato.CampeonatoService;
import br.insper.campeonato.time.Time;
import br.insper.campeonato.time.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PartidaService {

    private ArrayList<Partida> partidas = new ArrayList<>();

    @Autowired
    private TimeService timeService;

    @Autowired
    private CampeonatoService campeonatoService;


    public Partida cadastrarPartida(Partida partida){
        Time timeMandante = timeService.getTime(partida.getTimeMandante());
        if (timeMandante == null){
            return null;
        }
        Time timeVisitante = timeService.getTime(partida.getTimeVisitante());
        if (timeVisitante == null){
            return null;
        }
        Campeonato campeonato = campeonatoService.getCampeonato(partida.getCampeonato());
        if (campeonato == null) {
            return null;
        }
        partidas.add(partida);
        return partida;
    }

    public ArrayList<Partida> listarPartidasMandante(String identificador){
        ArrayList<Partida> lista = new ArrayList<>();
        for (Partida partida: partidas){
            if (partida.getTimeMandante().equals(identificador)){
                lista.add(partida);
            }
        }
        return lista;
    }

    public ArrayList<Partida> listarPartidas() {return partidas; }

    public ArrayList<Partida> listarPartidasCampeonato(String campeonato) {
        ArrayList<Partida> lista = new ArrayList<>();
        for (Partida partida : partidas) {
            if (partida.getCampeonato().equals(campeonato)) {
                lista.add(partida);
            }
        }
        return lista;
    }

    public Integer contarVitorias(String nome){
        int contador = 0;
        for (Partida partida : partidas) {
            if (partida.getTimeMandante().equals(nome)){
                if(partida.getPlacarMandante() > partida.getPlacarVisitante()){
                    contador++;
                }
            }
            else if (partida.getTimeVisitante().equals(nome)){
                if(partida.getPlacarMandante() < partida.getPlacarVisitante()){
                    contador++;
                }
            }

        }
        return contador;
    }







}
