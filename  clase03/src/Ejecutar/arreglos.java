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
public class arreglos {
    
    public static void main(String[] args) {
        //definir arreglos en 2 lineas 
        String [] apellidos;
         apellidos = new String[5];
         
         //definir arreglos en 1 linea
         String[] nombres = new String[5];
         
         //asignar valores a los arreglos
         
         apellidos[0] = "Cordova";
         apellidos[1] = "Ramirez";
         apellidos[2] = "Leon";
         apellidos[3] = "Perez";
         apellidos[4] = "Sanchez";
         
         String[] departamentos = {"Lima", "Piura", "Tacna", "Puno", "Cuzco", "Loreto"};
         
         System.out.println("Tamaño del arreglo departamento: " + departamentos.length);
         System.out.println("Tamaño del arreglo apellidos: " + apellidos.length);
         System.out.println("Tamaño del arreglo nombre: " + nombres.length);
         
         departamentos[0] = "arequipa"; //Modificando de Liamaa Arequipa
         
         System.out.println(" Valor de departamentos indice 1 = " + departamentos [1]);
         
         for (int i = 0; i< departamentos.length; i++){
             System.out.println("el valor de la posicion" + i + " => " + departamentos [i]);
         }
    
}


}