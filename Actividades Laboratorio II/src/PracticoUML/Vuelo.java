package PracticoUML;

import java.util.ArrayList;

public class Vuelo {
    private int nroDeVuelo;
    private Avion avion;
    private ArrayList<Reserva> reservas;
    private Piloto piloto;
    private Piloto copiloto;

    //constructor
    public Vuelo() {
    }
    public Vuelo(int nroDeVuelo, Avion avion, Piloto piloto, Piloto copiloto) {
        this.nroDeVuelo = nroDeVuelo;
        this.avion = avion;
        this.piloto = piloto;
        this.copiloto = copiloto;
    }

    //getters & setters
    public int getNroDeVuelo() {
        return nroDeVuelo;
    }
    public void setNroDeVuelo(int nroDeVuelo) {
        this.nroDeVuelo = nroDeVuelo;
    }

    public Avion getAvion() {
        return avion;
    }
    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }
    public void setReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }

    public Piloto getPiloto() {
        return piloto;
    }
    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public Piloto getCopiloto() {
        return copiloto;
    }
    public void setCopiloto(Piloto copiloto) {
        this.copiloto = copiloto;
    }
}
