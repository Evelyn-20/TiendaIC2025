package com.tienda.domain;

import lombok.Data;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.*;

@Data
@Entity
@Table(name = "Factura")
public class Factura implements Serializable {

    private static final long serialVersionUID = 1L;
    
    //Indicar que va a llamarse así, pero es diferente a la BD
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_factura")
    private long idFactura;
    private long idUsuario;
    private Date fecha;
    private double total;
    private int estado;
    
    //Constructor vacío
    public Factura() {
    }

    public Factura(long idUsuario) {
        this.idUsuario = idUsuario;
        this.fecha = Calendar.getInstance().getTime();
        this.estado = 1;
    }
}