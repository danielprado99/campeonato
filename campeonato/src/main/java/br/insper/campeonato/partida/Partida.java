package br.insper.campeonato.partida;

public class Partida {

    private String timeMandante;

    private String timeVisitante;

    private String campeonato;

    private Integer placarMandante;

    private Integer placarVisitante;

    public Partida(String timeMandante, String timeVisitante, String campeonato, Integer placarMandante, Integer placarVisitante) {
        this.timeMandante = timeMandante;
        this.timeVisitante = timeVisitante;
        this.placarMandante = placarMandante;
        this.placarVisitante = placarVisitante;
        this.campeonato = campeonato;
    }


    public String getTimeMandante() {
        return timeMandante;
    }

    public void setTimeMandante(String timeMandante) {
        this.timeMandante = timeMandante;
    }

    public String getTimeVisitante() {
        return timeVisitante;
    }

    public void setTimeVisitante(String timeVisitante) {
        this.timeVisitante = timeVisitante;
    }

    public Integer getPlacarMandante() {
        return placarMandante;
    }

    public void setPlacarMandante(Integer placarMandante) {
        this.placarMandante = placarMandante;
    }

    public Integer getPlacarVisitante() {
        return placarVisitante;
    }

    public void setPlacarVisitante(Integer placarVisitante) {
        this.placarVisitante = placarVisitante;
    }

    public String getCampeonato() {
        return campeonato;
    }

    public void setCampeonato(String campeonato) {
        this.campeonato = campeonato;
    }
}
