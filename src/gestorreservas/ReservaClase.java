/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestorreservas;

import java.time.LocalDate;
import java.time.LocalTime;
/**
 *
 * @author cahl1
 */
public class ReservaClase extends Reserva{
   private String nombreClase;
    private String carrera;
    
    public ReservaClase(int id, Aula aula, String cliente, LocalDate fecha, LocalTime horaInicio, LocalTime horaFin, String nombreClase, String carrera) {
        super(id, aula, cliente, fecha, horaInicio, horaFin);
        this.nombreClase = nombreClase;
        this.carrera = carrera;
    }
    
    @Override
    public String getTipoReserva() {
        return "Clase";
    }
    
    @Override
    public String toString() {
        return super.toString() +
                ", TipoReserva = Clase" +
                ", Clase: " + nombreClase + '\'' +
                ", Carrera: " + carrera + '\'' +
                "}";
    }
}
