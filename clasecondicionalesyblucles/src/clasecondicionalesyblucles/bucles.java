/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasecondicionalesyblucles;

/**
 *
 * @author Administrador
 */
public class bucles {
    public static void main(String[] args) {
        
        int i=0;
        
        while (i<=10){
            System.out.println("el numero i="+ i);
            i= i+1;
        }
        //version 2
        for (int j = 0; j <= 10; j++) {
            System.out.println("For El numero J = "+j);
            
        }
        //version3
        int x=0;
        do{
            System.out.println("Dowhile = elnumero x es = "+x);   
            x++;
        }while(x <= 10);
        
        for (int j = 0; j <= 12; j++){
            System.out.println("9 x "+ j + "=" + (9 * j));
        }
    }
    
    //tabla del 9
    
}
 