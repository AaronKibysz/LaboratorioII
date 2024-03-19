package PracticoUML;

public class Avion {
    private String patente;
    private String marca;
    private String modelo;
    private int anioFabricacion;
    private int nroAsientos;
    private float alcance;

    //constrictor
    public Avion(){}
    public Avion(String patente, String marca, String modelo, int anioFabricacion, int nroAsientos, float alcance){
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.nroAsientos = nroAsientos;
        this.alcance = alcance;
    }

    //getters & setters
    public String getPatente() {
        return patente;
    }
    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }
    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public int getNroAsientos() {
        return nroAsientos;
    }
    public void setNroAsientos(int nroAsientos) {
        this.nroAsientos = nroAsientos;
    }

    public float getAlcance() {
        return alcance;
    }
    public void setAlcance(float alcance) {
        this.alcance = alcance;
    }


}
