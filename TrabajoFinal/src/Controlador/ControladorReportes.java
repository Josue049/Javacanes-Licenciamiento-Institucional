/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Universidad;
import Modelo.Licenciamiento;
import Modelo.Ubicacion;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author Josue
 */
public class ControladorReportes {
    int lineas = 144;
    Universidad[] universidades = new Universidad[lineas-1];
    Licenciamiento[] licenciamientos = new Licenciamiento[lineas-1];
    Ubicacion[] ubicaciones = new Ubicacion[lineas-1];
    
    int id = 6;
    int anchoNombre = 82;
    int anchoTipoDeGestion = 21;
    int anchoEstado = 26;
    int anchoFechaInicio = 21;
    int anchoFechaFin = 21;
    int anchoDepartamento = 21;
    int anchoProvincia = 29;
    int anchoDistrito = 25;
    int anchoUbigeo = 21;
    int anchoLatitud = 21;
    int anchoLongitud = 21;
    int anchoFechaCorte = 21;

    public void CrearData() throws IOException {
        String nombreArchivo = "src/Data/Licenciamiento_Institucional_15.csv";
        BufferedReader lectorLinea;

        lectorLinea = new BufferedReader(new FileReader(nombreArchivo));
        String linea;

        for (int i = 0; i < lineas; i++) {
            linea = lectorLinea.readLine();
            if (i > 0){
                //System.out.println(linea);
                String[] valores = linea.split("\\|");

                Universidad universidad = new Universidad(valores[1],valores[2],valores[13]);
                Licenciamiento licenciamiento = new Licenciamiento(valores[3], valores[4], valores[5]);
                Ubicacion ubicacion = new Ubicacion(valores[7], valores[8], valores[9], valores[10], valores[11], valores[12]);
                
                universidades[i-1]=universidad;
                licenciamientos[i-1]=licenciamiento;
                ubicaciones[i-1]=ubicacion;
                
            }
        }
        //hay 144 lineas, 143 de ellas son universidades
        //el for recorre esas 143 y la pone en una lista
        //la lista empieza a contar desde 0 así que hay 142 elementos
        lectorLinea.close();
    }
    
    public void ReporteEstado() {
        String separador = "#".repeat(anchoNombre + anchoEstado + anchoFechaCorte);

        System.out.println(separador);
        System.out.printf("# %-78s # %-23s # %-18s #\n", "Universidad", "Estado", "Fecha de Corte");
        System.out.println(separador);

        for (int i = 0; i < universidades.length; i++) {
            System.out.printf("# %-78s # %-23s # %-18s #\n",
                    universidades[i].getNombre(),
                    licenciamientos[i].getEstado(),
                    universidades[i].getFechaCorte());
        }

        System.out.println(separador);
    }
    
    public void ReporteUbicacion(){
        String separador = "#".repeat(anchoNombre + anchoDepartamento + anchoProvincia + anchoDistrito + anchoUbigeo + anchoLatitud + anchoLongitud + anchoFechaCorte);

        System.out.println(separador);
        
        System.out.printf("# %-78s # %-18s # %-26s # %-23s # %-18s # %-18s # %-18s # %-18s #\n",
                "Universidad",
                "Departamento",
                "Provincia",
                "Distrito",
                "Ubigeo",
                "Latitud",
                "Longitud",
                "FechaCorte");
        
        System.out.println(separador);
        
        for (int i = 0; i < universidades.length; i++) {
            System.out.printf("# %-78s # %-18s # %-26s # %-23s # %-18s # %-18s # %-18s # %-18s #\n",
                    universidades[i].getNombre(),
                    ubicaciones[i].getDepartamento(),
                    ubicaciones[i].getProvincia(),
                    ubicaciones[i].getDistrito(),
                    ubicaciones[i].getUbigeo(),
                    ubicaciones[i].getLatitud(),
                    ubicaciones[i].getLongitud(),
                    universidades[i].getFechaCorte());
        }
        
        System.out.println(separador);
        
    }
    
    public void TablaPeriodo(){
        String separador = "-".repeat(id + anchoNombre + anchoFechaInicio + anchoFechaFin + anchoFechaCorte);
        System.out.println(separador);
        System.out.printf("| %-4s | %-78s | %-18s | %-18s | %-18s |\n", "# ", "Universidad", "Fecha Inicio", "Fecha Fin", "Fecha Corte");
        System.out.println(separador);

        for (int i = 0; i < universidades.length; i++) {
            System.out.printf("| %-4s | %-78s | %-18s | %-18s | %-18s |\n",
                    i,
                    universidades[i].getNombre(),
                    licenciamientos[i].getFechaInicio(),
                    licenciamientos[i].getFechaFin(),
                    universidades[i].getFechaCorte());
        }

        System.out.println(separador);
    }
    
    public void TablaGestion(){
        String separador = "-".repeat(id + anchoNombre + anchoTipoDeGestion + anchoFechaCorte);
        System.out.println(separador);
        System.out.printf("| %-4s | %-78s | %-18s | %-18s |\n", "# ", "Universidad", "Tipo De Gestion", "Fecha Corte");
        System.out.println(separador);
        
        for (int i = 0; i < universidades.length; i++) {
            System.out.printf("| %-4s | %-78s | %-18s | %-18s |\n",
                    i,
                    universidades[i].getNombre(),
                    universidades[i].getTipoDeGestion(),
                    universidades[i].getFechaCorte());
        }
        
        System.out.println(separador);
        
    }
    
}