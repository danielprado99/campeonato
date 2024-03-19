package br.insper.campeonato.campeonato;

import br.insper.campeonato.partida.Partida;
import br.insper.campeonato.partida.PartidaService;
import br.insper.campeonato.time.Time;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CampeonatoService {



    private ArrayList<Campeonato> campeonatos = new ArrayList<>();

    public ArrayList<Campeonato> cadastrarCampeonato(Campeonato campeonato) {

        if (campeonato.getNome().equals("")
                || campeonato.getIdentificador().equals("")) {
            return null;
        } else {
            campeonatos.add(campeonato);
            return campeonatos;
        }

    }

    public Campeonato getCampeonato(String identificador) {
        for (Campeonato campeonato : campeonatos) {
            if (campeonato.getIdentificador().equals(identificador)) {
                return campeonato;
            }
        }
        return null;
    }





}






