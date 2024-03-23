package Estructuras;

/**
 * @author Stefano Boschetti
 * @author Diego De Jesus
 */
public class HashTable<K, V> {

    private int size;
    private ListaDoble[] buckets;

    public HashTable(int capacity) {
        size = capacity;
        buckets = new ListaDoble[size];

    }

    public int hash(K key) {
        if (key.getClass() == String.class) {
            String sKey = key.toString();
            int hashing = 0;
            for (int i = 0; i < sKey.length(); i++) {
                int j = i + 1;
                hashing += (int) sKey.charAt(i) * j;
            }
            return hashing % size;
        } else if (key.getClass() == Integer.class) {
            return (int) key % size;
        }
        return 0;
    }

    public void put(K key, V value) {
        int x = hash(key);
        if (x < 0) {
            System.out.println("Hash invalido!");
            return;
        }
        if (buckets[x] == null) {
            buckets[x] = new ListaDoble<NodoHash<K, V>>();
        }
        ListaDoble<NodoHash> list = buckets[x];
        NodoHash nodo = new NodoHash(key, value);
        list.push(nodo);
    }

    public void delete(K key) {
        int x = hash(key);
        if (x < 0) {
            System.out.println("Hash invalido!");
            return;
        }
        if (buckets[x] == null) {
            return;
        }
        ListaDoble<NodoHash> list = buckets[x];
        ListaDoble<NodoHash> newList = new ListaDoble();
        for (NodoLista aux = list.first; aux != null; aux = aux.siguente) {
            NodoHash nodo = (NodoHash) aux.data;
            if (!nodo.key.equals(key)) {
                newList.push(nodo);
            }
        }
        buckets[x] = (newList.size == 0) ? null : newList;
    }

    public V get(K key) {
        int x = hash(key);
        if (x < 0) {
            System.out.println("Hash invalido!");
            return null;
        }
        if (buckets[x] == null) {
            return null;
        }
        ListaDoble<NodoHash> list = buckets[x];
        for (NodoLista aux = list.first; aux != null; aux = aux.siguente) {
            NodoHash nodo = (NodoHash) aux.data;
            if (nodo.key.equals(key)) {
                return (V) nodo.value;
            }
        }
        return null;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(i + " ");
            ListaDoble<NodoHash> list = buckets[i];
            if (list != null) {
                for (NodoLista aux = list.first; aux != null; aux = aux.siguente) {
                    NodoHash nodo = (NodoHash) aux.data;
                    System.out.print(nodo.value + " ");
                }
            }
            System.out.println();
        }
    }
}
