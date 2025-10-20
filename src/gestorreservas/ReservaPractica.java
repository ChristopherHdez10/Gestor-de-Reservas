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
public class ReservaPractica extends Reserva{
    private String nombrePractica;
    private int numGrupos;
    
    public ReservaPractica(int id, Aula aula, String cliente, LocalDate fecha, LocalTime horaInicio, LocalTime horaFin, String nombrePractica, int numGrupos) {              
        super(id, aula, cliente, fecha, horaInicio, horaFin);
        this.nombrePractica = nombrePractica;
        this.numGrupos = numGrupos;
    }
    
    @Override
    public String getTipoReserva() {
        return "Práctica";
    }
    
    @Override
    public String toString() {
        return super.toString() +
                ", TipoReserva = Práctica" +
                ", Práctica: " + nombrePractica + '\'' +
                ", Grupos: " + numGrupos +
                "}";
    }
}
