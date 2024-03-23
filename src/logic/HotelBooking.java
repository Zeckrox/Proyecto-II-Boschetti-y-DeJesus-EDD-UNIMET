package logic;

import Estructuras.BinaryTree;
import Estructuras.HashTable;

/**
 * @author Stefano Boschetti
 * @author Diego De Jesus
 */
public class HotelBooking {

    public static void main(String[] args) {
        BinaryTree ola = new BinaryTree();
        ola.insertar(5, 5);
        ola.insertar(2, 2);
        ola.insertar(8, 8);
        ola.insertar(1, 1);
        ola.insertar(11, 11);
        
        HashTable chao = new HashTable(10);
        chao.put("francia", "samuel");
        chao.put("si", "irrael");
        chao.put("cinco", "seix");
        chao.put("top", "Garen");
        chao.put("mid", "Zoe");
        chao.put("azul", "blue");
        chao.delete("top");
        chao.delete("si");
        chao.delete("mid");

        chao.print();
        
        System.out.println();
        System.out.println(chao.get("azul"));

    }

}
