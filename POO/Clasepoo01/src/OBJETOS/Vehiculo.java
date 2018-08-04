/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OBJETOS;

/**
 *
 * @author Administrador
 */
public class Vehiculo {

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the Marca
     */
    public String getMarca() {
        return Marca;
    }

    /**
     * @param Marca the Marca to set
     */
    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    /**
     * @return the Precio
     */
    public double getPrecio() {
        return Precio;
    }

    /**
     * @param Precio the Precio to set
     */
    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    /**
     * @return the Puerta
     */
    public int getPuerta() {
        return Puerta;
    }

    /**
     * @param Puerta the Puerta to set
     */
    public void setPuerta(int Puerta) {
        this.Puerta = Puerta;
    }
    private String color;
    private String Marca;
    private double Precio;
    private int Puerta;
    
}
