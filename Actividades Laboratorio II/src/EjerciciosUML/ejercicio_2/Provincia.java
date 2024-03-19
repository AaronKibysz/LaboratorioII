package EjerciciosUML.ejercicio_2;

import java.util.ArrayList;

public class Provincia {
    // ATRIBUTOS
    private String nombreProvincia;
    public ArrayList<Provincia> limitaProvinciasPais;
    private Pais pais;
    private ArrayList<Pais> limitaPaises;
    private ArrayList<Ciudad> ciudades = new ArrayList<>();
    private Ciudad capital;

    // CONSTRUCTOR
    public Provincia(String nombreProvincia, ArrayList<Provincia> limitaProvinciasPais, Pais pais, ArrayList<Pais> limitaPaises, ArrayList<Ciudad> ciudades, Ciudad capital) {
        this.nombreProvincia = nombreProvincia;
        this.limitaProvinciasPais = limitaProvinciasPais;
        this.pais = pais;
        this.limitaPaises = limitaPaises;
        this.ciudades = ciudades;
        this.capital = capital;
    }

    // GETTERS Y SETTERS
    public String getNombreProvincia() {
        return nombreProvincia;
    }
    public void setNombreProvincia(String nombreProvincia) {
        this.nombreProvincia = nombreProvincia;
    }
    public Pais getPais() {
        return pais;
    }
    public void setPais(Pais pais) {
        this.pais = pais;
    }
    public ArrayList<Pais> getLimitaPaises() {
        return limitaPaises;
    }
    public void setLimitaPaises(ArrayList<Pais> limitaPaises) {
        this.limitaPaises = limitaPaises;
    }
    public ArrayList<Ciudad> getCiudades() {
        return ciudades;
    }
    public void setCiudades(ArrayList<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }
    public Ciudad getCapital() {
        return capital;
    }
    public void setCapital(Ciudad capital) {
        this.capital = capital;
    }
}
