package logic;

import Estructuras.BinaryTree;
import Estructuras.ListaDoble;

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
        
        ListaDoble chao = new ListaDoble();
        chao.push(5);
        chao.push(8);
        chao.push(50);
        chao.push(53);
        chao.eliminar(5);
        chao.eliminar(8);
        chao.eliminar(53);
        chao.push(514);
        chao.push(33);
        chao.push(22);
        chao.print();
        System.out.println(String.format("tamano: %d",chao.size));
        
    }
    
}
