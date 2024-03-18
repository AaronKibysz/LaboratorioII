import java.util.Date;

public class Reserva {
    private long nroReserva;
    private Date partida;
    private Date arribo;
    private String origen;
    private String destino;

    public Reserva(){}
    public Reserva(long nroReserva, Date partida, Date arribo, String origen, String destino){
        this.nroReserva = nroReserva;
        this.partida = partida;
        this.arribo = arribo;
        this.origen = origen;
        this.destino = destino;
    }

    public long getNroReserva() {
        return nroReserva;
    }

    public void setNroReserva(long nroReserva) {
        this.nroReserva = nroReserva;
    }

    public Date getPartida() {
        return partida;
    }

    public void setPartida(Date partida) {
        this.partida = partida;
    }

    public Date getArribo() {
        return arribo;
    }

    public void setArribo(Date arribo) {
        this.arribo = arribo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
}
