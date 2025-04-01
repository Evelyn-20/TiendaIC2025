package com.tienda.domain;

import lombok.Data;
import jakarta.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "Venta")
public class Venta implements Serializable {

    private static final long serialVersionUID = 1L;
    
    //Indicar que va a llamarse así, pero es diferente a la BD
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_venta")
    private long idVenta;
    private long idFactura;
    private long idProducto;
    private double precio;
    private int cantidad;
    
    //Constructor vacío
    public Venta() {
    }

    public Venta(long idFactura, long idProducto, double precio, int cantidad) {
        this.idFactura = idFactura;
        this.idProducto = idProducto;
        this.precio = precio;
        this.cantidad = cantidad;
    }
}