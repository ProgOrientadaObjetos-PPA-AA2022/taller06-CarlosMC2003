/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

/**
 *
 * @author Carlos Morocho - PC
 */
public class Medico { 
    private String nombre;
    private String especialidad;
    private double sueldoMensual;
    
    public Medico (String nom, String espe, double menSueldo) {
        nombre = nom;
        especialidad = espe;
        sueldoMensual = menSueldo;
    }
    
    public void establecerNombre(String n) {
        nombre = n;
    }
    
    public void establecerEspecialidad (String n) {
        especialidad = n;
    }
    
    public void establecerSueldoMensual (double n) {
        sueldoMensual = n;
    }
    
    public String obtenerNombre() {
        return nombre;
    }
    
    public String obtenerEspecialidad() {
        return especialidad;
    }
    
    public double obtenerSueldoMensual () {
        return sueldoMensual;
    }
}
