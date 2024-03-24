package Estructuras;

/**
 * @author Stefano Boschetti
 * @author Diego De Jesus
 */
public class BinaryTree<T> {

    NodoTree raiz;

    public BinaryTree() {
        raiz = null;
    }

    public void insertar(Integer k, T i) {
        if (raiz == null) {
            raiz = new NodoTree(k, i);
        } else {
            raiz.insertar(k, i);
        }
    }

    public NodoTree buscar(Integer k) {
        return busqueda(raiz, k);
    }

    private NodoTree busqueda(NodoTree auxNodo, Integer k) {
        if (auxNodo.key.equals(k)) {
            return auxNodo;
        } else if (auxNodo.key < k) {
            return busqueda(auxNodo.derecho, k);
        } else {
            return busqueda(auxNodo.izquierdo, k);
        }
    }

    public NodoTree eliminar(Integer k) {
        return delete(raiz, k);
    }

    private NodoTree delete(NodoTree auxNodo, Integer k) {
        if (auxNodo == null) {
            return auxNodo;
        } else if (k < auxNodo.key) {
            auxNodo.izquierdo = delete(auxNodo.izquierdo, k);
        } else if (k > auxNodo.key) {
            auxNodo.derecho = delete(auxNodo.derecho, k);
        } else {

            if (auxNodo.izquierdo == null) {
                return auxNodo.derecho;
            } else if (auxNodo.derecho == null) {
                return auxNodo.izquierdo;
            }

            auxNodo.key = inOrderSuccessor(auxNodo.derecho);
            auxNodo.derecho = delete(auxNodo.derecho, auxNodo.key);
        }

        return auxNodo;

    }

    public Integer inOrderSuccessor(NodoTree auxNodo) {
        int minimum = auxNodo.key;
        while (auxNodo.izquierdo != null) {
            minimum = auxNodo.izquierdo.key;
            auxNodo = auxNodo.izquierdo;
        }
        return minimum;
    }

    public void printPreorden() {
        preorden(raiz);
    }

    private void preorden(NodoTree nodo) {
        if (nodo != null) {
            System.out.print(nodo.key);
            System.out.print(" | ");
            System.out.println(nodo.info);
            preorden(nodo.izquierdo);
            preorden(nodo.derecho);
        }
    }
}
