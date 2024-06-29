/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Josue
 */
class Licenciamiento
{
  Universidad universidad;
  boolean Estado;
  double FechaInicio;
  double FechaFin;
  
  //constructor
  public Licenciamiento(Universidad universidad, boolean Estado, double FechaInicio, double FechaFin){
    this.universidad = universidad;
    this.Estado = Estado;
    this.FechaInicio = FechaInicio;
    this.FechaFin = FechaFin;
  }
  
  // Getters
  public String getUniversidad(){
    return universidad.getNombre();
  }
  
  public String getEstado(){
    return Estado+"";
  }
  
  public String getFechaInicio(){
  	return FechaInicio+"";
  }
  
  public String getFechaFin(){
  	return FechaFin+"";
  }
  
}