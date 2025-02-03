
package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

   @Entity
@Table(name = "venta")
public class Venta {
    @Id
    private int id;
    private String productooservicio;
    private int cantidad;
    private int precio;

    public Venta() {
    }

    public Venta(int id, String productooservicio, int cantidad, int precio) {
        this.id = id;
        this.productooservicio = productooservicio;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductooservicio() {
        return productooservicio;
    }

    public void setProductooservicio(String productooservicio) {
        this.productooservicio = productooservicio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    

    
    
}
