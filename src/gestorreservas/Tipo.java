/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestorreservas;

/**
 *
 * @author cahl1
 */
public class Tipo {
    
    //Tipo de aula
    public enum TipoAula {
    TEORICA, LABORATORIO, AUDITORIO
}
    
    //Tipo de evento
public enum TipoEvento {
    CONFERENCIA, TALLER, REUNION
}

    //Tipo de reserva
public enum EstadoReserva {
    ACTIVA, CANCELADA, HISTORICA
}
}
