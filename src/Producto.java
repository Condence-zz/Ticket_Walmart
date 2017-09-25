/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public class Producto {
    public int sku;
    public String nombre;
    public float precio;

    public Producto() {
    }
    
    public Producto(int sku, String nombre, float precio) {
        this.sku = sku;
        this.nombre = nombre;
        this.precio = precio;
    }
    
    public int getSku() {
        return sku;
    }

    public void setSku(int sku) {
        this.sku = sku;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() { 
        return "Producto{" + "sku=" + sku + ", nombre=" + nombre + ", precio=" + precio + '}';
    }
    
} 