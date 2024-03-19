package EjerciciosUML.ejercicio_2;

import java.util.ArrayList;

public class Pais {
    private String nombrePais;
    public ArrayList<Pais> limitaPaises;
    private Continente continente;
    private ArrayList<Provincia> provincias = new ArrayList<>();
    private ArrayList<Provincia> limiteProvincias;

    public Pais(String nombrePais, ArrayList<Pais> limitaPaises, Continente continente, ArrayList<Provincia> limiteProvincias) {
        this.nombrePais = nombrePais;
        this.limitaPaises = limitaPaises;
        this.continente = continente;
        this.limiteProvincias = limiteProvincias;
    }
}
