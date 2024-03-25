package logic;

import Estructuras.BinaryTree;
import Estructuras.HashTable;
import GUI.VentanaInicial;
import data.Populator;

/**
 * @author Stefano Boschetti
 * @author Diego De Jesus
 */
public class HotelBooking {

    public static void main(String[] args) {
        Populator populate = new Populator();
        BinaryTree arbolHabitaciones = new BinaryTree();
        HashTable tablaHabitaciones = populate.loadRooms(arbolHabitaciones);
        BinaryTree arbolReservas = populate.loadReservas();
        
        VentanaInicial inicio = new VentanaInicial(tablaHabitaciones, arbolReservas, arbolHabitaciones);
        inicio.setLocationRelativeTo(null);
        inicio.setVisible(true);
    }

}
