package com.tienda.domain;

import lombok.Data;
import jakarta.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "Producto")
public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;
    
    //Indicar que va a llamarse así, pero es diferente a la BD
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private long idProducto;

    private String descripcion;
    private String detalle;
    private double precio;
    private int existencias;
    @Column(name = "ruta_imagen")
    private String rutaImagen;
    private boolean activo;

    //Indicar que es de muchos a uno
    @ManyToOne​
    @JoinColumn(name="id_categoria")
    Categoria categoria;
    
    //Constructor vacío
    public Producto() {
    }

    //Constructor lleno
    public Producto(String descripcion, String detalle, double precio, int existencias, String imagen, boolean activo) {
        this.descripcion = descripcion;
        this.detalle = detalle;
        this.precio = precio;
        this.existencias = existencias;
        this.rutaImagen = imagen;
        this.activo = activo;
    }
}