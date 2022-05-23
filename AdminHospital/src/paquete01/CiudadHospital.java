/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

/**
 *
 * @author Carlos Morocho - PC
 */
public class CiudadHospital {
    private String direccion;
    private String nombre;
    private String provincia;
    
    public CiudadHospital(String dir, String nom, String prov) {
        direccion = dir;
        nombre = nom;
        provincia = prov;
    }
    
    public void establecerDireccion(String n) {
        direccion = n;
    }
    
    public void establecerNombreCiudad(String n) {
        nombre = n;
    }
    
    public void establecerProvincia(String n) {
        provincia = n;
    }
    
    public String obtenerDireccion() {
        return direccion;
    }
    
    public String obtenerNombreCiudad() {
        return nombre;
    }
    
    public String obtenerProvincia() {
        return provincia;
    }
}
