
package clasepoo01;

/**
 *
 * @author Administrador
 */
public class Clasepoo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SaludaVersionMetodo();
        SaludaVersionMetodo();
        
       String cadena = Saluda ("Lucho");
        System.out.println(cadena);
       
        String[] nombres = ( "Luis", "Jose", "Maria","Pedro");
        
        for (int i = 0; i < nombres.lenght; i++) {
            String mensaje = Saluda (nombres[i]);
            System.out.println(mensaje);
            
        }
// TODO code application logic here
    }
   
    //FUNCION
    static String Saluda(String nombre){
        String saludo= "Hola como estas";
        return saludo;
        
    }
    
   static void SaludaVersionMetodo(){
        System.out.println("Hola,como estas (Metodo)");
    }
}
