/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author 1059237155
 */
public class Perro {
    //Atributos
    private String Nombre,Raza;

    //cnstructor no parametrizado
    public Perro(){
    }
    //constructor parametrizado

    public Perro(String Nombre, String Raza) {
        this.Nombre = Nombre;
        this.Raza = Raza;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getRaza() {
        return Raza;
    }
    
  

}