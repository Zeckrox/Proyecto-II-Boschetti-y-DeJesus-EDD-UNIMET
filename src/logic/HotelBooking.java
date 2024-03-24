package logic;

import Estructuras.BinaryTree;
import Estructuras.HashTable;
import data.Populator;

/**
 * @author Stefano Boschetti
 * @author Diego De Jesus
 */
public class HotelBooking {

    public static void main(String[] args) {
        Populator ola = new Populator();
        BinaryTree arbolHabitaciones = new BinaryTree();
        HashTable tablaHabitaciones = ola.loadRooms(arbolHabitaciones);
        BinaryTree arbolReservas = ola.loadReservas();
        Habitacion hab = (Habitacion) arbolHabitaciones.buscar(2).info;
        Habitacion habdos = (Habitacion) tablaHabitaciones.get("KayMcPherson");
        arbolHabitaciones.printPreorden();
    }

}
