package com.robert.invoiceproject.Service;

import com.robert.invoiceproject.entity.Factura;

public interface IFacturaService {

    Factura findByid(Long id);
    Factura saveFactura(Factura factura);
    void eliminarFactura(Long id);
}
