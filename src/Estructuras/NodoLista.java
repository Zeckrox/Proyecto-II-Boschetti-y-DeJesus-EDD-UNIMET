package Estructuras;

/**
 * @author Stefano Boschetti
 * @author Diego De Jesus
 */
public class NodoLista <T> {
    public T data;
    public NodoLista anterior;
    public NodoLista siguente;
    
    public NodoLista(T info){
        data = info;
        anterior = null;
        siguente = null;
    }
    
}
