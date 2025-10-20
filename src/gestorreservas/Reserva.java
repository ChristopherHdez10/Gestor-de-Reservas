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
public abstract class Reserva{
  protected int id;
    protected Aula aula;
    protected String cliente;
    protected LocalDate fecha;
    protected LocalTime horaInicio;
    protected LocalTime horaFin;
    
    //Constructor
    public Reserva(int id, Aula aula, String cliente, LocalDate fecha, LocalTime horaInicio, LocalTime horaFin) {
        this.id = id;
        this.aula = aula;
        this.cliente = cliente;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }
    
    public int getId() {
        return id;
    }

    public Aula getAula() {
        return aula;
    }

    public String getCliente() {
        return cliente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public LocalTime getHoraFin() {
        return horaFin;
    }

    public abstract String getTipoReserva();
    
    @Override
    public String toString() {
        return "Reserva{" +
                "ID: " + id +
                ", Aula: " + aula.getCodigo() +
                ", Cliente: " + cliente + '\'' +
                ", Fecha: " + fecha +
                ", Inicio: " + horaInicio +
                ", Fin: " + horaFin +
                "}";
    }
}
