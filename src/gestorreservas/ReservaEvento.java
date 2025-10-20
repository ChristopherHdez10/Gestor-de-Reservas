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
public class ReservaEvento extends Reserva{
   private String nombreEvento;
   private String organizador;
    
   public ReservaEvento(int id, Aula aula, String cliente, LocalDate fecha, LocalTime horaInicio, LocalTime horaFin, String nombreEvento, String organizador) {
        super(id, aula, cliente, fecha, horaInicio, horaFin);
        this.nombreEvento = nombreEvento;
        this.organizador = organizador;
    } 
   
   @Override
    public String getTipoReserva() {
        return "Evento";
    }
    
    @Override
    public String toString() {
        return super.toString() +
                ", TipoReserva = Evento" +
                ", Evento: " + nombreEvento + '\'' +
                ", Organizador: " + organizador + '\'' +
                "}";
    }
}
