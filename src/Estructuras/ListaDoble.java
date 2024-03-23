package Estructuras;

/**
 * @author Stefano Boschetti
 * @author Diego De Jesus
 */
public class ListaDoble<T> {

    NodoLista first;
    NodoLista last;
    public Integer size;

    public ListaDoble() {
        first = null;
        size = 0;
    }

    public void push(T newData) {
        NodoLista newNodo = new NodoLista(newData);

        if (size == 0) {
            first = newNodo;
            last = newNodo;
        } else {
            newNodo.anterior = last;
            last.siguente = newNodo;
            last = newNodo;
        }
        size++;
    }

    public void eliminar(Integer k) {
        if (size > 0) {
            if(size == 1){
                if(first.data == k){
                   first = null;
                   last = null;
                   size--;
                }
            }
            else if(first.data == k){
                first = first.siguente;
                first.anterior = null;
                size--;
            }
            else if(last.data == k){
                last = last.anterior;
                last.siguente = null;
                size--;
            }
            else{
                for (NodoLista auxNodo = first; auxNodo != null; auxNodo = auxNodo.siguente) {
                    if (auxNodo.data == k) {
                        auxNodo.anterior.siguente = auxNodo.siguente;
                        auxNodo.siguente.anterior = auxNodo.anterior;
                        size--;
                    }
                }
            }
            
        }
    }

    public void print() {
        for (NodoLista aux = first; aux != null; aux = aux.siguente) {
            System.out.println(aux.data);
        }
    }

}
