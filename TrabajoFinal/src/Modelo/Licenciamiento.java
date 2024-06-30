/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Josue
 */
public class Licenciamiento
{
  String Estado;
  String FechaInicio;
  String FechaFin;
  
  //constructor
  public Licenciamiento(String Estado, String FechaInicio, String FechaFin){
    this.Estado = Estado;
    this.FechaInicio = FechaInicio;
    this.FechaFin = FechaFin;
  }
  
  // Getters
  
  public String getEstado(){
    return Estado;
  }
  
  public String getFechaInicio(){
  	return FechaInicio;
  }
  
  public String getFechaFin(){
  	return FechaFin;
  }
  
}