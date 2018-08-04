/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasepoo01;

/**
 *
 * @author Administrador
 */
public class Metodos {
    public static void main(String[] args) {
        SaludarAlumno("Luis");
        CalcularPromedio(11, 12, 20);
        SaludarAlumno("Ana");
        CalcularPromedio(20, 18, 15);
    }
    static void SaludarAlumno (String nombreAlumno){
        System.out.println("Hola" + nombreAlumno);
    }
    static void CalcularPromedio (double n1, double n2, double n3){
        double Promedio = (n1 + n2 + n3)/3;
          if (Promedio > 15){
              System.out.println("Felicidades");
          }else
              System.out.println("Estudia!!!!");
    }
 
}
