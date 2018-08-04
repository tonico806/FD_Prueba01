/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OBJETOS;

import POO.Docente;

/**
 *
 * @author Administrador
 */
public class ReferenciasObjetos {
    
    
    public static void main(String[] args) {
      
    //como crear un objeto
    Docente objDocente1 = new Docente();
    objDocente1.setNombre("Luis");
    objDocente1.setApellidos("Cordova");
    objDocente1.setDni("45842095");
      
    String nombreDocente = objDocente1.getNombre();
    
    Vehiculo objVehiculo = new vehiculo();
    objVehiculo.setMarca("Lamborghini");
    objVehiculo.setColor("Plata");
    objVehiculo.setPuerta(2);
    objVehiculo.setPrecio(5000000);
    objVehiculo.Avanzar();
    objVehiculo.Detener();
    }
    
}
