/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Josue
 */
class Universidad
{
  String Nombre;
  String TipoDeGestion;
  double FechaCorte;
  
  //constructor
  public Universidad(String Nombre, String TipoDeGestion, double FechaCorte) {
    this.Nombre = Nombre;
    this.TipoDeGestion = TipoDeGestion;
    this.FechaCorte = FechaCorte;
  }
  
  // Getters
  public String getNombre() {
    return Nombre;
  }
  
  public String getTipoDeGestion() {
    return TipoDeGestion;
  }
  
  public String FechaCorte() {
    return FechaCorte+"";
  }
}
