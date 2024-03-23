package logic;

/**
 * @author Stefano Boschetti
 * @author Diego De Jesus
 */
public class Cliente {
    Integer cedula;
    String nombre;
    String apellido;
    String email;
    String genero;
    String telefono;
    String llegada;
    String salida;
    
    public Cliente(Integer id, String name, String lastName, String mail, String gender, String phone, String arrival, String departure){
        cedula = id;
        nombre = name;
        apellido = lastName;
        email = mail;
        genero = gender;
        telefono = phone;
        llegada = arrival;
        salida = departure;
    }
}
