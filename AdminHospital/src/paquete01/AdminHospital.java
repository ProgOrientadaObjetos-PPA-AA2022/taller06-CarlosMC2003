/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

/**
 *
 * @author Carlos Morocho - PC
 */
public class AdminHospital {
    private String nombreHospital;
    private CiudadHospital ciudad;
    private int numEspe;
    private Medico [] medicos;
    private Enfermero [] enfermeros;
    private double sueldoTotal;
    
    public AdminHospital(String nombre, CiudadHospital ciu, int num, Medico [] med, Enfermero [] enf) {
        nombreHospital = nombre;
        ciudad = ciu;
        numEspe = num;
        medicos = med;
        enfermeros = enf;
    }
    
    public void establecerNombreHospital(String n) {
        nombreHospital = n;
    }
    
    public void establecerCiudad (CiudadHospital n) {
        ciudad = n;
    }
    
    public void establecerNumeroEspecialidad(int n) {
        numEspe = n;
    }
    
    public void establecerMedicos(Medico [] n) {
        medicos = n;
    }
    
    public void establecerEnfermeros(Enfermero [] n) {
        enfermeros = n;
    }
    
    public void establecerSueldoTotal() {
        double suma = 0;
        
        for (int i = 0; i < obtenerMedicos().length; i++){
            suma = suma + obtenerMedicos()[i].obtenerSueldoMensual();
        }
        
        for (int i = 0; i < obtenerEnfermeros().length; i++){
            suma = suma + obtenerEnfermeros()[i].obtenerSueldoMensual();
        }
        
        sueldoTotal = suma;
    }
    
    public String  obtenerNombreHospital() {
        return nombreHospital;
    }
    
    public CiudadHospital obtenerCiudad() {
        return ciudad;
    }
    
    public int obtenerNumeroEspecialidad() {
        return numEspe;
    }
    
    public Medico [] obtenerMedicos() {
        return medicos;
    }
    
    public Enfermero [] obtenerEnfermeros() {
        return enfermeros;
    }
    
    public double obtenerSueldoTotal() {
        return sueldoTotal;
    }
    
    public String toString(){
        String cadena = "";
        cadena = String.format("%sHOSPITAL %s\n" 
                + "Dirección: %s\n" 
                + "Ciudad: %s\n" 
                + "Provincia: %s\n" 
                + "Número de Especialidades: %d\n" 
                + "Listado de médicos \n",cadena, nombreHospital.toUpperCase(),
                obtenerCiudad().obtenerDireccion(), obtenerCiudad().obtenerNombreCiudad(),
                obtenerCiudad().obtenerProvincia(), numEspe);
        
        for (int i = 0; i < obtenerMedicos().length; i++) {
            cadena = String.format("%s- %s - sueldo: " 
                    + "%.2f - %s\n" , cadena, obtenerMedicos()[i].obtenerNombre(), 
                    obtenerMedicos()[i].obtenerSueldoMensual(), obtenerMedicos()[i].obtenerEspecialidad());
        }
        
        cadena = String.format("%s\nListado de enfermeros(as)\n", cadena);
        
        for (int i = 0; i < obtenerEnfermeros().length; i++) {
            cadena = String.format("%s- %s - sueldo: " 
                    + "%.2f - %s\n" , cadena, obtenerEnfermeros()[i].obtenerNombre(), 
                    obtenerEnfermeros()[i].obtenerSueldoMensual(), obtenerEnfermeros()[i].obtenerTipo());
        }
        
        cadena = String.format("%s\nTotal de sueldos a pagar por mes: %.2f", cadena, sueldoTotal);
        return cadena;
    }
}
