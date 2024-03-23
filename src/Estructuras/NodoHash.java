package Estructuras;

/**
 * @author Stefano Boschetti
 * @author Diego De Jesus
 */
public class NodoHash<K, V> {

    K key;
    V value;

    public NodoHash(K llave, V valor) {
        key = llave;
        value = valor;
    }

    public boolean equals(NodoHash entry) {
        if (!key.equals(entry.key)) {
            return false;
        } else {
            return value.equals(entry.value);
        }
    }

    public String text() {
        return "(" + key.toString() + ", " + value.toString() + ")";
    }
}
