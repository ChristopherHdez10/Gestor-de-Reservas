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
public class Aula{
   private int id;
    private String codigo;
    private String tipo;
    private int capacidad;
    private boolean disponible;
    
    public Aula(int id, String codigo, String tipo, int capacidad, boolean disponible) {
        this.id = id;
        this.codigo = codigo;
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.disponible = disponible;
    }
    
    public int getId() {
        return id;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    @Override
    public String toString() {
        return "Aula{" +
                "ID: " + id +
                ", Código: " + codigo + '\'' +
                ", Tipo: " + tipo + '\'' +
                ", Capacidad: " + capacidad +
                ", Disponible: " + disponible +
                "}";
    }
}
