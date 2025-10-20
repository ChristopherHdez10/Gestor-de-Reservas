/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestorreservas;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;
/**
 *
 * @author cahl1
 */
public class GestorReservaApp {

    public static void main(String[] args) {
        GestorReservas gestor = new GestorReservas();
        Scanner entrada = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("\n=== SISTEMA DE GESTION DE RESERVAS ===");
            System.out.println("1. Registrar Aula");
            System.out.println("2. Registrar Reserva");
            System.out.println("3. Listar Aulas");
            System.out.println("4. Listar Reservas");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            
            switch (opcion) {
                case 1:
                    System.out.print("Código del aula: ");
                    String codigo = entrada.nextLine();
                    System.out.print("Tipo de aula: ");
                    String tipoAula = entrada.nextLine();
                    System.out.print("Capacidad: ");
                    int capacidad = entrada.nextInt();
                    entrada.nextLine();
                    Aula aula = new Aula(gestor.getAulas().size() + 1, codigo, tipoAula, capacidad, true);
                    gestor.agregarAula(aula);
                    System.out.println("Aula registrada correctamente.");
                    break;
                    
                case 2:
                    System.out.print("Código del aula: ");
                    String cod = entrada.nextLine();
                    Aula aulaSel = gestor.buscarAulaPorCodigo(cod);
                    if (aulaSel == null) {
                        System.out.println("Aula no encontrada.");
                        break;
            }
                    System.out.print("Nombre del cliente: ");
                    String cliente = entrada.nextLine();
                    System.out.print("Fecha (AAAA-MM-DD): ");
                    LocalDate fecha = LocalDate.parse(entrada.nextLine());
                    System.out.print("Hora inicio (HH:MM): ");
                    LocalTime inicio = LocalTime.parse(entrada.nextLine());
                    System.out.print("Hora fin (HH:MM): ");
                    LocalTime fin = LocalTime.parse(entrada.nextLine());
                    
                    System.out.print("Tipo de reserva (1 = Clase, 2 = Evento, 3 = Práctica): ");
                    int tipo = entrada.nextInt();
                    entrada.nextLine();
                    
                    int id = gestor.getReservas().size() + 1;
                    
                    switch (tipo) {
                        case 1:
                            System.out.print("Nombre de la clase: ");
                            String nombreClase = entrada.nextLine();
                            System.out.print("Carrera: ");
                            String carrera = entrada.nextLine();
                            gestor.agregarReserva(new ReservaClase(id, aulaSel, cliente, fecha, inicio, fin, nombreClase, carrera));
                            break;
                            
                        case 2:
                            System.out.print("Nombre del evento: ");
                            String evento = entrada.nextLine();
                            System.out.print("Organizador: ");
                            String organizador = entrada.nextLine();
                            gestor.agregarReserva(new ReservaEvento(id, aulaSel, cliente, fecha, inicio, fin, evento, organizador));
                            break;
                            
                        case 3:
                            System.out.print("Nombre de la práctica: ");
                            String practica = entrada.nextLine();
                            System.out.print("Número de grupos: ");
                            int grupos = entrada.nextInt();
                            gestor.agregarReserva(new ReservaPractica(id, aulaSel, cliente, fecha, inicio, fin, practica, grupos));
                            break;
                            
                        default:
                            System.out.println("Tipo no válido.");    
                    }
                    
                    System.out.println("Reserva registrada correctamente.");
                    break;
                    
                case 3:
                    gestor.listarAulas();
                    break;
                    
                case 4:
                    gestor.listarReservas();
                    break;
                    
                case 0:
                    System.out.println("Saliendo del sistema. Gracias por usar el sistema de gestion de reserva...");
                    break;   
                    
                default:
                    System.out.println("Opción inválida.");
            }    
                    
        }while(opcion != 0);
        
    }   
}
