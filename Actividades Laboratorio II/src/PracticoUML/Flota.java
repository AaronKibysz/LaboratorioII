package PracticoUML;

import java.util.ArrayList;

public class Flota {
    private ArrayList<Avion> flotaAviones;

    public ArrayList<Avion> getFlotaAviones() {
        return flotaAviones;
    }
    public void setFlotaAviones(ArrayList<Avion> flotaAviones) {
        this.flotaAviones = flotaAviones;
    }

    public void crearFlota(){
        flotaAviones = new ArrayList<Avion>();
        flotaAviones.add(new Avion("LV-CIG", "Embraer", "190", 2006, 96, 4448));
        flotaAviones.add(new Avion("LV-FWS", "Boeing", "737-800", 2012, 170, 5765));
        flotaAviones.add(new Avion("LV-KEJ", "Boeing", "737 Max 8", 2016, 170, 6500));
    }
}
