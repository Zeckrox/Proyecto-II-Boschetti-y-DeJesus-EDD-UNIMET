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
        ola.loadRooms().print();
    }

}
