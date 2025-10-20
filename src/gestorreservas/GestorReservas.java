/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestorreservas;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author cahl1
 */
public class GestorReservas {
    private List<Aula> aulas;
    private List<Reserva> reservas;
    
    public GestorReservas() {
        aulas = new ArrayList<>();
        reservas = new ArrayList<>();
    }

    public List<Aula> getAulas() {
        return aulas;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void agregarAula(Aula aula) {
        aulas.add(aula);
    }
    
    public Aula buscarAulaPorCodigo(String codigo) {
        for (Aula a : aulas) {
            if (a.getCodigo().equalsIgnoreCase(codigo)) {
                return a;
            }
        }
        return null;
    }
    
    public void agregarReserva(Reserva reserva) {
        reservas.add(reserva);
    }
    
    public void listarAulas() {
        for (Aula a : aulas) {
            System.out.println(a);
        }
    }
    
    public void listarReservas() {
        for (Reserva r : reservas) {
            System.out.println(r);
        }
    }
}
