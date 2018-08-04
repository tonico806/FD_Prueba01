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
public class Funciones {
    public static void main(String[] args) {
        String saludo = "";
        double promedio = 0;
        String MensajeFinal = "";
        
        //Alumno
        saludo = SaludarAlumno("Luis");
        promedio = CalcularPromedio (11,12,20);
        mensajeFinal = MensajeFinal(promedio);
        System.out.println(saludo);
        System.out.println(MensajeFinal);
    }
    static String SaludarAlumno (String nombreAlumno){
        String mensaje = "Hola" + nombreAlumno;
        return mensaje;
    }
    
    static double CalcularPromedio (double n1, double n2, double n3){
        double promedio = (n1 + n2 + n3) / 3;
        return promedio;
        
    
}  
    static String MensajeFinal (double promedio){
        String mensaje;
        if (promedio>15){
            mensaje = "Felicidades";
        }else
            mensaje = "Estudiar!!!";
    
    }
}
