package logic;

/**
 * @author Stefano Boschetti
 * @author Diego De Jesus
 */
public class Reserva {
    Cliente cliente;
    String tipoHab;
    
    public Reserva(Cliente customer, String hab){
        cliente = customer;
        tipoHab = hab;
    }
}
