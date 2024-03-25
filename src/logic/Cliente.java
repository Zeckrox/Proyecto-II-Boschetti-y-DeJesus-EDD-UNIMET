package logic;

/**
 * @author Stefano Boschetti
 * @author Diego De Jesus
 */
public class Cliente {
    public Integer cedula;
    public String nombre;
    public String apellido;
    public String email;
    public String genero;
    public String telefono;
    public String llegada;
    public String salida;
    
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
