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
