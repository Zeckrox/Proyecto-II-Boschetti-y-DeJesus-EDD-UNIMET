package logic;

import Estructuras.ListaDoble;

/**
 * @author Stefano Boschetti
 * @author Diego De Jesus
 */
public class Habitacion {
    Integer piso;
    public Integer numHab;
    String tipoHab;
    public Cliente cliente;
    public ListaDoble historico;
    
    public Habitacion(Integer floor, Integer number, String type, Cliente customer){
        piso = floor;
        numHab = number;
        tipoHab = type;
        cliente = customer;
        historico = new ListaDoble();
    }
}
