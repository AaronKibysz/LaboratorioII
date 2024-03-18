import java.util.ArrayList;

public class Flota {
    private ArrayList<Avion> flotaAviones;

    public ArrayList<Avion> getFlotaAviones() {
        return flotaAviones;
    }
    public void setFlotaAviones(ArrayList<Avion> flotaAviones) {
        this.flotaAviones = flotaAviones;
    }

    public void crearFlota(Flota flota1){
        flota1.getFlotaAviones().add(new Avion("LV-CIG", "Embraer", "190", 2006, 96, 4448));
        flota1.getFlotaAviones().add(new Avion("LV-FWS", "Boeing", "737-800", 2012, 170, 5765));
        flota1.getFlotaAviones().add(new Avion("LV-KEJ", "Boeing", "737 Max 8", 2016, 170, 6500));

    }
}
