/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Josue
 */
class Ubicacion
{
  Universidad universidad;
  String Departamento;
  String Provincia;
  String Distrito;
  String Ubigeo;
  String Latitud;
  String Longitud;
  
  //constructor
  public Ubicacion(Universidad universidad, String Departamento, String Provincia, String Distrito, String Ubigeo, String Latitud, String Longitud){
    this.universidad = universidad;
    this.Departamento = Departamento;
    this.Provincia = Provincia;
    this.Distrito = Distrito;
    this.Ubigeo = Ubigeo;
    this.Latitud = Latitud;
    this.Longitud = Longitud;
  }
  
  // Getters
  public String getUniversidad(){
    return universidad.getNombre();
  }
  
  public String getDepartamento(){
  	return Departamento;
  }
  
  public String getProvincia(){
  	return Provincia;
  }
  
  public String getDistrito(){
  	return Distrito;
  }
  
  public String getUbigeo(){
  	return Ubigeo;
  }
  
  public String getLatitud(){
  	return Latitud;
  }
  
  public String getLongitud(){
  	return Longitud;
  }
}