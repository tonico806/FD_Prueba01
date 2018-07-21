/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejecutar;

/**
 *
 * @author Administrador
 */
public class nota_alumno {
    public static void main(String[] args) {
        double[] notas = {11.5,15,12,17,20};
         String[] nombres = new String[6];
        
         String[] nombres = {"jose", "raul", "felipe", "fernado", "ana", "maria"};
        
         
        
        for (int i=0; i < notas.length; i++){
            if(notas[i] > notamayor)
                notamayor=notas[i];
        }
        System.out.println("La nota mayor es= "+ notamayor);
    }
    
}
