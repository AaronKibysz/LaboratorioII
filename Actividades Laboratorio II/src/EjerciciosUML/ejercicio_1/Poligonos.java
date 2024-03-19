package EjerciciosUML.ejercicio_1;

import java.util.ArrayList;

public class Poligonos {
    public int nroLados;
    public ArrayList lados;
    public Figura figura;

    public Poligonos(int nroLados, ArrayList lados, Figura figura){
        this.nroLados = nroLados;
        this.lados = lados;
        this.figura = figura;
    }
}
