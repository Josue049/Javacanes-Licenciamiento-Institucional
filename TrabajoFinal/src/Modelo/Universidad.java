/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Josue
 */
public class Universidad
{
  String Nombre;
  String TipoDeGestion;
  String FechaCorte;
  
  //constructor
  public Universidad(String Nombre, String TipoDeGestion, String FechaCorte) {
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
  
  public String getFechaCorte() {
    return FechaCorte;
  }
}
