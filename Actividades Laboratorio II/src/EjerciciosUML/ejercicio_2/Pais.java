package EjerciciosUML.ejercicio_2;

import java.util.ArrayList;

public class Pais {
    // ATRIBUTOS
    private String nombrePais;
    public ArrayList<Pais> limitaPaises;
    private Continente continente;
    private ArrayList<Provincia> provincias = new ArrayList<>();
    private ArrayList<Provincia> limiteProvincias;

    // CONSTRUCTOR
    public Pais(String nombrePais, ArrayList<Pais> limitaPaises, Continente continente, ArrayList<Provincia> limiteProvincias) {
        this.nombrePais = nombrePais;
        this.limitaPaises = limitaPaises;
        this.continente = continente;
        this.limiteProvincias = limiteProvincias;
    }

    // GETTERS Y SETTERS

    public String getNombrePais() {
        return nombrePais;
    }
    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }
    public Continente getContinente() {
        return continente;
    }
    public void setContinente(Continente continente) {
        this.continente = continente;
    }
    public ArrayList<Provincia> getProvincias() {
        return provincias;
    }
    public void setProvincias(ArrayList<Provincia> provincias) {
        this.provincias = provincias;
    }
    public ArrayList<Provincia> getLimiteProvincias() {
        return limiteProvincias;
    }
    public void setLimiteProvincias(ArrayList<Provincia> limiteProvincias) {
        this.limiteProvincias = limiteProvincias;
    }
}
