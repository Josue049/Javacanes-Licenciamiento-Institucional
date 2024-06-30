/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;
import Controlador.ControladorReportes;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author Josue
 */
public class Ejecutar {
    public static void main(String[] args) throws IOException {
        Scanner lector = new Scanner(System.in);
        int opcion;
        String continuar= "SI";
        
        ControladorReportes controlador = new ControladorReportes();
        controlador.CrearData();
        
        while (continuar.equals("SI")){
            System.out.printf("""
                                 ---------------------------------
                                |  BIENVENIDO A LA BASE DE DATOS  |
                                |              DE                 |
                                |    UNIVERSIDADES DEL PERU       |
                                 ---------------------------------

                              SELECCIONA LA OPERACION A REALIZAR:

                              1) Reporte de estado de licenciamiento
                              2) Reporte de ubicacion de universidades
                              3) Tabla de periodo de licenciamiento
                              4) Tabla de tipo de gestion de universidades
                              5) Salir

                              """);
            System.out.print(">>> ");
            opcion = lector.nextInt();

            switch (opcion) {
                case 1 -> controlador.ReporteEstado();
                case 2 -> controlador.ReporteUbicacion();
                case 3 -> controlador.TablaPeriodo();
                case 4 -> controlador.TablaGestion();
                default -> {
                    return;
                }
            }
            
            System.out.print("¿Desea realizar otra operación? (Si/No)\n>>> ");
            continuar = lector.next().toUpperCase();
        }
        
    }
}
