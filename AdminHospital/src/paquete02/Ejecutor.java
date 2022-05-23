/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import java.util.Scanner;
import paquete01.CiudadHospital;
import paquete01.AdminHospital;
import paquete01.Enfermero;
import paquete01.Medico;
/**
 *
 * @author Carlos Morocho - PC
 */
public class Ejecutor {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre del Hospital: ");
        String nombre = sc.nextLine();
        
        System.out.print("Direccion del Hospital: ");
        String dir = sc.nextLine();
        
        System.out.print("Ciudad del Hospital: ");
        String ciudad = sc.nextLine();
        
        System.out.print("Provincia del Hospital: ");
        String prov = sc.nextLine();
        
        CiudadHospital ciu = new CiudadHospital (dir, ciudad, prov);
        
        System.out.print("Número de especialidades del Hospital: ");
        int num = sc.nextInt();
        
        System.out.print("¿Cuantos medicos/as desea ingresar?: ");
        int n = sc.nextInt();
        
        Medico med[] = new Medico[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("\nMEDICO/CA N°" + (i + 1));
            System.out.print("Nombre del medico/a: ");
            sc.nextLine();
            String nomMed = sc.nextLine();
            
            System.out.print("Especialidad: ");
            String espe = sc.nextLine();
            
            System.out.print("Sueldo Mensual: ");
            double sueldoMed = sc.nextDouble();
            
            Medico medi= new Medico(nomMed, espe, sueldoMed);
            med[i] = medi;
        }
        
        System.out.print("\n¿Cuantos enfermeros/as desea ingresar?: ");
        int nEnf = sc.nextInt();
        
        Enfermero enf[] = new Enfermero[nEnf];
        
        for (int i = 0; i < nEnf; i++) {
            System.out.println("\nENFERMERO/A N°" + (i + 1));
            System.out.print("Nombre del enfermero/a: ");
            sc.nextLine();
            String nomEnf = sc.nextLine();
            
            System.out.print("Tipo de Contrato: ");
            String cont = sc.nextLine();
            
            System.out.print("Sueldo Mensual: ");
            double sueldoEnf = sc.nextDouble();
            
            Enfermero enfer = new Enfermero(nomEnf, cont, sueldoEnf);
            enf[i] = enfer;
        }
        
        AdminHospital admin1 = new AdminHospital(nombre, ciu, num, med, enf);
        
        admin1.establecerSueldoTotal();
        System.out.printf("%s", admin1);
        
        
    }


}
