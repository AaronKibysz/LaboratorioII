package PracticoUML;

public class Piloto extends Persona implements Volador {
    private int nroLicencia;

    //constructores
    public Piloto(){}
    public Piloto(int nroLicencia, int dni, String nombre, int edad){
        super(dni, nombre, edad);
        this.nroLicencia = nroLicencia;
    }

    //getters & setters
    public int getNroLicencia() {
        return nroLicencia;
    }
    public void setNroLicencia(int nroLicencia) {
        this.nroLicencia = nroLicencia;
    }


    public void crearPilotos(){
        Piloto piloto1 = new Piloto(1989568, 22698364, "Oscar Alvarez", 53);
        Piloto piloto2 = new Piloto(2015683, 35823967, "Ignacio Lopez", 33);
        Piloto piloto3 = new Piloto(1978234, 15746321, "Alfredo Martinez", 65);
        Piloto piloto4 = new Piloto(2019261, 41134523, "Martin Molina", 25);
    }


    //implementando interfaz
    @Override
    public void despegar() {
        System.out.println("El piloto está despegando.");
    }
    @Override
    public void volar() {
        System.out.println("El piloto está volando.");
    }
    @Override
    public void aterrizar() {
        System.out.println("El piloto está aterrizando.");
    }

}
