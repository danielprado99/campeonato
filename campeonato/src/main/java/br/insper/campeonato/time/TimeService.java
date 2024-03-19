package br.insper.campeonato.time;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TimeService {

    private ArrayList<Time> times = new ArrayList<>();

    public Time cadastrarTime(Time time) {

        if(time.getIdentificador().equals("")){
            return null;
        }
        else{
            times.add(time);
            return time;
        }
    }

    public ArrayList<Time> listarTimes(String nome) {
        if (nome != null) {
            ArrayList<Time> lista = new ArrayList<>();
            for (Time time : times) {
                if (time.getNome().startsWith(nome)) {
                    lista.add(time);
                }
            }
            return lista;
        }
        return times;
    }

    public Time getTime(String identificador) {
        for (Time time : times) {
            if (time.getIdentificador().equals(identificador)) {
                return time;
            }
        }
        return null;
    }


    public ArrayList<Time> ListarTimesEstado(String nome){
        ArrayList<Time> lista = new ArrayList<>();
        if (nome!= null){
            for (Time time : times){
                if (time.getEstado().equals(nome)){
                    lista.add(time);
                }
            }
        }
        return lista;
    }








}
