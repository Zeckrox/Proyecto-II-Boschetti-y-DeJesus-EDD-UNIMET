package Estructuras;

/**
 * @author Stefano Boschetti
 * @author Diego De Jesus
 */
public class ListaEnlazada <T>{
    NodoLista first;
    NodoLista last;
    Integer size;
    
    public ListaEnlazada(){
        first = null;
        size = 0;
    }
    
    public void push(T newData){
        NodoLista newNodo = new NodoLista(newData);
        
        if(size == 0){
            first = newNodo;
            last = newNodo;
        }
        else{
            last.siguente = newNodo;
            last = newNodo;
        }
        size++;
    }
    
    public void print(){
        for( NodoLista aux = first; aux != null; aux = aux.siguente ){
            System.out.println(aux.data);
        }
    }
    
}
