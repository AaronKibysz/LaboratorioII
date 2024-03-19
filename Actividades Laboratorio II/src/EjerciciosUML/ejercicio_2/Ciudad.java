package EjerciciosUML.ejercicio_2;

public class Ciudad {
    // ATRIBUTOS
    private String nombreCiudad;
    private Provincia provincia;

    // CONSTRUCTOR
    public Ciudad(String nombreCiudad, Provincia provincia) {
        this.nombreCiudad = nombreCiudad;
        this.provincia = provincia;
    }

    // GETTERS Y SETTERS
    public String getNombreCiudad() {
        return nombreCiudad;
    }
    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }
    public Provincia getProvincia() {
        return provincia;
    }
    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }
}
