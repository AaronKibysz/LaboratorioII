package PracticoUML;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Reserva {
    private Persona persona;
    private static long nroReserva = 363900000;
    private Date fechaIda;
    private Date fechaVuelta;
    private String origen;
    private String destino;
    private Vuelo vueloIda;
    private Vuelo vueloVuelta;

    //constructor
    public Reserva(){}
    public Reserva(Persona persona, long nroReserva, Date fechaIda, Date fechaVuelta, String origen, String destino, Vuelo vueloIda) {
        this.persona = persona;
        this.nroReserva = nroReserva;
        this.fechaIda = fechaIda;
        this.fechaVuelta = fechaVuelta;
        this.origen = origen;
        this.destino = destino;
        this.vueloIda = vueloIda;
    }

    //getters & setters
    public long getNroReserva() {
        return nroReserva;
    }
    public void setNroReserva(long nroReserva) {
        this.nroReserva = nroReserva;
    }

    public Date getFechaIda() {
        return fechaIda;
    }
    public void setFechaIda(Date fechaIda) {
        this.fechaIda = fechaIda;
    }

    public Date getFechaVuelta() {
        return fechaVuelta;
    }
    public void setFechaVuelta(Date fechaVuelta) {
        this.fechaVuelta = fechaVuelta;
    }

    public String getOrigen() {
        return origen;
    }
    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Persona getPersona() {
        return persona;
    }
    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Vuelo getVueloIda() {
        return vueloIda;
    }
    public void setVueloIda(Vuelo vueloIda) {
        this.vueloIda = vueloIda;
    }

    public Vuelo getVueloVuelta() {
        return vueloVuelta;
    }
    public void setVueloVuelta(Vuelo vueloVuelta) {
        this.vueloVuelta = vueloVuelta;
    }

    public void crearReserva(ArrayList<Vuelo> vuelos){
        nroReserva++;

        Persona persona1 = new Persona();
        System.out.print("Nombre: "); persona1.setNombre(new Scanner(System.in).nextLine());
        System.out.print("DNI: "); persona1.setDni(new Scanner(System.in).nextInt());
        System.out.print("Edad: "); persona1.setEdad(new Scanner(System.in).nextInt());
        persona = persona1;

        System.out.print("\nLugar de origen: "); origen = new Scanner(System.in).nextLine();
        System.out.print("Lugar de destino: "); destino = new Scanner(System.in).nextLine();

        fechaIda = new Date();
        System.out.print("\nIntroduzca la fecha del viaje de ida (DD/MM/AAAA): ");
        String[] fechaArraySplitted = (new Scanner(System.in).nextLine()).split("/");
        fechaIda.setDate(Integer.parseInt(fechaArraySplitted[0])); fechaIda.setMonth(Integer.valueOf(fechaArraySplitted[1])); fechaIda.setYear(Integer.parseInt(fechaArraySplitted[2]));

        fechaVuelta = new Date();
        System.out.print("Introduzca la fecha del viaje de vuelta (DD/MM/AAAA): ");
        fechaArraySplitted = (new Scanner(System.in).nextLine()).split("/");
        fechaVuelta.setDate(Integer.parseInt(fechaArraySplitted[0])); fechaVuelta.setMonth(Integer.valueOf(fechaArraySplitted[1])); fechaVuelta.setYear(Integer.parseInt(fechaArraySplitted[2]));

        System.out.println("Los vuelos disponibles para la fecha de ida indicada son: ");
        System.out.println("1 - Nro AR"+vuelos.get(0).getNroDeVuelo()+"   Partida: 8:00 hs    Llegada: 11:00 hs");
        System.out.println("2 - Nro AR"+vuelos.get(1).getNroDeVuelo()+"   Partida: 19:00 hs   Llegada: 22:00 hs");

        System.out.print("\nSeleccione una opción: "); int opcion = new Scanner(System.in).nextInt();
        if (opcion == 1) {
            vueloIda = vuelos.get(0);
            fechaIda.setHours(8);
        } else {
            vueloIda = vuelos.get(1);
            fechaIda.setHours(19);
        }


        System.out.println("Los vuelos disponibles para la fecha de vuelta indicada son: ");
        System.out.println("1 - Nro AR"+vuelos.get(2).getNroDeVuelo()+"   Partida: 10:00 hs    Llegada: 13:00 hs");
        System.out.println("2 - Nro AR"+vuelos.get(3).getNroDeVuelo()+"   Partida: 17:00 hs    Llegada: 20:00 hs");
        System.out.print("\nSeleccione una opción: "); opcion = new Scanner(System.in).nextInt();

        if (opcion == 1) {
            vueloVuelta = vuelos.get(2);
            fechaVuelta.setHours(10);
        } else {
            vueloVuelta = vuelos.get(3);
            fechaVuelta.setHours(17);
        }


        System.out.println("PracticoUML.Reserva Confirmada!!!");
    }
}
