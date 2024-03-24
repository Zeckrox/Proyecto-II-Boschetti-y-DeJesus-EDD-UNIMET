/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import Estructuras.HashTable;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import logic.Cliente;
import logic.Habitacion;
import logic.HotelBooking;

/**
 * @author Stefano Boschetti
 * @author Diego De Jesus
 */
public class Populator {

    public Populator() {

    }

    public HashTable loadRooms() {
        try {
            CSVReader csvRooms, csvCustomers, csvCounter;
            String[] filaR, filaC, filaCounter;
            String roomsData = "src/data/habitaciones.csv";
            String customersData = "src/data/clientes.csv";
            csvRooms = new CSVReader(new FileReader(roomsData));
            csvCustomers = new CSVReader(new FileReader(customersData));
            csvCounter = new CSVReader(new FileReader(roomsData));
            filaR = csvRooms.readNext();
            filaC = csvCustomers.readNext();
//            Contamos la cantidad de filas que tiene nuestro archivo.
            Integer counter = 0;
            filaCounter = csvCounter.readNext();
            while ((filaCounter = csvCounter.readNext()) != null) {
                counter++;
            }
//            Con eso creamos nuestro Hashtable y lo poblamos.
            HashTable estadoActual = new HashTable(counter);
            while ((filaR = csvRooms.readNext()) != null && (filaC = csvCustomers.readNext()) != null) {
                Cliente auxC = new Cliente(0, filaC[1], filaC[2], filaC[3], filaC[4], filaC[5], filaC[6], "");
                Habitacion auxR = new Habitacion(filaR[2], filaR[0], filaR[1], auxC);
                
                estadoActual.put(auxR.cliente.nombre + auxR.cliente.apellido, auxR);
            }
            csvRooms.close();
            return estadoActual;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(HotelBooking.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | CsvValidationException ex) {
            Logger.getLogger(HotelBooking.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
