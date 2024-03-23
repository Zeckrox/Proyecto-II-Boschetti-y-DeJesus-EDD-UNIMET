package Estructuras;

/**
 * @author Stefano Boschetti
 * @author Diego De Jesus
 */
public class NodoLista <T> {
    T data;
    NodoLista anterior;
    NodoLista siguente;
    
    public NodoLista(T info){
        data = info;
        anterior = null;
        siguente = null;
    }
    
}
