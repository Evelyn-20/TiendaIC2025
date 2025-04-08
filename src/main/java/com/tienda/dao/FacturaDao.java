package com.tienda.dao;

import com.tienda.domain.Factura;
import org.springframework.data.jpa.repository.*;

public interface FacturaDao extends JpaRepository<Factura, Long> {
   
}