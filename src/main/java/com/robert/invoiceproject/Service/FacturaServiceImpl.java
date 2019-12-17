package com.robert.invoiceproject.Service;

import com.robert.invoiceproject.entity.Factura;
import com.robert.invoiceproject.repository.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacturaServiceImpl implements IFacturaService {

    @Autowired
    private FacturaRepository facturaRepository;

    @Override
    public Factura findByid(Long id) {
        return facturaRepository.findById(id).orElse(null);
    }

    @Override
    public Factura saveFactura(Factura factura) {
        return facturaRepository.save(factura);
    }

    @Override
    public void eliminarFactura(Long id) {
        facturaRepository.deleteById(id);
    }
}
