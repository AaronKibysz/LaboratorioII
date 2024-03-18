public class Vuelo {
    private int nroVuelo;
    Avion avion = new Avion();
    Reserva reserva = new Reserva();
    Piloto piloto = new Piloto();
    Piloto copiloto = new Piloto();
    public Vuelo(){}
    public Vuelo(int nroVuelo, Avion avion, Reserva reserva, Piloto piloto, Piloto copiloto){
        this.nroVuelo = nroVuelo;
        this.avion = avion;
        this.reserva = reserva;
        this.piloto = piloto;
        this.copiloto = copiloto;
    }

    public int getNroVuelo() {
        return nroVuelo;
    }

    public void setNroVuelo(int nroVuelo) {
        this.nroVuelo = nroVuelo;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
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
