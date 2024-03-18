import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Creación de flota
        Flota flota1 = new Flota();

        //Creación de pilotos
        Piloto piloto1 = new Piloto(1989568, 22698364, "Oscar Alvarez", 53);
        Piloto piloto2 = new Piloto(2015683, 35823967, "Ignacio Lopez", 33);
        Piloto piloto3 = new Piloto(1978234, 15746321, "Alfredo Martinez", 65);
        Piloto piloto4 = new Piloto(2019261, 41134523, "Martin Molina", 25);

        //Creacion de vuelos
        ArrayList<Vuelo> vuelos = new ArrayList<>();
        vuelos.add(new Vuelo(1424, flota1.getFlotaAviones().get(0), piloto2, piloto3));
        vuelos.add(new Vuelo(1456, flota1.getFlotaAviones().get(2), piloto1, piloto4));
        vuelos.add(new Vuelo(1441, flota1.getFlotaAviones().get(1), piloto3, piloto1));
        vuelos.add(new Vuelo(1427, flota1.getFlotaAviones().get(2), piloto4, piloto2));

        System.out.println("----- AEROLÍNEAS ARGENTINAS -----\n");
        System.out.println("Seleccione una opción: \n1 - Reservar un vuelo\n2 - Consultar reserva\n3 - Información de la empresa");

        System.out.print("Opción: "); int opcion = new Scanner(System.in).nextInt();
        switch (opcion) {
            case 1:
                //reserva
            case 2:
                //consultar
            case 3:
                //info
        }


    }
}