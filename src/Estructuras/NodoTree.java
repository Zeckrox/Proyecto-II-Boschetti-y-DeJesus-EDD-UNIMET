package Estructuras;

/**
 * @author Stefano Boschetti
 * @author Diego De Jesus
 */
public class NodoTree<T> {

    public Integer key;
    public T info;
    public NodoTree izquierdo;
    public NodoTree derecho;

    public NodoTree(Integer k, T inf) {
        key = k;
        info = inf;
        izquierdo = null;
        derecho = null;
    }

    public void insertar(Integer k, T i) {
        if (k < this.key) {
//            Insertamos en el lado izquierdo
            if (this.izquierdo == null) {
                this.izquierdo = new NodoTree(k, i);
            } else {
                this.izquierdo.insertar(k, i);
            }
        } else {
//            Insertamos en el lado derecho
            if (this.derecho == null) {
                this.derecho = new NodoTree(k, i);
            } else {
                this.derecho.insertar(k, i);
            }
        }
    }
}
