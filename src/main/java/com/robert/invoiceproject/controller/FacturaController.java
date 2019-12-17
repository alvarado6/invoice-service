package com.robert.invoiceproject.controller;

import com.robert.invoiceproject.Service.IFacturaService;
import com.robert.invoiceproject.entity.Cliente;
import com.robert.invoiceproject.entity.Factura;
import com.robert.invoiceproject.entity.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class FacturaController {

    @Autowired
    private IFacturaService facturaService;

    @GetMapping("/factura/{id}")
    public ResponseEntity<?> show(@PathVariable Long id) {

        Factura factura = null;
        Map<String, Object> response = new HashMap<>();
        try {
            factura = facturaService.findByid(id);
        } catch(DataAccessException e) {
            response.put("mensaje", "Error al realizar la consulta en la base de datos");
            response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        if(factura == null) {
            response.put("mensaje", "El cliente ID: ".concat(id.toString().concat(" no existe en la base de datos!")));
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Factura>(factura, HttpStatus.OK);
    }

    @DeleteMapping("/factura/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {

        Map<String, Object> response = new HashMap<>();
        try {
            Factura factura = facturaService.findByid(id);
            facturaService.eliminarFactura(id);
        } catch (DataAccessException e) {
            response.put("mensaje", "Error al eliminar la factura de la base de datos");
            response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        response.put("mensaje", "La factura ha sido eliminada con éxito!");
        return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
    }

}
