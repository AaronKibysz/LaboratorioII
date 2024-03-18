public class Avion {
    private String patente;
    private String marca;
    private String modelo;
    private int anioFablicacion;
    private int nroAsientos;
    private float alcance;

    public Avion(){}
    public Avion(String patente, String marca, String modelo, int anioFablicacion, int nroAsientos, float alcance){
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.anioFablicacion = anioFablicacion;
        this.nroAsientos = nroAsientos;
        this.alcance = alcance;
    }

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

    public int getAnioFablicacion() {
        return anioFablicacion;
    }

    public void setAnioFablicacion(int anioFablicacion) {
        this.anioFablicacion = anioFablicacion;
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
