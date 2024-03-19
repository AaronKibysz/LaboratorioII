package EjerciciosUML.ejercicio_2;

import java.util.ArrayList;

public class Continente {
    // ATRIBUTOS
    private String nombreContinente;
    private ArrayList<Pais> paises = new ArrayList<>();

    // CONSTRUCTOR
    public Continente(String nombreContinente, ArrayList<Pais> paises){
        this.nombreContinente = nombreContinente;
        this.paises = paises;
    }

    // GETTERS Y SETTERS
    public String getNombreContinente() {
        return nombreContinente;
    }
    public void setNombreContinente(String nombreContinente) {
        this.nombreContinente = nombreContinente;
    }
    public ArrayList<Pais> getPaises() {
        return paises;
    }
    public void setPaises(ArrayList<Pais> paises) {
        this.paises = paises;
    }
}
