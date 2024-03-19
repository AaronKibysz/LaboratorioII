package EjerciciosUML.ejercicio_1;

public class Elipse {
    public float semiEjeMayor;
    public float semiEjeMenor;
    Puntos centro = new Puntos();
    Figura figura;
    public Elipse(float semiEjeMayor, float semiEjeMenor, Puntos centro, Figura figura) {
        this.semiEjeMayor = semiEjeMayor;
        this.semiEjeMenor = semiEjeMenor;
        this.centro = centro;
        this.figura = figura;
    }
}
