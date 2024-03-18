public class Piloto implements Volador{
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
    private int nroLicensia;
    Persona persona = new Persona();

    public Piloto(){}
    public Piloto(int nroLicensia, Persona persona){
        this.nroLicensia = nroLicensia;
        this.persona = persona;
    }

    public int getNroLicensia() {
        return nroLicensia;
    }

    public void setNroLicensia(int nroLicensia) {
        this.nroLicensia = nroLicensia;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
}
