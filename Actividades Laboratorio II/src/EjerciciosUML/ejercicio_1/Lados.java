package EjerciciosUML.ejercicio_1;

public class Lados {
    private Puntos[] lado = new Puntos[2];
    public Lados(Puntos[] lado) {
        this.lado = lado;
    }
    public void setLado(Puntos[] lado) {
        this.lado = lado;
    }
    public Puntos[] getLado(){
        return lado;
    }
    public void crearLados(){

    }
}
