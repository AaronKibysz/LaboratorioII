package EjerciciosUML.ejercicio_2;

import java.util.ArrayList;

public class Provincia {
    private String nombreProvincia;
    public ArrayList<Provincia> limitaProvinciasPais;
    private Pais pais;
    private ArrayList<Pais> limitaPaises;
    private ArrayList<Ciudad> ciudades = new ArrayList<>();
    private Ciudad capital;
}
