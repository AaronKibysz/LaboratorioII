package EjerciciosUML.ejercicio_1;

import java.util.ArrayList;

public class Figura {
    public String nombreFigura;
    public ArrayList Poligonos;
    public ArrayList Elipses;

    public Figura(String nombreFigura, ArrayList Poligonos, ArrayList Elipses){
        this.nombreFigura = nombreFigura;
        this.Poligonos = Poligonos;
        this.Elipses = Elipses;
    }

    public float calcularArea(){
        return 0;
    }
    public float calcularPerimetro(){
        return 0;
    }
}
