package data;

import Estructuras.BinaryTree;
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
import logic.Reserva;

/**
 * @author Stefano Boschetti
 * @author Diego De Jesus
 */
public class Populator {

    public Populator() {

    }

    public HashTable loadRooms(BinaryTree arbolHabitaciones) {
        try {
            CSVReader csvRooms, csvCustomers, csvCounter, csvHistorico;
            String[] filaR, filaC, filaH;
            String roomsData = "src/data/habitaciones.csv";
            String customersData = "src/data/clientes.csv";
            String historicoData = "src/data/historico.csv";

            csvRooms = new CSVReader(new FileReader(roomsData));
            csvCustomers = new CSVReader(new FileReader(customersData));
            csvCounter = new CSVReader(new FileReader(roomsData));
            csvHistorico = new CSVReader(new FileReader(historicoData));

            filaR = csvRooms.readNext();
            filaC = csvCustomers.readNext();
            filaH = csvHistorico.readNext();
//            Contamos la cantidad de filas que tiene nuestro archivo.
            Integer counter = 0;
            csvCounter.readNext();
            while ((csvCounter.readNext()) != null) {
                counter++;
            }
//              Con eso creamos nuestro HashTable.
            HashTable estadoActual = new HashTable(counter);
            HashTable historicos = new HashTable(counter);
//              Populamos los historicos de cada habitacion.
            while ((filaH = csvHistorico.readNext()) != null) {
                Cliente newHistorico = new Cliente(Integer.parseInt(filaH[0].replaceAll("[^0-9]", "")),
                        filaH[1], filaH[2], filaH[3], filaH[4], "0", filaH[5], "-");
                historicos.put(Integer.valueOf(filaH[6]), newHistorico);
            }
//            Poblamos el HashTable
            while ((filaR = csvRooms.readNext()) != null && (filaC = csvCustomers.readNext()) != null) {
                Cliente auxC;
                if ("".equals(filaC[0])) {
                    auxC = null;
                } else {
                    auxC = new Cliente(0, filaC[1], filaC[2], filaC[3], filaC[4], filaC[5], filaC[6], "");
                }
                Habitacion auxR = new Habitacion(Integer.parseInt(filaR[2].replaceAll("[^0-9]", "")),
                        Integer.parseInt(filaR[0].replaceAll("[^0-9]", "")), filaR[1], auxC);
                while (true) {
                    if (historicos.get(auxR.numHab) == null) {
                        break;
                    } else {
                        auxR.historico.push(historicos.get(auxR.numHab));
                        historicos.delete(auxR.numHab);
                    }
                }
                arbolHabitaciones.insertar(auxR.numHab, auxR);
                if (!"".equals(filaC[0])) {
                    estadoActual.put(auxR.cliente.nombre + auxR.cliente.apellido, auxR);
                }
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

    public BinaryTree loadReservas() {
        try {
            CSVReader csvData;
            String[] fila;
            String data = "src/data/reservas.csv";
            csvData = new CSVReader(new FileReader(data));
            fila = csvData.readNext();
            BinaryTree arbolReservas = new BinaryTree();
            while ((fila = csvData.readNext()) != null) {
//                System.out.println(fila[0]);
                Cliente auxC = new Cliente(Integer.parseInt(fila[0].replaceAll("[^0-9]", "")),
                        fila[1], fila[2], fila[3], fila[4], fila[6], fila[7], fila[8]);
                Reserva auxR = new Reserva(auxC, fila[5]);
                arbolReservas.insertar(auxR.cliente.cedula, auxR);
            }
            csvData.close();
            return arbolReservas;

        } catch (FileNotFoundException ex) {
            Logger.getLogger(HotelBooking.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | CsvValidationException ex) {
            Logger.getLogger(HotelBooking.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
