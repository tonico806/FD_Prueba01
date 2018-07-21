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
public class RespuestaProblema {
    public static void main(String[] args) {
        
        double MontoCompra = 410;
        double Descuento = 0;
        double total = 0;
        //proceso
        
        MontoCompra = 410;
                Descuento = MontoCompra * 0.20;
                
                total = MontoCompra - Descuento;
                
                if (MontoCompra > 300){
                    System.out.println("Usted tiene que pagar: "+total);
                   
                }else{
                    System.out.println("Usted tiene que pagar: "+MontoCompra);
                }
        
       
    }
    
}
