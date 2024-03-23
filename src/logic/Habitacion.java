package logic;

import Estructuras.ListaEnlazada;

/**
 * @author Stefano Boschetti
 * @author Diego De Jesus
 */
public class Habitacion {
    Integer piso;
    Integer numHab;
    String tipoHab;
    Cliente cliente;
    ListaEnlazada historico;
    
    public Habitacion(Integer floor, Integer number, String type, Cliente customer){
        piso = floor;
        numHab = number;
        tipoHab = type;
        cliente = customer;
        historico = new ListaEnlazada();
    }
}
