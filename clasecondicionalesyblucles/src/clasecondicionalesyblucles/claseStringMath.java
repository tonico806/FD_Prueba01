package clasecondicionalesyblucles;

import java.text.DecimalFormat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrador
 */
public class claseStringMath {
  
    public static void main(String[] args) {
     String nombre = "Luis";
     String otroNombre = "Luis";
     
     if (nombre == otroNombre){
         System.out.println("Tienen el mismo nombre");
     }
     
     if (nombre.equals(otroNombre)) {
         System.out.println("Tiene el mismo nombre");
         
     }
     
     nombre = nombre.toUpperCase();
        System.out.println("En Mayuscula = "+nombre);
        
     nombre = nombre.toLowerCase();
        System.out.println("En minusculas = "+nombre);
        
     nombre = nombre.concat(" cordova").concat(" Leon");
        System.out.println("Nombre Completo = "+ nombre);
        
        
        
        
        
        double numero = 10.415161;
        
        DecimalFormat f = new DecimalFormat ("##.00");
        System.out.println(f.format(numero));
        
        numero = Math.round(numero);
        System.out.println("numero redondear = " + numero);
        
        System.out.println("Numero absoluto = "+Math.abs(-15.6));
        
     
     
    }
    

    
}
