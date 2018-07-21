/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasecondicionalesyblucles;

import java.util.Scanner;


/**
 *
 * @author Administrador
 */
public class condicionesSwitch {

    public static void main(String[] args) {
        System.out.println("Ingrese un numero");
        Scanner in = new Scanner(System.in);
       
        int numero = in.nextInt();
        
        if (numero == 1) {
            System.out.println("Lunes");
        }  else if (numero == 2){
            System.out.println("Martes");
        }   else if (numero == 3){
            System.out.println("Miercoles");
        }   else if (numero == 4){
            System.out.println("jueves");
        }   else if (numero == 5){
            System.out.println("viernes");
        }   else if (numero == 7 || numero ==6){
            System.out.println("es fin de semana");
        } else {
            System.out.println("No es un dia ela semana");
        } 
        
        switch (numero) {
            case 1:
                System.out.println("Es Lunes");
                break;
            case 2:
                System.out.println("Es Martes");
                break;    
            case 3:
                System.out.println("Es Miercoles");
                break;
            case 4:
                System.out.println("Es Jueves");
                break;
            case 5:
                System.out.println("Es Viernes");
                break;
            case 6:
               
            case 7:
                System.out.println("Es Fin de Semana");
                break;
                
            default:
                System.out.println("NO ES UN VALOR CORRECTO");
        }
    }
    
    
    
}
/* 
==igualdad
!= diferente
> mayor
< menor
>= mayor igual
<= menor igual
&& anidar condiciones =>(Y)
|| anidar condiciones =>(O)
*/