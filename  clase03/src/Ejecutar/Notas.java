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
public class Notas {
    public static void main(String[] args) {
       double[] notas = new double [4];
      
       notas[0]=18;
       notas[1]=13;
       notas[2]=12;
       notas[3]=5;
       double mayor = notas[0];
       
       for(int i=0; i<3; i++)
       {
       
       if (notas[i+1]>notas[i])
       { 
           mayor = notas [i+1];
       }
       
       }
       
        System.out.println("La nota mayor es" + mayor);
      
        
    }
    
}
