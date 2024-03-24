package logic;

/**
 * @author Stefano Boschetti
 * @author Diego De Jesus
 */
public class Reserva {

    public Cliente cliente;
    public String tipoHab;

    public Reserva(Cliente customer, String hab) {
        cliente = customer;
        tipoHab = hab;
    }
}
